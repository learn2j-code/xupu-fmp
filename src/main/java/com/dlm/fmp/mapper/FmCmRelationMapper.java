package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.FmCmRelation;
import com.dlm.fmp.pojo.FmCmRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmCmRelationMapper {
    long countByExample(FmCmRelationExample example);

    int deleteByExample(FmCmRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FmCmRelation record);

    int insertSelective(FmCmRelation record);

    List<FmCmRelation> selectByExample(FmCmRelationExample example);

    FmCmRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmCmRelation record, @Param("example") FmCmRelationExample example);

    int updateByExample(@Param("record") FmCmRelation record, @Param("example") FmCmRelationExample example);

    int updateByPrimaryKeySelective(FmCmRelation record);

    int updateByPrimaryKey(FmCmRelation record);
}