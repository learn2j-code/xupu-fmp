package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.CmModificationRecord;
import com.dlm.fmp.pojo.CmModificationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmModificationRecordMapper {
    long countByExample(CmModificationRecordExample example);

    int deleteByExample(CmModificationRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmModificationRecord record);

    int insertSelective(CmModificationRecord record);

    List<CmModificationRecord> selectByExample(CmModificationRecordExample example);

    CmModificationRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmModificationRecord record, @Param("example") CmModificationRecordExample example);

    int updateByExample(@Param("record") CmModificationRecord record, @Param("example") CmModificationRecordExample example);

    int updateByPrimaryKeySelective(CmModificationRecord record);

    int updateByPrimaryKey(CmModificationRecord record);
}