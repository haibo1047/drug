package com.ylsq.frame.dao.repo;

import com.ylsq.frame.model.repo.BillDetail;
import com.ylsq.frame.model.repo.BillDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillDetailMapper {
    int countByExample(BillDetailExample example);

    int deleteByExample(BillDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillDetail record);

    int insertSelective(BillDetail record);

    List<BillDetail> selectByExample(BillDetailExample example);

    BillDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillDetail record, @Param("example") BillDetailExample example);

    int updateByExample(@Param("record") BillDetail record, @Param("example") BillDetailExample example);

    int updateByPrimaryKeySelective(BillDetail record);

    int updateByPrimaryKey(BillDetail record);
    
    int deleteByBillId(Long billId);
}