/**
 * 
 */
package com.ylsq.frame.web.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.frame.model.common.Drug;
import com.ylsq.frame.model.common.Repository;
import com.ylsq.frame.model.repo.DrugRepository;
import com.ylsq.frame.service.common.DrugService;
import com.ylsq.frame.service.common.RepositoryService;
import com.ylsq.frame.service.repo.DrugRepositoryService;

/**
 * @author hopper
 *
 */
@Controller
@RequestMapping("query")
public class QueryStockController{
	@Autowired
	private DrugService drugService;
	@Autowired
	private DrugRepositoryService drugRepositoryService;
	@Autowired
	private RepositoryService repositoryService;
	
	@RequestMapping("stock")
	public String queryStock(Model model){
		List<Drug> drugList = drugService.findAll();
		List<Repository> repoList = repositoryService.findAll();
		Map<Long,String> drugMap = new HashMap<Long,String>();
		Map<Long,String> repoMap = new HashMap<Long,String>();
		for(Drug drug : drugList)
			drugMap.put(drug.getId(),drug.getDrugDescript());
		for(Repository repo : repoList)
			repoMap.put(repo.getId(),repo.getRepositoryName());
		List<DrugRepository> stockList = drugRepositoryService.findAll();
		for(DrugRepository dp : stockList){
			if(dp.getExtraInfo() == null)
				dp.setExtraInfo(new HashMap<String, String>());
			dp.getExtraInfo().put("drugName", drugMap.get(dp.getDrugId()));
			dp.getExtraInfo().put("repositoryName", repoMap.get(dp.getRepositoryId()));
		}
		model.addAttribute("stockList", stockList);
		return "repo/stockList";
	}

}
