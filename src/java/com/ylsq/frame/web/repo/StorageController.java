/**
 * 
 */
package com.ylsq.frame.web.repo;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.frame.dict.common.BillType;
import com.ylsq.frame.dict.common.Options;
import com.ylsq.frame.model.common.Repository;
import com.ylsq.frame.model.repo.Bill;
import com.ylsq.frame.utils.SecurityUtils;

/**
 * @author hopper
 *
 */
@Controller
@RequestMapping("storage")
public class StorageController extends BillController{

	@Override
	protected BillType getBillType() {
		return BillType.STORAGE;
	}

	@Override
	protected List<Bill> customList() {
		List<Bill> storageList = super.customList();
		List<Repository> repositorys = repositoryService.findAll();
		Map<Long,String> repoMap = new HashMap<Long,String>();
		for(Repository repo : repositorys)
			repoMap.put(repo.getId(), repo.getRepositoryName());
		for(Bill b : storageList){
			if(b.getExtraInfo() == null){
				b.setExtraInfo(new HashMap<String, String>());
			}
			b.getExtraInfo().put("repositoryName", repoMap.get(b.getRepositoryId()));
			if(b.getAvailable() != null && Options.YES.getValue().equals(b.getAvailable()))
				b.getExtraInfo().put("available", Options.YES.getLabel());
			else
				b.getExtraInfo().put("available", Options.NO.getLabel());
		}
		return storageList;
	}

	@Override
	public void beforeEdit(Model model) {
		model.addAttribute("providerList", providerService.findAll());
		model.addAttribute("repositoryList", repositoryService.findAll());
	}

	@Override
	public void beforeSave(Model model) {
		bill.setCreateDate(new Date());
		bill.setCreateUser(SecurityUtils.fetchUsername());
		bill.setAvailable(Options.NO.getValue());
		if(StringUtils.isBlank(bill.getBillNo()))
			bill.setBillNo(billService.nextOneBillNo(getBillType()));
	}
}
