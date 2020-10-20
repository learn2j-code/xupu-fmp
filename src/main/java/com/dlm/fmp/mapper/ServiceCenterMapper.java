package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.ServiceCenter;
import com.dlm.fmp.pojo.ServiceCenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceCenterMapper {
    long countByExample(ServiceCenterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServiceCenter record);

    int insertSelective(ServiceCenter record);

    List<ServiceCenter> selectByExample(ServiceCenterExample example);

    ServiceCenter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServiceCenter record, @Param("example") ServiceCenterExample example);

    int updateByExample(@Param("record") ServiceCenter record, @Param("example") ServiceCenterExample example);

    int updateByPrimaryKeySelective(ServiceCenter record);

    int updateByPrimaryKey(ServiceCenter record);
}