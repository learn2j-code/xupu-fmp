package com.dlm.fmp.bam_basemanagement.controller;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dlm.fmp.bam_basemanagement.service.ClanBookService;
import com.dlm.fmp.bam_basemanagement.service.CmContentFinalService;
import com.dlm.fmp.bam_basemanagement.service.CmContentService;
import com.dlm.fmp.bam_basemanagement.service.CmRelationService;
import com.dlm.fmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.fmp.bam_basemanagement.service.FmCmRelationService;
import com.dlm.fmp.bam_basemanagement.vo.CmContentFinalExtends;
import com.dlm.fmp.bam_basemanagement.vo.NumAndClanMembers;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForCmContent;
import com.dlm.fmp.bam_basemanagement.vo.RequestEntityForCmContentFinal;
import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.bam_toolsmanagement.service.IEportService;
import com.dlm.fmp.bam_toolsmanagement.vo.ExcelFile;
import com.dlm.fmp.constant.CommonConstant;
import com.dlm.fmp.pojo.CmContent;
import com.dlm.fmp.pojo.CmContentFinal;
import com.dlm.fmp.pojo.FamilyMember;
import com.dlm.fmp.pojo.FmCmRelation;
import com.dlm.fmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("cmcontent")
public class CmContentManageController {
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
	ClanBookService clanBookService;
	
	@Autowired
	IEportService ieportService;
	//导入Excel
    @RequestMapping(value = "/importExcelFileToCmContent", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity importExcelFileToCmContent(HttpServletRequest request,@RequestParam("file") MultipartFile file){    
        String rootPath = request.getSession().getServletContext().getRealPath(File.separator);
        String volumeId = request.getParameter("volumeId");
        String bookId = request.getParameter("bookId");
        
//        String volumeId = "150";
//        String bookId = "1";
        ResponseEntity response= new ResponseEntity();
        
        try {
        	ExcelFile excelFile = ieportService.importExcelFileToCmContent(file, rootPath);
	        //插入原文表
	        cmContentService.importExcelFileToCmContent(Integer.valueOf(bookId), Integer.valueOf(volumeId), excelFile);
		} catch (Exception e) {
			e.printStackTrace();
			response.setSuccess(CommonConstant.RESPONSE_FAIL);
			response.setErrorMsg(e.getMessage());
		}
        return response;
    }
    
    //导入Excel 用于更新词条内容
    @RequestMapping(value = "/importExcelFileForUpdateCmContent", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity importExcelFileForUpdateCmContent(HttpServletRequest request,@RequestParam("file") MultipartFile file){    
        String rootPath = request.getSession().getServletContext().getRealPath(File.separator);
        String volumeId = request.getParameter("volumeId");
        String bookId = request.getParameter("bookId");
        ResponseEntity response= new ResponseEntity();
        
        try {
        	ExcelFile excelFile = ieportService.importExcelFileToCmContent(file, rootPath);
        	CmContent cmContent = new CmContent();
            cmContent.setBookId(Integer.valueOf(bookId));
            cmContent.setVolumeId(Integer.valueOf(volumeId));
        	//更新原文并同步数据到final表
	        cmContentFinalService.updateExcelContentToCmFinal(excelFile, cmContent);
	        
		} catch (Exception e) {
			e.printStackTrace();
			response.setSuccess(CommonConstant.RESPONSE_FAIL);
			response.setErrorMsg(e.getMessage());
		}
        return response;
    }
    
    //将某一本书的所有卷的数据都复制到老谱成员中
    @RequestMapping("copyCmContentToFinal")
	public @ResponseBody ResponseEntity copyCmContentToFinal(@RequestBody CmContentFinal record){
    	ResponseEntity responseEntity = new ResponseEntity();
//		Map<String, Object> data = new HashMap<String, Object>();
    	try {
    		cmContentFinalService.copyCmContentToFinal(record);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
    	
//		data.put("originalContentList", originalContentList);
//		responseEntity.setData(data);
		return responseEntity;
    }
    
  //将某一本书的所有卷的数据都复制到老谱成员中
    @RequestMapping("copyCmContentToFinalContinue")
	public @ResponseBody ResponseEntity copyCmContentToFinalContinue(@RequestBody CmContentFinal record){
    	ResponseEntity responseEntity = new ResponseEntity();
//		Map<String, Object> data = new HashMap<String, Object>();
    	try {
    		cmContentFinalService.copyCmContentToFinalContinue(record);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
    	
//		data.put("originalContentList", originalContentList);
//		responseEntity.setData(data);
		return responseEntity;
    }
    
    //----------------------------------------------------------------------------------------------------
    //将某一本书的所有关系清理
    @RequestMapping("deleteCmRelationListFromBook")
	public @ResponseBody ResponseEntity deleteCmRelationListFromBook(@RequestBody CmContentFinalExtends record){
    	ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
    	try {
//			//先删除之前的关系
			cmRelationService.deleteCmRelationListFromBook(record.getBookId());
			//同时清除每个人的关系标识位
			cmContentFinalService.updateCmContentFinalFlag(record);
    		responseEntity.setData(data);
    	} catch (Exception e) {
			e.printStackTrace();
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
		return responseEntity;
    }
    //将某一本书的所有卷的配偶数据总数返回
    @RequestMapping("findSpouseRelationListNumInBook")
	public @ResponseBody ResponseEntity findSpouseRelationListNumInBook(@RequestBody CmContentFinal record){
    	ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
    	try {
    		Long cmContentFinalListNum = cmContentFinalService.findSpouseRelationListNumInBook(record);
    		data.put("cmContentFinalListNum", cmContentFinalListNum);
    		responseEntity.setData(data);
    	} catch (Exception e) {
			e.printStackTrace();
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
		return responseEntity;
    }
    
    //将某一本书的所有卷的数据都生成关系---精确对接
    @RequestMapping("addSpouseRelationListForBook")
	public @ResponseBody ResponseEntity addSpouseRelationListForBook(@RequestBody RequestEntityForCmContentFinal requestEntity){
    	ResponseEntity responseEntity = new ResponseEntity();
//		Map<String, Object> data = new HashMap<String, Object>();
    	try {
    		Page page = requestEntity.getPage();
			int pageNum = (page.getStart()-1);
			if(pageNum<0){
				return null;
			}
			PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
			
			Map<String, Object> data = new HashMap<String, Object>();
			
			CmContentFinal record = new CmContentFinal();
			record.setBookId(requestEntity.getBookId());
			record.setContentType(1);//只看成员
			
			List<CmContentFinal> cmContentFinalList = cmContentFinalService.findSpouseCmContentFinalListByCondition(record);
			cmRelationService.addCmRelationListForSpouse(cmContentFinalList);
			
			int total = (int)new PageInfo<>(cmContentFinalList).getTotal();
			page.setTotal(total);
			page.caculateLast(total);
			
			data.put("page", page);
			responseEntity.setData(data);
    		
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
    	
		return responseEntity;
    }
    
    //将某一本书的所有卷的主成员数据总数返回
    @RequestMapping("findMainRelationListNumInBook")
	public @ResponseBody ResponseEntity findMainRelationListNumInBook(@RequestBody CmContentFinalExtends record){
    	ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
    	try {
    		Long cmContentFinalListNum = cmContentFinalService.findMainRelationListNumInBook(record);
    		data.put("cmContentFinalListNum", cmContentFinalListNum);
    		responseEntity.setData(data);
    	} catch (Exception e) {
			e.printStackTrace();
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
		return responseEntity;
    }
    
    //将某一本书的所有卷的数据都生成关系---精确对接
    @RequestMapping("addMainRelationListForBook")
	public @ResponseBody ResponseEntity addMainRelationListForBook(@RequestBody RequestEntityForCmContentFinal requestEntity){
    	ResponseEntity responseEntity = new ResponseEntity();
//		Map<String, Object> data = new HashMap<String, Object>();
    	try {
    		Page page = requestEntity.getPage();
			int pageNum = (page.getStart()-1);
			if(pageNum<0){
				return null;
			}
			PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
			
			Map<String, Object> data = new HashMap<String, Object>();
			
			CmContentFinalExtends condition = new CmContentFinalExtends();
			condition.setBookId(requestEntity.getBookId());
			condition.setContentType(1);//只看成员
			condition.setStartGeneration(requestEntity.getStartGeneration());
			condition.setEndGeneration(requestEntity.getEndGeneration());
			
			List<CmContentFinal> cmContentFinalList = cmContentFinalService.findMainCmContentFinalListByCondition(condition);
			if(requestEntity.getSystemAddRelationFlag()==1) {
				cmRelationService.addCmRelationListForMainInFatherName(requestEntity.getSameSubClanFlag(),requestEntity.getSubNodeNumFlag(),cmContentFinalList);
			}else if(requestEntity.getSystemAddRelationFlag()==2) {
				cmRelationService.addCmRelationListForMainInMemberDetail(requestEntity.getSameSubClanFlag(),requestEntity.getSubNodeNumFlag(),cmContentFinalList);
			}else if(requestEntity.getSystemAddRelationFlag()==3) {
				cmRelationService.addCmRelationListForMainInBrotherNode(requestEntity.getSameSubClanFlag(),requestEntity.getSubNodeNumFlag(),cmContentFinalList);
			}else if(requestEntity.getSystemAddRelationFlag()==4) {
				
			}else if(requestEntity.getSystemAddRelationFlag()==5) {
				
			}
			
			int total = (int)new PageInfo<>(cmContentFinalList).getTotal();
			page.setTotal(total);
			page.caculateLast(total);
			
			data.put("page", page);
			responseEntity.setData(data);
    		
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
    	
		return responseEntity;
    }
    
    
    
//  //将某一本书的所有卷的主成员数据总数返回
//    @RequestMapping("findRelationListNumInBook")
//	public @ResponseBody ResponseEntity findRelationListNumInBook(@RequestBody CmContentFinal record){
//    	ResponseEntity responseEntity = new ResponseEntity();
//		Map<String, Object> data = new HashMap<String, Object>();
//    	try {
//    		Long cmContentFinalListNum = cmContentFinalService.findCmContentFinalListTotalCountByCondition(record);
//    		data.put("cmContentFinalListNum", cmContentFinalListNum);
////			//先不管三七二十一删除之前的关系
//			cmRelationService.deleteCmRelationListFromBook(record.getBookId());
//    		responseEntity.setData(data);
//    	} catch (Exception e) {
//			e.printStackTrace();
//			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
//			responseEntity.setErrorMsg(e.getMessage());
//		}
//		return responseEntity;
//    }
//    
//    //将某一本书的所有卷的数据都生成关系---精确对接
//    @RequestMapping("addRelationListForBook")
//	public @ResponseBody ResponseEntity addRelationListForBook(@RequestBody RequestEntityForCmContentFinal requestEntity){
//    	ResponseEntity responseEntity = new ResponseEntity();
////		Map<String, Object> data = new HashMap<String, Object>();
//    	try {
//    		Page page = requestEntity.getPage();
//			int pageNum = (page.getStart()-1);
//			if(pageNum<0){
//				return null;
//			}
//			PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
//			
//			Map<String, Object> data = new HashMap<String, Object>();
//			
//			CmContentFinal record = new CmContentFinal();
//			record.setBookId(requestEntity.getBookId());
//			record.setContentType(requestEntity.getContentType());
//			
//			List<CmContentFinal> cmContentFinalList = cmContentFinalService.findCmContentFinalListByCondition(record);
//			cmRelationService.addCmRelationList(cmContentFinalList);
//			
//			int total = (int)new PageInfo<>(cmContentFinalList).getTotal();
//			page.setTotal(total);
//			page.caculateLast(total);
//			
//			data.put("page", page);
//			responseEntity.setData(data);
//    		
//		} catch (Exception e) {
//			e.printStackTrace();
//			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
//			responseEntity.setErrorMsg(e.getMessage());
//		}
//    	
//		return responseEntity;
//    }
    
    //将某一本书的未形成关系的配偶成员按世代，进一步挂载
    @RequestMapping("addRelationListMoreInGeneration")
	public @ResponseBody ResponseEntity addRelationListMoreInGeneration(@RequestBody RequestEntityForCmContentFinal requestEntity){
    	ResponseEntity responseEntity = new ResponseEntity();
		CmContentFinalExtends record = new CmContentFinalExtends();
		Map<String, Object> data = new HashMap<String, Object>();
		record.setStartGeneration(requestEntity.getRequestParameter().getStartGeneration());
		record.setEndGeneration(requestEntity.getRequestParameter().getEndGeneration());
		record.setBookId(requestEntity.getRequestParameter().getBookId());
		record.setSubClanId(requestEntity.getRequestParameter().getSubClanId());
		cmContentFinalService.addRelationListMoreInGeneration(record);
		
//		data.put("numAndMembersList", numAndMembersList);
		responseEntity.setData(data);
		return responseEntity;
    }
    
	/**
	 * 	查询所有老谱成员
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<CmContentFinal> cmContentFinalList = cmContentFinalService.list();
		data.put("cmContentFinalList", cmContentFinalList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 	查询分页查询老谱成员
	 * @return
	 */
	@RequestMapping("findByCmContentPage")
	public @ResponseBody ResponseEntity findByCmContentPage(@RequestBody RequestEntityForCmContent requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<CmContent> cmContentList = cmContentService.findCmContentListByCondition(requestEntity.getRequestParameter());
		
		int total = (int)new PageInfo<>(cmContentList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("cmContentList", cmContentList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	/**
	 * 	查询分页查询老谱成员
	 * @return
	 */
	@RequestMapping("findByPage")
	public @ResponseBody ResponseEntity findByPage(@RequestBody RequestEntityForCmContentFinal requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<CmContentFinal> cmContentFinalList = cmContentFinalService.findCmContentFinalListByCondition(requestEntity.getRequestParameter());
		
		int total = (int)new PageInfo<>(cmContentFinalList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("cmContentFinalList", cmContentFinalList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询分页查询老谱成员-模糊和精确
	 * @return
	 */
	@RequestMapping("findCmListByPageAndCondition")
	public @ResponseBody ResponseEntity findCmListByPageAndCondition(@RequestBody RequestEntityForCmContentFinal requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<CmContentFinal> cmContentFinalList = cmContentFinalService.findCmListByPageAndCondition(requestEntity);
		List<CmContentFinalExtends> cmContentFinaExtendslList = cmContentFinalService.packageCmContentFinal(requestEntity,cmContentFinalList);
		int total = (int)new PageInfo<>(cmContentFinalList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("cmContentFinalList", cmContentFinaExtendslList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某人上几代人的信息
	 * @return
	 */
	@RequestMapping("findAncestorListBy")
	public @ResponseBody ResponseEntity findAncestorListBy(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<CmContentFinal> cmContentFinalList = cmContentFinalService.findAncestorListBy(record.getId(),record.getNum());
		data.put("cmContentFinalList", cmContentFinalList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个老谱成员信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody CmContentFinal record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		CmContentFinal cmContentFinal = cmContentFinalService.get(record.getId());
		data.put("cmContentFinal", cmContentFinal);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	条件查询其老谱成员列表
	 * @return
	 */
	@RequestMapping("findCmContentFinalListByCondition")
	public @ResponseBody ResponseEntity findCmContentFinalListByCondition(@RequestBody CmContentFinal record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<CmContentFinal> cmContentFinalList = cmContentFinalService.findCmContentFinalListByCondition(record);
		data.put("cmContentFinalList", cmContentFinalList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *  根据名称模糊查询老谱成员列表
	 * @return
	 */
	@RequestMapping("findMainMemberListByFuzzyName")
	public @ResponseBody ResponseEntity findMainMemberListByFuzzyName(@RequestBody CmContentFinal record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<CmContentFinalExtends> cmContentFinalList = new ArrayList<>();
		//添加高级搜索
		if(record.getStatus()!=null&&record.getStatus()==1) {
			cmContentFinalList = cmContentFinalService.findMainMemberListByFuzzyNameAdvanced(record);
		}else {
			cmContentFinalList = cmContentFinalService.findMainMemberListByFuzzyName(record);
		}
		data.put("cmContentFinalList", cmContentFinalList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *  根据名称模糊查询老谱成员列表
	 * @return
	 */
	@RequestMapping("findMemberListByHalfFuzzyName")
	public @ResponseBody ResponseEntity findMemberListByHalfFuzzyName(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<CmContentFinalExtends> cmContentFinalList = cmContentFinalService.findMemberListByHalfFuzzyName(record);
		data.put("cmContentFinalList", cmContentFinalList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	/**
	 * 	按世代查询老谱成员列表
	 * @return
	 */
	@RequestMapping("findCmContentFinalListByGenerationStartEnd")
	public @ResponseBody ResponseEntity findCmContentFinalListByGenerationStartEnd(@RequestBody RequestEntityForCmContentFinal requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		CmContentFinalExtends record = new CmContentFinalExtends();
		Map<String, Object> data = new HashMap<String, Object>();
		record.setStartGeneration(requestEntity.getRequestParameter().getStartGeneration());
		record.setEndGeneration(requestEntity.getRequestParameter().getEndGeneration());
		record.setBookId(requestEntity.getRequestParameter().getBookId());
		List<CmContentFinalExtends> cmContentFinalExtendsList = cmContentFinalService.findCmContentFinalExtendsListByGenerationStartEnd(record);
		data.put("cmContentFinalList", cmContentFinalExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	按人数查询老谱成员列表
	 * @return
	 */
	@RequestMapping("findCmContentFinalExtendsListByNum")
	public @ResponseBody ResponseEntity findCmContentFinalExtendsListByNum(@RequestBody RequestEntityForCmContentFinal requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		CmContentFinalExtends record = new CmContentFinalExtends();
		record.setBookId(requestEntity.getRequestParameter().getBookId());
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		Map<String, Object> data = new HashMap<String, Object>();
		List<CmContentFinalExtends> cmContentFinalExtendsList = cmContentFinalService.findCmContentFinalExtendsListByNum(record);
		
		int total = (int)new PageInfo<>(cmContentFinalExtendsList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("cmContentFinalList", cmContentFinalExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	按头节点查询其下几代的成员列表
	 * @return
	 */
	@RequestMapping("findCmContentFinalListByHeadAndSeveralNum")
	public @ResponseBody ResponseEntity findCmContentFinalListByHeadAndSeveralNum(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<CmContentFinalExtends> cmContentFinalExtendsList = cmContentFinalService.findCmContentFinalListByHeadAndSeveralNum(record);
		
		data.put("cmContentFinalList", cmContentFinalExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	//根据头结点查询该头结点以下指定几代的成员数据	
	 * @return
	 */
	@RequestMapping("findCmContentFinalListByHeadAndAssignGenerationNum")
	public @ResponseBody ResponseEntity findCmContentFinalListByHeadAndAssignGenerationNum(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<CmContentFinalExtends> cmContentFinalExtendsList = cmContentFinalService.findCmContentFinalListByHeadAndAssignGenerationNum(record);
		
		data.put("cmContentFinalList", cmContentFinalExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	//根据头结点查询指定代有关联的人员id
	 * @return
	 */
	@RequestMapping("findAssignGenerationMemberListByHeadAndAssignGenerationNum")
	public @ResponseBody ResponseEntity findAssignGenerationMemberListByHeadAndAssignGenerationNum(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<CmContentFinalExtends> cmContentFinalExtendsList = cmContentFinalService.findAssignGenerationMemberListByHeadAndAssignGenerationNum(record);
		data.put("cmContentFinalList", cmContentFinalExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	按成员信息查询老谱成员列表 -- 用于手机端查询某成员是否存在对应老谱
	 * @return
	 */
	@RequestMapping("findCmContentFinalListByMemberInfoForPhone")
	public @ResponseBody ResponseEntity findCmContentFinalListByMemberInfoForPhone(@RequestBody FamilyMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<CmContentFinalExtends> cmContentFinalExtendsList = new ArrayList<CmContentFinalExtends>();
		List<FamilyMember> familyMemberList = familyMemberService.findFamilyMemberListByBaseInfo(record);
		for(FamilyMember familyMember:familyMemberList) {
			List<FmCmRelation> fmCmRelationList = fmCmRelationService.findCmListByFmId(familyMember.getId());
			List<CmContentFinalExtends> tempExtendsList = cmContentFinalService.findCmContentFinalExtendsListByRelationList(familyMember.getSubFamilyCode(),fmCmRelationList);
			if(tempExtendsList.size()>0) {
				cmContentFinalExtendsList.addAll(tempExtendsList);
			}
		}
		
		data.put("cmContentFinalList", cmContentFinalExtendsList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	按世代查询的未找到关系的成员列表和数字
	 * @return
	 */
	@RequestMapping("findNumAndMemberListByGenerationStartEnd")
	public @ResponseBody ResponseEntity findNumAndMemberListByGenerationStartEnd(@RequestBody RequestEntityForCmContentFinal requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		CmContentFinalExtends record = new CmContentFinalExtends();
		Map<String, Object> data = new HashMap<String, Object>();
		record.setStartGeneration(requestEntity.getRequestParameter().getStartGeneration());
		record.setEndGeneration(requestEntity.getRequestParameter().getEndGeneration());
		record.setBookId(requestEntity.getRequestParameter().getBookId());
		record.setSubClanId(requestEntity.getRequestParameter().getSubClanId());
		List<NumAndClanMembers> numAndMembersList = cmContentFinalService.findNumAndMemberListByGenerationStartEnd(record);
		
		data.put("numAndMembersList", numAndMembersList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	按世代查询的未找到关系的成员数量
	 * @return
	 */
	@RequestMapping("findMemberListNumByGenerationStartEnd")
	public @ResponseBody ResponseEntity findMemberListNumByGenerationStartEnd(@RequestBody RequestEntityForCmContentFinal requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		CmContentFinalExtends record = new CmContentFinalExtends();
		Map<String, Object> data = new HashMap<String, Object>();
		record.setStartGeneration(requestEntity.getRequestParameter().getStartGeneration());
		record.setEndGeneration(requestEntity.getRequestParameter().getEndGeneration());
		record.setBookId(requestEntity.getRequestParameter().getBookId());
		record.setSubClanId(requestEntity.getRequestParameter().getSubClanId());
		List<NumAndClanMembers> numAndMembersList = cmContentFinalService.findMemberListNumByGenerationStartEnd(record);
		
		data.put("numAndMembersList", numAndMembersList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加节点和关系
	 * @param addNodeAndRelation
	 * @return
	 */
	@RequestMapping("addNodeAndRelation")
	public @ResponseBody ResponseEntity addNodeAndRelation(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		try {
			cmContentFinalService.addNodeAndRelation(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
		data.put("record", record);
		responseEntity.setData(data);
        return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody CmContentFinal record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		try {
			cmContentFinalService.add(record);;
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
		data.put("record", record);
		responseEntity.setData(data);
        return responseEntity;
	}
	
	/**
	 * 	编辑
	 * @param update
	 * @return
	 */
	@RequestMapping("update")
	public @ResponseBody ResponseEntity update(@RequestBody CmContentFinal record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmContentFinalService.update(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	删除
	 * @param deleteById
	 * @return
	 */
	@RequestMapping("deleteById")
	public @ResponseBody ResponseEntity deleteById(@RequestBody CmContent record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmContentFinalService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	根据bookId查询老谱始迁祖
	 * @param findAncestorByBookId
	 * @return
	 */
	@RequestMapping("findAncestorByBookId")
	public @ResponseBody ResponseEntity findAncestorByBookId(@RequestBody CmContentFinal record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		Integer AncestorId = cmContentFinalService.findAncestorByBookId(record);
		data.put("AncestorId", AncestorId);
		responseEntity.setData(data);
        return responseEntity;
	}
	
	/**
	 * 	快速按世代对接父级或配偶节点
	 * @return
	 */
	@RequestMapping("addTwoNodesConnectionQuicklyByGenerationStartEnd")
	public @ResponseBody ResponseEntity addTwoNodesConnectionQuicklyByGenerationStartEnd(@RequestBody RequestEntityForCmContentFinal requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		CmContentFinalExtends record = new CmContentFinalExtends();
		Map<String, Object> data = new HashMap<String, Object>();
		record.setStartGeneration(requestEntity.getRequestParameter().getStartGeneration());
		record.setEndGeneration(requestEntity.getRequestParameter().getEndGeneration());
		record.setBookId(requestEntity.getRequestParameter().getBookId());
		record.setSubClanId(requestEntity.getRequestParameter().getSubClanId());
		cmContentFinalService.addTwoNodesConnectionQuicklyByGenerationStartEnd(record);
		
//		data.put("numAndMembersList", numAndMembersList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	以最后一代某个人为起始点一直追踪到第一个人
	 * @param findCmContentFinalLinkBySomeOne
	 * @return
	 */
	@RequestMapping("findCmContentFinalLinkBySomeOne")
	public @ResponseBody ResponseEntity findCmContentFinalLinkBySomeOne(@RequestBody CmContentFinal record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		CmContentFinal lastOne = cmContentFinalService.findLastGenerationByLastOne(record);
		List<CmContentFinalExtends> cmContentFinalList = cmContentFinalService.findCmContentFinalLinkBySomeOne(lastOne);
		data.put("cmContentFinalList", cmContentFinalList);
		responseEntity.setData(data);
        return responseEntity;
	}
	
	/**
	 *	以某个人为起始点一直追踪到第一个人
	 * @param findCmContentFinalLinkByStart
	 * @return
	 */
	@RequestMapping("findCmContentFinalLinkByStart")
	public @ResponseBody ResponseEntity findCmContentFinalLinkByStart(@RequestBody CmContentFinal record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<CmContentFinalExtends> cmContentFinalList = cmContentFinalService.findCmContentFinalLinkBySomeOne(record);
		data.put("cmContentFinalList", cmContentFinalList);
		responseEntity.setData(data);
        return responseEntity;
	}
	
	/**
	 * 	分支1
	 * @param setAncestorForSubClanId
	 * @return
	 */
	@RequestMapping("setAncestorForSubClanId")
	public @ResponseBody ResponseEntity setAncestorForSubClanId(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmContentFinalService.setAncestorForSubClanId(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	分支2
	 * @param setXiForSubClanId
	 * @return
	 */
	@RequestMapping("setXiForSubClanId")
	public @ResponseBody ResponseEntity setXiForSubClanId(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmContentFinalService.setXiForSubClanId(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	分支3
	 * @param setFangForSubClanId
	 * @return
	 */
	@RequestMapping("setFangForSubClanId")
	public @ResponseBody ResponseEntity setFangForSubClanId(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmContentFinalService.setFangForSubClanId(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	分支4
	 * @param setYiForSubClanId
	 * @return
	 */
	@RequestMapping("setYiForSubClanId")
	public @ResponseBody ResponseEntity setYiForSubClanId(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmContentFinalService.setYiForSubClanId(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	设置分支的上下级关系
	 * @param updateParentIdForSubClanInfo
	 * @return
	 */
	@RequestMapping("updateParentIdForSubClanInfo")
	public @ResponseBody ResponseEntity updateParentIdForSubClanInfo(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmContentFinalService.updateParentIdForSubClanInfo(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	//为老谱设置分支
	
	
	/**
	 * 	临时设置儿子数量、兄弟数量和妻子列表
	 * @param setTempSonNumBrotherNumAndWifeList
	 * @return
	 */
	@RequestMapping("setTempSonNumBrotherNumAndWifeList")
	public @ResponseBody ResponseEntity setTempSonNumBrotherNumAndWifeList(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			cmContentFinalService.updateParentIdForSubClanInfo(record);
			CmContentFinalExtends cmContentFinal = new CmContentFinalExtends();
			cmContentFinal.setBookId(record.getBookId());
			cmContentFinalService.setMainMemberForSonNumReal(cmContentFinal);
			
			cmContentFinalService.setBrotherNumAndWifeListForCmContentToFinal(cmContentFinal);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	
	/**
	 * 	临时  三个字段memberName,memberRel,memberDetail内容复制到三个original里面去、memberName,memberRel,memberDetail需要繁简体转换；father_name/spouse_name这几个解析字段用简体字
	 * @param setTempSonNumBrotherNumAndWifeList
	 * @return
	 */
	@RequestMapping("setTempCopyContentAndTransport")
	public @ResponseBody ResponseEntity setTempCopyContentAndTransport(@RequestBody CmContentFinalExtends record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			List<CmContentFinal> cmContentFinalList = cmContentFinalService.findCmContentFinalListByCondition(record);
			cmContentFinalService.setThreeContentBy(cmContentFinalList);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}
