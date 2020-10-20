package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.HouseholdPayEvidence;
import com.dlm.fmp.pojo.HouseholdPayEvidenceExample;
import java.util.List;

public interface HouseholdPayEvidenceMapper {
    long countByExample(HouseholdPayEvidenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdPayEvidence record);

    int insertSelective(HouseholdPayEvidence record);

    List<HouseholdPayEvidence> selectByExample(HouseholdPayEvidenceExample example);

    HouseholdPayEvidence selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseholdPayEvidence record);

    int updateByPrimaryKey(HouseholdPayEvidence record);
}