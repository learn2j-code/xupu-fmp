package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.SubClanInfo;
import com.dlm.fmp.pojo.SubClanInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubClanInfoMapper {
    long countByExample(SubClanInfoExample example);

    int deleteByExample(SubClanInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubClanInfo record);

    int insertSelective(SubClanInfo record);

    List<SubClanInfo> selectByExample(SubClanInfoExample example);

    SubClanInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubClanInfo record, @Param("example") SubClanInfoExample example);

    int updateByExample(@Param("record") SubClanInfo record, @Param("example") SubClanInfoExample example);

    int updateByPrimaryKeySelective(SubClanInfo record);

    int updateByPrimaryKey(SubClanInfo record);
}