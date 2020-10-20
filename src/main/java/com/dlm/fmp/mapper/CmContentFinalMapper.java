package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.CmContentFinalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmContentFinalMapper {
    long countByExample(CmContentFinalExample example);

    int deleteByExample(CmContentFinalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmContentFinal record);

    int insertSelective(CmContentFinal record);

    List<CmContentFinal> selectByExample(CmContentFinalExample example);

    CmContentFinal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmContentFinal record, @Param("example") CmContentFinalExample example);

    int updateByExample(@Param("record") CmContentFinal record, @Param("example") CmContentFinalExample example);

    int updateByPrimaryKeySelective(CmContentFinal record);

    int updateByPrimaryKey(CmContentFinal record);
}