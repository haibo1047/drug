package com.ylsq.frame.dao.repo;

import com.ylsq.frame.model.repo.DrugRepository;
import com.ylsq.frame.model.repo.DrugRepositoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugRepositoryMapper {
    int countByExample(DrugRepositoryExample example);

    int deleteByExample(DrugRepositoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DrugRepository record);

    int insertSelective(DrugRepository record);

    List<DrugRepository> selectByExample(DrugRepositoryExample example);

    DrugRepository selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DrugRepository record, @Param("example") DrugRepositoryExample example);

    int updateByExample(@Param("record") DrugRepository record, @Param("example") DrugRepositoryExample example);

    int updateByPrimaryKeySelective(DrugRepository record);

    int updateByPrimaryKey(DrugRepository record);
}