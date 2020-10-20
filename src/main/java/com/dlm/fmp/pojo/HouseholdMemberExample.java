package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseholdMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseholdMemberExample() {
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

        public Criteria andHouseholdMemberCodeIsNull() {
            addCriterion("household_member_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeIsNotNull() {
            addCriterion("household_member_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeEqualTo(String value) {
            addCriterion("household_member_code =", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeNotEqualTo(String value) {
            addCriterion("household_member_code <>", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeGreaterThan(String value) {
            addCriterion("household_member_code >", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeGreaterThanOrEqualTo(String value) {
            addCriterion("household_member_code >=", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeLessThan(String value) {
            addCriterion("household_member_code <", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeLessThanOrEqualTo(String value) {
            addCriterion("household_member_code <=", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeLike(String value) {
            addCriterion("household_member_code like", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeNotLike(String value) {
            addCriterion("household_member_code not like", value, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeIn(List<String> values) {
            addCriterion("household_member_code in", values, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeNotIn(List<String> values) {
            addCriterion("household_member_code not in", values, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeBetween(String value1, String value2) {
            addCriterion("household_member_code between", value1, value2, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberCodeNotBetween(String value1, String value2) {
            addCriterion("household_member_code not between", value1, value2, "householdMemberCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdIsNull() {
            addCriterion("household_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdIsNotNull() {
            addCriterion("household_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdEqualTo(Integer value) {
            addCriterion("household_id =", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdNotEqualTo(Integer value) {
            addCriterion("household_id <>", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdGreaterThan(Integer value) {
            addCriterion("household_id >", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("household_id >=", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdLessThan(Integer value) {
            addCriterion("household_id <", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdLessThanOrEqualTo(Integer value) {
            addCriterion("household_id <=", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdIn(List<Integer> values) {
            addCriterion("household_id in", values, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdNotIn(List<Integer> values) {
            addCriterion("household_id not in", values, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdBetween(Integer value1, Integer value2) {
            addCriterion("household_id between", value1, value2, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("household_id not between", value1, value2, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIsNull() {
            addCriterion("household_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIsNotNull() {
            addCriterion("household_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeEqualTo(String value) {
            addCriterion("household_code =", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotEqualTo(String value) {
            addCriterion("household_code <>", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeGreaterThan(String value) {
            addCriterion("household_code >", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("household_code >=", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLessThan(String value) {
            addCriterion("household_code <", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLessThanOrEqualTo(String value) {
            addCriterion("household_code <=", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLike(String value) {
            addCriterion("household_code like", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotLike(String value) {
            addCriterion("household_code not like", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIn(List<String> values) {
            addCriterion("household_code in", values, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotIn(List<String> values) {
            addCriterion("household_code not in", values, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeBetween(String value1, String value2) {
            addCriterion("household_code between", value1, value2, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotBetween(String value1, String value2) {
            addCriterion("household_code not between", value1, value2, "householdCode");
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

        public Criteria andMotherNameIsNull() {
            addCriterion("mother_name is null");
            return (Criteria) this;
        }

        public Criteria andMotherNameIsNotNull() {
            addCriterion("mother_name is not null");
            return (Criteria) this;
        }

        public Criteria andMotherNameEqualTo(String value) {
            addCriterion("mother_name =", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotEqualTo(String value) {
            addCriterion("mother_name <>", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameGreaterThan(String value) {
            addCriterion("mother_name >", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameGreaterThanOrEqualTo(String value) {
            addCriterion("mother_name >=", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLessThan(String value) {
            addCriterion("mother_name <", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLessThanOrEqualTo(String value) {
            addCriterion("mother_name <=", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLike(String value) {
            addCriterion("mother_name like", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotLike(String value) {
            addCriterion("mother_name not like", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameIn(List<String> values) {
            addCriterion("mother_name in", values, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotIn(List<String> values) {
            addCriterion("mother_name not in", values, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameBetween(String value1, String value2) {
            addCriterion("mother_name between", value1, value2, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotBetween(String value1, String value2) {
            addCriterion("mother_name not between", value1, value2, "motherName");
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

        public Criteria andSpouseFatherNameIsNull() {
            addCriterion("spouse_father_name is null");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameIsNotNull() {
            addCriterion("spouse_father_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameEqualTo(String value) {
            addCriterion("spouse_father_name =", value, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameNotEqualTo(String value) {
            addCriterion("spouse_father_name <>", value, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameGreaterThan(String value) {
            addCriterion("spouse_father_name >", value, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_father_name >=", value, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameLessThan(String value) {
            addCriterion("spouse_father_name <", value, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameLessThanOrEqualTo(String value) {
            addCriterion("spouse_father_name <=", value, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameLike(String value) {
            addCriterion("spouse_father_name like", value, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameNotLike(String value) {
            addCriterion("spouse_father_name not like", value, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameIn(List<String> values) {
            addCriterion("spouse_father_name in", values, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameNotIn(List<String> values) {
            addCriterion("spouse_father_name not in", values, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameBetween(String value1, String value2) {
            addCriterion("spouse_father_name between", value1, value2, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andSpouseFatherNameNotBetween(String value1, String value2) {
            addCriterion("spouse_father_name not between", value1, value2, "spouseFatherName");
            return (Criteria) this;
        }

        public Criteria andRelationNameIsNull() {
            addCriterion("relation_name is null");
            return (Criteria) this;
        }

        public Criteria andRelationNameIsNotNull() {
            addCriterion("relation_name is not null");
            return (Criteria) this;
        }

        public Criteria andRelationNameEqualTo(String value) {
            addCriterion("relation_name =", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameNotEqualTo(String value) {
            addCriterion("relation_name <>", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameGreaterThan(String value) {
            addCriterion("relation_name >", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameGreaterThanOrEqualTo(String value) {
            addCriterion("relation_name >=", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameLessThan(String value) {
            addCriterion("relation_name <", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameLessThanOrEqualTo(String value) {
            addCriterion("relation_name <=", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameLike(String value) {
            addCriterion("relation_name like", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameNotLike(String value) {
            addCriterion("relation_name not like", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameIn(List<String> values) {
            addCriterion("relation_name in", values, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameNotIn(List<String> values) {
            addCriterion("relation_name not in", values, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameBetween(String value1, String value2) {
            addCriterion("relation_name between", value1, value2, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameNotBetween(String value1, String value2) {
            addCriterion("relation_name not between", value1, value2, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationCodeIsNull() {
            addCriterion("relation_code is null");
            return (Criteria) this;
        }

        public Criteria andRelationCodeIsNotNull() {
            addCriterion("relation_code is not null");
            return (Criteria) this;
        }

        public Criteria andRelationCodeEqualTo(String value) {
            addCriterion("relation_code =", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeNotEqualTo(String value) {
            addCriterion("relation_code <>", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeGreaterThan(String value) {
            addCriterion("relation_code >", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("relation_code >=", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeLessThan(String value) {
            addCriterion("relation_code <", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeLessThanOrEqualTo(String value) {
            addCriterion("relation_code <=", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeLike(String value) {
            addCriterion("relation_code like", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeNotLike(String value) {
            addCriterion("relation_code not like", value, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeIn(List<String> values) {
            addCriterion("relation_code in", values, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeNotIn(List<String> values) {
            addCriterion("relation_code not in", values, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeBetween(String value1, String value2) {
            addCriterion("relation_code between", value1, value2, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationCodeNotBetween(String value1, String value2) {
            addCriterion("relation_code not between", value1, value2, "relationCode");
            return (Criteria) this;
        }

        public Criteria andRelationDelIsNull() {
            addCriterion("relation_del is null");
            return (Criteria) this;
        }

        public Criteria andRelationDelIsNotNull() {
            addCriterion("relation_del is not null");
            return (Criteria) this;
        }

        public Criteria andRelationDelEqualTo(String value) {
            addCriterion("relation_del =", value, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelNotEqualTo(String value) {
            addCriterion("relation_del <>", value, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelGreaterThan(String value) {
            addCriterion("relation_del >", value, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelGreaterThanOrEqualTo(String value) {
            addCriterion("relation_del >=", value, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelLessThan(String value) {
            addCriterion("relation_del <", value, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelLessThanOrEqualTo(String value) {
            addCriterion("relation_del <=", value, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelLike(String value) {
            addCriterion("relation_del like", value, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelNotLike(String value) {
            addCriterion("relation_del not like", value, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelIn(List<String> values) {
            addCriterion("relation_del in", values, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelNotIn(List<String> values) {
            addCriterion("relation_del not in", values, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelBetween(String value1, String value2) {
            addCriterion("relation_del between", value1, value2, "relationDel");
            return (Criteria) this;
        }

        public Criteria andRelationDelNotBetween(String value1, String value2) {
            addCriterion("relation_del not between", value1, value2, "relationDel");
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

        public Criteria andOtherNameIsNull() {
            addCriterion("other_name is null");
            return (Criteria) this;
        }

        public Criteria andOtherNameIsNotNull() {
            addCriterion("other_name is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNameEqualTo(String value) {
            addCriterion("other_name =", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotEqualTo(String value) {
            addCriterion("other_name <>", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameGreaterThan(String value) {
            addCriterion("other_name >", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameGreaterThanOrEqualTo(String value) {
            addCriterion("other_name >=", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLessThan(String value) {
            addCriterion("other_name <", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLessThanOrEqualTo(String value) {
            addCriterion("other_name <=", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLike(String value) {
            addCriterion("other_name like", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotLike(String value) {
            addCriterion("other_name not like", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameIn(List<String> values) {
            addCriterion("other_name in", values, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotIn(List<String> values) {
            addCriterion("other_name not in", values, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameBetween(String value1, String value2) {
            addCriterion("other_name between", value1, value2, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotBetween(String value1, String value2) {
            addCriterion("other_name not between", value1, value2, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherMarkIsNull() {
            addCriterion("other_mark is null");
            return (Criteria) this;
        }

        public Criteria andOtherMarkIsNotNull() {
            addCriterion("other_mark is not null");
            return (Criteria) this;
        }

        public Criteria andOtherMarkEqualTo(String value) {
            addCriterion("other_mark =", value, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkNotEqualTo(String value) {
            addCriterion("other_mark <>", value, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkGreaterThan(String value) {
            addCriterion("other_mark >", value, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkGreaterThanOrEqualTo(String value) {
            addCriterion("other_mark >=", value, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkLessThan(String value) {
            addCriterion("other_mark <", value, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkLessThanOrEqualTo(String value) {
            addCriterion("other_mark <=", value, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkLike(String value) {
            addCriterion("other_mark like", value, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkNotLike(String value) {
            addCriterion("other_mark not like", value, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkIn(List<String> values) {
            addCriterion("other_mark in", values, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkNotIn(List<String> values) {
            addCriterion("other_mark not in", values, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkBetween(String value1, String value2) {
            addCriterion("other_mark between", value1, value2, "otherMark");
            return (Criteria) this;
        }

        public Criteria andOtherMarkNotBetween(String value1, String value2) {
            addCriterion("other_mark not between", value1, value2, "otherMark");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(String value) {
            addCriterion("marriage =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(String value) {
            addCriterion("marriage <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(String value) {
            addCriterion("marriage >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("marriage >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(String value) {
            addCriterion("marriage <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(String value) {
            addCriterion("marriage <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLike(String value) {
            addCriterion("marriage like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotLike(String value) {
            addCriterion("marriage not like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<String> values) {
            addCriterion("marriage in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<String> values) {
            addCriterion("marriage not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(String value1, String value2) {
            addCriterion("marriage between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(String value1, String value2) {
            addCriterion("marriage not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarryTimeIsNull() {
            addCriterion("marry_time is null");
            return (Criteria) this;
        }

        public Criteria andMarryTimeIsNotNull() {
            addCriterion("marry_time is not null");
            return (Criteria) this;
        }

        public Criteria andMarryTimeEqualTo(String value) {
            addCriterion("marry_time =", value, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeNotEqualTo(String value) {
            addCriterion("marry_time <>", value, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeGreaterThan(String value) {
            addCriterion("marry_time >", value, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("marry_time >=", value, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeLessThan(String value) {
            addCriterion("marry_time <", value, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeLessThanOrEqualTo(String value) {
            addCriterion("marry_time <=", value, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeLike(String value) {
            addCriterion("marry_time like", value, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeNotLike(String value) {
            addCriterion("marry_time not like", value, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeIn(List<String> values) {
            addCriterion("marry_time in", values, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeNotIn(List<String> values) {
            addCriterion("marry_time not in", values, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeBetween(String value1, String value2) {
            addCriterion("marry_time between", value1, value2, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryTimeNotBetween(String value1, String value2) {
            addCriterion("marry_time not between", value1, value2, "marryTime");
            return (Criteria) this;
        }

        public Criteria andMarryFlagIsNull() {
            addCriterion("marry_flag is null");
            return (Criteria) this;
        }

        public Criteria andMarryFlagIsNotNull() {
            addCriterion("marry_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMarryFlagEqualTo(Integer value) {
            addCriterion("marry_flag =", value, "marryFlag");
            return (Criteria) this;
        }

        public Criteria andMarryFlagNotEqualTo(Integer value) {
            addCriterion("marry_flag <>", value, "marryFlag");
            return (Criteria) this;
        }

        public Criteria andMarryFlagGreaterThan(Integer value) {
            addCriterion("marry_flag >", value, "marryFlag");
            return (Criteria) this;
        }

        public Criteria andMarryFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("marry_flag >=", value, "marryFlag");
            return (Criteria) this;
        }

        public Criteria andMarryFlagLessThan(Integer value) {
            addCriterion("marry_flag <", value, "marryFlag");
            return (Criteria) this;
        }

        public Criteria andMarryFlagLessThanOrEqualTo(Integer value) {
            addCriterion("marry_flag <=", value, "marryFlag");
            return (Criteria) this;
        }

        public Criteria andMarryFlagIn(List<Integer> values) {
            addCriterion("marry_flag in", values, "marryFlag");
            return (Criteria) this;
        }

        public Criteria andMarryFlagNotIn(List<Integer> values) {
            addCriterion("marry_flag not in", values, "marryFlag");
            return (Criteria) this;
        }

        public Criteria andMarryFlagBetween(Integer value1, Integer value2) {
            addCriterion("marry_flag between", value1, value2, "marryFlag");
            return (Criteria) this;
        }

        public Criteria andMarryFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("marry_flag not between", value1, value2, "marryFlag");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagIsNull() {
            addCriterion("pregnent_flag is null");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagIsNotNull() {
            addCriterion("pregnent_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagEqualTo(Integer value) {
            addCriterion("pregnent_flag =", value, "pregnentFlag");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagNotEqualTo(Integer value) {
            addCriterion("pregnent_flag <>", value, "pregnentFlag");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagGreaterThan(Integer value) {
            addCriterion("pregnent_flag >", value, "pregnentFlag");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("pregnent_flag >=", value, "pregnentFlag");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagLessThan(Integer value) {
            addCriterion("pregnent_flag <", value, "pregnentFlag");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagLessThanOrEqualTo(Integer value) {
            addCriterion("pregnent_flag <=", value, "pregnentFlag");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagIn(List<Integer> values) {
            addCriterion("pregnent_flag in", values, "pregnentFlag");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagNotIn(List<Integer> values) {
            addCriterion("pregnent_flag not in", values, "pregnentFlag");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagBetween(Integer value1, Integer value2) {
            addCriterion("pregnent_flag between", value1, value2, "pregnentFlag");
            return (Criteria) this;
        }

        public Criteria andPregnentFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("pregnent_flag not between", value1, value2, "pregnentFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagIsNull() {
            addCriterion("moveout_flag is null");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagIsNotNull() {
            addCriterion("moveout_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagEqualTo(Integer value) {
            addCriterion("moveout_flag =", value, "moveoutFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagNotEqualTo(Integer value) {
            addCriterion("moveout_flag <>", value, "moveoutFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagGreaterThan(Integer value) {
            addCriterion("moveout_flag >", value, "moveoutFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("moveout_flag >=", value, "moveoutFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagLessThan(Integer value) {
            addCriterion("moveout_flag <", value, "moveoutFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagLessThanOrEqualTo(Integer value) {
            addCriterion("moveout_flag <=", value, "moveoutFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagIn(List<Integer> values) {
            addCriterion("moveout_flag in", values, "moveoutFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagNotIn(List<Integer> values) {
            addCriterion("moveout_flag not in", values, "moveoutFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagBetween(Integer value1, Integer value2) {
            addCriterion("moveout_flag between", value1, value2, "moveoutFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("moveout_flag not between", value1, value2, "moveoutFlag");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceIsNull() {
            addCriterion("moveout_place is null");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceIsNotNull() {
            addCriterion("moveout_place is not null");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceEqualTo(String value) {
            addCriterion("moveout_place =", value, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceNotEqualTo(String value) {
            addCriterion("moveout_place <>", value, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceGreaterThan(String value) {
            addCriterion("moveout_place >", value, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("moveout_place >=", value, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceLessThan(String value) {
            addCriterion("moveout_place <", value, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceLessThanOrEqualTo(String value) {
            addCriterion("moveout_place <=", value, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceLike(String value) {
            addCriterion("moveout_place like", value, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceNotLike(String value) {
            addCriterion("moveout_place not like", value, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceIn(List<String> values) {
            addCriterion("moveout_place in", values, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceNotIn(List<String> values) {
            addCriterion("moveout_place not in", values, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceBetween(String value1, String value2) {
            addCriterion("moveout_place between", value1, value2, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andMoveoutPlaceNotBetween(String value1, String value2) {
            addCriterion("moveout_place not between", value1, value2, "moveoutPlace");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentIsNull() {
            addCriterion("other_comment is null");
            return (Criteria) this;
        }

        public Criteria andOtherCommentIsNotNull() {
            addCriterion("other_comment is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCommentEqualTo(String value) {
            addCriterion("other_comment =", value, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentNotEqualTo(String value) {
            addCriterion("other_comment <>", value, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentGreaterThan(String value) {
            addCriterion("other_comment >", value, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentGreaterThanOrEqualTo(String value) {
            addCriterion("other_comment >=", value, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentLessThan(String value) {
            addCriterion("other_comment <", value, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentLessThanOrEqualTo(String value) {
            addCriterion("other_comment <=", value, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentLike(String value) {
            addCriterion("other_comment like", value, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentNotLike(String value) {
            addCriterion("other_comment not like", value, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentIn(List<String> values) {
            addCriterion("other_comment in", values, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentNotIn(List<String> values) {
            addCriterion("other_comment not in", values, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentBetween(String value1, String value2) {
            addCriterion("other_comment between", value1, value2, "otherComment");
            return (Criteria) this;
        }

        public Criteria andOtherCommentNotBetween(String value1, String value2) {
            addCriterion("other_comment not between", value1, value2, "otherComment");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagIsNull() {
            addCriterion("sec_marry_flag is null");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagIsNotNull() {
            addCriterion("sec_marry_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagEqualTo(Integer value) {
            addCriterion("sec_marry_flag =", value, "secMarryFlag");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagNotEqualTo(Integer value) {
            addCriterion("sec_marry_flag <>", value, "secMarryFlag");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagGreaterThan(Integer value) {
            addCriterion("sec_marry_flag >", value, "secMarryFlag");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("sec_marry_flag >=", value, "secMarryFlag");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagLessThan(Integer value) {
            addCriterion("sec_marry_flag <", value, "secMarryFlag");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagLessThanOrEqualTo(Integer value) {
            addCriterion("sec_marry_flag <=", value, "secMarryFlag");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagIn(List<Integer> values) {
            addCriterion("sec_marry_flag in", values, "secMarryFlag");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagNotIn(List<Integer> values) {
            addCriterion("sec_marry_flag not in", values, "secMarryFlag");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagBetween(Integer value1, Integer value2) {
            addCriterion("sec_marry_flag between", value1, value2, "secMarryFlag");
            return (Criteria) this;
        }

        public Criteria andSecMarryFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("sec_marry_flag not between", value1, value2, "secMarryFlag");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagIsNull() {
            addCriterion("divorce_flag is null");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagIsNotNull() {
            addCriterion("divorce_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagEqualTo(Integer value) {
            addCriterion("divorce_flag =", value, "divorceFlag");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagNotEqualTo(Integer value) {
            addCriterion("divorce_flag <>", value, "divorceFlag");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagGreaterThan(Integer value) {
            addCriterion("divorce_flag >", value, "divorceFlag");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("divorce_flag >=", value, "divorceFlag");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagLessThan(Integer value) {
            addCriterion("divorce_flag <", value, "divorceFlag");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagLessThanOrEqualTo(Integer value) {
            addCriterion("divorce_flag <=", value, "divorceFlag");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagIn(List<Integer> values) {
            addCriterion("divorce_flag in", values, "divorceFlag");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagNotIn(List<Integer> values) {
            addCriterion("divorce_flag not in", values, "divorceFlag");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagBetween(Integer value1, Integer value2) {
            addCriterion("divorce_flag between", value1, value2, "divorceFlag");
            return (Criteria) this;
        }

        public Criteria andDivorceFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("divorce_flag not between", value1, value2, "divorceFlag");
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

        public Criteria andEducateExperienceIsNull() {
            addCriterion("educate_experience is null");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceIsNotNull() {
            addCriterion("educate_experience is not null");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceEqualTo(String value) {
            addCriterion("educate_experience =", value, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceNotEqualTo(String value) {
            addCriterion("educate_experience <>", value, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceGreaterThan(String value) {
            addCriterion("educate_experience >", value, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("educate_experience >=", value, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceLessThan(String value) {
            addCriterion("educate_experience <", value, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceLessThanOrEqualTo(String value) {
            addCriterion("educate_experience <=", value, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceLike(String value) {
            addCriterion("educate_experience like", value, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceNotLike(String value) {
            addCriterion("educate_experience not like", value, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceIn(List<String> values) {
            addCriterion("educate_experience in", values, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceNotIn(List<String> values) {
            addCriterion("educate_experience not in", values, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceBetween(String value1, String value2) {
            addCriterion("educate_experience between", value1, value2, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andEducateExperienceNotBetween(String value1, String value2) {
            addCriterion("educate_experience not between", value1, value2, "educateExperience");
            return (Criteria) this;
        }

        public Criteria andCareerIsNull() {
            addCriterion("career is null");
            return (Criteria) this;
        }

        public Criteria andCareerIsNotNull() {
            addCriterion("career is not null");
            return (Criteria) this;
        }

        public Criteria andCareerEqualTo(String value) {
            addCriterion("career =", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotEqualTo(String value) {
            addCriterion("career <>", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThan(String value) {
            addCriterion("career >", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThanOrEqualTo(String value) {
            addCriterion("career >=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThan(String value) {
            addCriterion("career <", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThanOrEqualTo(String value) {
            addCriterion("career <=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLike(String value) {
            addCriterion("career like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotLike(String value) {
            addCriterion("career not like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerIn(List<String> values) {
            addCriterion("career in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotIn(List<String> values) {
            addCriterion("career not in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerBetween(String value1, String value2) {
            addCriterion("career between", value1, value2, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotBetween(String value1, String value2) {
            addCriterion("career not between", value1, value2, "career");
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

        public Criteria andMemberStoryLevelIsNull() {
            addCriterion("member_story_level is null");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelIsNotNull() {
            addCriterion("member_story_level is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelEqualTo(Integer value) {
            addCriterion("member_story_level =", value, "memberStoryLevel");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelNotEqualTo(Integer value) {
            addCriterion("member_story_level <>", value, "memberStoryLevel");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelGreaterThan(Integer value) {
            addCriterion("member_story_level >", value, "memberStoryLevel");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_story_level >=", value, "memberStoryLevel");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelLessThan(Integer value) {
            addCriterion("member_story_level <", value, "memberStoryLevel");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelLessThanOrEqualTo(Integer value) {
            addCriterion("member_story_level <=", value, "memberStoryLevel");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelIn(List<Integer> values) {
            addCriterion("member_story_level in", values, "memberStoryLevel");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelNotIn(List<Integer> values) {
            addCriterion("member_story_level not in", values, "memberStoryLevel");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelBetween(Integer value1, Integer value2) {
            addCriterion("member_story_level between", value1, value2, "memberStoryLevel");
            return (Criteria) this;
        }

        public Criteria andMemberStoryLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("member_story_level not between", value1, value2, "memberStoryLevel");
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

        public Criteria andHeadImageIsNull() {
            addCriterion("head_image is null");
            return (Criteria) this;
        }

        public Criteria andHeadImageIsNotNull() {
            addCriterion("head_image is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImageEqualTo(String value) {
            addCriterion("head_image =", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotEqualTo(String value) {
            addCriterion("head_image <>", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageGreaterThan(String value) {
            addCriterion("head_image >", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageGreaterThanOrEqualTo(String value) {
            addCriterion("head_image >=", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageLessThan(String value) {
            addCriterion("head_image <", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageLessThanOrEqualTo(String value) {
            addCriterion("head_image <=", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageLike(String value) {
            addCriterion("head_image like", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotLike(String value) {
            addCriterion("head_image not like", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageIn(List<String> values) {
            addCriterion("head_image in", values, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotIn(List<String> values) {
            addCriterion("head_image not in", values, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageBetween(String value1, String value2) {
            addCriterion("head_image between", value1, value2, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotBetween(String value1, String value2) {
            addCriterion("head_image not between", value1, value2, "headImage");
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

        public Criteria andGenerationLevelIsNull() {
            addCriterion("generation_level is null");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelIsNotNull() {
            addCriterion("generation_level is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelEqualTo(String value) {
            addCriterion("generation_level =", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelNotEqualTo(String value) {
            addCriterion("generation_level <>", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelGreaterThan(String value) {
            addCriterion("generation_level >", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelGreaterThanOrEqualTo(String value) {
            addCriterion("generation_level >=", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelLessThan(String value) {
            addCriterion("generation_level <", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelLessThanOrEqualTo(String value) {
            addCriterion("generation_level <=", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelLike(String value) {
            addCriterion("generation_level like", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelNotLike(String value) {
            addCriterion("generation_level not like", value, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelIn(List<String> values) {
            addCriterion("generation_level in", values, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelNotIn(List<String> values) {
            addCriterion("generation_level not in", values, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelBetween(String value1, String value2) {
            addCriterion("generation_level between", value1, value2, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelNotBetween(String value1, String value2) {
            addCriterion("generation_level not between", value1, value2, "generationLevel");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeIsNull() {
            addCriterion("generation_level_code is null");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeIsNotNull() {
            addCriterion("generation_level_code is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeEqualTo(Integer value) {
            addCriterion("generation_level_code =", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeNotEqualTo(Integer value) {
            addCriterion("generation_level_code <>", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeGreaterThan(Integer value) {
            addCriterion("generation_level_code >", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("generation_level_code >=", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeLessThan(Integer value) {
            addCriterion("generation_level_code <", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeLessThanOrEqualTo(Integer value) {
            addCriterion("generation_level_code <=", value, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeIn(List<Integer> values) {
            addCriterion("generation_level_code in", values, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeNotIn(List<Integer> values) {
            addCriterion("generation_level_code not in", values, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeBetween(Integer value1, Integer value2) {
            addCriterion("generation_level_code between", value1, value2, "generationLevelCode");
            return (Criteria) this;
        }

        public Criteria andGenerationLevelCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("generation_level_code not between", value1, value2, "generationLevelCode");
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

        public Criteria andIdentityNoIsNull() {
            addCriterion("identity_no is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIsNotNull() {
            addCriterion("identity_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNoEqualTo(String value) {
            addCriterion("identity_no =", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotEqualTo(String value) {
            addCriterion("identity_no <>", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoGreaterThan(String value) {
            addCriterion("identity_no >", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoGreaterThanOrEqualTo(String value) {
            addCriterion("identity_no >=", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLessThan(String value) {
            addCriterion("identity_no <", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLessThanOrEqualTo(String value) {
            addCriterion("identity_no <=", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLike(String value) {
            addCriterion("identity_no like", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotLike(String value) {
            addCriterion("identity_no not like", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIn(List<String> values) {
            addCriterion("identity_no in", values, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotIn(List<String> values) {
            addCriterion("identity_no not in", values, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoBetween(String value1, String value2) {
            addCriterion("identity_no between", value1, value2, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotBetween(String value1, String value2) {
            addCriterion("identity_no not between", value1, value2, "identityNo");
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

        public Criteria andLunarBirthdayTimeIsNull() {
            addCriterion("lunar_birthday_time is null");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeIsNotNull() {
            addCriterion("lunar_birthday_time is not null");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeEqualTo(String value) {
            addCriterion("lunar_birthday_time =", value, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeNotEqualTo(String value) {
            addCriterion("lunar_birthday_time <>", value, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeGreaterThan(String value) {
            addCriterion("lunar_birthday_time >", value, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("lunar_birthday_time >=", value, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeLessThan(String value) {
            addCriterion("lunar_birthday_time <", value, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeLessThanOrEqualTo(String value) {
            addCriterion("lunar_birthday_time <=", value, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeLike(String value) {
            addCriterion("lunar_birthday_time like", value, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeNotLike(String value) {
            addCriterion("lunar_birthday_time not like", value, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeIn(List<String> values) {
            addCriterion("lunar_birthday_time in", values, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeNotIn(List<String> values) {
            addCriterion("lunar_birthday_time not in", values, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeBetween(String value1, String value2) {
            addCriterion("lunar_birthday_time between", value1, value2, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarBirthdayTimeNotBetween(String value1, String value2) {
            addCriterion("lunar_birthday_time not between", value1, value2, "lunarBirthdayTime");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraIsNull() {
            addCriterion("birthday_time_tra is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraIsNotNull() {
            addCriterion("birthday_time_tra is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraEqualTo(String value) {
            addCriterion("birthday_time_tra =", value, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraNotEqualTo(String value) {
            addCriterion("birthday_time_tra <>", value, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraGreaterThan(String value) {
            addCriterion("birthday_time_tra >", value, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraGreaterThanOrEqualTo(String value) {
            addCriterion("birthday_time_tra >=", value, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraLessThan(String value) {
            addCriterion("birthday_time_tra <", value, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraLessThanOrEqualTo(String value) {
            addCriterion("birthday_time_tra <=", value, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraLike(String value) {
            addCriterion("birthday_time_tra like", value, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraNotLike(String value) {
            addCriterion("birthday_time_tra not like", value, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraIn(List<String> values) {
            addCriterion("birthday_time_tra in", values, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraNotIn(List<String> values) {
            addCriterion("birthday_time_tra not in", values, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraBetween(String value1, String value2) {
            addCriterion("birthday_time_tra between", value1, value2, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayTimeTraNotBetween(String value1, String value2) {
            addCriterion("birthday_time_tra not between", value1, value2, "birthdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearIsNull() {
            addCriterion("birthday_year is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearIsNotNull() {
            addCriterion("birthday_year is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearEqualTo(String value) {
            addCriterion("birthday_year =", value, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearNotEqualTo(String value) {
            addCriterion("birthday_year <>", value, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearGreaterThan(String value) {
            addCriterion("birthday_year >", value, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearGreaterThanOrEqualTo(String value) {
            addCriterion("birthday_year >=", value, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearLessThan(String value) {
            addCriterion("birthday_year <", value, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearLessThanOrEqualTo(String value) {
            addCriterion("birthday_year <=", value, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearLike(String value) {
            addCriterion("birthday_year like", value, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearNotLike(String value) {
            addCriterion("birthday_year not like", value, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearIn(List<String> values) {
            addCriterion("birthday_year in", values, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearNotIn(List<String> values) {
            addCriterion("birthday_year not in", values, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearBetween(String value1, String value2) {
            addCriterion("birthday_year between", value1, value2, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearNotBetween(String value1, String value2) {
            addCriterion("birthday_year not between", value1, value2, "birthdayYear");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraIsNull() {
            addCriterion("birthday_year_tra is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraIsNotNull() {
            addCriterion("birthday_year_tra is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraEqualTo(String value) {
            addCriterion("birthday_year_tra =", value, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraNotEqualTo(String value) {
            addCriterion("birthday_year_tra <>", value, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraGreaterThan(String value) {
            addCriterion("birthday_year_tra >", value, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraGreaterThanOrEqualTo(String value) {
            addCriterion("birthday_year_tra >=", value, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraLessThan(String value) {
            addCriterion("birthday_year_tra <", value, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraLessThanOrEqualTo(String value) {
            addCriterion("birthday_year_tra <=", value, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraLike(String value) {
            addCriterion("birthday_year_tra like", value, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraNotLike(String value) {
            addCriterion("birthday_year_tra not like", value, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraIn(List<String> values) {
            addCriterion("birthday_year_tra in", values, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraNotIn(List<String> values) {
            addCriterion("birthday_year_tra not in", values, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraBetween(String value1, String value2) {
            addCriterion("birthday_year_tra between", value1, value2, "birthdayYearTra");
            return (Criteria) this;
        }

        public Criteria andBirthdayYearTraNotBetween(String value1, String value2) {
            addCriterion("birthday_year_tra not between", value1, value2, "birthdayYearTra");
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

        public Criteria andLunarDeathdayTimeIsNull() {
            addCriterion("lunar_deathday_time is null");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeIsNotNull() {
            addCriterion("lunar_deathday_time is not null");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeEqualTo(String value) {
            addCriterion("lunar_deathday_time =", value, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeNotEqualTo(String value) {
            addCriterion("lunar_deathday_time <>", value, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeGreaterThan(String value) {
            addCriterion("lunar_deathday_time >", value, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("lunar_deathday_time >=", value, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeLessThan(String value) {
            addCriterion("lunar_deathday_time <", value, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeLessThanOrEqualTo(String value) {
            addCriterion("lunar_deathday_time <=", value, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeLike(String value) {
            addCriterion("lunar_deathday_time like", value, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeNotLike(String value) {
            addCriterion("lunar_deathday_time not like", value, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeIn(List<String> values) {
            addCriterion("lunar_deathday_time in", values, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeNotIn(List<String> values) {
            addCriterion("lunar_deathday_time not in", values, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeBetween(String value1, String value2) {
            addCriterion("lunar_deathday_time between", value1, value2, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andLunarDeathdayTimeNotBetween(String value1, String value2) {
            addCriterion("lunar_deathday_time not between", value1, value2, "lunarDeathdayTime");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraIsNull() {
            addCriterion("deathday_time_tra is null");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraIsNotNull() {
            addCriterion("deathday_time_tra is not null");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraEqualTo(String value) {
            addCriterion("deathday_time_tra =", value, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraNotEqualTo(String value) {
            addCriterion("deathday_time_tra <>", value, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraGreaterThan(String value) {
            addCriterion("deathday_time_tra >", value, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraGreaterThanOrEqualTo(String value) {
            addCriterion("deathday_time_tra >=", value, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraLessThan(String value) {
            addCriterion("deathday_time_tra <", value, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraLessThanOrEqualTo(String value) {
            addCriterion("deathday_time_tra <=", value, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraLike(String value) {
            addCriterion("deathday_time_tra like", value, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraNotLike(String value) {
            addCriterion("deathday_time_tra not like", value, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraIn(List<String> values) {
            addCriterion("deathday_time_tra in", values, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraNotIn(List<String> values) {
            addCriterion("deathday_time_tra not in", values, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraBetween(String value1, String value2) {
            addCriterion("deathday_time_tra between", value1, value2, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayTimeTraNotBetween(String value1, String value2) {
            addCriterion("deathday_time_tra not between", value1, value2, "deathdayTimeTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearIsNull() {
            addCriterion("deathday_year is null");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearIsNotNull() {
            addCriterion("deathday_year is not null");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearEqualTo(String value) {
            addCriterion("deathday_year =", value, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearNotEqualTo(String value) {
            addCriterion("deathday_year <>", value, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearGreaterThan(String value) {
            addCriterion("deathday_year >", value, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearGreaterThanOrEqualTo(String value) {
            addCriterion("deathday_year >=", value, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearLessThan(String value) {
            addCriterion("deathday_year <", value, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearLessThanOrEqualTo(String value) {
            addCriterion("deathday_year <=", value, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearLike(String value) {
            addCriterion("deathday_year like", value, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearNotLike(String value) {
            addCriterion("deathday_year not like", value, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearIn(List<String> values) {
            addCriterion("deathday_year in", values, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearNotIn(List<String> values) {
            addCriterion("deathday_year not in", values, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearBetween(String value1, String value2) {
            addCriterion("deathday_year between", value1, value2, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearNotBetween(String value1, String value2) {
            addCriterion("deathday_year not between", value1, value2, "deathdayYear");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraIsNull() {
            addCriterion("deathday_year_tra is null");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraIsNotNull() {
            addCriterion("deathday_year_tra is not null");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraEqualTo(String value) {
            addCriterion("deathday_year_tra =", value, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraNotEqualTo(String value) {
            addCriterion("deathday_year_tra <>", value, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraGreaterThan(String value) {
            addCriterion("deathday_year_tra >", value, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraGreaterThanOrEqualTo(String value) {
            addCriterion("deathday_year_tra >=", value, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraLessThan(String value) {
            addCriterion("deathday_year_tra <", value, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraLessThanOrEqualTo(String value) {
            addCriterion("deathday_year_tra <=", value, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraLike(String value) {
            addCriterion("deathday_year_tra like", value, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraNotLike(String value) {
            addCriterion("deathday_year_tra not like", value, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraIn(List<String> values) {
            addCriterion("deathday_year_tra in", values, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraNotIn(List<String> values) {
            addCriterion("deathday_year_tra not in", values, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraBetween(String value1, String value2) {
            addCriterion("deathday_year_tra between", value1, value2, "deathdayYearTra");
            return (Criteria) this;
        }

        public Criteria andDeathdayYearTraNotBetween(String value1, String value2) {
            addCriterion("deathday_year_tra not between", value1, value2, "deathdayYearTra");
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

        public Criteria andBirthdateMonthtypeIsNull() {
            addCriterion("birthdate_monthtype is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeIsNotNull() {
            addCriterion("birthdate_monthtype is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeEqualTo(Integer value) {
            addCriterion("birthdate_monthtype =", value, "birthdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeNotEqualTo(Integer value) {
            addCriterion("birthdate_monthtype <>", value, "birthdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeGreaterThan(Integer value) {
            addCriterion("birthdate_monthtype >", value, "birthdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("birthdate_monthtype >=", value, "birthdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeLessThan(Integer value) {
            addCriterion("birthdate_monthtype <", value, "birthdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeLessThanOrEqualTo(Integer value) {
            addCriterion("birthdate_monthtype <=", value, "birthdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeIn(List<Integer> values) {
            addCriterion("birthdate_monthtype in", values, "birthdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeNotIn(List<Integer> values) {
            addCriterion("birthdate_monthtype not in", values, "birthdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeBetween(Integer value1, Integer value2) {
            addCriterion("birthdate_monthtype between", value1, value2, "birthdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andBirthdateMonthtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("birthdate_monthtype not between", value1, value2, "birthdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeIsNull() {
            addCriterion("deathdate_monthtype is null");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeIsNotNull() {
            addCriterion("deathdate_monthtype is not null");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeEqualTo(Integer value) {
            addCriterion("deathdate_monthtype =", value, "deathdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeNotEqualTo(Integer value) {
            addCriterion("deathdate_monthtype <>", value, "deathdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeGreaterThan(Integer value) {
            addCriterion("deathdate_monthtype >", value, "deathdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deathdate_monthtype >=", value, "deathdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeLessThan(Integer value) {
            addCriterion("deathdate_monthtype <", value, "deathdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeLessThanOrEqualTo(Integer value) {
            addCriterion("deathdate_monthtype <=", value, "deathdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeIn(List<Integer> values) {
            addCriterion("deathdate_monthtype in", values, "deathdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeNotIn(List<Integer> values) {
            addCriterion("deathdate_monthtype not in", values, "deathdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeBetween(Integer value1, Integer value2) {
            addCriterion("deathdate_monthtype between", value1, value2, "deathdateMonthtype");
            return (Criteria) this;
        }

        public Criteria andDeathdateMonthtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("deathdate_monthtype not between", value1, value2, "deathdateMonthtype");
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

        public Criteria andAliveStatusIsNull() {
            addCriterion("alive_status is null");
            return (Criteria) this;
        }

        public Criteria andAliveStatusIsNotNull() {
            addCriterion("alive_status is not null");
            return (Criteria) this;
        }

        public Criteria andAliveStatusEqualTo(Integer value) {
            addCriterion("alive_status =", value, "aliveStatus");
            return (Criteria) this;
        }

        public Criteria andAliveStatusNotEqualTo(Integer value) {
            addCriterion("alive_status <>", value, "aliveStatus");
            return (Criteria) this;
        }

        public Criteria andAliveStatusGreaterThan(Integer value) {
            addCriterion("alive_status >", value, "aliveStatus");
            return (Criteria) this;
        }

        public Criteria andAliveStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("alive_status >=", value, "aliveStatus");
            return (Criteria) this;
        }

        public Criteria andAliveStatusLessThan(Integer value) {
            addCriterion("alive_status <", value, "aliveStatus");
            return (Criteria) this;
        }

        public Criteria andAliveStatusLessThanOrEqualTo(Integer value) {
            addCriterion("alive_status <=", value, "aliveStatus");
            return (Criteria) this;
        }

        public Criteria andAliveStatusIn(List<Integer> values) {
            addCriterion("alive_status in", values, "aliveStatus");
            return (Criteria) this;
        }

        public Criteria andAliveStatusNotIn(List<Integer> values) {
            addCriterion("alive_status not in", values, "aliveStatus");
            return (Criteria) this;
        }

        public Criteria andAliveStatusBetween(Integer value1, Integer value2) {
            addCriterion("alive_status between", value1, value2, "aliveStatus");
            return (Criteria) this;
        }

        public Criteria andAliveStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("alive_status not between", value1, value2, "aliveStatus");
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

        public Criteria andHouseholdMembercolIsNull() {
            addCriterion("household_membercol is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolIsNotNull() {
            addCriterion("household_membercol is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolEqualTo(String value) {
            addCriterion("household_membercol =", value, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolNotEqualTo(String value) {
            addCriterion("household_membercol <>", value, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolGreaterThan(String value) {
            addCriterion("household_membercol >", value, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolGreaterThanOrEqualTo(String value) {
            addCriterion("household_membercol >=", value, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolLessThan(String value) {
            addCriterion("household_membercol <", value, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolLessThanOrEqualTo(String value) {
            addCriterion("household_membercol <=", value, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolLike(String value) {
            addCriterion("household_membercol like", value, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolNotLike(String value) {
            addCriterion("household_membercol not like", value, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolIn(List<String> values) {
            addCriterion("household_membercol in", values, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolNotIn(List<String> values) {
            addCriterion("household_membercol not in", values, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolBetween(String value1, String value2) {
            addCriterion("household_membercol between", value1, value2, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andHouseholdMembercolNotBetween(String value1, String value2) {
            addCriterion("household_membercol not between", value1, value2, "householdMembercol");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameIsNull() {
            addCriterion("other_personal_name is null");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameIsNotNull() {
            addCriterion("other_personal_name is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameEqualTo(String value) {
            addCriterion("other_personal_name =", value, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameNotEqualTo(String value) {
            addCriterion("other_personal_name <>", value, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameGreaterThan(String value) {
            addCriterion("other_personal_name >", value, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameGreaterThanOrEqualTo(String value) {
            addCriterion("other_personal_name >=", value, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameLessThan(String value) {
            addCriterion("other_personal_name <", value, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameLessThanOrEqualTo(String value) {
            addCriterion("other_personal_name <=", value, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameLike(String value) {
            addCriterion("other_personal_name like", value, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameNotLike(String value) {
            addCriterion("other_personal_name not like", value, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameIn(List<String> values) {
            addCriterion("other_personal_name in", values, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameNotIn(List<String> values) {
            addCriterion("other_personal_name not in", values, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameBetween(String value1, String value2) {
            addCriterion("other_personal_name between", value1, value2, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andOtherPersonalNameNotBetween(String value1, String value2) {
            addCriterion("other_personal_name not between", value1, value2, "otherPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameIsNull() {
            addCriterion("nick_personal_name is null");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameIsNotNull() {
            addCriterion("nick_personal_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameEqualTo(String value) {
            addCriterion("nick_personal_name =", value, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameNotEqualTo(String value) {
            addCriterion("nick_personal_name <>", value, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameGreaterThan(String value) {
            addCriterion("nick_personal_name >", value, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_personal_name >=", value, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameLessThan(String value) {
            addCriterion("nick_personal_name <", value, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameLessThanOrEqualTo(String value) {
            addCriterion("nick_personal_name <=", value, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameLike(String value) {
            addCriterion("nick_personal_name like", value, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameNotLike(String value) {
            addCriterion("nick_personal_name not like", value, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameIn(List<String> values) {
            addCriterion("nick_personal_name in", values, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameNotIn(List<String> values) {
            addCriterion("nick_personal_name not in", values, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameBetween(String value1, String value2) {
            addCriterion("nick_personal_name between", value1, value2, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickPersonalNameNotBetween(String value1, String value2) {
            addCriterion("nick_personal_name not between", value1, value2, "nickPersonalName");
            return (Criteria) this;
        }

        public Criteria andNickMarkIsNull() {
            addCriterion("nick_mark is null");
            return (Criteria) this;
        }

        public Criteria andNickMarkIsNotNull() {
            addCriterion("nick_mark is not null");
            return (Criteria) this;
        }

        public Criteria andNickMarkEqualTo(String value) {
            addCriterion("nick_mark =", value, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkNotEqualTo(String value) {
            addCriterion("nick_mark <>", value, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkGreaterThan(String value) {
            addCriterion("nick_mark >", value, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkGreaterThanOrEqualTo(String value) {
            addCriterion("nick_mark >=", value, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkLessThan(String value) {
            addCriterion("nick_mark <", value, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkLessThanOrEqualTo(String value) {
            addCriterion("nick_mark <=", value, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkLike(String value) {
            addCriterion("nick_mark like", value, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkNotLike(String value) {
            addCriterion("nick_mark not like", value, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkIn(List<String> values) {
            addCriterion("nick_mark in", values, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkNotIn(List<String> values) {
            addCriterion("nick_mark not in", values, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkBetween(String value1, String value2) {
            addCriterion("nick_mark between", value1, value2, "nickMark");
            return (Criteria) this;
        }

        public Criteria andNickMarkNotBetween(String value1, String value2) {
            addCriterion("nick_mark not between", value1, value2, "nickMark");
            return (Criteria) this;
        }

        public Criteria andLivePlaceIsNull() {
            addCriterion("live_place is null");
            return (Criteria) this;
        }

        public Criteria andLivePlaceIsNotNull() {
            addCriterion("live_place is not null");
            return (Criteria) this;
        }

        public Criteria andLivePlaceEqualTo(String value) {
            addCriterion("live_place =", value, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceNotEqualTo(String value) {
            addCriterion("live_place <>", value, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceGreaterThan(String value) {
            addCriterion("live_place >", value, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("live_place >=", value, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceLessThan(String value) {
            addCriterion("live_place <", value, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceLessThanOrEqualTo(String value) {
            addCriterion("live_place <=", value, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceLike(String value) {
            addCriterion("live_place like", value, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceNotLike(String value) {
            addCriterion("live_place not like", value, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceIn(List<String> values) {
            addCriterion("live_place in", values, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceNotIn(List<String> values) {
            addCriterion("live_place not in", values, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceBetween(String value1, String value2) {
            addCriterion("live_place between", value1, value2, "livePlace");
            return (Criteria) this;
        }

        public Criteria andLivePlaceNotBetween(String value1, String value2) {
            addCriterion("live_place not between", value1, value2, "livePlace");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailIsNull() {
            addCriterion("spouse_detail is null");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailIsNotNull() {
            addCriterion("spouse_detail is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailEqualTo(String value) {
            addCriterion("spouse_detail =", value, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailNotEqualTo(String value) {
            addCriterion("spouse_detail <>", value, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailGreaterThan(String value) {
            addCriterion("spouse_detail >", value, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_detail >=", value, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailLessThan(String value) {
            addCriterion("spouse_detail <", value, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailLessThanOrEqualTo(String value) {
            addCriterion("spouse_detail <=", value, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailLike(String value) {
            addCriterion("spouse_detail like", value, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailNotLike(String value) {
            addCriterion("spouse_detail not like", value, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailIn(List<String> values) {
            addCriterion("spouse_detail in", values, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailNotIn(List<String> values) {
            addCriterion("spouse_detail not in", values, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailBetween(String value1, String value2) {
            addCriterion("spouse_detail between", value1, value2, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andSpouseDetailNotBetween(String value1, String value2) {
            addCriterion("spouse_detail not between", value1, value2, "spouseDetail");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdIsNull() {
            addCriterion("center_member_id is null");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdIsNotNull() {
            addCriterion("center_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdEqualTo(Integer value) {
            addCriterion("center_member_id =", value, "centerMemberId");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdNotEqualTo(Integer value) {
            addCriterion("center_member_id <>", value, "centerMemberId");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdGreaterThan(Integer value) {
            addCriterion("center_member_id >", value, "centerMemberId");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("center_member_id >=", value, "centerMemberId");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdLessThan(Integer value) {
            addCriterion("center_member_id <", value, "centerMemberId");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("center_member_id <=", value, "centerMemberId");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdIn(List<Integer> values) {
            addCriterion("center_member_id in", values, "centerMemberId");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdNotIn(List<Integer> values) {
            addCriterion("center_member_id not in", values, "centerMemberId");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("center_member_id between", value1, value2, "centerMemberId");
            return (Criteria) this;
        }

        public Criteria andCenterMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("center_member_id not between", value1, value2, "centerMemberId");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeIsNull() {
            addCriterion("center_relation_code is null");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeIsNotNull() {
            addCriterion("center_relation_code is not null");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeEqualTo(String value) {
            addCriterion("center_relation_code =", value, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeNotEqualTo(String value) {
            addCriterion("center_relation_code <>", value, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeGreaterThan(String value) {
            addCriterion("center_relation_code >", value, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("center_relation_code >=", value, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeLessThan(String value) {
            addCriterion("center_relation_code <", value, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeLessThanOrEqualTo(String value) {
            addCriterion("center_relation_code <=", value, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeLike(String value) {
            addCriterion("center_relation_code like", value, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeNotLike(String value) {
            addCriterion("center_relation_code not like", value, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeIn(List<String> values) {
            addCriterion("center_relation_code in", values, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeNotIn(List<String> values) {
            addCriterion("center_relation_code not in", values, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeBetween(String value1, String value2) {
            addCriterion("center_relation_code between", value1, value2, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andCenterRelationCodeNotBetween(String value1, String value2) {
            addCriterion("center_relation_code not between", value1, value2, "centerRelationCode");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagIsNull() {
            addCriterion("woman_sec_marry_flag is null");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagIsNotNull() {
            addCriterion("woman_sec_marry_flag is not null");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagEqualTo(Integer value) {
            addCriterion("woman_sec_marry_flag =", value, "womanSecMarryFlag");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagNotEqualTo(Integer value) {
            addCriterion("woman_sec_marry_flag <>", value, "womanSecMarryFlag");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagGreaterThan(Integer value) {
            addCriterion("woman_sec_marry_flag >", value, "womanSecMarryFlag");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("woman_sec_marry_flag >=", value, "womanSecMarryFlag");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagLessThan(Integer value) {
            addCriterion("woman_sec_marry_flag <", value, "womanSecMarryFlag");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagLessThanOrEqualTo(Integer value) {
            addCriterion("woman_sec_marry_flag <=", value, "womanSecMarryFlag");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagIn(List<Integer> values) {
            addCriterion("woman_sec_marry_flag in", values, "womanSecMarryFlag");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagNotIn(List<Integer> values) {
            addCriterion("woman_sec_marry_flag not in", values, "womanSecMarryFlag");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagBetween(Integer value1, Integer value2) {
            addCriterion("woman_sec_marry_flag between", value1, value2, "womanSecMarryFlag");
            return (Criteria) this;
        }

        public Criteria andWomanSecMarryFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("woman_sec_marry_flag not between", value1, value2, "womanSecMarryFlag");
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