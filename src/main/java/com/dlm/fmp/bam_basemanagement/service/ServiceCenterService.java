package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.ServiceCenter;

public interface ServiceCenterService {
	List<ServiceCenter> list();
	void add(ServiceCenter record);
	void update(ServiceCenter record);
	void delete(int id);
	ServiceCenter get(int id);
	
}
