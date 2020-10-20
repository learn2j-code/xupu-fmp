package com.dlm.fmp.bam_basemanagement.vo;

import com.dlm.fmp.pojo.CmContent;

public class RequestEntityForCmContent extends RequestEntity{
	private CmContent requestParameter;

	public CmContent getRequestParameter() {
		return requestParameter;
	}

	public void setRequestParameter(CmContent requestParameter) {
		this.requestParameter = requestParameter;
	}

}
