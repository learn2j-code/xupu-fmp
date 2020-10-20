package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.HouseholdPayment;
import com.dlm.fmp.pojo.HouseholdPaymentExample;
import java.util.List;

public interface HouseholdPaymentMapper {
    long countByExample(HouseholdPaymentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdPayment record);

    int insertSelective(HouseholdPayment record);

    List<HouseholdPayment> selectByExample(HouseholdPaymentExample example);

    HouseholdPayment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseholdPayment record);

    int updateByPrimaryKey(HouseholdPayment record);
}