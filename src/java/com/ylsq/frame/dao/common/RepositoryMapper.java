package com.ylsq.frame.dao.common;

import com.ylsq.frame.model.common.Repository;
import com.ylsq.frame.model.common.RepositoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepositoryMapper {
    int countByExample(RepositoryExample example);

    int deleteByExample(RepositoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Repository record);

    int insertSelective(Repository record);

    List<Repository> selectByExample(RepositoryExample example);

    Repository selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Repository record, @Param("example") RepositoryExample example);

    int updateByExample(@Param("record") Repository record, @Param("example") RepositoryExample example);

    int updateByPrimaryKeySelective(Repository record);

    int updateByPrimaryKey(Repository record);
}