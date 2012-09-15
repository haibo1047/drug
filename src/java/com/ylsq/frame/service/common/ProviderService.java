/**
 * 
 */
package com.ylsq.frame.service.common;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.common.ProviderMapper;
import com.ylsq.frame.model.common.Provider;
import com.ylsq.frame.model.common.ProviderExample;

/**
 * @author hopper
 *
 */
@Service
public class ProviderService implements CommonService<Provider> {
	@Resource
	private ProviderMapper providerMapper;
	@Override
	public List<Provider> findAll() {
		return providerMapper.selectByExample(null);
	}

	@Override
	public Provider findById(Long id) {
		return providerMapper.selectByPrimaryKey(id);
	}

	@Override
	public int saveOrUpdateModel(Provider model) {
		int r = 0;
		if(model.getId() == null){
			r = providerMapper.insert(model);
		}
		else{
			r = providerMapper.updateByPrimaryKeySelective(model);
		}
		return r;
	}

	@Override
	public int deleteModel(Long id) {
		return providerMapper.deleteByPrimaryKey(id);
	}
	
	public Provider findByProviderName(String providerName){
		ProviderExample example = new ProviderExample();
		example.createCriteria().andProviderNameEqualTo(providerName);
		List<Provider> list = providerMapper.selectByExample(example);
		if(list.size() == 1){
			return list.get(0);
		}
		return null;
	}
}