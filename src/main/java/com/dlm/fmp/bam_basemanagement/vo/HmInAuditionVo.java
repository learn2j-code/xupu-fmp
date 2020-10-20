package com.dlm.fmp.bam_basemanagement.vo;

import com.dlm.fmp.pojo.HouseholdMember;

public class HmInAuditionVo {
	private Integer id;
	private HouseholdMember householdMember;
	private Integer payFlag;
	private String inMoney;
	private String storyMoney;
	public HouseholdMember getHouseholdMember() {
		return householdMember;
	}
	public void setHouseholdMember(HouseholdMember householdMember) {
		this.householdMember = householdMember;
	}
	public Integer getPayFlag() {
		return payFlag;
	}
	public void setPayFlag(Integer payFlag) {
		this.payFlag = payFlag;
	}
	public String getInMoney() {
		return inMoney;
	}
	public void setInMoney(String inMoney) {
		this.inMoney = inMoney;
	}
	public String getStoryMoney() {
		return storyMoney;
	}
	public void setStoryMoney(String storyMoney) {
		this.storyMoney = storyMoney;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
