package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.HmRelation;
import com.dlm.fmp.pojo.HmRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HmRelationMapper {
    long countByExample(HmRelationExample example);

    int deleteByExample(HmRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HmRelation record);

    int insertSelective(HmRelation record);

    List<HmRelation> selectByExample(HmRelationExample example);

    HmRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HmRelation record, @Param("example") HmRelationExample example);

    int updateByExample(@Param("record") HmRelation record, @Param("example") HmRelationExample example);

    int updateByPrimaryKeySelective(HmRelation record);

    int updateByPrimaryKey(HmRelation record);
}