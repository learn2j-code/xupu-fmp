package com.dlm.fmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dlm.fmp.bam_basemanagement.service.CmContentService;
import com.dlm.fmp.bam_toolsmanagement.vo.ExcelFile;
import com.dlm.fmp.bam_toolsmanagement.vo.ExcelSheetRow;
import com.dlm.fmp.mapper.CmContentMapper;
import com.dlm.fmp.pojo.CmContent;
import com.dlm.fmp.pojo.CmContentExample;
import com.dlm.fmp.pojo.CmContentExample.Criteria;

@Service
public class CmContentServiceImpl implements CmContentService {
	@Autowired
	CmContentMapper mapper;
	
	@Override
	public List<CmContent> list() {
		CmContentExample example = new CmContentExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(CmContent record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(CmContent record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public CmContent get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<CmContent> findCmContentListByCondition(CmContent record) {
		CmContentExample example = new CmContentExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record!=null) {
			//根据书id查
			if(record.getBookId()!=null) {
				criteria.andBookIdEqualTo(record.getBookId());
			}
			//根据卷id查
			if(record.getVolumeId()!=null) {
				criteria.andVolumeIdEqualTo(record.getVolumeId());
			}
//			//根据copyflag查
//			if(record.getCopyFlag()!=null) {
//				criteria.andCopyFlagEqualTo(record.getCopyFlag());
//			}
		}
		return mapper.selectByExample(example);
	}

	@Override
	public void addCmContentList(Integer bookId, Integer volumeId, ExcelFile excelFile)  {
		int orderNo = 1;
		try {
			if(excelFile.getSheetList().size()>0){
				List<ExcelSheetRow> rows = excelFile.getSheetList().get(0).getSheetRowList();
				for(ExcelSheetRow row:rows){
					CmContent cmContent = new CmContent();
					cmContent.setBookId(bookId);
					cmContent.setHusband(row.getCell1());
					cmContent.setMemberRel(row.getCell2());
					cmContent.setMemberName(row.getCell3());
					cmContent.setMemberDetail(row.getCell4());
					if(StringUtils.isNotEmpty(row.getCell5())) {
						cmContent.setGenerationNum(Double.valueOf(row.getCell5()).intValue());//Double.valueOf(row.getCell5()).intValue()
					}else {
						System.out.println("number: "+orderNo +"has problem!");
					}
					if(StringUtils.isNotEmpty(row.getCell6())) {
						cmContent.setPrintError(row.getCell5().trim());
					}
					cmContent.setVolumeId(volumeId);
					cmContent.setOrderNo(orderNo++);
					cmContent.setCopyFlag(1);
					add(cmContent);
				}
			}
		}catch(Exception e) {
			System.out.println("number: "+orderNo +"has problem!");
			throw e;
		}
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void importExcelFileToCmContent(Integer bookId, Integer volumeId, ExcelFile excelFile) {
		addCmContentList(Integer.valueOf(bookId), Integer.valueOf(volumeId), excelFile);
	}

	@Override
	public void updateNumForCmContent(CmContent record) {
		CmContentExample example = new CmContentExample();
		Criteria criteria = example.createCriteria();
		criteria.andBookIdEqualTo(record.getBookId());
		criteria.andVolumeIdEqualTo(record.getVolumeId());
		criteria.andOrderNoGreaterThanOrEqualTo(1009);
		List<CmContent> cmContentList = mapper.selectByExample(example);
		for(CmContent cmContent:cmContentList) {
			CmContent temp = new CmContent();
			temp.setId(cmContent.getId());
			temp.setOrderNo(cmContent.getOrderNo()+118);
			update(temp);
		}
	}

}
