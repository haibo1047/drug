/**
 * 
 */
package com.ylsq.frame.service.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.repo.BillDetailMapper;
import com.ylsq.frame.model.repo.BillDetail;
import com.ylsq.frame.model.repo.BillDetailExample;
import com.ylsq.frame.service.common.CommonService;

/**
 * @author hopper
 *
 */
@Service
public class BillDetailService implements CommonService<BillDetail> {
	@Autowired
	private BillDetailMapper billDetailMapper;
	
	@Override
	public List<BillDetail> findAll() {
		return billDetailMapper.selectByExample(null);
	}

	@Override
	public BillDetail findById(Long id) {
		return billDetailMapper.selectByPrimaryKey(id);
	}

	@Override
	public int saveOrUpdateModel(BillDetail model) {
		int r = 0;
		if(model.getId() == null){
			r = billDetailMapper.insert(model);
		}
		else{
			r = billDetailMapper.updateByPrimaryKeySelective(model);
		}
		return r;
	}

	@Override
	public int deleteModel(Long id) {
		return billDetailMapper.deleteByPrimaryKey(id);
	}
	
	public int deleteByBillId(Long billId){
		return billDetailMapper.deleteByBillId(billId);
	}

	public List<BillDetail> findListByBillId(Long billId){
		BillDetailExample example = new BillDetailExample();
		example.createCriteria().andBillIdEqualTo(billId);
		return billDetailMapper.selectByExample(example);
	}
	
	public int saveAll(List<BillDetail> billDetails){
		int r = 0;
		for(BillDetail bd : billDetails)
			r += saveOrUpdateModel(bd);
		return r;
	}
}
