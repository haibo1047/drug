/**
 * 
 */
package com.ylsq.frame.service.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.repo.BillMapper;
import com.ylsq.frame.dict.common.BillType;
import com.ylsq.frame.dict.common.Options;
import com.ylsq.frame.dict.common.WarehouseType;
import com.ylsq.frame.model.repo.Bill;
import com.ylsq.frame.model.repo.BillDetail;
import com.ylsq.frame.model.repo.BillExample;
import com.ylsq.frame.service.common.CommonService;
import com.ylsq.frame.utils.DateHelper;

/**
 * @author hopper
 *
 */
@Service
public class BillService implements CommonService<Bill> {
	@Resource
	private BillMapper billMapper;
	@Resource
	private BillDetailService billDetailService;
	@Resource
	private DrugRepositoryService drugRepositoryService;

	@Override
	public List<Bill> findAll() {
		return billMapper.selectByExample(null);
	}

	@Override
	public Bill findById(Long id) {
		return billMapper.selectByPrimaryKey(id);
	}

	@Override
	public int saveOrUpdateModel(Bill model) {
		int r = 0;
		if(model.getId() == null){
			r = billMapper.insert(model);
		}
		else{
			r = billMapper.updateByPrimaryKeySelective(model);
		}
		return r;
	}

	@Override
	public int deleteModel(Long id) {
		return billMapper.deleteByPrimaryKey(id);
	}

	public int deleteBillCascade(Long billId){
		billDetailService.deleteByBillId(billId);
		return billMapper.deleteByPrimaryKey(billId);
	}
	public List<Bill> findListByType(BillType billType){
		BillExample example = new BillExample();
		example.createCriteria().andBillTypeEqualTo(billType.getValue());
		example.setOrderByClause(" bill_no desc ");
		return billMapper.selectByExample(example);
	}
	
	public String nextOneBillNo(BillType billType){
		String prefix = billType.getPrefix()+DateHelper.formatNow(null);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("billType", billType.getValue());
		map.put("prefix", prefix+"%");
		int no = billMapper.nextOneBillNo(map);
		return prefix+StringUtils.leftPad(no+"",4,"0");
	}
	
	public int avaliableBill(Long billId){
		Bill record = new Bill();
		record.setId(billId);
		record.setAvailable(Options.YES.getValue());
		return billMapper.updateByPrimaryKeySelective(record);
	}
	
	public int dualConfirmBill(Long billId)throws Exception{
		avaliableBill(billId);
		Bill bill = findById(billId);
		List<BillDetail> details = billDetailService.findListByBillId(billId);
		BillType billType = BillType.convert(bill.getBillType());
		int r = 0;
		if(WarehouseType.IN == billType.getWarehouseType())
			r = drugRepositoryService.dualEnterWarehouse(bill, details);
		else
			r = drugRepositoryService.dualOutWarehouse(bill,details);
		return r;
	}
	
	public Bill findBillByBillNo(String billNo){
		BillExample example = new BillExample();
		example.createCriteria().andBillNoEqualTo(billNo);
		List<Bill> bills = billMapper.selectByExample(example);
		if(bills.size() == 1)
			return bills.get(0);
		return null;
	}
}
