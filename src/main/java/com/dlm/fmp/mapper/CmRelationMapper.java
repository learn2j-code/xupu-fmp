package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.CmRelation;
import com.dlm.fmp.pojo.CmRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmRelationMapper {
    long countByExample(CmRelationExample example);

    int deleteByExample(CmRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmRelation record);

    int insertSelective(CmRelation record);

    List<CmRelation> selectByExample(CmRelationExample example);

    CmRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmRelation record, @Param("example") CmRelationExample example);

    int updateByExample(@Param("record") CmRelation record, @Param("example") CmRelationExample example);

    int updateByPrimaryKeySelective(CmRelation record);

    int updateByPrimaryKey(CmRelation record);
}