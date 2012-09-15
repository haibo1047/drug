/**
 * 
 */
package com.ylsq.frame.service.common;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.common.SecuRoleMapper;
import com.ylsq.frame.model.common.SecuRole;

/**
 * @author hopper
 *
 */
@Service
public class SecuRoleService implements CommonService<SecuRole> {
	@Resource
	private SecuRoleMapper secuRoleMapper;

	@Override
	public List<SecuRole> findAll() {
		return secuRoleMapper.selectByExample(null);
	}

	@Override
	public SecuRole findById(Long id) {
		return secuRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int saveOrUpdateModel(SecuRole model) {
		int r = 0;
		if(model.getId() == null){
			r = secuRoleMapper.insert(model);
		}
		else{
			r = secuRoleMapper.updateByPrimaryKeySelective(model);
		}
		return r;
	}

	@Override
	public int deleteModel(Long id) {
		return secuRoleMapper.deleteByPrimaryKey(id);
	}

	public List<SecuRole> findListByUsername(String username){
		return secuRoleMapper.selectByUsername(username);
	}
}
