package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.AreaInfo;
import com.dlm.fmp.pojo.AreaInfoExample;
import java.util.List;

public interface AreaInfoMapper {
    long countByExample(AreaInfoExample example);

    int deleteByExample(AreaInfoExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(AreaInfo record);

    int insertSelective(AreaInfo record);

    List<AreaInfo> selectByExample(AreaInfoExample example);

    AreaInfo selectByPrimaryKey(Integer areaId);

    int updateByPrimaryKeySelective(AreaInfo record);

    int updateByPrimaryKey(AreaInfo record);
}