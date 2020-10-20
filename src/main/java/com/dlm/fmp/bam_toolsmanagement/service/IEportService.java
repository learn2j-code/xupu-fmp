package com.dlm.fmp.bam_toolsmanagement.service;

import java.util.List;


import org.springframework.web.multipart.MultipartFile;

import com.dlm.fmp.bam_toolsmanagement.vo.ExcelFile;
import com.dlm.fmp.pojo.CmContent;



public interface IEportService {
    
    public ExcelFile importExcelFileToCmContent(MultipartFile mFile, String rootPath);
//    public void exportCmContentToExcelFile(HttpServletResponse response, List<ClanMember> clanMemberList);
}

