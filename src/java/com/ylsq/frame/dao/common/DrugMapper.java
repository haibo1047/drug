package com.ylsq.frame.dao.common;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ylsq.frame.model.common.Drug;
import com.ylsq.frame.model.common.DrugExample;

public interface DrugMapper{
    int countByExample(DrugExample example);

    int deleteByExample(DrugExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Drug record);

    int insertSelective(Drug record);

    List<Drug> selectByExample(DrugExample example);

    Drug selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Drug record, @Param("example") DrugExample example);

    int updateByExample(@Param("record") Drug record, @Param("example") DrugExample example);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKey(Drug record);
}