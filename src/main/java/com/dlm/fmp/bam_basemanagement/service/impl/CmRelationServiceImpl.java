package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.util.StringUtils;
import com.dlm.fmp.bam_basemanagement.service.CmContentFinalService;
import com.dlm.fmp.bam_basemanagement.service.CmRelationService;
import com.dlm.fmp.bam_basemanagement.vo.CmContentFinalExtends;
import com.dlm.fmp.bam_basemanagement.vo.PersonInfo;
import com.dlm.fmp.constant.ClanConstant;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.mapper.CmRelationMapper;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.CmRelation;
import com.dlm.fmp.pojo.CmRelationExample;
import com.dlm.fmp.pojo.FmRelation;
import com.dlm.fmp.pojo.FmRelationExample;
import com.dlm.fmp.pojo.CmRelationExample.Criteria;
import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.github.pagehelper.PageHelper;

@Service
public class CmRelationServiceImpl implements CmRelationService {
	@Autowired
	CmRelationMapper mapper;
	@Autowired
	CmContentFinalService cmContentFinalService;
	@Override
	public List<CmRelation> list() {
		CmRelationExample example = new CmRelationExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(CmRelation record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(CmRelation record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public CmRelation get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void addCmRelationList(List<CmContentFinal> cmContentFinalList) {
		for(CmContentFinal cmContentFinal:cmContentFinalList) {
			CmContentFinal condition = new CmContentFinal();
			condition.setBookId(cmContentFinal.getBookId());
//			condition.setVolumeId(cmContentFinal.getVolumeId());
			
			CmRelation cmRelation = new CmRelation();
			cmRelation.setBookId(cmContentFinal.getBookId());
//			cmRelation.setVolumeId(cmContentFinal.getVolumeId());
			cmRelation.setMaId(cmContentFinal.getId());
			if(cmContentFinal.getGenerationNum()==null) {
				continue;
			}
			//先找是否存在父亲名称
			if(!StringUtils.isEmpty(cmContentFinal.getFatherName())) {
				condition.setMemberName(cmContentFinal.getFatherName());
				if(cmContentFinal.getGenerationNum()-1>0) {
					condition.setGenerationNum(cmContentFinal.getGenerationNum()-1);
					List<CmContentFinal> fatherList = cmContentFinalService.findCmContentFinalListByCondition(condition);
					if(fatherList.size()==1) {
						//子与父的关系
						cmRelation.setRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER);
						cmRelation.setMbId(fatherList.get(0).getId());
						addTwoNodesConnection(cmRelation);
					}
				}
			} else if(!StringUtils.isEmpty(cmContentFinal.getSpouseName())){
				//再找是否存在配偶名称	
				condition.setMemberName(cmContentFinal.getSpouseName());
				condition.setGenerationNum(cmContentFinal.getGenerationNum());
				List<CmContentFinal> spouseList = cmContentFinalService.findCmContentFinalListByCondition(condition);
				if(spouseList.size()==1) {
					//配与主的关系
					cmRelation.setRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_SPOUSESUB);
					cmRelation.setMbId(spouseList.get(0).getId());
					addTwoNodesConnection(cmRelation);
				}
			}
		}
	}

	@Override
	public List<PersonInfo> findSubNodeListByParentId(Integer parentId) {
		CmRelationExample example = new CmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER).andMbIdEqualTo(parentId);
		List<CmRelation> cmRelationList = mapper.selectByExample(example);
		List<PersonInfo> subNodeList = new ArrayList<PersonInfo>();
		for(CmRelation cmRelation:cmRelationList) {
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(cmRelation.getMaId());
			CmContentFinal cmContentFinal = cmContentFinalService.get(cmRelation.getMaId());
			if(cmContentFinal==null) {
				continue;
			}
			personInfo.setGender(cmContentFinal.getMemberGender());
			personInfo.setName(cmContentFinal.getMemberName());
			subNodeList.add(personInfo);
		}
		return subNodeList;
	}

	@Override
	public List<PersonInfo> findSpouseNodeListByMainId(Integer mainId) {
		CmRelationExample example = new CmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(ClanConstant.CLANMEMBER_RELATIONSHIP_SPOUSESUB).andMbIdEqualTo(mainId);
		List<CmRelation> cmRelationList = mapper.selectByExample(example);
		List<PersonInfo> spouseNodeList = new ArrayList<PersonInfo>();
		for(CmRelation cmRelation:cmRelationList) {
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(cmRelation.getMaId());
			CmContentFinal cmContentFinal = cmContentFinalService.get(cmRelation.getMaId());
			personInfo.setGender(cmContentFinal.getMemberGender());
			personInfo.setName(cmContentFinal.getMemberName());
			personInfo.setDetail(cmContentFinal.getMemberDetail());
			spouseNodeList.add(personInfo);
		}
		return spouseNodeList;
	}

	@Override
	public PersonInfo findParentNodeByMainId(Integer mainId) {
		CmRelationExample example = new CmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER).andMaIdEqualTo(mainId);
		List<CmRelation> cmRelationList = mapper.selectByExample(example);
		if(cmRelationList.size()>=1){
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(cmRelationList.get(0).getMbId());
			CmContentFinal cmContentFinal = cmContentFinalService.get(cmRelationList.get(0).getMbId());
			personInfo.setGender(cmContentFinal.getMemberGender());
			personInfo.setName(cmContentFinal.getMemberName());
			return personInfo;
		}
		return null;
	}

	@Override
	public PersonInfo findMainNodeBySpouseId(Integer spouseId) {
		CmRelationExample example = new CmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(ClanConstant.CLANMEMBER_RELATIONSHIP_SPOUSESUB).andMaIdEqualTo(spouseId);
		List<CmRelation> cmRelationList = mapper.selectByExample(example);
		if(cmRelationList.size()>=1){
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(cmRelationList.get(0).getMbId());
			CmContentFinal cmContentFinal = cmContentFinalService.get(cmRelationList.get(0).getMbId());
			personInfo.setGender(cmContentFinal.getMemberGender());
			personInfo.setName(cmContentFinal.getMemberName());
			return personInfo;
		}
		return null;
	}
	
	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void releaseTwoNodesConnection(CmRelation record) {
		//解除某节点与连接节点的关系,type 1：子与父，2：配与主
		CmRelationExample example = new CmRelationExample();
		Criteria criteria = example.createCriteria();
//		criteria.andRelTypeEqualTo(record.getRelType());
		criteria.andMbIdEqualTo(record.getMbId());
		criteria.andMaIdEqualTo(record.getMaId());
		criteria.andBookIdEqualTo(record.getBookId());
		List<CmRelation> cmRelationList = mapper.selectByExample(example);
		for(CmRelation cmRelation:cmRelationList) {
			delete(cmRelation.getId());
		}
		//修改该节点的标志为未挂上关系
		cmContentFinalService.updateMemberRelationStatusAndGenerationNum(record.getMaId(),record.getMbId(),CommonConstant.RELATIONSHIP_UNFIND);
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addTwoNodesConnection(CmRelation record) {
		List<CmRelation> cmRelationList = findCmRelationByMaIdAndMbId(record.getMaId(),record.getMbId());
		if(cmRelationList==null||cmRelationList.size()<=0) {
			add(record);
		}
		//修改该节点的标志为挂上关系
		cmContentFinalService.updateMemberRelationStatusAndGenerationNum(record.getMaId(),record.getMbId(),record.getRelType());
		//修改对接节点之下的所有节点的世代
		cmContentFinalService.updateRelationNodeGenerationNumByHeadNode(record.getMaId());
	}

	@Override
	public void changeTwoNodesConnection(CmRelation originalRecord, CmRelation destRecord) {
		releaseTwoNodesConnection(originalRecord);
		addTwoNodesConnection(destRecord);
	}

	@Override
	public List<CmRelation> findCmRelationListByBookId(Integer bookId) {
		CmRelationExample example = new CmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andBookIdEqualTo(bookId);
		return mapper.selectByExample(example);
	}

	@Override
	public void deleteAllRelationOfNode(Integer memberId) {
		//移除的是该节点的 子与父 或者配与主的关系
		CmRelationExample example = new CmRelationExample();
		example.createCriteria().andMaIdEqualTo(memberId);
		List<CmRelation> cmRelationList = mapper.selectByExample(example);
		for(CmRelation cmRelation:cmRelationList) {
			delete(cmRelation.getId());
			
		}
		//移除的是该节点的 父与子 或者主与配的关系
		CmRelationExample example1 = new CmRelationExample();
		example1.createCriteria().andMbIdEqualTo(memberId);
		List<CmRelation> cmRelationList1 = mapper.selectByExample(example1);
		for(CmRelation cmRelation:cmRelationList1) {
			delete(cmRelation.getId());
			//同时需要把其他关联成员的关系字段清除
			cmContentFinalService.updateMemberRelationStatusAndGenerationNum(cmRelation.getMaId(),cmRelation.getMbId(), CommonConstant.RELATIONSHIP_UNFIND);
		}
	}

	@Override
	public Integer findMbIdByMaIdAndRelType(Integer relType, Integer maId) {
		if(maId==null) {
			return null;
		}
		CmRelationExample example = new CmRelationExample();
		example.createCriteria().andRelTypeEqualTo(relType).andMaIdEqualTo(maId);
		List<CmRelation> cmRelationList = mapper.selectByExample(example);
		if(cmRelationList!=null&&cmRelationList.size()==1) {
			return cmRelationList.get(0).getMbId();
		}
		return null;
	}

	@Override
	public List<Integer> findMaIdListByMbIdAndRelType(Integer relType, Integer mbId) {
		CmRelationExample example = new CmRelationExample();
		example.createCriteria().andRelTypeEqualTo(relType).andMbIdEqualTo(mbId);
		List<CmRelation> cmRelationList = mapper.selectByExample(example);
		List<Integer> maIdList = new ArrayList<Integer>();
		for(CmRelation cmRelation:cmRelationList) {
			maIdList.add(cmRelation.getMaId());
		}
		return maIdList;
	}

	@Override
	public List<CmRelation> findCmRelationByMaIdAndMbId(Integer maId, Integer mbId) {
		CmRelationExample example = new CmRelationExample();
		example.createCriteria().andMaIdEqualTo(maId).andMbIdEqualTo(mbId);
		return mapper.selectByExample(example);
	}

	@Override
	public void deleteCmRelationListFromBook(Integer bookId) {
		CmRelationExample example = new CmRelationExample();
		example.createCriteria().andBookIdEqualTo(bookId).andRelTypeEqualTo(1);
		mapper.deleteByExample(example);
	}

	@Override
	public Long findCmRelationListNumByBookId(Integer bookId) {
		CmRelationExample example = new CmRelationExample();
		example.createCriteria().andBookIdEqualTo(bookId);
		return mapper.countByExample(example);
	}

	@Override
	public List<Integer> findfiveGenerationContentIdListByMaId(Integer maId) {
		List<Integer> idList = new ArrayList<Integer>();
		CmRelationExample example = new CmRelationExample();
		example.createCriteria().andMaIdEqualTo(maId).andRelTypeEqualTo(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER);
		List<CmRelation> cmRelationList = mapper.selectByExample(example);
		for(int i=0;i<5;i++) {
			if(cmRelationList!=null&&cmRelationList.size()>0) {
				Integer fatherId = cmRelationList.get(0).getMbId();
				idList.add(fatherId);
				cmRelationList.clear();
				CmRelationExample example1 = new CmRelationExample();
				example1.createCriteria().andMaIdEqualTo(fatherId).andRelTypeEqualTo(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER);
				cmRelationList = mapper.selectByExample(example1);
			}else {
				break;
			}
		}
		return idList;
	}

	@Override
	public Long countMaIdListNumByMbIdAndRelType(Integer relType, Integer mbId) {
		CmRelationExample example = new CmRelationExample();
		example.createCriteria().andRelTypeEqualTo(relType).andMbIdEqualTo(mbId);
		return mapper.countByExample(example);
	}

	@Override
	public void addCmRelationListForSpouse(List<CmContentFinal> cmContentFinalList) {
		for(CmContentFinal cmContentFinal:cmContentFinalList) {
			if(cmContentFinal.getRelFlag()!=0||cmContentFinal.getGenerationNum()==null) {
				continue;
			}
			if(!StringUtils.isEmpty(cmContentFinal.getSpouseName())){
				CmContentFinal condition = new CmContentFinal();
				condition.setBookId(cmContentFinal.getBookId());
				//设置分页参数
				condition.setId(cmContentFinal.getId());
				int pageNum = 0;
				int count = 1;
				//分页找前一个主节点
				PageHelper.offsetPage(pageNum*count,count);
				List<CmContentFinal> spouseList = cmContentFinalService.findMainNodeForSpouse(condition);
				if(spouseList!=null&&spouseList.size()>0) {
					//配与主的关系
					CmRelation cmRelation = new CmRelation();
					cmRelation.setBookId(cmContentFinal.getBookId());
					cmRelation.setMaId(cmContentFinal.getId());
					cmRelation.setRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_SPOUSESUB);
					cmRelation.setMbId(spouseList.get(0).getId());
					addTwoNodesConnection(cmRelation);
				}
			}
		}
	}

	@Override
	public void addCmRelationListForMainInFatherName(Integer sameSubClanFlag,Integer subNodeNumFlag,List<CmContentFinal> cmContentFinalList) {
		for(CmContentFinal cmContentFinal:cmContentFinalList) {
			if(cmContentFinal.getRelFlag()!=0||cmContentFinal.getGenerationNum()==null) {
				continue;
			}
			//先找是否存在父亲名称
			if(!StringUtils.isEmpty(cmContentFinal.getFatherName())) {
				String fatherName = cmContentFinal.getFatherName();
				if(fatherName.length()>=2) {
					if((fatherName.endsWith("之"))) {
						fatherName = fatherName.replaceFirst("之", "");
					}
					if(fatherName.endsWith("公")) {
						fatherName = fatherName.replaceFirst("公", "");
					}
				}
				CmContentFinal condition = new CmContentFinal();
				if(sameSubClanFlag!=null&&sameSubClanFlag==1&&cmContentFinal.getGenerationNum()>5){
					condition.setSubClanIdOrigin(cmContentFinal.getSubClanIdOrigin());
				}
				if(subNodeNumFlag!=null&&subNodeNumFlag==1){
					condition.setSonNumDiff(subNodeNumFlag);
				}
				condition.setBookId(cmContentFinal.getBookId());
				condition.setMemberName(fatherName);
				if(cmContentFinal.getGenerationNum()-1>0) {
					condition.setGenerationNum(cmContentFinal.getGenerationNum()-1);
					List<CmContentFinal> fatherList = cmContentFinalService.findCmContentFinalListByCondition(condition);
					if(fatherList.size()==1) {
						//子与父的关系
						CmRelation cmRelation = new CmRelation();
						cmRelation.setBookId(cmContentFinal.getBookId());
						cmRelation.setMaId(cmContentFinal.getId());
						cmRelation.setRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER);
						cmRelation.setMbId(fatherList.get(0).getId());
						addTwoNodesConnection(cmRelation);
						
						CmContentFinal temp = new CmContentFinal();
						temp.setId(cmContentFinal.getId());
						temp.setConnectType(1);
						cmContentFinalService.update(temp);
					}
				}
			} 
		}
	}

	@Override
	public void addCmRelationListForMainInMemberDetail(Integer sameSubClanFlag,Integer subNodeNumFlag,List<CmContentFinal> cmContentFinalList) {
		for(CmContentFinal unrelatedMember:cmContentFinalList) {
			if(unrelatedMember.getRelFlag()!=0) {
				continue;
			}
			if(!StringUtils.isEmpty(unrelatedMember.getFatherName())) {
				String fatherName = unrelatedMember.getFatherName();
				if(fatherName.length()>=2) {
					if((fatherName.endsWith("之"))) {
						fatherName = fatherName.replaceFirst("之", "");
					}
					if(fatherName.endsWith("公")) {
						fatherName = fatherName.replaceFirst("公", "");
					}
				}
				CmContentFinal condition = new CmContentFinal();
				if(sameSubClanFlag!=null&&sameSubClanFlag==1&&unrelatedMember.getGenerationNum()>5){
					condition.setSubClanIdOrigin(unrelatedMember.getSubClanIdOrigin());
				}
				if(subNodeNumFlag!=null&&subNodeNumFlag==1){
					condition.setSonNumDiff(subNodeNumFlag);
				}
				condition.setMemberName(fatherName);
				condition.setBookId(unrelatedMember.getBookId());
				condition.setGenerationNum(unrelatedMember.getGenerationNum());
				List<CmContentFinalExtends> fatherList = cmContentFinalService.findMainMemberListByFuzzyName(condition);
				if(fatherList!=null&&fatherList.size()==1) {
					//添加新的节点关系
					CmRelation cmRelation = new CmRelation();
					cmRelation.setBookId(unrelatedMember.getBookId());
					cmRelation.setMaId(unrelatedMember.getId());
					cmRelation.setMbId(fatherList.get(0).getId());
					cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
					addTwoNodesConnection(cmRelation);
					
					CmContentFinal temp = new CmContentFinal();
					temp.setId(unrelatedMember.getId());
					temp.setConnectType(4);
					cmContentFinalService.update(temp);
				}else if(fatherList!=null&&fatherList.size()>1&&unrelatedMember.getToLocate()==0) { //如果不是继子则继续执行&&unrelatedMember.getToLocate()==0
					//先看能否转繁体
					String memberName = unrelatedMember.getMemberName();
					try {
						if(!StringUtils.isEmpty(memberName)) {
							memberName = ZhConverterUtil.convertToTraditional(memberName);
						}
					}catch(Exception e) {
						System.out.println("无法转繁体的id和内容："+unrelatedMember.getId()+":"+memberName);
						continue;
					}
					
					//方案1 根据母亲的信息来识别
					CmContentFinalExtends finalFather=null;
					int num =0;
					for(CmContentFinalExtends father:fatherList) {
						List<PersonInfo> spouseInfoList = father.getSpouseNodeList();
						for(PersonInfo spouseInfo:spouseInfoList) {
							if(spouseInfo.getDetail().contains(memberName)||spouseInfo.getDetail().contains(unrelatedMember.getMemberName())){
								finalFather = father;
								++num;
							}
						}
					}
					if(finalFather!=null&&num==1) {
						//添加新的节点关系
						CmRelation cmRelation = new CmRelation();
						cmRelation.setBookId(unrelatedMember.getBookId());
						cmRelation.setMaId(unrelatedMember.getId());
						cmRelation.setMbId(finalFather.getId());
						cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
						addTwoNodesConnection(cmRelation);
						
						CmContentFinal temp = new CmContentFinal();
						temp.setId(unrelatedMember.getId());
						temp.setConnectType(2);
						cmContentFinalService.update(temp);
					}
				}
			}
		}
	}

	@Override
	public void addCmRelationListForMainInBrotherNode(Integer sameSubClanFlag,Integer subNodeNumFlag,List<CmContentFinal> cmContentFinalList) {
		int num=1;
		Integer headRanking = 1;
		Integer tailRanking =12;
		for(CmContentFinal unrelatedMember:cmContentFinalList) {
			if(unrelatedMember.getRelFlag()!=0||unrelatedMember.getRanking()==0) {
				continue;
			}
			//记录兄弟列表
			List<CmContentFinal> brotherList = new ArrayList<>();
			Integer ranking = unrelatedMember.getRanking();
			//按排行往两头走
			//1、先往前，比如ranking=3  找ranking=2、1
			//往前找到所有兄弟
			if(ranking>headRanking&&ranking<=tailRanking) {
				int pageNum = 0;
				int count = ranking-1;
				PageHelper.offsetPage(pageNum*count,count);
				List<CmContentFinal> bigBrotherList = cmContentFinalService.findBigBrotherListByBookVolumeAndOrderNo(unrelatedMember,sameSubClanFlag,subNodeNumFlag);
				brotherList.addAll(bigBrotherList);
			}
			//2、往后，先找其后是否有兄弟
			if(ranking>=headRanking) {
				CmContentFinal smallBrother = unrelatedMember;
				int i=1;
				while(smallBrother!=null) {
					List<CmContentFinal> smallBrotherList = new ArrayList<>();
					int pageNum = 0;
					int count = 1;
					PageHelper.offsetPage(pageNum*count,count);
					smallBrotherList = cmContentFinalService.findSmallBrotherListByBookVolumeAndOrderNo(smallBrother,sameSubClanFlag,subNodeNumFlag);
					if(smallBrotherList!=null&&smallBrotherList.size()>0) {
						if(smallBrotherList.get(0).getRanking()==unrelatedMember.getRanking()+i) {
							smallBrother = smallBrotherList.get(0);
							brotherList.add(smallBrother);
							i++;
						}else {
							smallBrother=null;
						}
					}else {
						smallBrother=null;
					}
				}
			}
			System.out.println("--------------------------------------------------------");
			System.out.println("编号："+num);
			System.out.println("未找到关系的人员："+unrelatedMember.getMemberRel()+" 自身id: "+unrelatedMember.getId());
			
			//判断所有兄弟里已挂载的父节点都是一致的
			List<Integer> fatherIdList = new ArrayList<>();
//			List<Integer> brotherIdList = new ArrayList<>();
			
			//能挂载的标志
			Boolean enable = true;
			for(CmContentFinal brother:brotherList) {
				if(brother.getRelFlag()!=0) {
					if(brother.getRanking()==unrelatedMember.getRanking()||!brother.getFatherName().contains(unrelatedMember.getFatherName())) {
						enable = false;
					}
					//获取已挂载的父节点id
					Integer fatherId = findMbIdByMaIdAndRelType(ClanConstant.CLANMEMBER_RELATIONSHIP_CHILDFATHER, brother.getId());
					System.out.println("已挂载："+brother.getMemberRel()+" 自身id: "+brother.getId()+" 其父节点："+fatherId);
					if(fatherId!=null&&!fatherIdList.contains(fatherId)) {
						fatherIdList.add(fatherId);
					}
				}else {
					System.out.println("未挂载："+brother.getMemberRel()+" 自身id: "+brother.getId());
					//获取所有未挂载的兄弟节点id
//					brotherIdList.add(brother.getId());
				}
			}
			num++;
			//如果兄弟间的ranking不一样并且父亲名一样 只有唯一一个父节点，则将所有子节点都挂载上去
			if(enable&&fatherIdList.size()==1) {
				//条件满足 添加该成员的节点关系
				CmRelation cmRelation = new CmRelation();
				cmRelation.setBookId(unrelatedMember.getBookId());
				cmRelation.setMaId(unrelatedMember.getId());
				cmRelation.setMbId(fatherIdList.get(0));
				cmRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
				addTwoNodesConnection(cmRelation);
				
				CmContentFinal temp = new CmContentFinal();
				temp.setId(unrelatedMember.getId());
				temp.setConnectType(3);
				cmContentFinalService.update(temp);
				
//				for(Integer brotherId:brotherIdList) {
//					//条件满足 添加该成员兄弟的节点关系
//					CmRelation cmBrotherRelation = new CmRelation();
//					cmBrotherRelation.setBookId(unrelatedMember.getBookId());
//					cmBrotherRelation.setMaId(brotherId);
//					cmBrotherRelation.setMbId(fatherIdList.get(0));
//					cmBrotherRelation.setRelType(CommonConstant.RELATIONSHIP_CHILDFATHER);
//					addTwoNodesConnection(cmBrotherRelation);
//				}
				System.out.println("已处理");
			}else {
				System.out.println("未处理--有异常！！！");
			}
			System.out.println("--------------------------------------------------------");
				
			brotherList.clear();
		}
	}
}

