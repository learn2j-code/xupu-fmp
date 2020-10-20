package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.FamilySetting;
import com.dlm.fmp.pojo.FamilySettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilySettingMapper {
    long countByExample(FamilySettingExample example);

    int deleteByExample(FamilySettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FamilySetting record);

    int insertSelective(FamilySetting record);

    List<FamilySetting> selectByExample(FamilySettingExample example);

    FamilySetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FamilySetting record, @Param("example") FamilySettingExample example);

    int updateByExample(@Param("record") FamilySetting record, @Param("example") FamilySettingExample example);

    int updateByPrimaryKeySelective(FamilySetting record);

    int updateByPrimaryKey(FamilySetting record);
}