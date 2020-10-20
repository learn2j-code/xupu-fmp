package com.dlm.fmp.constant;

public class CommonConstant {
//	//省市县类型标志
//	public final static int AREAINFO_PROVINCE = 1;
//	public final static int AREAINFO_CITY = 2;
//	public final static int AREAINFO_COUNTY = 3;
	
	
	//应答的成败标识
	public final static int RESPONSE_SUCCESS = 1;
	public final static int RESPONSE_FAIL = 0;
	
	
	/**
	 * 关系标识：1：子女与父；2：配与主,0：未找到关系；
	 */
	public final static int RELATIONSHIP_UNFIND = 0;
	public final static int RELATIONSHIP_CHILDFATHER = 1;
	public final static int RELATIONSHIP_SPOUSEMAIN = 2;

	/**
	 * 内容类型，1：成员词条，2：世代，3：其他
	 */
	public final static int CONTENTTYPE_MEMBER = 1;
	public final static int CONTENTTYPE_GENERATION = 2;
	public final static int CONTENTTYPE_OTHER = 3;
	
	/**
	 * 内置服务编码：
	 */
	//免收费服务--针对部分个人
	public final static String INTERNAL_SERVICE_FREECHARGE = "freecharge";
	//代收费服务
	public final static String INTERNAL_SERVICE_COLLECTIONCHARGE = "collectioncharge";
	//阶梯收费服务--小传
	public final static String INTERNAL_SERVICE_MULTIPLECHARGE = "multiplecharge";
}
