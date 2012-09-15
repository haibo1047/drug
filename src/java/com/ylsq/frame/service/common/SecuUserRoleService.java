/**
 * 
 */
package com.ylsq.frame.service.common;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.common.SecuUserRoleMapper;
import com.ylsq.frame.model.common.SecuUserRole;
import com.ylsq.frame.model.common.SecuUserRoleExample;

/**
 * @author hopper
 *
 */
@Service
public class SecuUserRoleService implements CommonService<SecuUserRole>{
	@Resource
	private SecuUserRoleMapper secuUserRoleMapper;

	@Override
	public List<SecuUserRole> findAll() {
		return null;
	}

	@Override
	public SecuUserRole findById(Long id) {
		return null;
	}

	@Override
	public int saveOrUpdateModel(SecuUserRole model) {
		return 0;
	}

	@Override
	public int deleteModel(Long id) {
		return 0;
	}
	
	public int deleteByRoleId(Long roleId){
		SecuUserRoleExample example = new SecuUserRoleExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		return secuUserRoleMapper.deleteByExample(example);
	}

	public int saveUserRole(Long roleId,List<String> unselect,List<String> selected){
		deleteByRoleId(roleId);
		int t = 0;
		for(String strId : selected){
			SecuUserRole sru = new SecuUserRole();
			sru.setRoleId(roleId);
			sru.setUserId(Long.parseLong(strId));
			t += secuUserRoleMapper.insert(sru);
		}
		return t;
	}
}
