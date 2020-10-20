package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.SubFamilyInfo;
import com.dlm.fmp.pojo.SubFamilyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubFamilyInfoMapper {
    long countByExample(SubFamilyInfoExample example);

    int deleteByExample(SubFamilyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubFamilyInfo record);

    int insertSelective(SubFamilyInfo record);

    List<SubFamilyInfo> selectByExample(SubFamilyInfoExample example);

    SubFamilyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubFamilyInfo record, @Param("example") SubFamilyInfoExample example);

    int updateByExample(@Param("record") SubFamilyInfo record, @Param("example") SubFamilyInfoExample example);

    int updateByPrimaryKeySelective(SubFamilyInfo record);

    int updateByPrimaryKey(SubFamilyInfo record);
}