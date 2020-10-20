package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.fmp.bam_basemanagement.service.FamilySettingService;
import com.dlm.fmp.bam_basemanagement.service.KeywordsConfigService;
import com.dlm.fmp.mapper.FamilySettingMapper;
import com.dlm.fmp.mapper.KeywordsConfigMapper;
import com.dlm.fmp.pojo.FamilySetting;
import com.dlm.fmp.pojo.FamilySettingExample;
import com.dlm.fmp.pojo.KeywordsConfig;
import com.dlm.fmp.pojo.KeywordsConfigExample;

@Service
public class KeywordsConfigServiceImpl implements KeywordsConfigService {
	@Autowired
	KeywordsConfigMapper mapper;

	@Override
	public List<KeywordsConfig> list() {
		KeywordsConfigExample example = new KeywordsConfigExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(KeywordsConfig record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(KeywordsConfig record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public KeywordsConfig get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public String getKeywordsValueByKeywordsCode(String keywordsCode,Integer bookId) {
		KeywordsConfigExample example = new KeywordsConfigExample();
		example.createCriteria().andKeywordsCodeEqualTo(keywordsCode).andBookIdEqualTo(bookId);
		List<KeywordsConfig> keywordsConfigList = mapper.selectByExample(example);
		if(keywordsConfigList!=null&&keywordsConfigList.size()==1) {
			return keywordsConfigList.get(0).getKeywordsValue();
		}
		return null;
	}

	@Override
	public List<KeywordsConfig> findKeywordsConfigListByBookId(Integer bookId) {
		KeywordsConfigExample example = new KeywordsConfigExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andBookIdEqualTo(bookId);
		return mapper.selectByExample(example);
	}

}
