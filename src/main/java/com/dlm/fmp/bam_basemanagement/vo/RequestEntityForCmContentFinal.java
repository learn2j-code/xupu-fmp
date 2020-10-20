package com.dlm.fmp.bam_basemanagement.vo;





public class RequestEntityForCmContentFinal extends RequestEntity{
	private CmContentFinalExtends requestParameter;
	private Integer bookId;
	private Integer contentType;
	private Integer preciseFlag;
	
	private String memberName;
	private String fatherName;
	private String spouseName;
	private String memberDetail;
	private String secPersonalName;//字
	private String mark;//号
	private Integer generationNum;//世代
	private String generationWord;//派
	
	private Integer brotherNum;
	private Integer sonNum;
	
	//查询标志
	private Integer sameSubClanFlag;//同房系标志，0：非同房系；1：同房系
	private Integer subNodeNumFlag;//加上子节点数量限制标志，0：不加；1：加
	private Integer startGeneration;//开始世代
	private Integer endGeneration;//结束世代
	
	private Integer systemAddRelationFlag;//是哪种系统挂载 1、按父名；2、按齿录；3、按兄弟；4、按区间；5、按扫描
	
	public CmContentFinalExtends getRequestParameter() {
		return requestParameter;
	}

	public void setRequestParameter(CmContentFinalExtends requestParameter) {
		this.requestParameter = requestParameter;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getContentType() {
		return contentType;
	}

	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}

	public Integer getPreciseFlag() {
		return preciseFlag;
	}

	public void setPreciseFlag(Integer preciseFlag) {
		this.preciseFlag = preciseFlag;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getMemberDetail() {
		return memberDetail;
	}

	public void setMemberDetail(String memberDetail) {
		this.memberDetail = memberDetail;
	}

	public String getSecPersonalName() {
		return secPersonalName;
	}

	public void setSecPersonalName(String secPersonalName) {
		this.secPersonalName = secPersonalName;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Integer getGenerationNum() {
		return generationNum;
	}

	public void setGenerationNum(Integer generationNum) {
		this.generationNum = generationNum;
	}

	public String getGenerationWord() {
		return generationWord;
	}

	public void setGenerationWord(String generationWord) {
		this.generationWord = generationWord;
	}

	public Integer getSystemAddRelationFlag() {
		return systemAddRelationFlag;
	}

	public Integer getBrotherNum() {
		return brotherNum;
	}

	public void setBrotherNum(Integer brotherNum) {
		this.brotherNum = brotherNum;
	}

	public Integer getSonNum() {
		return sonNum;
	}

	public void setSonNum(Integer sonNum) {
		this.sonNum = sonNum;
	}

	public void setSystemAddRelationFlag(Integer systemAddRelationFlag) {
		this.systemAddRelationFlag = systemAddRelationFlag;
	}

	public Integer getSameSubClanFlag() {
		return sameSubClanFlag;
	}

	public void setSameSubClanFlag(Integer sameSubClanFlag) {
		this.sameSubClanFlag = sameSubClanFlag;
	}

	public Integer getSubNodeNumFlag() {
		return subNodeNumFlag;
	}

	public void setSubNodeNumFlag(Integer subNodeNumFlag) {
		this.subNodeNumFlag = subNodeNumFlag;
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
