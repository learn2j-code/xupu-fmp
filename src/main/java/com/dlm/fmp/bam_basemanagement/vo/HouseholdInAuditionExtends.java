package com.dlm.fmp.bam_basemanagement.vo;

import java.util.List;

import com.dlm.fmp.pojo.HouseholdInAudition;

public class HouseholdInAuditionExtends extends HouseholdInAudition{
	private List<HmInAuditionVo> HmInAuditionVoList;

	public List<HmInAuditionVo> getHmInAuditionVoList() {
		return HmInAuditionVoList;
	}

	public void setHmInAuditionVoList(List<HmInAuditionVo> hmInAuditionVoList) {
		HmInAuditionVoList = hmInAuditionVoList;
	}
}
