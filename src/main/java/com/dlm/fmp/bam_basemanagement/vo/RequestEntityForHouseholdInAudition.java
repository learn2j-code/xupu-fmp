package com.dlm.fmp.bam_basemanagement.vo;


import java.util.List;

import com.dlm.fmp.pojo.HmInAudition;
import com.dlm.fmp.pojo.HouseholdInAudition;


public class RequestEntityForHouseholdInAudition {
	private HouseholdInAudition HouseholdInAudition;
	private List<HmInAudition> hmInAuditionList;
	public HouseholdInAudition getHouseholdInAudition() {
		return HouseholdInAudition;
	}
	public void setHouseholdInAudition(HouseholdInAudition householdInAudition) {
		HouseholdInAudition = householdInAudition;
	}
	public List<HmInAudition> getHmInAuditionList() {
		return hmInAuditionList;
	}
	public void setHmInAuditionList(List<HmInAudition> hmInAuditionList) {
		this.hmInAuditionList = hmInAuditionList;
	}

}
