/**
 * 
 */
package com.ylsq.frame.service.repo;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.repo.BillDetailMapper;
import com.ylsq.frame.dao.repo.BillMapper;
import com.ylsq.frame.dict.common.BillType;
import com.ylsq.frame.model.repo.Bill;
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
	private BillDetailMapper billDetailMapper;

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
		billDetailMapper.deleteByBillId(billId);
		return billMapper.deleteByPrimaryKey(billId);
	}
	public List<Bill> findListByType(BillType billType){
		BillExample example = new BillExample();
		example.createCriteria().andBillTypeEqualTo(billType.getValue());
		return billMapper.selectByExample(example);
	}
	
	public String nextOneBillNo(BillType billType){
		int no = billMapper.nextOneBillNo(billType.getValue());
		return billType.getPrefix()+DateHelper.formatNow(null)+StringUtils.leftPad(no+"",4,"0");
	}
}
