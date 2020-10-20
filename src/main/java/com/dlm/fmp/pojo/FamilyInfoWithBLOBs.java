package com.dlm.fmp.pojo;

public class FamilyInfoWithBLOBs extends FamilyInfo {
    private String familyIntro;

    private String ancestorStory;

    private String otherInfo;

    public String getFamilyIntro() {
        return familyIntro;
    }

    public void setFamilyIntro(String familyIntro) {
        this.familyIntro = familyIntro == null ? null : familyIntro.trim();
    }

    public String getAncestorStory() {
        return ancestorStory;
    }

    public void setAncestorStory(String ancestorStory) {
        this.ancestorStory = ancestorStory == null ? null : ancestorStory.trim();
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo == null ? null : otherInfo.trim();
    }
}