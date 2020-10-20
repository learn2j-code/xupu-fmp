package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.DiscountsStaff;

public interface DiscountsStaffService {
	List<DiscountsStaff> list();
	void add(DiscountsStaff record);
	void update(DiscountsStaff record);
	void delete(int id);
	DiscountsStaff get(int id);
	
	List<DiscountsStaff> findDiscountsStaffListBySettingId(Integer settingId);
	
	DiscountsStaff findDiscountsStaffByIdentityNo(String indentityNo);
}
