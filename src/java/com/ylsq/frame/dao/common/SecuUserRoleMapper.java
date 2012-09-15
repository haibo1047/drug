package com.ylsq.frame.dao.common;

import com.ylsq.frame.model.common.SecuUserRole;
import com.ylsq.frame.model.common.SecuUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecuUserRoleMapper {
    int countByExample(SecuUserRoleExample example);

    int deleteByExample(SecuUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuUserRole record);

    int insertSelective(SecuUserRole record);

    List<SecuUserRole> selectByExample(SecuUserRoleExample example);

    SecuUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecuUserRole record, @Param("example") SecuUserRoleExample example);

    int updateByExample(@Param("record") SecuUserRole record, @Param("example") SecuUserRoleExample example);

    int updateByPrimaryKeySelective(SecuUserRole record);

    int updateByPrimaryKey(SecuUserRole record);
}