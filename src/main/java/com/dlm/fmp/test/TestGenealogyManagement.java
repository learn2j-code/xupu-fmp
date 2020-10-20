package com.dlm.fmp.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthStyle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dlm.fmp.bam_basemanagement.service.ClanVolumeService;
import com.dlm.fmp.bam_basemanagement.service.CmContentFinalService;
import com.dlm.fmp.bam_basemanagement.service.CmContentService;
import com.dlm.fmp.bam_basemanagement.service.CmRelationService;
import com.dlm.fmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.fmp.bam_basemanagement.service.FmCmRelationService;
import com.dlm.fmp.bam_basemanagement.service.SubClanInfoService;
import com.dlm.fmp.bam_basemanagement.vo.CmContentFinalExtends;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForCmContentFinal;
import com.dlm.fmp.bam_basemanagement.vo.SubClanInfoExtends;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.ClanVolume;
import com.dlm.fmp.pojo.CmContent;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.FamilyMember;
import com.dlm.fmp.pojo.FmCmRelation;
import com.dlm.fmp.pojo.SubClanInfo;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestGenealogyManagement {
	@Autowired
	CmContentService cmContentService;	
	@Autowired
	CmContentFinalService cmContentFinalService;
	
	@Autowired
	CmRelationService cmRelationService;
	
	@Autowired
	FamilyMemberService familyMemberService;
	
	@Autowired
	FmCmRelationService fmCmRelationService;
	
	@Autowired
	ClanVolumeService clanVolumeService;
	
	@Autowired
	SubClanInfoService subClanInfoService;
//	@Test
//	public void findByPage() {
//		Page page = new Page();
//		int count = 6;
//		int num = 1;
//		page.setStart(count*(num-1));
//		page.setCount(count);
//		PageHelper.offsetPage(page.getStart(),page.getCount());
////		int total = (int) new PageInfo<>(userList).getTotal();
////        page.setTotal(total);
//	}
	
//	@Test
//	public void findCmContentFinalListByMemberInfoForPhone() {
//		FamilyMember record = new FamilyMember();
//		record.setMemberGender(1);
//		record.setMemberName("和");
//		record.setMemberSurname("欧阳");
//		
//		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<CmContentFinalExtends>();
//		List<FamilyMember> familyMemberList = familyMemberService.findFamilyMemberListByBaseInfo(record);
//		for(FamilyMember familyMember:familyMemberList) {
//			List<FmCmRelation> fmCmRelationList = fmCmRelationService.findCmListByFmId(familyMember.getId());
//			List<CmContentFinalExtends> tempExtendsList = cmContentFinalService.findCmContentFinalExtendsListByRelationList(fmCmRelationList);
//			if(tempExtendsList.size()>0) {
//				cmContentFinalExtendsList.addAll(tempExtendsList);
//			}
//		}
//		System.out.println(familyMemberList.size());
//	}
	
	
	
////	//更新里面的错别字
//	@Test
//	public void updateCmContentFinalList() {
//		//查询出原文表该卷的记录
////		String kk = "皎:晈;尙:尚"; //内:內;溁:濚;坣:壆;价:價;恒:恆;清:淸;爲:為;杰:傑;敎:教;瑶:瑤;鳯:鳳;㸃:點;䖍:虔;擧:舉;
////		String kk = "清:淸"; //内:內;溁:濚;坣:壆;价:價;恒:恆;清:淸;爲:為;杰:傑;敎:教;瑶:瑤;鳯:鳳;㸃:點;䖍:虔;擧:舉;
//		String kk = "㫤：昶;晈：皎;譄：增;昻：昂;穂：穗;卽：即;爼：俎;㮊：楙;詠：咏;簮：簪;瑯：琅;鉁：珍;夑：燮;厯：历;曆：历;鳯：凤;易灬：炀;戱：戏;㑹：会;逹：达;煇：辉;㸃：点;荘：庄;衞：卫;榦：干;擧：举;䕶：护;鎭：镇;錄：录;綠：绿;凖：准";
//		
//		String[] tempList = kk.split(";");
//		for(String temp:tempList) {
//			String[] mm = temp.split("：");
////			String[] mm = kk.split("：");
//			//替换前的字符串
//			String bookName = mm[0];
//			//替换后的字符串
//			String subClanName = mm[1];
//			CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
//			cmContentFinal.setBookId(Integer.valueOf(6));
//			cmContentFinal.setBookName(bookName);
//			cmContentFinal.setSubClanName(subClanName);
//			cmContentFinalService.updateCmContentFinalList(cmContentFinal);
//		}
//	}
	
//	//删除表
//	@Test
//	public void deleteFromCmContentFinal() {
//		cmContentFinalService.deleteFromBook(1);
//	}
	
//	//更新里面的标志位
//	@Test
//	public void updateCmContentFinalFlag() {
//		CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
//		cmContentFinal.setBookId(Integer.valueOf(1));
//		cmContentFinalService.updateCmContentFinalFlag(cmContentFinal);
//	}
	
//	//更新里面的father_name,spouse_name,member_name,member_rel这四个为简体
//	@Test
//	public void updateCmContentFinalToSimple() {
//		CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
////		cmContentFinal.setBookId(Integer.valueOf(1));
//		cmContentFinalService.updateCmContentFinalToSimple(cmContentFinal);
//	}
	
//	//更新里面的出继标志
//	@Test
//	public void updateCmContentFinalToSimple() {
//		CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
//		cmContentFinal.setBookId(Integer.valueOf(1));
//		cmContentFinalService.updateCmContentFinalToSimple(cmContentFinal);
//	}
	
//	@Test
//	public void findUnrelatedNum() {
//		//查询出原文表该卷的记录
//		CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
//		
//        cmContentFinal.setBookId(Integer.valueOf(1));
//        cmContentFinal.setRelFlag(0);
//        int sum=0;
//        for(int i=2;i<23;i++) {
//        	cmContentFinal.setGenerationNum(i);
//        	Long num = cmContentFinalService.findUnrelatedNum(cmContentFinal);
//        	System.out.println("世代"+i+":未挂载完的人数"+":"+num);
//        	sum+=num;
//        }
//        System.out.println("总共未挂载完的人数"+":"+sum);
//	}
	
	
//	@Test
//	public void addConnectionBySystem() {
//		List<CmContentFinalExtends> cmContentFinalList = cmContentFinalService.findMainMemberListByFuzzyName(record);
//	}
	
	//设置该人的在老谱上记录的儿子数量
//	@Test
//	public void setMainMemberForSonNum() {
//		CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
//        cmContentFinal.setBookId(Integer.valueOf(1));
//        String[] details = {"子十二","子十一","子十","子九","子八","子七","子六","子五","子四","子三","子二","子一"}; 
//        
////        String[] details = {"承繼"}; 
//        for(int i =12;i>0;i--) {
//        	cmContentFinal.setSonNum(i);
//        	System.out.println(details[12-i]);
//        	cmContentFinal.setMemberDetail(details[12-i]);
//        	cmContentFinalService.setMainMemberForSonNum(cmContentFinal);
//        }
//	}
	
	//设置该人的在世系图上挂载的实际儿子数量
//	@Test
//	public void setMainMemberForSonNumReal() {
//		CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
//        cmContentFinal.setBookId(Integer.valueOf(14));
//	    cmContentFinalService.setMainMemberForSonNumReal(cmContentFinal);
//	}
	
//	//批量对接某一代的成员关系
//	@Test
//	public void addRelationListMoreInGeneration() {
//		for(int i=10;i<22;i++) {
//			CmContentFinalExtends record = new CmContentFinalExtends();
//			record.setStartGeneration(i);
//			record.setEndGeneration(i);
//			record.setBookId(Integer.valueOf(1));
//			record.setSubClanId(0);
//			cmContentFinalService.addRelationListMoreInGeneration(record);
//			
//		}
//	}
	
//	//更新24卷的人员序号
//	@Test
//	public void updateNumForCmContent() {
//		CmContent record = new CmContent();
//		record.setBookId(Integer.valueOf(1));
//		record.setVolumeId(24);
//		cmContentService.updateNumForCmContent(record);
//	}
//	//更新24卷的人员序号
//	@Test
//	public void updateNumForCmContent() {
//		CmContentFinalExtends record = new CmContentFinalExtends();
//		record.setBookId(Integer.valueOf(1));
//		record.setVolumeId(24);
//		cmContentFinalService.updateNumForCmContentFinal(record);
//	}
	
//	//将老谱成员拷贝到老谱最终表
//	@Test
//	public void copyCmContentToFinal() {
//		CmContentFinalExtends record = new CmContentFinalExtends();
//		record.setBookId(Integer.valueOf(1));
//		record.setVolumeId(24);
//		cmContentFinalService.copyCmContentToFinal(record);
//	}
	
//	//设置每个人的排行
//	@Test
//	public void setRankingForCmContentToFinal() {
//		CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
//		cmContentFinal.setBookId(Integer.valueOf(6));
//		cmContentFinalService.setRankingForCmContentToFinal(cmContentFinal);
////		String[] details = {"十二子","十一子","十子","九子","八子","七子","六子","五子","四子","三子","次子","长子"}; 
//		String[] details = {"二子","一子"};
////      String[] details = {"承繼"}; 
////		cmContentFinalService.setRankingForCmContentToFinal(cmContentFinal);
//		for(int i =2;i>0;i--) {
//			cmContentFinal.setRanking(i);
//			System.out.println(details[2-i]);
//			cmContentFinal.setRelKeyword(details[2-i]);
//			cmContentFinalService.setRankingForCmContentToFinal(cmContentFinal);
//		}
//	}
	
	//1、按兄弟进行挂载，先查未挂载的有兄弟的节点，然后查出该节点的所有兄弟，
	//2、查看所有兄弟是否都有挂载父亲节点，如果挂载的是同一个父亲，则将其余的节点都挂载至该父亲上
//	@Test
//	public void setRelationForBrotherNode() {
////		for(int i=19;i<20;i++) {
////			CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
////			cmContentFinal.setBookId(Integer.valueOf(1));
////			cmContentFinal.setGenerationNum(i);
////			cmContentFinalService.setRelationForBrotherNode(cmContentFinal);
////		}
//		
//		RequestEntityForCmContentFinal requestEntity = new RequestEntityForCmContentFinal();
//		try {
//    		Page page = new Page();
//    		page.setStart(4);
//    		page.setCount(100);
//			int pageNum = (page.getStart()-1);
//			if(pageNum<0){
//				return ;
//			}
//			PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
//			
//			Map<String, Object> data = new HashMap<String, Object>();
//			
//			CmContentFinalExtends condition = new CmContentFinalExtends();
//			condition.setBookId(6);
//			condition.setContentType(1);//只看成员
//			condition.setStartGeneration(requestEntity.getStartGeneration());
//			condition.setEndGeneration(requestEntity.getEndGeneration());
//			
//			List<CmContentFinal> cmContentFinalList = cmContentFinalService.findMainCmContentFinalListByCondition(condition);
//			
//			cmRelationService.addCmRelationListForMainInBrotherNode(requestEntity.getSameSubClanFlag(),requestEntity.getSubNodeNumFlag(),cmContentFinalList);
//			
//			
//			int total = (int)new PageInfo<>(cmContentFinalList).getTotal();
//			page.setTotal(total);
//			page.caculateLast(total);
//			
//			data.put("page", page);
//    		
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	//为挑子继子挂载父节点
//	@Test
//	public void setRelationForLocateNode() {
//		CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
//		cmContentFinal.setBookId(Integer.valueOf(1));
//		cmContentFinal.setToLocate(2);
//		cmContentFinalService.setRelationForLocateNode(cmContentFinal);
//	}
	
//	//区间对接父子节点
//	@Test
//	public void setRelationInArea() {
//		CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
//		cmContentFinal.setBookId(Integer.valueOf(1));
//		cmContentFinalService.setRelationInArea(cmContentFinal);
//	}
	
	//扫描式强制挂载 
	//限制条件就是sub_clan_id相等，并且son_num>son_num_real
	//比如son_num-son_num_real=3，直接取三条sub_clan_id跟它相等，且rel_flag为0的亲节点，直接创建父子关系，然后更新当前节点的son_num_real
//	@Test
//	public void setRelationByForceScan() {
//		CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
//		cmContentFinal.setBookId(Integer.valueOf(1));
//		cmContentFinalService.setRelationByForceScan(cmContentFinal);
//	}
	
//	//删除数据
//	@Test
//	public void deleteData() {
//		CmContentFinal record = new CmContentFinal();
//		record.setBookId(6);
//		cmContentFinalService.deleteCmContentFinalFromBook(record);
//	}
	//拷贝数据
//	@Test
//	public void copyData() {
//		List<ClanVolume> volumeList1 = clanVolumeService.findClanVolumeListByBookId(1, null);
//		List<ClanVolume> volumeList2 = clanVolumeService.findClanVolumeListByBookId(6, null);
//		for(ClanVolume volume1:volumeList1) {
//			CmContentFinal condition = new CmContentFinal();
//			condition.setBookId(1);
//			condition.setVolumeId(volume1.getId());
//			List<CmContentFinal> cmContentFinalList = cmContentFinalService.findCmContentFinalListByCondition(condition);
//			for(CmContentFinal cmContentFinal:cmContentFinalList) {
//				CmContentFinal newCmContentFinal = new CmContentFinal();
//				BeanUtils.copyProperties(cmContentFinal, newCmContentFinal);
//				newCmContentFinal.setBookId(6);
//				newCmContentFinal.setVolumeId(volumeList2.get(volume1.getVolumeNo()-1).getId());
//				newCmContentFinal.setRelFlag(0);
//				newCmContentFinal.setSonNumReal(0);
//				newCmContentFinal.setSonNumDiff(cmContentFinal.getSonNum());
//				newCmContentFinal.setId(null);
//				cmContentFinalService.add(newCmContentFinal);
//			}
//		}
//	}
	
//	//修改数据
//	@Test
//	public void updateData() {
//		List<ClanVolume> volumeList = clanVolumeService.findClanVolumeListByBookId(6, null);
//		for(ClanVolume volume:volumeList) {
//			CmContentFinal condition = new CmContentFinal();
//			condition.setBookId(6);
//			condition.setVolumeId(volume.getId());
//			List<CmContentFinal> cmContentFinalList = cmContentFinalService.findCmContentFinalListByCondition(condition);
//			for(CmContentFinal cmContentFinal:cmContentFinalList) {
//				CmContentFinal newCmContentFinal = new CmContentFinal();
//				BeanUtils.copyProperties(cmContentFinal, newCmContentFinal);
//				newCmContentFinal.setSonNumReal(0);
//				newCmContentFinal.setSonNumDiff(cmContentFinal.getSonNum());
//				cmContentFinalService.update(newCmContentFinal);
//			}
//		}
//	}
	
//	//设置系房分支数据
//	@Test
//	public void setSubClanInfoForClan() {
//		CmContentFinalExtends newCM = new CmContentFinalExtends();
//		newCM.setBookId(1);
//		cmContentFinalService.setSubClanInfoForClan(newCM);
//	}
	
//	//设置更新分支数据
//	@Test
//	public void updateParentIdForSubClanInfo() {
//		CmContentFinalExtends newCM = new CmContentFinalExtends();
//		newCM.setBookId(1);
//		cmContentFinalService.updateParentIdForSubClanInfo(newCM);
//	}
	
//	//设置更新分支id到final表
//	@Test
//	public void setSubClanIdForAllClanMember() {
//		CmContentFinalExtends newCM = new CmContentFinalExtends();
//		newCM.setBookId(1);
//		cmContentFinalService.setSubClanIdForAllClanMember(newCM);
////		CmContentFinalExtends newCM = new CmContentFinalExtends();
////		newCM.setBookId(1);
////		newCM.setContentType(1);
////		List<CmContentFinal> cmlist = cmContentFinalService.findCmContentFinalListByCondition(newCM);
////		cmContentFinalService.updateCmContentFinalListAtSubClanId(cmlist,-2);
//	}
	
//	//添加补充卷到老谱书
//	@Test
//	public void copyCmContentToFinalContinue() {
//		CmContentFinal newCM = new CmContentFinal();
//		newCM.setBookId(1);
//		newCM.setVolumeId(150);
//		cmContentFinalService.copyCmContentToFinalContinue(newCM);
//	}
	
//	//将词条内容中包含“已録”字眼的人员设置标志位
//	@Test
//	public void setExistFlagForCM() {
//		CmContentFinalExtends newCM = new CmContentFinalExtends();
//		newCM.setBookId(1);
//		newCM.setVolumeId(150);
//		cmContentFinalService.setExistFlagForCM(newCM);
//	}
	
//	//将新增卷的配偶进行挂载
//	@Test
//	public void addRelationForSpouseInContinue() {
//		CmContentFinalExtends newCM = new CmContentFinalExtends();
//		newCM.setBookId(1);
//		newCM.setVolumeId(150);
//		newCM.setContentType(1);
//		List<CmContentFinal> cmContentFinalList = cmContentFinalService.findSpouseCmContentFinalListByCondition(newCM);
//		cmRelationService.addCmRelationListForSpouse(cmContentFinalList);
//	}
	
//	//设置始祖分支
//	@Test
//	public void setSubClanInfoForClan() {
//		CmContentFinalExtends newCM = new CmContentFinalExtends();
//		newCM.setBookId(1);
//		newCM.setGenerationNum(15);
//		newCM.setNum(3);
//		newCM.setStartGeneration(21);
//		newCM.setEndGeneration(23);
//		cmContentFinalService.setYiForSubClanId(newCM);
//	}
	
//	//设置每个人的兄弟数量和妻子名字
//	@Test
//	public void setBrotherNumAndWifeListForCmContentToFinal() {
//		CmContentFinalExtends newCM = new CmContentFinalExtends();
//		newCM.setBookId(14);
//		cmContentFinalService.setBrotherNumAndWifeListForCmContentToFinal(newCM);
//	}
	
//	//设置老谱的subclanId 先要设置头节点
//	@Test
//	public void setSubClanIdForOldClanHeadFirst() {
//		CmContentFinal record = new CmContentFinal();
//		record.setBookId(6);
//		cmContentFinalService.setSubClanIdForOldClanHeadFirst(record);
//	}
	//设置老谱的subclanId
//	@Test
//	public void setSubClanIdForOldClan() {
//		CmContentFinal record = new CmContentFinal();
//		record.setBookId(6);
//		List<ClanVolume> volumeList = clanVolumeService.findClanVolumeListByBookId(6, 0);
//		for(ClanVolume clanVolume:volumeList) {
//			record.setVolumeId(clanVolume.getId());
//			cmContentFinalService.setSubClanIdForOldClan(record);
//		}
//	}
	
	
	
//	@Test
//	public void addCmRelationListForSpouse() {
//		CmContentFinal record = new CmContentFinal();
//		record.setBookId(6);
//		record.setGenerationNum(1);
//		List<CmContentFinal> cmContentFinalList = cmContentFinalService.findSpouseCmContentFinalListByCondition(record);
//		cmRelationService.addCmRelationListForSpouse(cmContentFinalList);
//	}
	
	@Test
	public void findCmContentFinalListByCondition() {
		CmContentFinal record = new CmContentFinal();
		record.setBookId(22);
//		record.setStartGeneration(4);
//		record.setEndGeneration(5);
//		record.setHasSpouseFlag(0);
//		record.setHeadId(115677);
//		record.setGenerationNum(1);
		List<CmContentFinal> cmContentFinalList = cmContentFinalService.findCmContentFinalListByCondition(record);
		cmContentFinalService.setThreeContentBy(cmContentFinalList);
		System.out.println();
	}
	
//	@Test
//	public void findCmContentFinalListByCondition() {
//		CmContentFinalExtends record = new CmContentFinalExtends();
//		record.setHeadId(115852);
//		record.setBookId(6);
//		record.setGenerationNum(10);
////		record.setGenerationNum(1);
//		List<CmContentFinalExtends> cmContentFinalList = cmContentFinalService.findAssignGenerationMemberListByHeadAndAssignGenerationNum(record);
//		System.out.println();
//		
////		SubClanInfoExtends condition = new SubClanInfoExtends();
////		condition.setBookId(6);
////		List<SubClanInfo> list =  subClanInfoService.findSubClanInfoListByBookId(condition);
////		for(SubClanInfo subClanInfo:list) {
////			Integer id  = subClanInfo.getCmId();
////			if(id != null) {
////				CmContentFinal cmContentFinal = cmContentFinalService.get(id);
////				if(cmContentFinal!=null) {
////					SubClanInfo newSubClanInfo = new SubClanInfo();	
////					newSubClanInfo.setId(subClanInfo.getId());
////					newSubClanInfo.setOrderNo(cmContentFinal.getOrderNo());
////					subClanInfoService.update(newSubClanInfo);
////				}
////			}
////		}
//	}
	
//	@Test
//	public void updateSubClanInfo() {
//		List<SubClanInfo> list = subClanInfoService.findSubClanInfoListByBookId(6, 1);
//		for(SubClanInfo subClanInfo:list) {
//			if(subClanInfo.getLevelType()==5) {
//				SubClanInfo newSubClanInfo = subClanInfoService.get(subClanInfo.getParentId());
//				String levelName = newSubClanInfo.getLevelName();
//				subClanInfo.setLevelName(levelName+subClanInfo.getSubClanName()+"支");
//				subClanInfoService.update(subClanInfo);
//			}
//		}
//	}
}
