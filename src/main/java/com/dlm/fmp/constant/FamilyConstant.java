package com.dlm.fmp.constant;

public class FamilyConstant {
	/**
	 * 分支始祖标识，默认为0：普通成员，1：分支始祖
	 */
	public final static int SUBFAMILYFLAG_COMMON = 0;
	public final static int SUBFAMILYFLAG_SPECIAL = 1;
	
//	/**
//	 * 族谱或家庭成员标识：默认为0，代表该数据来源族谱成员信息表，1代表该数据来源家庭成员信息表
//	 */
//	public final static int CLANMEMBER_CLAN = 0;
//	public final static int CLANMEMBER_HOUSEHOLD = 1;
	
	/**
	 * 扩展用：初始状态为0，
	 */
	public final static int CLANMEMBERSTATUS_UNSET = 0;
	public final static int CLANMEMBERSTATUS_SET = 1;

}
