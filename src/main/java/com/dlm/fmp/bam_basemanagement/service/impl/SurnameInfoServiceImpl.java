package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.SurnameInfoService;
import com.dlm.fmp.mapper.SurnameInfoMapper;
import com.dlm.fmp.pojo.SurnameInfo;
import com.dlm.fmp.pojo.SurnameInfoExample;

@Service
public class SurnameInfoServiceImpl implements SurnameInfoService {
	@Autowired
	SurnameInfoMapper mapper;

	@Override
	public List<SurnameInfo> list() {
		SurnameInfoExample example = new SurnameInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(SurnameInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(SurnameInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public SurnameInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public SurnameInfo findSurnameInfoByName(String record) {
		SurnameInfoExample example = new SurnameInfoExample();
		example.createCriteria().andSurnameEqualTo(record);
		List<SurnameInfo> surnameInfoList = mapper.selectByExample(example);
		if(surnameInfoList.isEmpty()){
			return null;
		}
		return surnameInfoList.get(0);
	}

	@Override
	public HashMap<String,List<SurnameInfo>> packSurnameMap(List<SurnameInfo> surnameList) {
		HashMap<String,List<SurnameInfo>> surnameInfoMap = new HashMap<String,List<SurnameInfo>>();
		HashMap<String,List<SurnameInfo>> surnameMap = new HashMap<String,List<SurnameInfo>>();
		for(SurnameInfo surname:surnameList) {
			String surnamePinyin = surname.getSurnamePinyin();
			String firstApha = surnamePinyin.substring(0, 1).toUpperCase();
			if(surnameMap.containsKey(firstApha)) {
				List<SurnameInfo> surnameInfoList = surnameMap.get(firstApha);
				surnameInfoList.add(surname);
			}else {
				List<SurnameInfo> newList = new ArrayList<SurnameInfo>();
				newList.add(surname);
				surnameMap.put(firstApha, newList);
			}
		}
		//26字母
		for(int i=(int)'a';i<'a'+26;i++)
		{
			String alphA = (char)(i-32)+"";
			if(surnameMap.containsKey(alphA)){
				surnameInfoMap.put(alphA, surnameMap.get(alphA));
			}
		}
		return surnameInfoMap;
	}
	
	@Override
	public List<SurnameInfo> findSurnameListByWordNum(Integer wordNum) {
		SurnameInfoExample example = new SurnameInfoExample();
		example.setOrderByClause("surname_pinyin asc");
		example.createCriteria().andWordNumEqualTo(wordNum);
		return mapper.selectByExample(example);
	}

	@Override
	public Integer findMaxWordNumInSurname() {
		SurnameInfoExample example = new SurnameInfoExample();
		example.setOrderByClause("word_num desc");
		List<SurnameInfo> surnameInfoList = mapper.selectByExample(example);
		if(surnameInfoList.size()>0) {
			return surnameInfoList.get(0).getWordNum();
		}
		return 0;
	}

	
}
