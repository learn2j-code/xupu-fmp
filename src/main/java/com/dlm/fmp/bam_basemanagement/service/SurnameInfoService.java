package com.dlm.fmp.bam_basemanagement.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dlm.fmp.pojo.SurnameInfo;


public interface SurnameInfoService {
	List<SurnameInfo> list();
	void add(SurnameInfo surname);
	void update(SurnameInfo surname);
	void delete(int surnameId);
	SurnameInfo get(int surnameId);
	//通过姓氏名查找姓氏信息
	SurnameInfo findSurnameInfoByName(String surname);
	//通过字数查找姓氏信息
	List<SurnameInfo> findSurnameListByWordNum(Integer wordNum);
	//按字母封装姓氏列表
	HashMap<String,List<SurnameInfo>> packSurnameMap(List<SurnameInfo> surnameList);
	//查询姓氏中最大的字数是多少
	Integer findMaxWordNumInSurname();
}
