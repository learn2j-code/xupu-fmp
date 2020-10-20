package com.dlm.fmp.bam_basemanagement.vo;


import java.util.List;
import com.dlm.fmp.pojo.CmContentFinal;


public class NumAndClanMembers{
	private int generationNum;
	private int num;
	private List<CmContentFinalExtends> cmContentFinalList;
	public int getGenerationNum() {
		return generationNum;
	}
	public void setGenerationNum(int generationNum) {
		this.generationNum = generationNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public List<CmContentFinalExtends> getCmContentFinalList() {
		return cmContentFinalList;
	}
	public void setCmContentFinalList(List<CmContentFinalExtends> cmContentFinalList) {
		this.cmContentFinalList = cmContentFinalList;
	}
}
