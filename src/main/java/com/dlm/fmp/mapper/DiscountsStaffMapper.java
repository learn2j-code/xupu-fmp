package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.DiscountsStaff;
import com.dlm.fmp.pojo.DiscountsStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscountsStaffMapper {
    long countByExample(DiscountsStaffExample example);

    int deleteByExample(DiscountsStaffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DiscountsStaff record);

    int insertSelective(DiscountsStaff record);

    List<DiscountsStaff> selectByExample(DiscountsStaffExample example);

    DiscountsStaff selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DiscountsStaff record, @Param("example") DiscountsStaffExample example);

    int updateByExample(@Param("record") DiscountsStaff record, @Param("example") DiscountsStaffExample example);

    int updateByPrimaryKeySelective(DiscountsStaff record);

    int updateByPrimaryKey(DiscountsStaff record);
}