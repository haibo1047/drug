/**
 * 
 */
package com.ylsq.frame.service.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.common.SecuRoleMenuMapper;
import com.ylsq.frame.model.common.SecuRoleMenu;
import com.ylsq.frame.model.common.SecuRoleMenuExample;

/**
 * @author hopper
 *
 */
@Service
public class SecuRoleMenuService {
	@Autowired
	private SecuRoleMenuMapper secuRoleMenuMapper;
	
	public List<String> findRoleListByMenuId(Long menuId){
		return secuRoleMenuMapper.selectAuthorityListByMenuId(menuId);
	}
	
	public int deleteByRoleId(Long roleId){
		SecuRoleMenuExample example = new SecuRoleMenuExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		return secuRoleMenuMapper.deleteByExample(example);
	}
	
	public int saveRoleMenu(Long roleId,List<String> unselect,List<String> selected){
		deleteByRoleId(roleId);
		int t = 0;
		for(String strId : selected){
			Long menuId = Long.parseLong(strId);
			SecuRoleMenu srm = new SecuRoleMenu();
			srm.setRoleId(roleId);
			srm.setMenuId(menuId);
			
			t += secuRoleMenuMapper.insert(srm);
		}
		return t;
	}
}
