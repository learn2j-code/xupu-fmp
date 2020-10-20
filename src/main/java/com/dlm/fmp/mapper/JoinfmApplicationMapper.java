package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.JoinfmApplication;
import com.dlm.fmp.pojo.JoinfmApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoinfmApplicationMapper {
    long countByExample(JoinfmApplicationExample example);

    int deleteByExample(JoinfmApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JoinfmApplication record);

    int insertSelective(JoinfmApplication record);

    List<JoinfmApplication> selectByExample(JoinfmApplicationExample example);

    JoinfmApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JoinfmApplication record, @Param("example") JoinfmApplicationExample example);

    int updateByExample(@Param("record") JoinfmApplication record, @Param("example") JoinfmApplicationExample example);

    int updateByPrimaryKeySelective(JoinfmApplication record);

    int updateByPrimaryKey(JoinfmApplication record);
}