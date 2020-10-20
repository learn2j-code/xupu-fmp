package com.dlm.fmp.pojo;

import java.util.Date;

public class CmContent {
    private Integer id;

    private String husband;

    private String memberRel;

    private String memberName;

    private String memberDetail;

    private Integer generationNum;

    private Integer orderNo;

    private Integer bookId;

    private Integer volumeId;

    private Integer copyFlag;

    private Date createTime;

    private Date updateTime;

    private String printError;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHusband() {
        return husband;
    }

    public void setHusband(String husband) {
        this.husband = husband == null ? null : husband.trim();
    }

    public String getMemberRel() {
        return memberRel;
    }

    public void setMemberRel(String memberRel) {
        this.memberRel = memberRel == null ? null : memberRel.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberDetail() {
        return memberDetail;
    }

    public void setMemberDetail(String memberDetail) {
        this.memberDetail = memberDetail == null ? null : memberDetail.trim();
    }

    public Integer getGenerationNum() {
        return generationNum;
    }

    public void setGenerationNum(Integer generationNum) {
        this.generationNum = generationNum;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(Integer volumeId) {
        this.volumeId = volumeId;
    }

    public Integer getCopyFlag() {
        return copyFlag;
    }

    public void setCopyFlag(Integer copyFlag) {
        this.copyFlag = copyFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPrintError() {
        return printError;
    }

    public void setPrintError(String printError) {
        this.printError = printError == null ? null : printError.trim();
    }
}