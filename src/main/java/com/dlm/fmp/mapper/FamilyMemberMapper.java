package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.FamilyMember;
import com.dlm.fmp.pojo.FamilyMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyMemberMapper {
    long countByExample(FamilyMemberExample example);

    int deleteByExample(FamilyMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FamilyMember record);

    int insertSelective(FamilyMember record);

    List<FamilyMember> selectByExample(FamilyMemberExample example);

    FamilyMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FamilyMember record, @Param("example") FamilyMemberExample example);

    int updateByExample(@Param("record") FamilyMember record, @Param("example") FamilyMemberExample example);

    int updateByPrimaryKeySelective(FamilyMember record);

    int updateByPrimaryKey(FamilyMember record);
}