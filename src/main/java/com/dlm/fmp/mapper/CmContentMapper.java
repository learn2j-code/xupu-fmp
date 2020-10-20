package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.CmContent;
import com.dlm.fmp.pojo.CmContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmContentMapper {
    long countByExample(CmContentExample example);

    int deleteByExample(CmContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmContent record);

    int insertSelective(CmContent record);

    List<CmContent> selectByExample(CmContentExample example);

    CmContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmContent record, @Param("example") CmContentExample example);

    int updateByExample(@Param("record") CmContent record, @Param("example") CmContentExample example);

    int updateByPrimaryKeySelective(CmContent record);

    int updateByPrimaryKey(CmContent record);
}