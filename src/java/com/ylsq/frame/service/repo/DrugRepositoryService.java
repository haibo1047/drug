/**
 * 
 */
package com.ylsq.frame.service.repo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.repo.DrugRepositoryMapper;
import com.ylsq.frame.model.repo.Bill;
import com.ylsq.frame.model.repo.BillDetail;
import com.ylsq.frame.model.repo.DrugRepository;
import com.ylsq.frame.model.repo.DrugRepositoryExample;
import com.ylsq.frame.service.common.CommonService;

/**
 * @author hopper
 *
 */
@Service
public class DrugRepositoryService implements CommonService<DrugRepository> {
	@Resource
	private DrugRepositoryMapper drugRepositoryMapper;
	@Override
	public List<DrugRepository> findAll() {
		return drugRepositoryMapper.selectByExample(null);
	}

	@Override
	public DrugRepository findById(Long id) {
		return drugRepositoryMapper.selectByPrimaryKey(id);
	}

	@Override
	public int saveOrUpdateModel(DrugRepository model) {
		int r = 0;
		if(model.getId() == null){
			r = drugRepositoryMapper.insert(model);
		}
		else{
			r = drugRepositoryMapper.updateByPrimaryKeySelective(model);
		}
		return r;
	}

	@Override
	public int deleteModel(Long id) {
		return drugRepositoryMapper.deleteByPrimaryKey(id);
	}

	public int saveAll(List<DrugRepository> list){
		int r=0;
		for(DrugRepository dp : list){
			r += saveOrUpdateModel(dp);
		}
		return r;
	}
	
	public List<DrugRepository> findListByRepositoryId(Long repositoryId){
		DrugRepositoryExample example = new DrugRepositoryExample();
		example.createCriteria().andRepositoryIdEqualTo(repositoryId);
		example.setOrderByClause(" produce_date ");
		return drugRepositoryMapper.selectByExample(example);
	}
	
	public List<DrugRepository> findListByDrugId(Long drugId){
		DrugRepositoryExample example = new DrugRepositoryExample();
		example.createCriteria().andDrugIdEqualTo(drugId);
		return drugRepositoryMapper.selectByExample(example);
	}
	
	public int dualEnterWarehouse(Bill bill,List<BillDetail> details){
		List<DrugRepository> exists = findListByRepositoryId(bill.getRepositoryId());
		Map<Long,Map<Date,Map<Double,DrugRepository>>> map = new HashMap<Long, Map<Date,Map<Double,DrugRepository>>>();
		for(DrugRepository dp: exists){
			Long drugId = dp.getDrugId();
			Date productDate = DateUtils.truncate(dp.getProduceDate(), Calendar.DAY_OF_MONTH);
			Map<Date,Map<Double,DrugRepository>> dateMap = map.get(drugId);
			if(dateMap == null){
				dateMap = new HashMap<Date, Map<Double,DrugRepository>>();
				map.put(drugId, dateMap);
			}
			Map<Double,DrugRepository> priceMap = dateMap.get(productDate);
			if(priceMap == null){
				priceMap = new HashMap<Double, DrugRepository>();
				dateMap.put(productDate, priceMap);
			}
			priceMap.put(dp.getDrugPrice(), dp);
		}
		List<DrugRepository> data = new ArrayList<DrugRepository>();
		for(BillDetail bd : details){
			DrugRepository dp = null;
			Map<Date,Map<Double,DrugRepository>> dateMap = map.get(bd.getDrugId());
			if(dateMap != null){
				Map<Double,DrugRepository> priceMap = dateMap.get(DateUtils.truncate(bd.getProductDate(), Calendar.DAY_OF_MONTH));
				if(priceMap != null)
					dp = priceMap.get(bd.getDrugPrice());
			}
			if(dp == null){
				dp = new DrugRepository();
				dp.setDrugId(bd.getDrugId());
				dp.setDrugNumber(0);
				dp.setDrugPrice(bd.getDrugPrice());
				dp.setProduceDate(bd.getProductDate());
				dp.setRepositoryId(bill.getRepositoryId());
			}
			dp.setDrugNumber(dp.getDrugNumber()+bd.getDrugCount());
			data.add(dp);
		}
		return saveAll(data);
	}
	
	public int dualOutWarehouse(Bill bill,List<BillDetail> details){
		List<DrugRepository> exists = findListByRepositoryId(bill.getRepositoryId());
		Map<Long,Map<Date,List<DrugRepository>>> map = new HashMap<Long, Map<Date,List<DrugRepository>>>();
		List<DrugRepository> data = new ArrayList<DrugRepository>();
		for(DrugRepository dp: exists){
			Long drugId = dp.getDrugId();
			Date productDate = DateUtils.truncate(dp.getProduceDate(), Calendar.DAY_OF_MONTH);
			Map<Date,List<DrugRepository>> dateMap = map.get(drugId);
			if(dateMap == null){
				dateMap = new HashMap<Date, List<DrugRepository>>();
				map.put(drugId, dateMap);
			}
			List<DrugRepository> dpList = dateMap.get(productDate);
			if(dpList == null){
				dpList = new ArrayList<DrugRepository>();
				dateMap.put(productDate, dpList);
			}
			dpList.add(dp);
		}
		for(BillDetail bd : details){
			int existsCnt = 0;
			Map<Date,List<DrugRepository>> dateMap = map.get(bd.getDrugId());
			List<DrugRepository> dpList = null;
			if(dateMap != null){
				dpList = dateMap.get(DateUtils.truncate(bd.getProductDate(), Calendar.DAY_OF_MONTH));
				if(dpList != null)
					for(DrugRepository elem : dpList)
						existsCnt += elem.getDrugNumber();
			}
			if(dpList == null || existsCnt-bd.getDrugCount()<0){
				throw new RuntimeException("库存不足！");
			}
			int outCnt = bd.getDrugCount();
			for(DrugRepository dp : dpList){
				if(dp.getDrugNumber() <= outCnt)
					deleteModel(dp.getId());
				else{
					dp.setDrugNumber(dp.getDrugNumber()-outCnt);
					data.add(dp);
					break;
				}
				outCnt -= dp.getDrugNumber();
			}
		}
		return saveAll(data);
	}
}
