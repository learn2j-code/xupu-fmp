package com.dlm.fmp.pojo;

import java.util.Date;

public class FmCmRelation {
    private Integer id;

    private Integer familyMemberId;

    private String familyMemberCode;

    private Integer cmContentFinalId;

    private Integer familyId;

    private Integer bookId;

    private Integer volumeId;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFamilyMemberId() {
        return familyMemberId;
    }

    public void setFamilyMemberId(Integer familyMemberId) {
        this.familyMemberId = familyMemberId;
    }

    public String getFamilyMemberCode() {
        return familyMemberCode;
    }

    public void setFamilyMemberCode(String familyMemberCode) {
        this.familyMemberCode = familyMemberCode == null ? null : familyMemberCode.trim();
    }

    public Integer getCmContentFinalId() {
        return cmContentFinalId;
    }

    public void setCmContentFinalId(Integer cmContentFinalId) {
        this.cmContentFinalId = cmContentFinalId;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
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
}