package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.FmRelation;
import com.dlm.fmp.pojo.FmRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmRelationMapper {
    long countByExample(FmRelationExample example);

    int deleteByExample(FmRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FmRelation record);

    int insertSelective(FmRelation record);

    List<FmRelation> selectByExample(FmRelationExample example);

    FmRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmRelation record, @Param("example") FmRelationExample example);

    int updateByExample(@Param("record") FmRelation record, @Param("example") FmRelationExample example);

    int updateByPrimaryKeySelective(FmRelation record);

    int updateByPrimaryKey(FmRelation record);
}