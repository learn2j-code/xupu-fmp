package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.HmInAudition;
import com.dlm.fmp.pojo.HmInAuditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HmInAuditionMapper {
    long countByExample(HmInAuditionExample example);

    int deleteByExample(HmInAuditionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HmInAudition record);

    int insertSelective(HmInAudition record);

    List<HmInAudition> selectByExample(HmInAuditionExample example);

    HmInAudition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HmInAudition record, @Param("example") HmInAuditionExample example);

    int updateByExample(@Param("record") HmInAudition record, @Param("example") HmInAuditionExample example);

    int updateByPrimaryKeySelective(HmInAudition record);

    int updateByPrimaryKey(HmInAudition record);
}