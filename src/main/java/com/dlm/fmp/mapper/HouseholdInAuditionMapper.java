package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.HouseholdInAudition;
import com.dlm.fmp.pojo.HouseholdInAuditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseholdInAuditionMapper {
    long countByExample(HouseholdInAuditionExample example);

    int deleteByExample(HouseholdInAuditionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdInAudition record);

    int insertSelective(HouseholdInAudition record);

    List<HouseholdInAudition> selectByExample(HouseholdInAuditionExample example);

    HouseholdInAudition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseholdInAudition record, @Param("example") HouseholdInAuditionExample example);

    int updateByExample(@Param("record") HouseholdInAudition record, @Param("example") HouseholdInAuditionExample example);

    int updateByPrimaryKeySelective(HouseholdInAudition record);

    int updateByPrimaryKey(HouseholdInAudition record);
}