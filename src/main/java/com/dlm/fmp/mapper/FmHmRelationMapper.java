package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.FmHmRelation;
import com.dlm.fmp.pojo.FmHmRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmHmRelationMapper {
    long countByExample(FmHmRelationExample example);

    int deleteByExample(FmHmRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FmHmRelation record);

    int insertSelective(FmHmRelation record);

    List<FmHmRelation> selectByExample(FmHmRelationExample example);

    FmHmRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmHmRelation record, @Param("example") FmHmRelationExample example);

    int updateByExample(@Param("record") FmHmRelation record, @Param("example") FmHmRelationExample example);

    int updateByPrimaryKeySelective(FmHmRelation record);

    int updateByPrimaryKey(FmHmRelation record);
}