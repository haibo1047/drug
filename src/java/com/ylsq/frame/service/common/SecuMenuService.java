/**
 * 
 */
package com.ylsq.frame.service.common;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.common.SecuMenuMapper;
import com.ylsq.frame.model.common.SecuMenu;
import com.ylsq.frame.model.common.SecuMenuExample;

/**
 * @author hopper
 *
 */
@Service
public class SecuMenuService implements CommonService<SecuMenu>{
	@Resource
	private SecuMenuMapper secuMenuMapper;
	
	@Override
	public List<SecuMenu> findAll() {
		return secuMenuMapper.selectByExample(null);
	}

	@Override
	public SecuMenu findById(Long id) {
		return secuMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public int saveOrUpdateModel(SecuMenu model) {
		int r = 0;
		if(model.getId() == null){
			r = secuMenuMapper.insert(model);
		}
		else{
			r = secuMenuMapper.updateByPrimaryKeySelective(model);
		}
		return r;
	}

	@Override
	public int deleteModel(Long id) {
		return secuMenuMapper.deleteByPrimaryKey(id);
	}

	public SecuMenu findMenuByUrl(String url){
		SecuMenuExample example = new SecuMenuExample();
		example.createCriteria().andMenuUrlEqualTo(url);
		List<SecuMenu> list = secuMenuMapper.selectByExample(example);
		if(list.size() ==1)
			return list.get(0);
		return null;
	}
	
	public List<SecuMenu> findListByUsername(String username){
		return secuMenuMapper.findListByUsername(username);
	}
	
	public List<SecuMenu> findListByRoleId(Long roleId){
		return secuMenuMapper.findListByRoleId(roleId);
	}
	
}
