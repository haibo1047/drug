/**
 * 
 */
package com.ylsq.frame.web.repo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.frame.dict.common.BillType;
import com.ylsq.frame.model.repo.Bill;
import com.ylsq.frame.service.repo.BillService;

/**
 * @author hopper
 *
 */
public abstract class BillController {
	private Logger logger = LoggerFactory.getLogger(BillController.class);
	public static String prefix = "repo/";
	@Autowired
	private BillService billService;
	
	private Bill bill;
	
	protected List<Bill> customList(){
		logger.debug(billService.nextOneBillNo(getBillType()));
		return billService.findListByType(getBillType());
	}
	
	@RequestMapping("list")
	public String list(Model model){
		List<Bill> billList = customList();
		model.addAttribute("billList", billList);
		return prefix+getBillType().getBillPrefix()+"/list";
	}
	
	@RequestMapping("add")
	public String add(Model model){
		bill = new Bill();
		bill.setBillType(getBillType().getValue());
		beforeEdit(model);
		model.addAttribute("bill", bill);
		return prefix+getBillType().getBillPrefix()+"/edit";
	}
	
	@RequestMapping("edit")
	public String edit(Long billId,Model model){
		bill = billService.findById(billId);
		model.addAttribute("bill", bill);
		beforeEdit(model);
		return prefix+getBillType().getBillPrefix()+"/edit";
	}
	
	@RequestMapping("save")
	public String save(@ModelAttribute Bill bill,Model model){
		this.bill = bill;
		return list(model);
	}
	
	@RequestMapping("delete")
	public String delete(Long billId,Model model){
		return list(model);
	}
	
	protected abstract BillType getBillType();
	
	public void beforeEdit(Model model){}
	public void beforeSave(Model model){}
	public void beforeDelete(Model model){}
}
