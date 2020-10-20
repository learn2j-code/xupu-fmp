package com.dlm.fmp.bam_basemanagement.vo;

import com.dlm.fmp.pojo.SubFamilyInfo;

public class RequestEntityForSubFamilyInfo extends RequestEntity{
	private SubFamilyInfo requestParameter;

	public SubFamilyInfo getRequestParameter() {
		return requestParameter;
	}

	public void setRequestParameter(SubFamilyInfo requestParameter) {
		this.requestParameter = requestParameter;
	}

}
