package com.dlm.fmp.pojo;

import java.util.Date;

public class CmModificationRecord {
    private Integer id;

    private Integer cmId;

    private String memberName;

    private String memberRel;

    private String content;

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

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberRel() {
        return memberRel;
    }

    public void setMemberRel(String memberRel) {
        this.memberRel = memberRel == null ? null : memberRel.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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