/**
 * 
 */
package com.ylsq.frame.web.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.frame.model.common.Provider;
import com.ylsq.frame.service.common.CommonService;
import com.ylsq.frame.service.common.ProviderService;

/**
 * @author hopper
 *
 */
@Controller
@RequestMapping("/provider")
public class ProviderController extends CommonController<Provider>{
	@Autowired
	private ProviderService providerService;

	@Override
	protected CommonService<Provider> getModelService() {
		return providerService;
	}

	@Override
	protected String dir() {
		return "provider";
	}

	@Override
	protected Class<Provider> getObjectClass() {
		return Provider.class;
	}

}
