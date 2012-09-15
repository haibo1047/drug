/**
 * 
 */
package com.ylsq.frame.web.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.frame.dict.common.BillType;
import com.ylsq.frame.service.common.ProviderService;
import com.ylsq.frame.service.common.RepositoryService;

/**
 * @author hopper
 *
 */
@Controller
@RequestMapping("storage")
public class StorageController extends BillController{
	@Autowired
	private ProviderService providerService;
	@Autowired
	private RepositoryService repositoryService;

	@Override
	protected BillType getBillType() {
		return BillType.STORAGE;
	}

	@Override
	public void beforeEdit(Model model) {
		model.addAttribute("providerList", providerService.findAll());
		model.addAttribute("repositoryList", repositoryService.findAll());
		super.beforeEdit(model);
	}
}
