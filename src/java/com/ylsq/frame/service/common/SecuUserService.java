/**
 * 
 */
package com.ylsq.frame.service.common;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.common.SecuUserMapper;
import com.ylsq.frame.model.common.SecuUser;
import com.ylsq.frame.model.common.SecuUserExample;
import com.ylsq.frame.utils.StringHelper;

/**
 * @author hopper
 *
 */
@Service
public class SecuUserService implements CommonService<SecuUser>{
	@Resource
	private SecuUserMapper secuUserMapper;


	@Override
	public List<SecuUser> findAll() {
		return secuUserMapper.selectByExample(null);
	}

	@Override
	public SecuUser findById(Long id) {
		return secuUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public int saveOrUpdateModel(SecuUser model) {
		int r = 0;
		if(model.getId() == null){
			r = secuUserMapper.insert(model);
		}
		else{
			r = secuUserMapper.updateByPrimaryKeySelective(model);
		}
		return r;
	}

	@Override
	public int deleteModel(Long id) {
		return secuUserMapper.deleteByPrimaryKey(id);
	}

	public SecuUser getUserById(Long id){
		return secuUserMapper.selectByPrimaryKey(id);
	}
	
	public SecuUser getUserByUsername(String username){
		SecuUserExample example = new SecuUserExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<SecuUser> list = secuUserMapper.selectByExample(example);
		if(list.size() ==1)
			return list.get(0);
		return null;
	}
	
	public List<SecuUser> findListByRoleId(Long roleId){
		return secuUserMapper.findListByRoleId(roleId);
	}
	
	public int dualResetPassword(Long id,String pwd){
		SecuUser record = new SecuUser();
		record.setId(id);
		record.setPassword(StringHelper.md5code(pwd));
		return secuUserMapper.updateByPrimaryKeySelective(record);
	}
}
