package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.FamilyCouncil;
import com.dlm.fmp.pojo.FamilyCouncilExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyCouncilMapper {
    long countByExample(FamilyCouncilExample example);

    int deleteByExample(FamilyCouncilExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FamilyCouncil record);

    int insertSelective(FamilyCouncil record);

    List<FamilyCouncil> selectByExample(FamilyCouncilExample example);

    FamilyCouncil selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FamilyCouncil record, @Param("example") FamilyCouncilExample example);

    int updateByExample(@Param("record") FamilyCouncil record, @Param("example") FamilyCouncilExample example);

    int updateByPrimaryKeySelective(FamilyCouncil record);

    int updateByPrimaryKey(FamilyCouncil record);
}