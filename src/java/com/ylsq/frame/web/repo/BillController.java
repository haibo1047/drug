/**
 * 
 */
package com.ylsq.frame.web.repo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.frame.dict.common.BillType;
import com.ylsq.frame.model.common.Drug;
import com.ylsq.frame.model.repo.Bill;
import com.ylsq.frame.model.repo.BillDetail;
import com.ylsq.frame.service.common.DrugService;
import com.ylsq.frame.service.common.ProviderService;
import com.ylsq.frame.service.common.RepositoryService;
import com.ylsq.frame.service.repo.BillDetailService;
import com.ylsq.frame.service.repo.BillService;
import com.ylsq.frame.utils.DateHelper;
import com.ylsq.frame.utils.StringHelper;

/**
 * @author hopper
 *
 */
public abstract class BillController {
	private Logger logger = LoggerFactory.getLogger(BillController.class);
	public static String prefix = "repo/";
	@Autowired
	protected BillService billService;
	@Autowired
	protected BillDetailService billDetailService;
	@Autowired
	protected DrugService drugService;
	@Autowired
	protected ProviderService providerService;
	@Autowired
	protected RepositoryService repositoryService;
	
	protected Bill bill;
	
	protected List<Bill> customList(){
		return billService.findListByType(getBillType());
	}
	
	@RequestMapping("list")
	public String list(Model model) throws Exception{
		List<Bill> billList = customList();
		model.addAttribute("billList", billList);
		logger.debug(billList.size()+"");
		logger.debug(billService.nextOneBillNo(getBillType()));
		return prefix+"/list";
	}
	
	@RequestMapping("add")
	public String add(Model model) throws Exception{
		bill = new Bill();
		bill.setBillType(getBillType().getValue());
		beforeEdit(model);
		model.addAttribute("bill", bill);
		return prefix+getBillType().getBillPrefix()+"/edit";
	}
	
	@RequestMapping("edit")
	public String edit(Long billId,Model model) throws Exception{
		bill = billService.findById(billId);
		model.addAttribute("bill", bill);
		beforeEdit(model);
		return prefix+getBillType().getBillPrefix()+"/edit";
	}
	
	@RequestMapping("save")
	public String save(@ModelAttribute Bill bill,Model model) throws Exception{
		this.bill = bill;
		beforeSave(model);
		billService.saveOrUpdateModel(bill);
		bill = billService.findBillByBillNo(bill.getBillNo());
		return editDetail(bill.getId(), model);
	}
	
	@RequestMapping("delete")
	public String delete(Long billId,Model model) throws Exception{
		beforeDelete(model);
		billService.deleteBillCascade(billId);
		return list(model);
	}
	
	@RequestMapping("editDetail")
	public String editDetail(Long billId,Model model) throws Exception{
		bill = billService.findById(billId);
		List<Drug> drugList = drugService.findAll();
		Map<Long,String> drugMap = new HashMap<Long,String>(drugList.size());
		for(Drug dg : drugList)
			drugMap.put(dg.getId(), dg.getSimpleSpell()+"-"+dg.getDrugName());
		List<BillDetail> details = billDetailService.findListByBillId(billId);
		for(BillDetail bd : details){
			if(bd.getExtraInfo() == null)
				bd.setExtraInfo(new HashMap<String, String>());
			bd.getExtraInfo().put("drugName", drugMap.get(bd.getDrugId()));
			bd.getExtraInfo().put("productDate", DateHelper.format(bd.getProductDate(), DateHelper.FORMAT_YYYY_MM_DD));
		}
		model.addAttribute("bill", bill);
		model.addAttribute("details", details);
		beforeEdit(model);
		return prefix+"billDetail";
	}
	
	@RequestMapping("saveDetails")
	public String saveDetails(@ModelAttribute Bill bill,Model model,HttpServletRequest request) throws Exception{
		String[] detailIds = request.getParameterValues("detailId");
		String[] drugIds = request.getParameterValues("drugId");
		String[] providers = request.getParameterValues("createUser");
		String[] productDates = request.getParameterValues("productDate");
		String[] drugCounts = request.getParameterValues("drugCount");
		String[] drugPrices = request.getParameterValues("drugPrice");
		List<BillDetail> details = new ArrayList<BillDetail>();
		for(int index =1;index<providers.length;index++){
			String sp = providers[index];
			String sd = drugIds[index];
			String pd = productDates[index];
			String dc = drugCounts[index];
			String dp = drugPrices[index];
			Date date = DateHelper.parseDate(pd);
			if(StringUtils.isNumeric(sp) && StringUtils.isNumeric(sd) && StringUtils.isNumeric(dc) && StringHelper.isNumberic(dp) && date!=null){
				BillDetail detail = new BillDetail();
				if(StringUtils.isNotBlank(detailIds[index]) && StringUtils.isNumeric(detailIds[index])){
					detail.setId(Long.parseLong(detailIds[index]));
				}
				detail.setProviderId(Long.parseLong(sp));
				detail.setDrugId(Long.parseLong(sd));
				detail.setDrugCount(Integer.parseInt(dc));
				detail.setDrugPrice(Double.parseDouble(dp));
				detail.setProductDate(date);
				detail.setBillId(bill.getId());
				details.add(detail);
			}
		}
		billDetailService.saveAll(details);
		return list(model);
	}
	
	@RequestMapping("confirmBill")
	public String confirmBill(Long billId,Model model) throws Exception{
		billService.dualConfirmBill(billId);
		return list(model);
	}
	
	protected abstract BillType getBillType();
	
	public void beforeEdit(Model model){}
	public void beforeSave(Model model){}
	public void beforeDelete(Model model){}
}
