package com.dlm.fmp.bam_toolsmanagement.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.druid.util.StringUtils;
import com.dlm.fmp.bam_toolsmanagement.service.IEportService;
import com.dlm.fmp.bam_toolsmanagement.vo.ExcelFile;
import com.dlm.fmp.bam_toolsmanagement.vo.ExcelSheet;
import com.dlm.fmp.bam_toolsmanagement.vo.ExcelSheetRow;
import com.dlm.fmp.pojo.CmContent;
import com.dlm.fmp.util.ChineseNumberFormatUtil;
import com.dlm.fmp.util.ClanMemberContentParsing;
import com.github.pagehelper.util.StringUtil;

@Service
public class IEportServiceImpl implements IEportService{
	
	
    @Override
    public ExcelFile importExcelFileToCmContent(MultipartFile mFile, String rootPath){
    	ExcelFile excelFile = new ExcelFile();
        
        String fileName = mFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
        String ym = new SimpleDateFormat("yyyy-MM").format(new Date());
        String filePath = "uploadFile/" + ym + fileName;
        try {
            File file = new File(rootPath + filePath);
            if (file.exists()) {
                file.delete();
                file.mkdirs();
            }else {
                file.mkdirs();
            }
            mFile.transferTo(file);
            
            if ("xls".equals(suffix) || "XLS".equals(suffix)) {
            	excelFile = importXls(file);
            }else if ("xlsx".equals(suffix) || "XLSX".equals(suffix)) {
            	excelFile = importXlsx(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
        return excelFile;
    }
    
    private ExcelFile importXls(File file) {
    	ExcelFile excelFile = new ExcelFile();
        
        InputStream is = null;
        HSSFWorkbook hWorkbook = null;
        try {
            is = new FileInputStream(file);
            hWorkbook = new HSSFWorkbook(is);
            List<ExcelSheet> sheetList = new ArrayList<ExcelSheet>();
            for(int j = 0; j < hWorkbook.getNumberOfSheets(); j++){
            	HSSFSheet hSheet = hWorkbook.getSheetAt(j);
            	ExcelSheet excelSheet = new ExcelSheet();
            	List<ExcelSheetRow> sheetRowList = new ArrayList<ExcelSheetRow>();
            	if (null != hSheet){
            		for (int i = 1; i < hSheet.getPhysicalNumberOfRows(); i++){  
            			ExcelSheetRow excelSheetRow = new ExcelSheetRow();
            			HSSFRow hRow = hSheet.getRow(i);
            			excelSheetRow.setCell1(hRow.getCell(0)==null?null:hRow.getCell(0).toString());
            			excelSheetRow.setCell2(hRow.getCell(1)==null?null:hRow.getCell(1).toString());
            			excelSheetRow.setCell3(hRow.getCell(2)==null?null:hRow.getCell(2).toString());
            			excelSheetRow.setCell4(hRow.getCell(3)==null?null:hRow.getCell(3).toString());
            			excelSheetRow.setCell5(hRow.getCell(4)==null?null:hRow.getCell(4).toString());
            			excelSheetRow.setCell6(hRow.getCell(5)==null?null:hRow.getCell(5).toString());
            			sheetRowList.add(excelSheetRow);
            		}  
            	}  
            	excelSheet.setSheetRowList(sheetRowList);
            	sheetList.add(excelSheet);
            }
            excelFile.setSheetList(sheetList);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (null != is) {
                try {
                    is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            if (null != hWorkbook) {
                try {
                    hWorkbook.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }    
        
        return excelFile;
    }
    
    private ExcelFile importXlsx(File file) {
    	ExcelFile excelFile = new ExcelFile();
    	
        InputStream is = null;
        XSSFWorkbook xWorkbook = null;
        try {
            is = new FileInputStream(file);
            xWorkbook = new XSSFWorkbook(is);
            XSSFSheet xSheet = xWorkbook.getSheetAt(0);
            
            List<ExcelSheet> sheetList = new ArrayList<ExcelSheet>();
            for(int j = 0; j < xWorkbook.getNumberOfSheets(); j++){
            	XSSFSheet hSheet = xWorkbook.getSheetAt(j);
            	ExcelSheet excelSheet = new ExcelSheet();
            	List<ExcelSheetRow> sheetRowList = new ArrayList<ExcelSheetRow>();
            	if (null != hSheet){
            		for (int i = 1; i < hSheet.getPhysicalNumberOfRows(); i++){  
            			ExcelSheetRow excelSheetRow = new ExcelSheetRow();
            			XSSFRow xRow = xSheet.getRow(i);
            			excelSheetRow.setCell1(xRow.getCell(0)==null?null:xRow.getCell(0).toString());
            			excelSheetRow.setCell2(xRow.getCell(1)==null?null:xRow.getCell(1).toString());
            			excelSheetRow.setCell3(xRow.getCell(2)==null?null:xRow.getCell(2).toString());
            			excelSheetRow.setCell4(xRow.getCell(3)==null?null:xRow.getCell(3).toString());
            			excelSheetRow.setCell5(xRow.getCell(4)==null?null:xRow.getCell(4).toString());
            			excelSheetRow.setCell6(xRow.getCell(5)==null?null:xRow.getCell(5).toString());
            			sheetRowList.add(excelSheetRow);
            		}  
            	}  
            	excelSheet.setSheetRowList(sheetRowList);
            	sheetList.add(excelSheet);
            }
            excelFile.setSheetList(sheetList);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (null != is) {
                try {
                    is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            if (null != xWorkbook) {
                try {
                    xWorkbook.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        
        return excelFile;
    }
//    @Override
//    public void exportCmContentToExcelFile(HttpServletResponse response, List<ClanMember> clanMemberList) {
//        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
//        OutputStream os = null;
//        XSSFWorkbook xWorkbook = null;
//        try {
//            String fileName = "User" + df.format(new Date()) + ".xlsx";
//            
//            os = response.getOutputStream();
//            response.reset();
//            
//            response.setHeader("Content-disposition", "attachment; filename = " + URLEncoder.encode(fileName, "UTF-8"));
//            response.setContentType("application/octet-streem");
//            
//            xWorkbook = new XSSFWorkbook();
//            XSSFSheet xSheet = xWorkbook.createSheet("UserList");
//            
//            //set Sheet页头部
//            setSheetHeader(xWorkbook, xSheet);
//            
//            //set Sheet页内容
//            setSheetContent(xWorkbook, xSheet, clanMemberList);
//            
//            xWorkbook.write(os);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (null != os) {
//                try {
//                    os.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            
//            if (null != xWorkbook) {
//                try {
//                    xWorkbook.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        
//    }

//    /**
//     * set Sheet页头部
//     * @param xWorkbook
//     * @param xSheet
//     */
//    private void setSheetHeader(XSSFWorkbook xWorkbook, XSSFSheet xSheet) {
//        xSheet.setColumnWidth(0, 10 * 256);
//        xSheet.setColumnWidth(1, 20 * 256);
//        xSheet.setColumnWidth(2, 20 * 256);
//        
//        CellStyle cs = xWorkbook.createCellStyle();
//        //设置水平垂直居中
//        cs.setAlignment(CellStyle.ALIGN_CENTER);
//        cs.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
//        //设置字体
//        Font headerFont = xWorkbook.createFont();
//        headerFont.setFontHeightInPoints((short) 12);
//        headerFont.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
//        headerFont.setFontName("宋体");
//        cs.setFont(headerFont);
//        cs.setWrapText(true);//是否自动换行
//
//        XSSFRow xRow0 = xSheet.createRow(0);
//        
//        XSSFCell xCell0 = xRow0.createCell(0);
//        xCell0.setCellStyle(cs);
//        xCell0.setCellValue("关系");
//        
//        XSSFCell xCell1 = xRow0.createCell(1);
//        xCell1.setCellStyle(cs);
//        xCell1.setCellValue("姓名");
//        
//        XSSFCell xCell2 = xRow0.createCell(2);
//        xCell2.setCellStyle(cs);
//        xCell2.setCellValue("内容");    
//        
//        XSSFCell xCell3 = xRow0.createCell(3);
//        xCell3.setCellStyle(cs);
//        xCell3.setCellValue("世代");
//    }
//
//    /**
//     * set Sheet页内容
//     * @param xWorkbook
//     * @param xSheet
//     */
//    private void setSheetContent(XSSFWorkbook xWorkbook, XSSFSheet xSheet, List<ClanMember> clanMemberList) {
//        CellStyle cs = xWorkbook.createCellStyle();
//        //设置水平垂直居中
//        cs.setAlignment(CellStyle.ALIGN_LEFT);
//        cs.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
//        cs.setWrapText(true);
//        
//        if (null != clanMemberList && clanMemberList.size() > 0) {
//            for (int i = 0; i < clanMemberList.size(); i++) {
//                XSSFRow xRow = xSheet.createRow(i + 1);
//                ClanMember clanMember = clanMemberList.get(i);
//                for (int j = 0; j < 4; j++) {
//                    XSSFCell xCell = xRow.createCell(j);
//                    xCell.setCellStyle(cs);
//                    switch (j) {
//                        case 0:
//                        	if(!StringUtils.isEmpty(clanMember.getFatherName())){
//                        		xCell.setCellValue(clanMember.getFatherName()+clanMember.getRelationshipKeyword());
//                        	}else{
//                        		xCell.setCellValue(clanMember.getSpouseName()+clanMember.getRelationshipKeyword());
//                        	}
//                            break;
//                        case 1:
//                            xCell.setCellValue(clanMember.getFirstname());
//                            break;
//                        case 2:
//                            xCell.setCellValue(clanMember.getMemberDetail());
//                            break;
//                        case 3:
//                            xCell.setCellValue(clanMember.getGenerationNum());
//                            break;
//                        default:
//                            break;
//                    }
//                }    
//            }            
//        }
//    }
}
