package com.ylsq.frame.web.common;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.frame.model.common.SecuUser;
import com.ylsq.frame.service.common.CommonService;
import com.ylsq.frame.service.common.SecuUserService;
import com.ylsq.frame.utils.SpringProperties;
import com.ylsq.frame.utils.StringHelper;


@Controller
@RequestMapping("user")
public class SecuUserController extends CommonController<SecuUser>{
	private static Logger logger = LoggerFactory.getLogger(SecuUserController.class);
	@Autowired
	private SecuUserService secuUserService;
	@Autowired
	private SpringProperties springProperties;
	@Override
	protected String dir() {
		return "user";
	}

	@Override
	protected Class<SecuUser> getObjectClass() {
		return SecuUser.class;
	}

	@Override
	protected CommonService<SecuUser> getModelService() {
		return secuUserService;
	}

	@Override
	protected void beforeSave() {
		if(StringUtils.isEmpty(object.getPassword()))
			object.setPassword(StringHelper.md5code(springProperties.getDefaultPassword()));
		logger.debug("before");
	}

	@RequestMapping("resetPassword")
	public String resetPassword(Long id,Model model){
		SecuUser user = new SecuUser();
		user.setId(id);
		model.addAttribute("user", user);
		return dir()+"/resetPassword";
	}

	@RequestMapping("savePassword")
	public String savePassword(HttpServletRequest request){
		logger.debug(request.getParameter("id"));
		logger.debug(request.getParameter("pwd"));
		return "0";
	}
}
