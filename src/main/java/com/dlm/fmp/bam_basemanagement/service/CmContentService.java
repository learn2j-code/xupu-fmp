package com.dlm.fmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.fmp.bam_toolsmanagement.vo.ExcelFile;
import com.dlm.fmp.pojo.CmContent;

public interface CmContentService {
	List<CmContent> list();
	void add(CmContent record);
	void update(CmContent record);
	void delete(int id);
	CmContent get(int id);
	
	void addCmContentList(Integer bookId, Integer volumeId, ExcelFile excelFile);

	//根据书和卷id，并按id顺序查找内容
	List<CmContent> findCmContentListByCondition(CmContent record);
	
	//导入excel的文件到数据库
	void importExcelFileToCmContent(Integer bookId, Integer volumeId, ExcelFile excelFile);
	
	//测试脚本用，更新某卷的order_no
	void updateNumForCmContent(CmContent record);
	
}
