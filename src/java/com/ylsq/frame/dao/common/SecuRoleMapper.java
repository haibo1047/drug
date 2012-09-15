package com.ylsq.frame.dao.common;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ylsq.frame.model.common.SecuRole;
import com.ylsq.frame.model.common.SecuRoleExample;

public interface SecuRoleMapper{
    int countByExample(SecuRoleExample example);

    int deleteByExample(SecuRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuRole record);

    int insertSelective(SecuRole record);

    List<SecuRole> selectByExample(SecuRoleExample example);

    SecuRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecuRole record, @Param("example") SecuRoleExample example);

    int updateByExample(@Param("record") SecuRole record, @Param("example") SecuRoleExample example);

    int updateByPrimaryKeySelective(SecuRole record);

    int updateByPrimaryKey(SecuRole record);
    
    List<SecuRole> selectByUsername(String username);
}