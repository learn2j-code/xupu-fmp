package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.EditorialStaff;
import com.dlm.fmp.pojo.EditorialStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EditorialStaffMapper {
    long countByExample(EditorialStaffExample example);

    int deleteByExample(EditorialStaffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EditorialStaff record);

    int insertSelective(EditorialStaff record);

    List<EditorialStaff> selectByExample(EditorialStaffExample example);

    EditorialStaff selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EditorialStaff record, @Param("example") EditorialStaffExample example);

    int updateByExample(@Param("record") EditorialStaff record, @Param("example") EditorialStaffExample example);

    int updateByPrimaryKeySelective(EditorialStaff record);

    int updateByPrimaryKey(EditorialStaff record);
}