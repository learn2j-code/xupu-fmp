package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FamilyMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FamilyMemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNull() {
            addCriterion("family_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNotNull() {
            addCriterion("family_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdEqualTo(Integer value) {
            addCriterion("family_id =", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotEqualTo(Integer value) {
            addCriterion("family_id <>", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThan(Integer value) {
            addCriterion("family_id >", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_id >=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThan(Integer value) {
            addCriterion("family_id <", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThanOrEqualTo(Integer value) {
            addCriterion("family_id <=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIn(List<Integer> values) {
            addCriterion("family_id in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotIn(List<Integer> values) {
            addCriterion("family_id not in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdBetween(Integer value1, Integer value2) {
            addCriterion("family_id between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("family_id not between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdIsNull() {
            addCriterion("volume_id is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIdIsNotNull() {
            addCriterion("volume_id is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeIdEqualTo(Integer value) {
            addCriterion("volume_id =", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdNotEqualTo(Integer value) {
            addCriterion("volume_id <>", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdGreaterThan(Integer value) {
            addCriterion("volume_id >", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume_id >=", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdLessThan(Integer value) {
            addCriterion("volume_id <", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("volume_id <=", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdIn(List<Integer> values) {
            addCriterion("volume_id in", values, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdNotIn(List<Integer> values) {
            addCriterion("volume_id not in", values, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdBetween(Integer value1, Integer value2) {
            addCriterion("volume_id between", value1, value2, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("volume_id not between", value1, value2, "volumeId");
            return (Criteria) this;
        }

        public Criteria andSubClanIdIsNull() {
            addCriterion("sub_clan_id is null");
            return (Criteria) this;
        }

        public Criteria andSubClanIdIsNotNull() {
            addCriterion("sub_clan_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubClanIdEqualTo(Integer value) {
            addCriterion("sub_clan_id =", value, "subClanId");
            return (Criteria) this;
        }

        public Criteria andSubClanIdNotEqualTo(Integer value) {
            addCriterion("sub_clan_id <>", value, "subClanId");
            return (Criteria) this;
        }

        public Criteria andSubClanIdGreaterThan(Integer value) {
            addCriterion("sub_clan_id >", value, "subClanId");
            return (Criteria) this;
        }

        public Criteria andSubClanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_clan_id >=", value, "subClanId");
            return (Criteria) this;
        }

        public Criteria andSubClanIdLessThan(Integer value) {
            addCriterion("sub_clan_id <", value, "subClanId");
            return (Criteria) this;
        }

        public Criteria andSubClanIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_clan_id <=", value, "subClanId");
            return (Criteria) this;
        }

        public Criteria andSubClanIdIn(List<Integer> values) {
            addCriterion("sub_clan_id in", values, "subClanId");
            return (Criteria) this;
        }

        public Criteria andSubClanIdNotIn(List<Integer> values) {
            addCriterion("sub_clan_id not in", values, "subClanId");
            return (Criteria) this;
        }

        public Criteria andSubClanIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_clan_id between", value1, value2, "subClanId");
            return (Criteria) this;
        }

        public Criteria andSubClanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_clan_id not between", value1, value2, "subClanId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeIsNull() {
            addCriterion("family_member_code is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeIsNotNull() {
            addCriterion("family_member_code is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeEqualTo(String value) {
            addCriterion("family_member_code =", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeNotEqualTo(String value) {
            addCriterion("family_member_code <>", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeGreaterThan(String value) {
            addCriterion("family_member_code >", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeGreaterThanOrEqualTo(String value) {
            addCriterion("family_member_code >=", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeLessThan(String value) {
            addCriterion("family_member_code <", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeLessThanOrEqualTo(String value) {
            addCriterion("family_member_code <=", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeLike(String value) {
            addCriterion("family_member_code like", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeNotLike(String value) {
            addCriterion("family_member_code not like", value, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeIn(List<String> values) {
            addCriterion("family_member_code in", values, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeNotIn(List<String> values) {
            addCriterion("family_member_code not in", values, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeBetween(String value1, String value2) {
            addCriterion("family_member_code between", value1, value2, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberCodeNotBetween(String value1, String value2) {
            addCriterion("family_member_code not between", value1, value2, "familyMemberCode");
            return (Criteria) this;
        }

        public Criteria andFatherNameIsNull() {
            addCriterion("father_name is null");
            return (Criteria) this;
        }

        public Criteria andFatherNameIsNotNull() {
            addCriterion("father_name is not null");
            return (Criteria) this;
        }

        public Criteria andFatherNameEqualTo(String value) {
            addCriterion("father_name =", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotEqualTo(String value) {
            addCriterion("father_name <>", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameGreaterThan(String value) {
            addCriterion("father_name >", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameGreaterThanOrEqualTo(String value) {
            addCriterion("father_name >=", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLessThan(String value) {
            addCriterion("father_name <", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLessThanOrEqualTo(String value) {
            addCriterion("father_name <=", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLike(String value) {
            addCriterion("father_name like", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotLike(String value) {
            addCriterion("father_name not like", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameIn(List<String> values) {
            addCriterion("father_name in", values, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotIn(List<String> values) {
            addCriterion("father_name not in", values, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameBetween(String value1, String value2) {
            addCriterion("father_name between", value1, value2, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotBetween(String value1, String value2) {
            addCriterion("father_name not between", value1, value2, "fatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNull() {
            addCriterion("spouse_name is null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNotNull() {
            addCriterion("spouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameEqualTo(String value) {
            addCriterion("spouse_name =", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotEqualTo(String value) {
            addCriterion("spouse_name <>", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThan(String value) {
            addCriterion("spouse_name >", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_name >=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThan(String value) {
            addCriterion("spouse_name <", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThanOrEqualTo(String value) {
            addCriterion("spouse_name <=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLike(String value) {
            addCriterion("spouse_name like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotLike(String value) {
            addCriterion("spouse_name not like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIn(List<String> values) {
            addCriterion("spouse_name in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotIn(List<String> values) {
            addCriterion("spouse_name not in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameBetween(String value1, String value2) {
            addCriterion("spouse_name between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotBetween(String value1, String value2) {
            addCriterion("spouse_name not between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinIsNull() {
            addCriterion("father_name_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinIsNotNull() {
            addCriterion("father_name_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinEqualTo(String value) {
            addCriterion("father_name_pinyin =", value, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinNotEqualTo(String value) {
            addCriterion("father_name_pinyin <>", value, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinGreaterThan(String value) {
            addCriterion("father_name_pinyin >", value, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("father_name_pinyin >=", value, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinLessThan(String value) {
            addCriterion("father_name_pinyin <", value, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinLessThanOrEqualTo(String value) {
            addCriterion("father_name_pinyin <=", value, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinLike(String value) {
            addCriterion("father_name_pinyin like", value, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinNotLike(String value) {
            addCriterion("father_name_pinyin not like", value, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinIn(List<String> values) {
            addCriterion("father_name_pinyin in", values, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinNotIn(List<String> values) {
            addCriterion("father_name_pinyin not in", values, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinBetween(String value1, String value2) {
            addCriterion("father_name_pinyin between", value1, value2, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andFatherNamePinyinNotBetween(String value1, String value2) {
            addCriterion("father_name_pinyin not between", value1, value2, "fatherNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinIsNull() {
            addCriterion("spouse_name_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinIsNotNull() {
            addCriterion("spouse_name_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinEqualTo(String value) {
            addCriterion("spouse_name_pinyin =", value, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinNotEqualTo(String value) {
            addCriterion("spouse_name_pinyin <>", value, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinGreaterThan(String value) {
            addCriterion("spouse_name_pinyin >", value, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_name_pinyin >=", value, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinLessThan(String value) {
            addCriterion("spouse_name_pinyin <", value, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinLessThanOrEqualTo(String value) {
            addCriterion("spouse_name_pinyin <=", value, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinLike(String value) {
            addCriterion("spouse_name_pinyin like", value, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinNotLike(String value) {
            addCriterion("spouse_name_pinyin not like", value, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinIn(List<String> values) {
            addCriterion("spouse_name_pinyin in", values, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinNotIn(List<String> values) {
            addCriterion("spouse_name_pinyin not in", values, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinBetween(String value1, String value2) {
            addCriterion("spouse_name_pinyin between", value1, value2, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andSpouseNamePinyinNotBetween(String value1, String value2) {
            addCriterion("spouse_name_pinyin not between", value1, value2, "spouseNamePinyin");
            return (Criteria) this;
        }

        public Criteria andRelKeywordIsNull() {
            addCriterion("rel_keyword is null");
            return (Criteria) this;
        }

        public Criteria andRelKeywordIsNotNull() {
            addCriterion("rel_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andRelKeywordEqualTo(String value) {
            addCriterion("rel_keyword =", value, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordNotEqualTo(String value) {
            addCriterion("rel_keyword <>", value, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordGreaterThan(String value) {
            addCriterion("rel_keyword >", value, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("rel_keyword >=", value, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordLessThan(String value) {
            addCriterion("rel_keyword <", value, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordLessThanOrEqualTo(String value) {
            addCriterion("rel_keyword <=", value, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordLike(String value) {
            addCriterion("rel_keyword like", value, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordNotLike(String value) {
            addCriterion("rel_keyword not like", value, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordIn(List<String> values) {
            addCriterion("rel_keyword in", values, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordNotIn(List<String> values) {
            addCriterion("rel_keyword not in", values, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordBetween(String value1, String value2) {
            addCriterion("rel_keyword between", value1, value2, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andRelKeywordNotBetween(String value1, String value2) {
            addCriterion("rel_keyword not between", value1, value2, "relKeyword");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameIsNull() {
            addCriterion("member_surname is null");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameIsNotNull() {
            addCriterion("member_surname is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameEqualTo(String value) {
            addCriterion("member_surname =", value, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameNotEqualTo(String value) {
            addCriterion("member_surname <>", value, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameGreaterThan(String value) {
            addCriterion("member_surname >", value, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameGreaterThanOrEqualTo(String value) {
            addCriterion("member_surname >=", value, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameLessThan(String value) {
            addCriterion("member_surname <", value, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameLessThanOrEqualTo(String value) {
            addCriterion("member_surname <=", value, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameLike(String value) {
            addCriterion("member_surname like", value, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameNotLike(String value) {
            addCriterion("member_surname not like", value, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameIn(List<String> values) {
            addCriterion("member_surname in", values, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameNotIn(List<String> values) {
            addCriterion("member_surname not in", values, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameBetween(String value1, String value2) {
            addCriterion("member_surname between", value1, value2, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberSurnameNotBetween(String value1, String value2) {
            addCriterion("member_surname not between", value1, value2, "memberSurname");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinIsNull() {
            addCriterion("member_name_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinIsNotNull() {
            addCriterion("member_name_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinEqualTo(String value) {
            addCriterion("member_name_pinyin =", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinNotEqualTo(String value) {
            addCriterion("member_name_pinyin <>", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinGreaterThan(String value) {
            addCriterion("member_name_pinyin >", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("member_name_pinyin >=", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinLessThan(String value) {
            addCriterion("member_name_pinyin <", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinLessThanOrEqualTo(String value) {
            addCriterion("member_name_pinyin <=", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinLike(String value) {
            addCriterion("member_name_pinyin like", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinNotLike(String value) {
            addCriterion("member_name_pinyin not like", value, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinIn(List<String> values) {
            addCriterion("member_name_pinyin in", values, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinNotIn(List<String> values) {
            addCriterion("member_name_pinyin not in", values, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinBetween(String value1, String value2) {
            addCriterion("member_name_pinyin between", value1, value2, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberNamePinyinNotBetween(String value1, String value2) {
            addCriterion("member_name_pinyin not between", value1, value2, "memberNamePinyin");
            return (Criteria) this;
        }

        public Criteria andMemberGenderIsNull() {
            addCriterion("member_gender is null");
            return (Criteria) this;
        }

        public Criteria andMemberGenderIsNotNull() {
            addCriterion("member_gender is not null");
            return (Criteria) this;
        }

        public Criteria andMemberGenderEqualTo(Integer value) {
            addCriterion("member_gender =", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderNotEqualTo(Integer value) {
            addCriterion("member_gender <>", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderGreaterThan(Integer value) {
            addCriterion("member_gender >", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_gender >=", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderLessThan(Integer value) {
            addCriterion("member_gender <", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderLessThanOrEqualTo(Integer value) {
            addCriterion("member_gender <=", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderIn(List<Integer> values) {
            addCriterion("member_gender in", values, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderNotIn(List<Integer> values) {
            addCriterion("member_gender not in", values, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderBetween(Integer value1, Integer value2) {
            addCriterion("member_gender between", value1, value2, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("member_gender not between", value1, value2, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberDetailIsNull() {
            addCriterion("member_detail is null");
            return (Criteria) this;
        }

        public Criteria andMemberDetailIsNotNull() {
            addCriterion("member_detail is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDetailEqualTo(String value) {
            addCriterion("member_detail =", value, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNotEqualTo(String value) {
            addCriterion("member_detail <>", value, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailGreaterThan(String value) {
            addCriterion("member_detail >", value, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailGreaterThanOrEqualTo(String value) {
            addCriterion("member_detail >=", value, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailLessThan(String value) {
            addCriterion("member_detail <", value, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailLessThanOrEqualTo(String value) {
            addCriterion("member_detail <=", value, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailLike(String value) {
            addCriterion("member_detail like", value, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNotLike(String value) {
            addCriterion("member_detail not like", value, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailIn(List<String> values) {
            addCriterion("member_detail in", values, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNotIn(List<String> values) {
            addCriterion("member_detail not in", values, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailBetween(String value1, String value2) {
            addCriterion("member_detail between", value1, value2, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNotBetween(String value1, String value2) {
            addCriterion("member_detail not between", value1, value2, "memberDetail");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("native_place not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andMemberStoryIsNull() {
            addCriterion("member_story is null");
            return (Criteria) this;
        }

        public Criteria andMemberStoryIsNotNull() {
            addCriterion("member_story is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStoryEqualTo(String value) {
            addCriterion("member_story =", value, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryNotEqualTo(String value) {
            addCriterion("member_story <>", value, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryGreaterThan(String value) {
            addCriterion("member_story >", value, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryGreaterThanOrEqualTo(String value) {
            addCriterion("member_story >=", value, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLessThan(String value) {
            addCriterion("member_story <", value, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLessThanOrEqualTo(String value) {
            addCriterion("member_story <=", value, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLike(String value) {
            addCriterion("member_story like", value, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryNotLike(String value) {
            addCriterion("member_story not like", value, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryIn(List<String> values) {
            addCriterion("member_story in", values, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryNotIn(List<String> values) {
            addCriterion("member_story not in", values, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryBetween(String value1, String value2) {
            addCriterion("member_story between", value1, value2, "memberStory");
            return (Criteria) this;
        }

        public Criteria andMemberStoryNotBetween(String value1, String value2) {
            addCriterion("member_story not between", value1, value2, "memberStory");
            return (Criteria) this;
        }

        public Criteria andGenerationNumIsNull() {
            addCriterion("generation_num is null");
            return (Criteria) this;
        }

        public Criteria andGenerationNumIsNotNull() {
            addCriterion("generation_num is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationNumEqualTo(Integer value) {
            addCriterion("generation_num =", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumNotEqualTo(Integer value) {
            addCriterion("generation_num <>", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumGreaterThan(Integer value) {
            addCriterion("generation_num >", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("generation_num >=", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumLessThan(Integer value) {
            addCriterion("generation_num <", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumLessThanOrEqualTo(Integer value) {
            addCriterion("generation_num <=", value, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumIn(List<Integer> values) {
            addCriterion("generation_num in", values, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumNotIn(List<Integer> values) {
            addCriterion("generation_num not in", values, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumBetween(Integer value1, Integer value2) {
            addCriterion("generation_num between", value1, value2, "generationNum");
            return (Criteria) this;
        }

        public Criteria andGenerationNumNotBetween(Integer value1, Integer value2) {
            addCriterion("generation_num not between", value1, value2, "generationNum");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameIsNull() {
            addCriterion("sec_personal_name is null");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameIsNotNull() {
            addCriterion("sec_personal_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameEqualTo(String value) {
            addCriterion("sec_personal_name =", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameNotEqualTo(String value) {
            addCriterion("sec_personal_name <>", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameGreaterThan(String value) {
            addCriterion("sec_personal_name >", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameGreaterThanOrEqualTo(String value) {
            addCriterion("sec_personal_name >=", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameLessThan(String value) {
            addCriterion("sec_personal_name <", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameLessThanOrEqualTo(String value) {
            addCriterion("sec_personal_name <=", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameLike(String value) {
            addCriterion("sec_personal_name like", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameNotLike(String value) {
            addCriterion("sec_personal_name not like", value, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameIn(List<String> values) {
            addCriterion("sec_personal_name in", values, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameNotIn(List<String> values) {
            addCriterion("sec_personal_name not in", values, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameBetween(String value1, String value2) {
            addCriterion("sec_personal_name between", value1, value2, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andSecPersonalNameNotBetween(String value1, String value2) {
            addCriterion("sec_personal_name not between", value1, value2, "secPersonalName");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andGenerationWordIsNull() {
            addCriterion("generation_word is null");
            return (Criteria) this;
        }

        public Criteria andGenerationWordIsNotNull() {
            addCriterion("generation_word is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationWordEqualTo(String value) {
            addCriterion("generation_word =", value, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordNotEqualTo(String value) {
            addCriterion("generation_word <>", value, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordGreaterThan(String value) {
            addCriterion("generation_word >", value, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordGreaterThanOrEqualTo(String value) {
            addCriterion("generation_word >=", value, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordLessThan(String value) {
            addCriterion("generation_word <", value, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordLessThanOrEqualTo(String value) {
            addCriterion("generation_word <=", value, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordLike(String value) {
            addCriterion("generation_word like", value, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordNotLike(String value) {
            addCriterion("generation_word not like", value, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordIn(List<String> values) {
            addCriterion("generation_word in", values, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordNotIn(List<String> values) {
            addCriterion("generation_word not in", values, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordBetween(String value1, String value2) {
            addCriterion("generation_word between", value1, value2, "generationWord");
            return (Criteria) this;
        }

        public Criteria andGenerationWordNotBetween(String value1, String value2) {
            addCriterion("generation_word not between", value1, value2, "generationWord");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeIsNull() {
            addCriterion("birthday_time is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeIsNotNull() {
            addCriterion("birthday_time is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeEqualTo(String value) {
            addCriterion("birthday_time =", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeNotEqualTo(String value) {
            addCriterion("birthday_time <>", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeGreaterThan(String value) {
            addCriterion("birthday_time >", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("birthday_time >=", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeLessThan(String value) {
            addCriterion("birthday_time <", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeLessThanOrEqualTo(String value) {
            addCriterion("birthday_time <=", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeLike(String value) {
            addCriterion("birthday_time like", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeNotLike(String value) {
            addCriterion("birthday_time not like", value, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeIn(List<String> values) {
            addCriterion("birthday_time in", values, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeNotIn(List<String> values) {
            addCriterion("birthday_time not in", values, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeBetween(String value1, String value2) {
            addCriterion("birthday_time between", value1, value2, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeNotBetween(String value1, String value2) {
            addCriterion("birthday_time not between", value1, value2, "birthdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeIsNull() {
            addCriterion("deathday_time is null");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeIsNotNull() {
            addCriterion("deathday_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeEqualTo(String value) {
            addCriterion("deathday_time =", value, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeNotEqualTo(String value) {
            addCriterion("deathday_time <>", value, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeGreaterThan(String value) {
            addCriterion("deathday_time >", value, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("deathday_time >=", value, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeLessThan(String value) {
            addCriterion("deathday_time <", value, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeLessThanOrEqualTo(String value) {
            addCriterion("deathday_time <=", value, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeLike(String value) {
            addCriterion("deathday_time like", value, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeNotLike(String value) {
            addCriterion("deathday_time not like", value, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeIn(List<String> values) {
            addCriterion("deathday_time in", values, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeNotIn(List<String> values) {
            addCriterion("deathday_time not in", values, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeBetween(String value1, String value2) {
            addCriterion("deathday_time between", value1, value2, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeNotBetween(String value1, String value2) {
            addCriterion("deathday_time not between", value1, value2, "deathdayTime");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationIsNull() {
            addCriterion("buried_location is null");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationIsNotNull() {
            addCriterion("buried_location is not null");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationEqualTo(String value) {
            addCriterion("buried_location =", value, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationNotEqualTo(String value) {
            addCriterion("buried_location <>", value, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationGreaterThan(String value) {
            addCriterion("buried_location >", value, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationGreaterThanOrEqualTo(String value) {
            addCriterion("buried_location >=", value, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationLessThan(String value) {
            addCriterion("buried_location <", value, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationLessThanOrEqualTo(String value) {
            addCriterion("buried_location <=", value, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationLike(String value) {
            addCriterion("buried_location like", value, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationNotLike(String value) {
            addCriterion("buried_location not like", value, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationIn(List<String> values) {
            addCriterion("buried_location in", values, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationNotIn(List<String> values) {
            addCriterion("buried_location not in", values, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationBetween(String value1, String value2) {
            addCriterion("buried_location between", value1, value2, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andBuriedLocationNotBetween(String value1, String value2) {
            addCriterion("buried_location not between", value1, value2, "buriedLocation");
            return (Criteria) this;
        }

        public Criteria andSonIsNull() {
            addCriterion("son is null");
            return (Criteria) this;
        }

        public Criteria andSonIsNotNull() {
            addCriterion("son is not null");
            return (Criteria) this;
        }

        public Criteria andSonEqualTo(String value) {
            addCriterion("son =", value, "son");
            return (Criteria) this;
        }

        public Criteria andSonNotEqualTo(String value) {
            addCriterion("son <>", value, "son");
            return (Criteria) this;
        }

        public Criteria andSonGreaterThan(String value) {
            addCriterion("son >", value, "son");
            return (Criteria) this;
        }

        public Criteria andSonGreaterThanOrEqualTo(String value) {
            addCriterion("son >=", value, "son");
            return (Criteria) this;
        }

        public Criteria andSonLessThan(String value) {
            addCriterion("son <", value, "son");
            return (Criteria) this;
        }

        public Criteria andSonLessThanOrEqualTo(String value) {
            addCriterion("son <=", value, "son");
            return (Criteria) this;
        }

        public Criteria andSonLike(String value) {
            addCriterion("son like", value, "son");
            return (Criteria) this;
        }

        public Criteria andSonNotLike(String value) {
            addCriterion("son not like", value, "son");
            return (Criteria) this;
        }

        public Criteria andSonIn(List<String> values) {
            addCriterion("son in", values, "son");
            return (Criteria) this;
        }

        public Criteria andSonNotIn(List<String> values) {
            addCriterion("son not in", values, "son");
            return (Criteria) this;
        }

        public Criteria andSonBetween(String value1, String value2) {
            addCriterion("son between", value1, value2, "son");
            return (Criteria) this;
        }

        public Criteria andSonNotBetween(String value1, String value2) {
            addCriterion("son not between", value1, value2, "son");
            return (Criteria) this;
        }

        public Criteria andDaughterIsNull() {
            addCriterion("daughter is null");
            return (Criteria) this;
        }

        public Criteria andDaughterIsNotNull() {
            addCriterion("daughter is not null");
            return (Criteria) this;
        }

        public Criteria andDaughterEqualTo(String value) {
            addCriterion("daughter =", value, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterNotEqualTo(String value) {
            addCriterion("daughter <>", value, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterGreaterThan(String value) {
            addCriterion("daughter >", value, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterGreaterThanOrEqualTo(String value) {
            addCriterion("daughter >=", value, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterLessThan(String value) {
            addCriterion("daughter <", value, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterLessThanOrEqualTo(String value) {
            addCriterion("daughter <=", value, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterLike(String value) {
            addCriterion("daughter like", value, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterNotLike(String value) {
            addCriterion("daughter not like", value, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterIn(List<String> values) {
            addCriterion("daughter in", values, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterNotIn(List<String> values) {
            addCriterion("daughter not in", values, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterBetween(String value1, String value2) {
            addCriterion("daughter between", value1, value2, "daughter");
            return (Criteria) this;
        }

        public Criteria andDaughterNotBetween(String value1, String value2) {
            addCriterion("daughter not between", value1, value2, "daughter");
            return (Criteria) this;
        }

        public Criteria andRankingIsNull() {
            addCriterion("ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(Integer value) {
            addCriterion("ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(Integer value) {
            addCriterion("ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(Integer value) {
            addCriterion("ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(Integer value) {
            addCriterion("ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(Integer value) {
            addCriterion("ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<Integer> values) {
            addCriterion("ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<Integer> values) {
            addCriterion("ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(Integer value1, Integer value2) {
            addCriterion("ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andPreRelationListIsNull() {
            addCriterion("pre_relation_list is null");
            return (Criteria) this;
        }

        public Criteria andPreRelationListIsNotNull() {
            addCriterion("pre_relation_list is not null");
            return (Criteria) this;
        }

        public Criteria andPreRelationListEqualTo(String value) {
            addCriterion("pre_relation_list =", value, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListNotEqualTo(String value) {
            addCriterion("pre_relation_list <>", value, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListGreaterThan(String value) {
            addCriterion("pre_relation_list >", value, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListGreaterThanOrEqualTo(String value) {
            addCriterion("pre_relation_list >=", value, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListLessThan(String value) {
            addCriterion("pre_relation_list <", value, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListLessThanOrEqualTo(String value) {
            addCriterion("pre_relation_list <=", value, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListLike(String value) {
            addCriterion("pre_relation_list like", value, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListNotLike(String value) {
            addCriterion("pre_relation_list not like", value, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListIn(List<String> values) {
            addCriterion("pre_relation_list in", values, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListNotIn(List<String> values) {
            addCriterion("pre_relation_list not in", values, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListBetween(String value1, String value2) {
            addCriterion("pre_relation_list between", value1, value2, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPreRelationListNotBetween(String value1, String value2) {
            addCriterion("pre_relation_list not between", value1, value2, "preRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListIsNull() {
            addCriterion("post_relation_list is null");
            return (Criteria) this;
        }

        public Criteria andPostRelationListIsNotNull() {
            addCriterion("post_relation_list is not null");
            return (Criteria) this;
        }

        public Criteria andPostRelationListEqualTo(String value) {
            addCriterion("post_relation_list =", value, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListNotEqualTo(String value) {
            addCriterion("post_relation_list <>", value, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListGreaterThan(String value) {
            addCriterion("post_relation_list >", value, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListGreaterThanOrEqualTo(String value) {
            addCriterion("post_relation_list >=", value, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListLessThan(String value) {
            addCriterion("post_relation_list <", value, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListLessThanOrEqualTo(String value) {
            addCriterion("post_relation_list <=", value, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListLike(String value) {
            addCriterion("post_relation_list like", value, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListNotLike(String value) {
            addCriterion("post_relation_list not like", value, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListIn(List<String> values) {
            addCriterion("post_relation_list in", values, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListNotIn(List<String> values) {
            addCriterion("post_relation_list not in", values, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListBetween(String value1, String value2) {
            addCriterion("post_relation_list between", value1, value2, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andPostRelationListNotBetween(String value1, String value2) {
            addCriterion("post_relation_list not between", value1, value2, "postRelationList");
            return (Criteria) this;
        }

        public Criteria andRelFlagIsNull() {
            addCriterion("rel_flag is null");
            return (Criteria) this;
        }

        public Criteria andRelFlagIsNotNull() {
            addCriterion("rel_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRelFlagEqualTo(Integer value) {
            addCriterion("rel_flag =", value, "relFlag");
            return (Criteria) this;
        }

        public Criteria andRelFlagNotEqualTo(Integer value) {
            addCriterion("rel_flag <>", value, "relFlag");
            return (Criteria) this;
        }

        public Criteria andRelFlagGreaterThan(Integer value) {
            addCriterion("rel_flag >", value, "relFlag");
            return (Criteria) this;
        }

        public Criteria andRelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("rel_flag >=", value, "relFlag");
            return (Criteria) this;
        }

        public Criteria andRelFlagLessThan(Integer value) {
            addCriterion("rel_flag <", value, "relFlag");
            return (Criteria) this;
        }

        public Criteria andRelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("rel_flag <=", value, "relFlag");
            return (Criteria) this;
        }

        public Criteria andRelFlagIn(List<Integer> values) {
            addCriterion("rel_flag in", values, "relFlag");
            return (Criteria) this;
        }

        public Criteria andRelFlagNotIn(List<Integer> values) {
            addCriterion("rel_flag not in", values, "relFlag");
            return (Criteria) this;
        }

        public Criteria andRelFlagBetween(Integer value1, Integer value2) {
            addCriterion("rel_flag between", value1, value2, "relFlag");
            return (Criteria) this;
        }

        public Criteria andRelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("rel_flag not between", value1, value2, "relFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNull() {
            addCriterion("pay_flag is null");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNotNull() {
            addCriterion("pay_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPayFlagEqualTo(Integer value) {
            addCriterion("pay_flag =", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotEqualTo(Integer value) {
            addCriterion("pay_flag <>", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThan(Integer value) {
            addCriterion("pay_flag >", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_flag >=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThan(Integer value) {
            addCriterion("pay_flag <", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThanOrEqualTo(Integer value) {
            addCriterion("pay_flag <=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagIn(List<Integer> values) {
            addCriterion("pay_flag in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotIn(List<Integer> values) {
            addCriterion("pay_flag not in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagBetween(Integer value1, Integer value2) {
            addCriterion("pay_flag between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_flag not between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagIsNull() {
            addCriterion("audit_flag is null");
            return (Criteria) this;
        }

        public Criteria andAuditFlagIsNotNull() {
            addCriterion("audit_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAuditFlagEqualTo(Integer value) {
            addCriterion("audit_flag =", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagNotEqualTo(Integer value) {
            addCriterion("audit_flag <>", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagGreaterThan(Integer value) {
            addCriterion("audit_flag >", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_flag >=", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagLessThan(Integer value) {
            addCriterion("audit_flag <", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagLessThanOrEqualTo(Integer value) {
            addCriterion("audit_flag <=", value, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagIn(List<Integer> values) {
            addCriterion("audit_flag in", values, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagNotIn(List<Integer> values) {
            addCriterion("audit_flag not in", values, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagBetween(Integer value1, Integer value2) {
            addCriterion("audit_flag between", value1, value2, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_flag not between", value1, value2, "auditFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagIsNull() {
            addCriterion("sub_family_flag is null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagIsNotNull() {
            addCriterion("sub_family_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagEqualTo(Integer value) {
            addCriterion("sub_family_flag =", value, "subFamilyFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagNotEqualTo(Integer value) {
            addCriterion("sub_family_flag <>", value, "subFamilyFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagGreaterThan(Integer value) {
            addCriterion("sub_family_flag >", value, "subFamilyFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_family_flag >=", value, "subFamilyFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagLessThan(Integer value) {
            addCriterion("sub_family_flag <", value, "subFamilyFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagLessThanOrEqualTo(Integer value) {
            addCriterion("sub_family_flag <=", value, "subFamilyFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagIn(List<Integer> values) {
            addCriterion("sub_family_flag in", values, "subFamilyFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagNotIn(List<Integer> values) {
            addCriterion("sub_family_flag not in", values, "subFamilyFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagBetween(Integer value1, Integer value2) {
            addCriterion("sub_family_flag between", value1, value2, "subFamilyFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_family_flag not between", value1, value2, "subFamilyFlag");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeIsNull() {
            addCriterion("sub_family_code is null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeIsNotNull() {
            addCriterion("sub_family_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeEqualTo(String value) {
            addCriterion("sub_family_code =", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeNotEqualTo(String value) {
            addCriterion("sub_family_code <>", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeGreaterThan(String value) {
            addCriterion("sub_family_code >", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_family_code >=", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeLessThan(String value) {
            addCriterion("sub_family_code <", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeLessThanOrEqualTo(String value) {
            addCriterion("sub_family_code <=", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeLike(String value) {
            addCriterion("sub_family_code like", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeNotLike(String value) {
            addCriterion("sub_family_code not like", value, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeIn(List<String> values) {
            addCriterion("sub_family_code in", values, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeNotIn(List<String> values) {
            addCriterion("sub_family_code not in", values, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeBetween(String value1, String value2) {
            addCriterion("sub_family_code between", value1, value2, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andSubFamilyCodeNotBetween(String value1, String value2) {
            addCriterion("sub_family_code not between", value1, value2, "subFamilyCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagIsNull() {
            addCriterion("household_in_flag is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagIsNotNull() {
            addCriterion("household_in_flag is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagEqualTo(Integer value) {
            addCriterion("household_in_flag =", value, "householdInFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagNotEqualTo(Integer value) {
            addCriterion("household_in_flag <>", value, "householdInFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagGreaterThan(Integer value) {
            addCriterion("household_in_flag >", value, "householdInFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("household_in_flag >=", value, "householdInFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagLessThan(Integer value) {
            addCriterion("household_in_flag <", value, "householdInFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagLessThanOrEqualTo(Integer value) {
            addCriterion("household_in_flag <=", value, "householdInFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagIn(List<Integer> values) {
            addCriterion("household_in_flag in", values, "householdInFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagNotIn(List<Integer> values) {
            addCriterion("household_in_flag not in", values, "householdInFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagBetween(Integer value1, Integer value2) {
            addCriterion("household_in_flag between", value1, value2, "householdInFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdInFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("household_in_flag not between", value1, value2, "householdInFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeIsNull() {
            addCriterion("household_in_time is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeIsNotNull() {
            addCriterion("household_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeEqualTo(String value) {
            addCriterion("household_in_time =", value, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeNotEqualTo(String value) {
            addCriterion("household_in_time <>", value, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeGreaterThan(String value) {
            addCriterion("household_in_time >", value, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeGreaterThanOrEqualTo(String value) {
            addCriterion("household_in_time >=", value, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeLessThan(String value) {
            addCriterion("household_in_time <", value, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeLessThanOrEqualTo(String value) {
            addCriterion("household_in_time <=", value, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeLike(String value) {
            addCriterion("household_in_time like", value, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeNotLike(String value) {
            addCriterion("household_in_time not like", value, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeIn(List<String> values) {
            addCriterion("household_in_time in", values, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeNotIn(List<String> values) {
            addCriterion("household_in_time not in", values, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeBetween(String value1, String value2) {
            addCriterion("household_in_time between", value1, value2, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdInTimeNotBetween(String value1, String value2) {
            addCriterion("household_in_time not between", value1, value2, "householdInTime");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andVersionSourceIsNull() {
            addCriterion("version_source is null");
            return (Criteria) this;
        }

        public Criteria andVersionSourceIsNotNull() {
            addCriterion("version_source is not null");
            return (Criteria) this;
        }

        public Criteria andVersionSourceEqualTo(Integer value) {
            addCriterion("version_source =", value, "versionSource");
            return (Criteria) this;
        }

        public Criteria andVersionSourceNotEqualTo(Integer value) {
            addCriterion("version_source <>", value, "versionSource");
            return (Criteria) this;
        }

        public Criteria andVersionSourceGreaterThan(Integer value) {
            addCriterion("version_source >", value, "versionSource");
            return (Criteria) this;
        }

        public Criteria andVersionSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_source >=", value, "versionSource");
            return (Criteria) this;
        }

        public Criteria andVersionSourceLessThan(Integer value) {
            addCriterion("version_source <", value, "versionSource");
            return (Criteria) this;
        }

        public Criteria andVersionSourceLessThanOrEqualTo(Integer value) {
            addCriterion("version_source <=", value, "versionSource");
            return (Criteria) this;
        }

        public Criteria andVersionSourceIn(List<Integer> values) {
            addCriterion("version_source in", values, "versionSource");
            return (Criteria) this;
        }

        public Criteria andVersionSourceNotIn(List<Integer> values) {
            addCriterion("version_source not in", values, "versionSource");
            return (Criteria) this;
        }

        public Criteria andVersionSourceBetween(Integer value1, Integer value2) {
            addCriterion("version_source between", value1, value2, "versionSource");
            return (Criteria) this;
        }

        public Criteria andVersionSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("version_source not between", value1, value2, "versionSource");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNull() {
            addCriterion("version_id is null");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNotNull() {
            addCriterion("version_id is not null");
            return (Criteria) this;
        }

        public Criteria andVersionIdEqualTo(Integer value) {
            addCriterion("version_id =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Integer value) {
            addCriterion("version_id <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Integer value) {
            addCriterion("version_id >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_id >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Integer value) {
            addCriterion("version_id <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("version_id <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(List<Integer> values) {
            addCriterion("version_id in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(List<Integer> values) {
            addCriterion("version_id not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("version_id between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("version_id not between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdIsNull() {
            addCriterion("version_member_id is null");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdIsNotNull() {
            addCriterion("version_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdEqualTo(Integer value) {
            addCriterion("version_member_id =", value, "versionMemberId");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdNotEqualTo(Integer value) {
            addCriterion("version_member_id <>", value, "versionMemberId");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdGreaterThan(Integer value) {
            addCriterion("version_member_id >", value, "versionMemberId");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_member_id >=", value, "versionMemberId");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdLessThan(Integer value) {
            addCriterion("version_member_id <", value, "versionMemberId");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("version_member_id <=", value, "versionMemberId");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdIn(List<Integer> values) {
            addCriterion("version_member_id in", values, "versionMemberId");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdNotIn(List<Integer> values) {
            addCriterion("version_member_id not in", values, "versionMemberId");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("version_member_id between", value1, value2, "versionMemberId");
            return (Criteria) this;
        }

        public Criteria andVersionMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("version_member_id not between", value1, value2, "versionMemberId");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeIsNull() {
            addCriterion("birthdate_type is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeIsNotNull() {
            addCriterion("birthdate_type is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeEqualTo(Integer value) {
            addCriterion("birthdate_type =", value, "birthdateType");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeNotEqualTo(Integer value) {
            addCriterion("birthdate_type <>", value, "birthdateType");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeGreaterThan(Integer value) {
            addCriterion("birthdate_type >", value, "birthdateType");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("birthdate_type >=", value, "birthdateType");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeLessThan(Integer value) {
            addCriterion("birthdate_type <", value, "birthdateType");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("birthdate_type <=", value, "birthdateType");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeIn(List<Integer> values) {
            addCriterion("birthdate_type in", values, "birthdateType");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeNotIn(List<Integer> values) {
            addCriterion("birthdate_type not in", values, "birthdateType");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeBetween(Integer value1, Integer value2) {
            addCriterion("birthdate_type between", value1, value2, "birthdateType");
            return (Criteria) this;
        }

        public Criteria andBirthdateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("birthdate_type not between", value1, value2, "birthdateType");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagIsNull() {
            addCriterion("relative_flag is null");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagIsNotNull() {
            addCriterion("relative_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagEqualTo(Integer value) {
            addCriterion("relative_flag =", value, "relativeFlag");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagNotEqualTo(Integer value) {
            addCriterion("relative_flag <>", value, "relativeFlag");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagGreaterThan(Integer value) {
            addCriterion("relative_flag >", value, "relativeFlag");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("relative_flag >=", value, "relativeFlag");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagLessThan(Integer value) {
            addCriterion("relative_flag <", value, "relativeFlag");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagLessThanOrEqualTo(Integer value) {
            addCriterion("relative_flag <=", value, "relativeFlag");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagIn(List<Integer> values) {
            addCriterion("relative_flag in", values, "relativeFlag");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagNotIn(List<Integer> values) {
            addCriterion("relative_flag not in", values, "relativeFlag");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagBetween(Integer value1, Integer value2) {
            addCriterion("relative_flag between", value1, value2, "relativeFlag");
            return (Criteria) this;
        }

        public Criteria andRelativeFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("relative_flag not between", value1, value2, "relativeFlag");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNull() {
            addCriterion("address_detail is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNotNull() {
            addCriterion("address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailEqualTo(String value) {
            addCriterion("address_detail =", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotEqualTo(String value) {
            addCriterion("address_detail <>", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThan(String value) {
            addCriterion("address_detail >", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("address_detail >=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThan(String value) {
            addCriterion("address_detail <", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("address_detail <=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLike(String value) {
            addCriterion("address_detail like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotLike(String value) {
            addCriterion("address_detail not like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIn(List<String> values) {
            addCriterion("address_detail in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotIn(List<String> values) {
            addCriterion("address_detail not in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailBetween(String value1, String value2) {
            addCriterion("address_detail between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotBetween(String value1, String value2) {
            addCriterion("address_detail not between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutIsNull() {
            addCriterion("adoptout is null");
            return (Criteria) this;
        }

        public Criteria andAdoptoutIsNotNull() {
            addCriterion("adoptout is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptoutEqualTo(Integer value) {
            addCriterion("adoptout =", value, "adoptout");
            return (Criteria) this;
        }

        public Criteria andAdoptoutNotEqualTo(Integer value) {
            addCriterion("adoptout <>", value, "adoptout");
            return (Criteria) this;
        }

        public Criteria andAdoptoutGreaterThan(Integer value) {
            addCriterion("adoptout >", value, "adoptout");
            return (Criteria) this;
        }

        public Criteria andAdoptoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("adoptout >=", value, "adoptout");
            return (Criteria) this;
        }

        public Criteria andAdoptoutLessThan(Integer value) {
            addCriterion("adoptout <", value, "adoptout");
            return (Criteria) this;
        }

        public Criteria andAdoptoutLessThanOrEqualTo(Integer value) {
            addCriterion("adoptout <=", value, "adoptout");
            return (Criteria) this;
        }

        public Criteria andAdoptoutIn(List<Integer> values) {
            addCriterion("adoptout in", values, "adoptout");
            return (Criteria) this;
        }

        public Criteria andAdoptoutNotIn(List<Integer> values) {
            addCriterion("adoptout not in", values, "adoptout");
            return (Criteria) this;
        }

        public Criteria andAdoptoutBetween(Integer value1, Integer value2) {
            addCriterion("adoptout between", value1, value2, "adoptout");
            return (Criteria) this;
        }

        public Criteria andAdoptoutNotBetween(Integer value1, Integer value2) {
            addCriterion("adoptout not between", value1, value2, "adoptout");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailIsNull() {
            addCriterion("adoptout_detail is null");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailIsNotNull() {
            addCriterion("adoptout_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailEqualTo(String value) {
            addCriterion("adoptout_detail =", value, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailNotEqualTo(String value) {
            addCriterion("adoptout_detail <>", value, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailGreaterThan(String value) {
            addCriterion("adoptout_detail >", value, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailGreaterThanOrEqualTo(String value) {
            addCriterion("adoptout_detail >=", value, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailLessThan(String value) {
            addCriterion("adoptout_detail <", value, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailLessThanOrEqualTo(String value) {
            addCriterion("adoptout_detail <=", value, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailLike(String value) {
            addCriterion("adoptout_detail like", value, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailNotLike(String value) {
            addCriterion("adoptout_detail not like", value, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailIn(List<String> values) {
            addCriterion("adoptout_detail in", values, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailNotIn(List<String> values) {
            addCriterion("adoptout_detail not in", values, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailBetween(String value1, String value2) {
            addCriterion("adoptout_detail between", value1, value2, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andAdoptoutDetailNotBetween(String value1, String value2) {
            addCriterion("adoptout_detail not between", value1, value2, "adoptoutDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalIsNull() {
            addCriterion("uxorilocal is null");
            return (Criteria) this;
        }

        public Criteria andUxorilocalIsNotNull() {
            addCriterion("uxorilocal is not null");
            return (Criteria) this;
        }

        public Criteria andUxorilocalEqualTo(Integer value) {
            addCriterion("uxorilocal =", value, "uxorilocal");
            return (Criteria) this;
        }

        public Criteria andUxorilocalNotEqualTo(Integer value) {
            addCriterion("uxorilocal <>", value, "uxorilocal");
            return (Criteria) this;
        }

        public Criteria andUxorilocalGreaterThan(Integer value) {
            addCriterion("uxorilocal >", value, "uxorilocal");
            return (Criteria) this;
        }

        public Criteria andUxorilocalGreaterThanOrEqualTo(Integer value) {
            addCriterion("uxorilocal >=", value, "uxorilocal");
            return (Criteria) this;
        }

        public Criteria andUxorilocalLessThan(Integer value) {
            addCriterion("uxorilocal <", value, "uxorilocal");
            return (Criteria) this;
        }

        public Criteria andUxorilocalLessThanOrEqualTo(Integer value) {
            addCriterion("uxorilocal <=", value, "uxorilocal");
            return (Criteria) this;
        }

        public Criteria andUxorilocalIn(List<Integer> values) {
            addCriterion("uxorilocal in", values, "uxorilocal");
            return (Criteria) this;
        }

        public Criteria andUxorilocalNotIn(List<Integer> values) {
            addCriterion("uxorilocal not in", values, "uxorilocal");
            return (Criteria) this;
        }

        public Criteria andUxorilocalBetween(Integer value1, Integer value2) {
            addCriterion("uxorilocal between", value1, value2, "uxorilocal");
            return (Criteria) this;
        }

        public Criteria andUxorilocalNotBetween(Integer value1, Integer value2) {
            addCriterion("uxorilocal not between", value1, value2, "uxorilocal");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailIsNull() {
            addCriterion("uxorilocal_detail is null");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailIsNotNull() {
            addCriterion("uxorilocal_detail is not null");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailEqualTo(String value) {
            addCriterion("uxorilocal_detail =", value, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailNotEqualTo(String value) {
            addCriterion("uxorilocal_detail <>", value, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailGreaterThan(String value) {
            addCriterion("uxorilocal_detail >", value, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailGreaterThanOrEqualTo(String value) {
            addCriterion("uxorilocal_detail >=", value, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailLessThan(String value) {
            addCriterion("uxorilocal_detail <", value, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailLessThanOrEqualTo(String value) {
            addCriterion("uxorilocal_detail <=", value, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailLike(String value) {
            addCriterion("uxorilocal_detail like", value, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailNotLike(String value) {
            addCriterion("uxorilocal_detail not like", value, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailIn(List<String> values) {
            addCriterion("uxorilocal_detail in", values, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailNotIn(List<String> values) {
            addCriterion("uxorilocal_detail not in", values, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailBetween(String value1, String value2) {
            addCriterion("uxorilocal_detail between", value1, value2, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andUxorilocalDetailNotBetween(String value1, String value2) {
            addCriterion("uxorilocal_detail not between", value1, value2, "uxorilocalDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawIsNull() {
            addCriterion("soninlaw is null");
            return (Criteria) this;
        }

        public Criteria andSoninlawIsNotNull() {
            addCriterion("soninlaw is not null");
            return (Criteria) this;
        }

        public Criteria andSoninlawEqualTo(Integer value) {
            addCriterion("soninlaw =", value, "soninlaw");
            return (Criteria) this;
        }

        public Criteria andSoninlawNotEqualTo(Integer value) {
            addCriterion("soninlaw <>", value, "soninlaw");
            return (Criteria) this;
        }

        public Criteria andSoninlawGreaterThan(Integer value) {
            addCriterion("soninlaw >", value, "soninlaw");
            return (Criteria) this;
        }

        public Criteria andSoninlawGreaterThanOrEqualTo(Integer value) {
            addCriterion("soninlaw >=", value, "soninlaw");
            return (Criteria) this;
        }

        public Criteria andSoninlawLessThan(Integer value) {
            addCriterion("soninlaw <", value, "soninlaw");
            return (Criteria) this;
        }

        public Criteria andSoninlawLessThanOrEqualTo(Integer value) {
            addCriterion("soninlaw <=", value, "soninlaw");
            return (Criteria) this;
        }

        public Criteria andSoninlawIn(List<Integer> values) {
            addCriterion("soninlaw in", values, "soninlaw");
            return (Criteria) this;
        }

        public Criteria andSoninlawNotIn(List<Integer> values) {
            addCriterion("soninlaw not in", values, "soninlaw");
            return (Criteria) this;
        }

        public Criteria andSoninlawBetween(Integer value1, Integer value2) {
            addCriterion("soninlaw between", value1, value2, "soninlaw");
            return (Criteria) this;
        }

        public Criteria andSoninlawNotBetween(Integer value1, Integer value2) {
            addCriterion("soninlaw not between", value1, value2, "soninlaw");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailIsNull() {
            addCriterion("soninlaw_detail is null");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailIsNotNull() {
            addCriterion("soninlaw_detail is not null");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailEqualTo(String value) {
            addCriterion("soninlaw_detail =", value, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailNotEqualTo(String value) {
            addCriterion("soninlaw_detail <>", value, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailGreaterThan(String value) {
            addCriterion("soninlaw_detail >", value, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailGreaterThanOrEqualTo(String value) {
            addCriterion("soninlaw_detail >=", value, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailLessThan(String value) {
            addCriterion("soninlaw_detail <", value, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailLessThanOrEqualTo(String value) {
            addCriterion("soninlaw_detail <=", value, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailLike(String value) {
            addCriterion("soninlaw_detail like", value, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailNotLike(String value) {
            addCriterion("soninlaw_detail not like", value, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailIn(List<String> values) {
            addCriterion("soninlaw_detail in", values, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailNotIn(List<String> values) {
            addCriterion("soninlaw_detail not in", values, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailBetween(String value1, String value2) {
            addCriterion("soninlaw_detail between", value1, value2, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andSoninlawDetailNotBetween(String value1, String value2) {
            addCriterion("soninlaw_detail not between", value1, value2, "soninlawDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andToLocateIsNull() {
            addCriterion("to_locate is null");
            return (Criteria) this;
        }

        public Criteria andToLocateIsNotNull() {
            addCriterion("to_locate is not null");
            return (Criteria) this;
        }

        public Criteria andToLocateEqualTo(Integer value) {
            addCriterion("to_locate =", value, "toLocate");
            return (Criteria) this;
        }

        public Criteria andToLocateNotEqualTo(Integer value) {
            addCriterion("to_locate <>", value, "toLocate");
            return (Criteria) this;
        }

        public Criteria andToLocateGreaterThan(Integer value) {
            addCriterion("to_locate >", value, "toLocate");
            return (Criteria) this;
        }

        public Criteria andToLocateGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_locate >=", value, "toLocate");
            return (Criteria) this;
        }

        public Criteria andToLocateLessThan(Integer value) {
            addCriterion("to_locate <", value, "toLocate");
            return (Criteria) this;
        }

        public Criteria andToLocateLessThanOrEqualTo(Integer value) {
            addCriterion("to_locate <=", value, "toLocate");
            return (Criteria) this;
        }

        public Criteria andToLocateIn(List<Integer> values) {
            addCriterion("to_locate in", values, "toLocate");
            return (Criteria) this;
        }

        public Criteria andToLocateNotIn(List<Integer> values) {
            addCriterion("to_locate not in", values, "toLocate");
            return (Criteria) this;
        }

        public Criteria andToLocateBetween(Integer value1, Integer value2) {
            addCriterion("to_locate between", value1, value2, "toLocate");
            return (Criteria) this;
        }

        public Criteria andToLocateNotBetween(Integer value1, Integer value2) {
            addCriterion("to_locate not between", value1, value2, "toLocate");
            return (Criteria) this;
        }

        public Criteria andSonNumIsNull() {
            addCriterion("son_num is null");
            return (Criteria) this;
        }

        public Criteria andSonNumIsNotNull() {
            addCriterion("son_num is not null");
            return (Criteria) this;
        }

        public Criteria andSonNumEqualTo(Integer value) {
            addCriterion("son_num =", value, "sonNum");
            return (Criteria) this;
        }

        public Criteria andSonNumNotEqualTo(Integer value) {
            addCriterion("son_num <>", value, "sonNum");
            return (Criteria) this;
        }

        public Criteria andSonNumGreaterThan(Integer value) {
            addCriterion("son_num >", value, "sonNum");
            return (Criteria) this;
        }

        public Criteria andSonNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("son_num >=", value, "sonNum");
            return (Criteria) this;
        }

        public Criteria andSonNumLessThan(Integer value) {
            addCriterion("son_num <", value, "sonNum");
            return (Criteria) this;
        }

        public Criteria andSonNumLessThanOrEqualTo(Integer value) {
            addCriterion("son_num <=", value, "sonNum");
            return (Criteria) this;
        }

        public Criteria andSonNumIn(List<Integer> values) {
            addCriterion("son_num in", values, "sonNum");
            return (Criteria) this;
        }

        public Criteria andSonNumNotIn(List<Integer> values) {
            addCriterion("son_num not in", values, "sonNum");
            return (Criteria) this;
        }

        public Criteria andSonNumBetween(Integer value1, Integer value2) {
            addCriterion("son_num between", value1, value2, "sonNum");
            return (Criteria) this;
        }

        public Criteria andSonNumNotBetween(Integer value1, Integer value2) {
            addCriterion("son_num not between", value1, value2, "sonNum");
            return (Criteria) this;
        }

        public Criteria andSonNumRealIsNull() {
            addCriterion("son_num_real is null");
            return (Criteria) this;
        }

        public Criteria andSonNumRealIsNotNull() {
            addCriterion("son_num_real is not null");
            return (Criteria) this;
        }

        public Criteria andSonNumRealEqualTo(Integer value) {
            addCriterion("son_num_real =", value, "sonNumReal");
            return (Criteria) this;
        }

        public Criteria andSonNumRealNotEqualTo(Integer value) {
            addCriterion("son_num_real <>", value, "sonNumReal");
            return (Criteria) this;
        }

        public Criteria andSonNumRealGreaterThan(Integer value) {
            addCriterion("son_num_real >", value, "sonNumReal");
            return (Criteria) this;
        }

        public Criteria andSonNumRealGreaterThanOrEqualTo(Integer value) {
            addCriterion("son_num_real >=", value, "sonNumReal");
            return (Criteria) this;
        }

        public Criteria andSonNumRealLessThan(Integer value) {
            addCriterion("son_num_real <", value, "sonNumReal");
            return (Criteria) this;
        }

        public Criteria andSonNumRealLessThanOrEqualTo(Integer value) {
            addCriterion("son_num_real <=", value, "sonNumReal");
            return (Criteria) this;
        }

        public Criteria andSonNumRealIn(List<Integer> values) {
            addCriterion("son_num_real in", values, "sonNumReal");
            return (Criteria) this;
        }

        public Criteria andSonNumRealNotIn(List<Integer> values) {
            addCriterion("son_num_real not in", values, "sonNumReal");
            return (Criteria) this;
        }

        public Criteria andSonNumRealBetween(Integer value1, Integer value2) {
            addCriterion("son_num_real between", value1, value2, "sonNumReal");
            return (Criteria) this;
        }

        public Criteria andSonNumRealNotBetween(Integer value1, Integer value2) {
            addCriterion("son_num_real not between", value1, value2, "sonNumReal");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagIsNull() {
            addCriterion("rel_error_flag is null");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagIsNotNull() {
            addCriterion("rel_error_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagEqualTo(Integer value) {
            addCriterion("rel_error_flag =", value, "relErrorFlag");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagNotEqualTo(Integer value) {
            addCriterion("rel_error_flag <>", value, "relErrorFlag");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagGreaterThan(Integer value) {
            addCriterion("rel_error_flag >", value, "relErrorFlag");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("rel_error_flag >=", value, "relErrorFlag");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagLessThan(Integer value) {
            addCriterion("rel_error_flag <", value, "relErrorFlag");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagLessThanOrEqualTo(Integer value) {
            addCriterion("rel_error_flag <=", value, "relErrorFlag");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagIn(List<Integer> values) {
            addCriterion("rel_error_flag in", values, "relErrorFlag");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagNotIn(List<Integer> values) {
            addCriterion("rel_error_flag not in", values, "relErrorFlag");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagBetween(Integer value1, Integer value2) {
            addCriterion("rel_error_flag between", value1, value2, "relErrorFlag");
            return (Criteria) this;
        }

        public Criteria andRelErrorFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("rel_error_flag not between", value1, value2, "relErrorFlag");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffIsNull() {
            addCriterion("son_num_diff is null");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffIsNotNull() {
            addCriterion("son_num_diff is not null");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffEqualTo(Integer value) {
            addCriterion("son_num_diff =", value, "sonNumDiff");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffNotEqualTo(Integer value) {
            addCriterion("son_num_diff <>", value, "sonNumDiff");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffGreaterThan(Integer value) {
            addCriterion("son_num_diff >", value, "sonNumDiff");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffGreaterThanOrEqualTo(Integer value) {
            addCriterion("son_num_diff >=", value, "sonNumDiff");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffLessThan(Integer value) {
            addCriterion("son_num_diff <", value, "sonNumDiff");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffLessThanOrEqualTo(Integer value) {
            addCriterion("son_num_diff <=", value, "sonNumDiff");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffIn(List<Integer> values) {
            addCriterion("son_num_diff in", values, "sonNumDiff");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffNotIn(List<Integer> values) {
            addCriterion("son_num_diff not in", values, "sonNumDiff");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffBetween(Integer value1, Integer value2) {
            addCriterion("son_num_diff between", value1, value2, "sonNumDiff");
            return (Criteria) this;
        }

        public Criteria andSonNumDiffNotBetween(Integer value1, Integer value2) {
            addCriterion("son_num_diff not between", value1, value2, "sonNumDiff");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistIsNull() {
            addCriterion("already_exist is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistIsNotNull() {
            addCriterion("already_exist is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistEqualTo(Integer value) {
            addCriterion("already_exist =", value, "alreadyExist");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistNotEqualTo(Integer value) {
            addCriterion("already_exist <>", value, "alreadyExist");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistGreaterThan(Integer value) {
            addCriterion("already_exist >", value, "alreadyExist");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistGreaterThanOrEqualTo(Integer value) {
            addCriterion("already_exist >=", value, "alreadyExist");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistLessThan(Integer value) {
            addCriterion("already_exist <", value, "alreadyExist");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistLessThanOrEqualTo(Integer value) {
            addCriterion("already_exist <=", value, "alreadyExist");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistIn(List<Integer> values) {
            addCriterion("already_exist in", values, "alreadyExist");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistNotIn(List<Integer> values) {
            addCriterion("already_exist not in", values, "alreadyExist");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistBetween(Integer value1, Integer value2) {
            addCriterion("already_exist between", value1, value2, "alreadyExist");
            return (Criteria) this;
        }

        public Criteria andAlreadyExistNotBetween(Integer value1, Integer value2) {
            addCriterion("already_exist not between", value1, value2, "alreadyExist");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}