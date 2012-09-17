/**
 * 
 */
package com.ylsq.frame.web.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.frame.model.common.SecuMenu;
import com.ylsq.frame.model.common.SecuMenuValidator;
import com.ylsq.frame.service.common.CommonService;
import com.ylsq.frame.service.common.SecuMenuService;

/**
 * @author hopper
 *
 */

@Controller
@RequestMapping("menu")
public class SecuMenuController extends CommonController<SecuMenu>{
	private static Logger logger = LoggerFactory.getLogger(SecuMenuController.class);
	@Autowired
	private SecuMenuService secuMenuService;
	
	@InitBinder  
	protected void initBinder(WebDataBinder binder){  
		binder.setValidator(new SecuMenuValidator());  
	}  
	
	@Override
	protected String dir() {
		return "menu";
	}

	@Override
	protected Class<SecuMenu> getObjectClass() {
		return SecuMenu.class;
	}

	@Override
	protected CommonService<SecuMenu> getModelService() {
		return secuMenuService;
	}

	@Override
	protected void beforeSave() {
		logger.debug("before");
		object.setMenuName(object.getMenuPath().substring(object.getMenuPath().lastIndexOf(SecuMenu.MENU_SPLIT)+SecuMenu.MENU_SPLIT.length()));
	}
}
