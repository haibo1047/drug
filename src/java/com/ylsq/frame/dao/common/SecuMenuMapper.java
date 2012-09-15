package com.ylsq.frame.dao.common;

import com.ylsq.frame.model.common.SecuMenu;
import com.ylsq.frame.model.common.SecuMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecuMenuMapper {
    int countByExample(SecuMenuExample example);

    int deleteByExample(SecuMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuMenu record);

    int insertSelective(SecuMenu record);

    List<SecuMenu> selectByExample(SecuMenuExample example);

    SecuMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecuMenu record, @Param("example") SecuMenuExample example);

    int updateByExample(@Param("record") SecuMenu record, @Param("example") SecuMenuExample example);

    int updateByPrimaryKeySelective(SecuMenu record);

    int updateByPrimaryKey(SecuMenu record);
    
    List<SecuMenu> findListByUsername(String username);
    
    List<SecuMenu> findListByRoleId(Long roleId);
}