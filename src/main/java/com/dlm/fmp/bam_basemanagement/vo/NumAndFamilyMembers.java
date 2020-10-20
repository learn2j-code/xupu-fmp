package com.dlm.fmp.bam_basemanagement.vo;


import java.util.List;
import com.dlm.fmp.pojo.FamilyMember;


public class NumAndFamilyMembers{
	private int generationNum;
	private int num;
	private List<FamilyMemberExtends> familyMemberList;
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
	public List<FamilyMemberExtends> getFamilyMemberList() {
		return familyMemberList;
	}
	public void setFamilyMemberList(List<FamilyMemberExtends> familyMemberList) {
		this.familyMemberList = familyMemberList;
	}
}
