package com.dlm.fmp.bam_basemanagement.vo;

import com.dlm.fmp.pojo.SubClanInfo;

public class SubClanInfoExtends extends SubClanInfo {
	private String cmName;
	private String fullName;
	private Integer startGeneration;
	private Integer endGeneration;
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCmName() {
		return cmName;
	}

	public void setCmName(String cmName) {
		this.cmName = cmName;
	}

	public Integer getStartGeneration() {
		return startGeneration;
	}

	public void setStartGeneration(Integer startGeneration) {
		this.startGeneration = startGeneration;
	}

	public Integer getEndGeneration() {
		return endGeneration;
	}

	public void setEndGeneration(Integer endGeneration) {
		this.endGeneration = endGeneration;
	}
}
