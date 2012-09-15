/**
 * 
 */
package com.ylsq.frame.web.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.frame.model.common.Repository;
import com.ylsq.frame.service.common.CommonService;
import com.ylsq.frame.service.common.RepositoryService;

/**
 * @author hopper
 *
 */
@Controller
@RequestMapping("repository")
public class RepositoryController extends CommonController<Repository>{
	@Autowired
	private RepositoryService repositoryService;
	@Override
	protected CommonService<Repository> getModelService() {
		return repositoryService;
	}

	@Override
	protected String dir() {
		return "repository";
	}

	@Override
	protected Class<Repository> getObjectClass() {
		return Repository.class;
	}
}
