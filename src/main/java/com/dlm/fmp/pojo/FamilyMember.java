package com.dlm.fmp.pojo;

import java.util.Date;

public class FamilyMember {
    private Integer id;

    private Integer familyId;

    private Integer bookId;

    private Integer volumeId;

    private Integer subClanId;

    private String familyMemberCode;

    private String fatherName;

    private String spouseName;

    private String fatherNamePinyin;

    private String spouseNamePinyin;

    private String relKeyword;

    private String memberSurname;

    private String memberName;

    private String memberNamePinyin;

    private Integer memberGender;

    private String memberDetail;

    private String nativePlace;

    private String memberStory;

    private Integer generationNum;

    private Integer orderNo;

    private String secPersonalName;

    private String mark;

    private String generationWord;

    private String birthdayTime;

    private String deathdayTime;

    private String buriedLocation;

    private String son;

    private String daughter;

    private Integer ranking;

    private String preRelationList;

    private String postRelationList;

    private Integer relFlag;

    private Integer payFlag;

    private Integer auditFlag;

    private Integer subFamilyFlag;

    private String subFamilyCode;

    private Integer householdInFlag;

    private String householdInTime;

    private Integer source;

    private Integer versionSource;

    private Integer versionId;

    private Integer versionMemberId;

    private Integer birthdateType;

    private Integer relativeFlag;

    private String addressDetail;

    private Integer adoptout;

    private String adoptoutDetail;

    private Integer uxorilocal;

    private String uxorilocalDetail;

    private Integer soninlaw;

    private String soninlawDetail;

    private Date createTime;

    private Date updateTime;

    private Integer toLocate;

    private Integer sonNum;

    private Integer sonNumReal;

    private Integer relErrorFlag;

    private Integer sonNumDiff;

    private Integer alreadyExist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getSubClanId() {
        return subClanId;
    }

    public void setSubClanId(Integer subClanId) {
        this.subClanId = subClanId;
    }

    public String getFamilyMemberCode() {
        return familyMemberCode;
    }

    public void setFamilyMemberCode(String familyMemberCode) {
        this.familyMemberCode = familyMemberCode == null ? null : familyMemberCode.trim();
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName == null ? null : fatherName.trim();
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName == null ? null : spouseName.trim();
    }

    public String getFatherNamePinyin() {
        return fatherNamePinyin;
    }

    public void setFatherNamePinyin(String fatherNamePinyin) {
        this.fatherNamePinyin = fatherNamePinyin == null ? null : fatherNamePinyin.trim();
    }

    public String getSpouseNamePinyin() {
        return spouseNamePinyin;
    }

    public void setSpouseNamePinyin(String spouseNamePinyin) {
        this.spouseNamePinyin = spouseNamePinyin == null ? null : spouseNamePinyin.trim();
    }

    public String getRelKeyword() {
        return relKeyword;
    }

    public void setRelKeyword(String relKeyword) {
        this.relKeyword = relKeyword == null ? null : relKeyword.trim();
    }

    public String getMemberSurname() {
        return memberSurname;
    }

    public void setMemberSurname(String memberSurname) {
        this.memberSurname = memberSurname == null ? null : memberSurname.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberNamePinyin() {
        return memberNamePinyin;
    }

    public void setMemberNamePinyin(String memberNamePinyin) {
        this.memberNamePinyin = memberNamePinyin == null ? null : memberNamePinyin.trim();
    }

    public Integer getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(Integer memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberDetail() {
        return memberDetail;
    }

    public void setMemberDetail(String memberDetail) {
        this.memberDetail = memberDetail == null ? null : memberDetail.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getMemberStory() {
        return memberStory;
    }

    public void setMemberStory(String memberStory) {
        this.memberStory = memberStory == null ? null : memberStory.trim();
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

    public String getSecPersonalName() {
        return secPersonalName;
    }

    public void setSecPersonalName(String secPersonalName) {
        this.secPersonalName = secPersonalName == null ? null : secPersonalName.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getGenerationWord() {
        return generationWord;
    }

    public void setGenerationWord(String generationWord) {
        this.generationWord = generationWord == null ? null : generationWord.trim();
    }

    public String getBirthdayTime() {
        return birthdayTime;
    }

    public void setBirthdayTime(String birthdayTime) {
        this.birthdayTime = birthdayTime == null ? null : birthdayTime.trim();
    }

    public String getDeathdayTime() {
        return deathdayTime;
    }

    public void setDeathdayTime(String deathdayTime) {
        this.deathdayTime = deathdayTime == null ? null : deathdayTime.trim();
    }

    public String getBuriedLocation() {
        return buriedLocation;
    }

    public void setBuriedLocation(String buriedLocation) {
        this.buriedLocation = buriedLocation == null ? null : buriedLocation.trim();
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son == null ? null : son.trim();
    }

    public String getDaughter() {
        return daughter;
    }

    public void setDaughter(String daughter) {
        this.daughter = daughter == null ? null : daughter.trim();
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getPreRelationList() {
        return preRelationList;
    }

    public void setPreRelationList(String preRelationList) {
        this.preRelationList = preRelationList == null ? null : preRelationList.trim();
    }

    public String getPostRelationList() {
        return postRelationList;
    }

    public void setPostRelationList(String postRelationList) {
        this.postRelationList = postRelationList == null ? null : postRelationList.trim();
    }

    public Integer getRelFlag() {
        return relFlag;
    }

    public void setRelFlag(Integer relFlag) {
        this.relFlag = relFlag;
    }

    public Integer getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }

    public Integer getAuditFlag() {
        return auditFlag;
    }

    public void setAuditFlag(Integer auditFlag) {
        this.auditFlag = auditFlag;
    }

    public Integer getSubFamilyFlag() {
        return subFamilyFlag;
    }

    public void setSubFamilyFlag(Integer subFamilyFlag) {
        this.subFamilyFlag = subFamilyFlag;
    }

    public String getSubFamilyCode() {
        return subFamilyCode;
    }

    public void setSubFamilyCode(String subFamilyCode) {
        this.subFamilyCode = subFamilyCode == null ? null : subFamilyCode.trim();
    }

    public Integer getHouseholdInFlag() {
        return householdInFlag;
    }

    public void setHouseholdInFlag(Integer householdInFlag) {
        this.householdInFlag = householdInFlag;
    }

    public String getHouseholdInTime() {
        return householdInTime;
    }

    public void setHouseholdInTime(String householdInTime) {
        this.householdInTime = householdInTime == null ? null : householdInTime.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getVersionSource() {
        return versionSource;
    }

    public void setVersionSource(Integer versionSource) {
        this.versionSource = versionSource;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public Integer getVersionMemberId() {
        return versionMemberId;
    }

    public void setVersionMemberId(Integer versionMemberId) {
        this.versionMemberId = versionMemberId;
    }

    public Integer getBirthdateType() {
        return birthdateType;
    }

    public void setBirthdateType(Integer birthdateType) {
        this.birthdateType = birthdateType;
    }

    public Integer getRelativeFlag() {
        return relativeFlag;
    }

    public void setRelativeFlag(Integer relativeFlag) {
        this.relativeFlag = relativeFlag;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public Integer getAdoptout() {
        return adoptout;
    }

    public void setAdoptout(Integer adoptout) {
        this.adoptout = adoptout;
    }

    public String getAdoptoutDetail() {
        return adoptoutDetail;
    }

    public void setAdoptoutDetail(String adoptoutDetail) {
        this.adoptoutDetail = adoptoutDetail == null ? null : adoptoutDetail.trim();
    }

    public Integer getUxorilocal() {
        return uxorilocal;
    }

    public void setUxorilocal(Integer uxorilocal) {
        this.uxorilocal = uxorilocal;
    }

    public String getUxorilocalDetail() {
        return uxorilocalDetail;
    }

    public void setUxorilocalDetail(String uxorilocalDetail) {
        this.uxorilocalDetail = uxorilocalDetail == null ? null : uxorilocalDetail.trim();
    }

    public Integer getSoninlaw() {
        return soninlaw;
    }

    public void setSoninlaw(Integer soninlaw) {
        this.soninlaw = soninlaw;
    }

    public String getSoninlawDetail() {
        return soninlawDetail;
    }

    public void setSoninlawDetail(String soninlawDetail) {
        this.soninlawDetail = soninlawDetail == null ? null : soninlawDetail.trim();
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

    public Integer getToLocate() {
        return toLocate;
    }

    public void setToLocate(Integer toLocate) {
        this.toLocate = toLocate;
    }

    public Integer getSonNum() {
        return sonNum;
    }

    public void setSonNum(Integer sonNum) {
        this.sonNum = sonNum;
    }

    public Integer getSonNumReal() {
        return sonNumReal;
    }

    public void setSonNumReal(Integer sonNumReal) {
        this.sonNumReal = sonNumReal;
    }

    public Integer getRelErrorFlag() {
        return relErrorFlag;
    }

    public void setRelErrorFlag(Integer relErrorFlag) {
        this.relErrorFlag = relErrorFlag;
    }

    public Integer getSonNumDiff() {
        return sonNumDiff;
    }

    public void setSonNumDiff(Integer sonNumDiff) {
        this.sonNumDiff = sonNumDiff;
    }

    public Integer getAlreadyExist() {
        return alreadyExist;
    }

    public void setAlreadyExist(Integer alreadyExist) {
        this.alreadyExist = alreadyExist;
    }
}