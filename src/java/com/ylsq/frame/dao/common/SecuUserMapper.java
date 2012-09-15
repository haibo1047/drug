package com.ylsq.frame.dao.common;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ylsq.frame.model.common.SecuUser;
import com.ylsq.frame.model.common.SecuUserExample;

public interface SecuUserMapper{
    int countByExample(SecuUserExample example);

    int deleteByExample(SecuUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuUser record);

    int insertSelective(SecuUser record);

    List<SecuUser> selectByExample(SecuUserExample example);

    SecuUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecuUser record, @Param("example") SecuUserExample example);

    int updateByExample(@Param("record") SecuUser record, @Param("example") SecuUserExample example);

    int updateByPrimaryKeySelective(SecuUser record);

    int updateByPrimaryKey(SecuUser record);
    
    public List<SecuUser> findListByRoleId(Long roleId);
}