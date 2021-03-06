/**
 * 
 */
package com.ylsq.frame.web.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.frame.model.common.SecuMenu;
import com.ylsq.frame.model.common.SecuRole;
import com.ylsq.frame.model.common.SecuUser;
import com.ylsq.frame.service.common.CommonService;
import com.ylsq.frame.service.common.SecuMenuService;
import com.ylsq.frame.service.common.SecuRoleMenuService;
import com.ylsq.frame.service.common.SecuRoleService;
import com.ylsq.frame.service.common.SecuUserRoleService;
import com.ylsq.frame.service.common.SecuUserService;

/**
 * @author hopper
 *
 */
@Controller
@RequestMapping("role")
public class SecuRoleController extends CommonController<SecuRole> {
	@Autowired
	private SecuRoleService secuRoleService;
	@Autowired
	private SecuUserRoleService secuUserRoleService;
	@Autowired
	private SecuRoleMenuService secuRoleMenuService;
	@Autowired
	private SecuUserService secuUserService;
	@Autowired
	private SecuMenuService secuMenuService;

	@Override
	protected String dir() {
		return "role";
	}

	@Override
	protected Class<SecuRole> getObjectClass() {
		return SecuRole.class;
	}

	@Override
	protected CommonService<SecuRole> getModelService() {
		return secuRoleService;
	}

	@Override
	protected void beforeSave() {
		object.setAuthority(object.getAuthority().toUpperCase());
	}

	@RequestMapping("configUser")
	public String configUser(Long id,Model model) throws Exception{
		List<SecuUser> selectedUsers = secuUserService.findListByRoleId(id);
		Set<Long> selectIds = new HashSet<Long>();
		for(SecuUser u : selectedUsers){
			selectIds.add(u.getId());
		}
		List<SecuUser> allUser = secuUserService.findAll();
		List<SecuUser> unselectUsers = new ArrayList<SecuUser>(allUser.size()-selectIds.size());
		for(SecuUser u : allUser){
			if(!selectIds.contains(u.getId())){
				unselectUsers.add(u);
			}
		}
		model.addAttribute("selectedUsers", selectedUsers);
		model.addAttribute("unselectUsers", unselectUsers);
		model.addAttribute("object", secuRoleService.findById(id));
		objectDir(model);
		return dir()+"/configUser";
	}
	
	@RequestMapping("saveConfigUser")
	public String saveConfigUser(@ModelAttribute SecuRole role,Model model) throws Exception{
		secuUserRoleService.saveUserRole(role.getId(),role.getUnselect(),role.getSelected());
		return configUser(role.getId(),model);
	}
	
	@RequestMapping("configMenu")
	public String configMenu(Long id,Model model) throws Exception{
		List<SecuMenu> selectedMenus = secuMenuService.findListByRoleId(id);
		Set<Long> existIds = new HashSet<Long>();
		for(SecuMenu m : selectedMenus){
			existIds.add(m.getId());
		}
		List<SecuMenu> allMenu = secuMenuService.findAll();
		List<SecuMenu> unselectMenus = new ArrayList<SecuMenu>(allMenu.size()-existIds.size());
		for(SecuMenu menu : allMenu){
			if(!existIds.contains(menu.getId())){
				unselectMenus.add(menu);
			}
		}
		model.addAttribute("selected", selectedMenus);
		model.addAttribute("unselect", unselectMenus);
		model.addAttribute("object", secuRoleService.findById(id));
		objectDir(model);
		return dir()+"/menuConfig";
	}
	
	@RequestMapping("saveConfigMenu")
	public String saveConfigRole(@ModelAttribute SecuRole role,Model model) throws Exception{
		secuRoleMenuService.saveRoleMenu(role.getId(),role.getUnselect(),role.getSelected());
		return configMenu(role.getId(), model);
	}
}
