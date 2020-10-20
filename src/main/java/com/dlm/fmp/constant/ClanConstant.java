package com.dlm.fmp.constant;

import java.util.ArrayList;
import java.util.List;

public class ClanConstant {
	/**
	 * 族谱原文的解析标识： 初始状态为0，说明未进行解析；1代表解析完成
	 */
	public final static int CLANMEMBERCONTENT_UNPARSING = 0;
	public final static int CLANMEMBERCONTENT_PARSING = 1;
	
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

	/**
	 * 进入世系的标志：初始状态为0，说明未进入世系；1代表已进入世系
	 */
	public final static int CLANMEMBER_OUT_GENEALOGY = 0;
	public final static int CLANMEMBER_IN_GENEALOGY = 1;
	/**
	 * 用于解析三段式谱文中的关系字段
	 */
	public final static String SPOUSEKEYWORD = "赘夫,赘娶,赘男,赘婿,原配,元配,二配,次配,繼配,继配,续配,續配,續娶,再配,三配,四配,配,聘,副室,继室,再继,继,繼娶,再娶,元娶,娶,贅,庶";//以后
	public final static String CHILDKEYWORD = "無子,之子,從子,长子,長子,次子,十一子,十二子,一子,二子,三子,四子,五子,六子,七子,八子,九子,十子,繼子,撫子,養子,祧子,祧孫,之女,长女,長女,次女,一女,二女,三女,四女,五女,六女,七女,八女,九女,繼女,養女";
	public final static String OTHERKEYWORD = "公";
	public final static String COMMA = ",";
	public final static String COMMA_CHINA = "，";
	public final static String SON_KEYWORD = "無子,之子,從子,长子,長子,次子,十一子,十二子,一子,二子,三子,四子,五子,六子,七子,八子,九子,十子,繼子,撫子,養子,祧子,祧孫";
	public final static String DAUGHTER_KEYWORD = "之女,长女,長女,次女,一女,二女,三女,四女,五女,六女,七女,八女,九女,繼女,養女";
	public final static String HUSBAND_KEYWORD = "赘夫,赘娶,赘男,赘婿";
	public final static String WIFE_KEYWORD = "原配,元配,二配,次配,繼配,继配,续配,續配,續娶,再配,三配,四配,配,聘,副室,继室,再继,继,繼娶,再娶,元娶,娶,贅,庶";//以后
	/**
	 * 用于解析三段式谱文中的成员详情字段
	 */
	public final static String SECPERSONALNAME_KEYWORD = "派,名,又名,字,号";
	public final static String BIRTHDAYTIME_KEYWORD = "生于";
	public final static String DEATHDAYTIME_KEYWORD = "殁于";
	public final static String BURIED_KEYWORD = "葬";
	public final static String HAVESON_KEYWORD = "子,生子";
	public final static String HAVEDAUGHTER_KEYWORD = "女,生女";
	/**
	 * 表示男女；1为男  2为女
	 */
	public final static int CLANMEMBERCONTENT_MALE = 1;
	public final static int CLANMEMBERCONTENT_FEMALE = 2;
	
	/**
	 * 逻辑删除标志：初始状态为0，说明未删除；1代表已删除
	 */
	public final static int CLANMEMBER_NOT_DELETE = 0;
	public final static int CLANMEMBER_DELETED = 1;
	
	
	/**
	 * 关系标识：1：子女与父；2：配与主；
	 */
	public final static int CLANMEMBER_RELATIONSHIP_CHILDFATHER = 1;
	public final static int CLANMEMBER_RELATIONSHIP_SPOUSESUB = 2;
	public final static String INTELNET = "@";
	public final static String COLON = ":";
	public final static String ASTERISK = "*";
	public final static String FOREKEYWORD = "派,名,又名,字,号,生于,时年,时寿,殁于,葬";
	public final static String BACKKEYWORD= "子,女";
	public final static String SPECIALWORD = "字,号";
	
	//胡氏派语
	public final static String GENERATIONWORD_HU = "始德道溟隆本紹胡興一國正天心順官清民自安文光昭祖澤力學定揚名賢良輝盛世繼起振家聲";//派语：始德道溟隆，本紹胡興一。國正天心順，官清民自安。文光昭祖澤，力學定揚名。賢良輝盛世，繼起振家聲。
	
	//解析世代、齿录
//	public final static String GENERATIONWORD_HU =
	
	public static void main(String[] args) {
		int kk = 11;
		int tt = 3;
		int mm = 8;
		int ss = tt + mm;
		List<Integer> ww = new ArrayList<>();
		ww.add(kk);
		if(ww.contains(ss)) {
			System.out.println(true);
		}
	}
	
}
