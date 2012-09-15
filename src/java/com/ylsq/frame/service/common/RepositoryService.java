/**
 * 
 */
package com.ylsq.frame.service.common;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ylsq.frame.dao.common.RepositoryMapper;
import com.ylsq.frame.model.common.Repository;

/**
 * @author hopper
 *
 */
@Service
public class RepositoryService implements CommonService<Repository>{
	@Resource
	private RepositoryMapper repositoryMapper;
	@Override
	public List<Repository> findAll() {
		return repositoryMapper.selectByExample(null);
	}

	@Override
	public Repository findById(Long id) {
		return repositoryMapper.selectByPrimaryKey(id);
	}

	@Override
	public int saveOrUpdateModel(Repository model) {
		int r = 0;
		if(model.getId() == null){
			r = repositoryMapper.insert(model);
		}
		else{
			r = repositoryMapper.updateByPrimaryKeySelective(model);
		}
		return r;
	}

	@Override
	public int deleteModel(Long id) {
		return repositoryMapper.deleteByPrimaryKey(id);
	}
}
