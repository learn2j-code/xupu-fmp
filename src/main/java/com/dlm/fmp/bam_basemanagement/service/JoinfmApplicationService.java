package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.JoinfmApplication;

public interface JoinfmApplicationService {
	List<JoinfmApplication> list();
	void add(JoinfmApplication record);
	void update(JoinfmApplication record);
	void delete(int id);
	JoinfmApplication get(int id);
	
	void addJoinfmApplication(JoinfmApplication record);
}
