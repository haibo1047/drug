/**
 * 
 */
package com.ylsq.frame.service.common;

import java.util.List;

import com.ylsq.frame.model.common.PK;


/**
 * @author hopper
 *
 */
public interface CommonService<T extends PK> {

	public List<T> findAll();
	
	public T findById(Long id);
	
	public int saveOrUpdateModel(T model);
	
	public int deleteModel(Long id);
}