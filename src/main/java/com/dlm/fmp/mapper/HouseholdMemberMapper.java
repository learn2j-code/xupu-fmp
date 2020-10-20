package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.HouseholdMember;
import com.dlm.fmp.pojo.HouseholdMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseholdMemberMapper {
    long countByExample(HouseholdMemberExample example);

    int deleteByExample(HouseholdMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdMember record);

    int insertSelective(HouseholdMember record);

    List<HouseholdMember> selectByExample(HouseholdMemberExample example);

    HouseholdMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseholdMember record, @Param("example") HouseholdMemberExample example);

    int updateByExample(@Param("record") HouseholdMember record, @Param("example") HouseholdMemberExample example);

    int updateByPrimaryKeySelective(HouseholdMember record);

    int updateByPrimaryKey(HouseholdMember record);
}