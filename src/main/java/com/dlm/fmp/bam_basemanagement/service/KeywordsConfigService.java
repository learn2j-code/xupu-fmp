package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.pojo.KeywordsConfig;


public interface KeywordsConfigService {
	List<KeywordsConfig> list();
	void add(KeywordsConfig record);
	void update(KeywordsConfig record);
	void delete(int id);
	KeywordsConfig get(int id);
	
	String getKeywordsValueByKeywordsCode(String keywordsCode,Integer bookId);
	
	List<KeywordsConfig> findKeywordsConfigListByBookId(Integer bookId);
}
