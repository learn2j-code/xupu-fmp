package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseholdInAuditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseholdInAuditionExample() {
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

        public Criteria andSubFamilyNameIsNull() {
            addCriterion("sub_family_name is null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameIsNotNull() {
            addCriterion("sub_family_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameEqualTo(String value) {
            addCriterion("sub_family_name =", value, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameNotEqualTo(String value) {
            addCriterion("sub_family_name <>", value, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameGreaterThan(String value) {
            addCriterion("sub_family_name >", value, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_family_name >=", value, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameLessThan(String value) {
            addCriterion("sub_family_name <", value, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("sub_family_name <=", value, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameLike(String value) {
            addCriterion("sub_family_name like", value, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameNotLike(String value) {
            addCriterion("sub_family_name not like", value, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameIn(List<String> values) {
            addCriterion("sub_family_name in", values, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameNotIn(List<String> values) {
            addCriterion("sub_family_name not in", values, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameBetween(String value1, String value2) {
            addCriterion("sub_family_name between", value1, value2, "subFamilyName");
            return (Criteria) this;
        }

        public Criteria andSubFamilyNameNotBetween(String value1, String value2) {
            addCriterion("sub_family_name not between", value1, value2, "subFamilyName");
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

        public Criteria andFamilyMemberIdIsNull() {
            addCriterion("family_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdIsNotNull() {
            addCriterion("family_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdEqualTo(Integer value) {
            addCriterion("family_member_id =", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdNotEqualTo(Integer value) {
            addCriterion("family_member_id <>", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdGreaterThan(Integer value) {
            addCriterion("family_member_id >", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_member_id >=", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdLessThan(Integer value) {
            addCriterion("family_member_id <", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("family_member_id <=", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdIn(List<Integer> values) {
            addCriterion("family_member_id in", values, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdNotIn(List<Integer> values) {
            addCriterion("family_member_id not in", values, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("family_member_id between", value1, value2, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("family_member_id not between", value1, value2, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameIsNull() {
            addCriterion("family_member_name is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameIsNotNull() {
            addCriterion("family_member_name is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameEqualTo(String value) {
            addCriterion("family_member_name =", value, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameNotEqualTo(String value) {
            addCriterion("family_member_name <>", value, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameGreaterThan(String value) {
            addCriterion("family_member_name >", value, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("family_member_name >=", value, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameLessThan(String value) {
            addCriterion("family_member_name <", value, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameLessThanOrEqualTo(String value) {
            addCriterion("family_member_name <=", value, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameLike(String value) {
            addCriterion("family_member_name like", value, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameNotLike(String value) {
            addCriterion("family_member_name not like", value, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameIn(List<String> values) {
            addCriterion("family_member_name in", values, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameNotIn(List<String> values) {
            addCriterion("family_member_name not in", values, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameBetween(String value1, String value2) {
            addCriterion("family_member_name between", value1, value2, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNameNotBetween(String value1, String value2) {
            addCriterion("family_member_name not between", value1, value2, "familyMemberName");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmIsNull() {
            addCriterion("family_member_gm is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmIsNotNull() {
            addCriterion("family_member_gm is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmEqualTo(Integer value) {
            addCriterion("family_member_gm =", value, "familyMemberGm");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmNotEqualTo(Integer value) {
            addCriterion("family_member_gm <>", value, "familyMemberGm");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmGreaterThan(Integer value) {
            addCriterion("family_member_gm >", value, "familyMemberGm");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_member_gm >=", value, "familyMemberGm");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmLessThan(Integer value) {
            addCriterion("family_member_gm <", value, "familyMemberGm");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmLessThanOrEqualTo(Integer value) {
            addCriterion("family_member_gm <=", value, "familyMemberGm");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmIn(List<Integer> values) {
            addCriterion("family_member_gm in", values, "familyMemberGm");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmNotIn(List<Integer> values) {
            addCriterion("family_member_gm not in", values, "familyMemberGm");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmBetween(Integer value1, Integer value2) {
            addCriterion("family_member_gm between", value1, value2, "familyMemberGm");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGmNotBetween(Integer value1, Integer value2) {
            addCriterion("family_member_gm not between", value1, value2, "familyMemberGm");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNull() {
            addCriterion("family_name is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("family_name is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("family_name =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("family_name <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("family_name >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("family_name >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("family_name <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("family_name <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("family_name like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("family_name not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("family_name in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("family_name not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("family_name between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("family_name not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andTotemAddressIsNull() {
            addCriterion("totem_address is null");
            return (Criteria) this;
        }

        public Criteria andTotemAddressIsNotNull() {
            addCriterion("totem_address is not null");
            return (Criteria) this;
        }

        public Criteria andTotemAddressEqualTo(String value) {
            addCriterion("totem_address =", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressNotEqualTo(String value) {
            addCriterion("totem_address <>", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressGreaterThan(String value) {
            addCriterion("totem_address >", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressGreaterThanOrEqualTo(String value) {
            addCriterion("totem_address >=", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressLessThan(String value) {
            addCriterion("totem_address <", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressLessThanOrEqualTo(String value) {
            addCriterion("totem_address <=", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressLike(String value) {
            addCriterion("totem_address like", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressNotLike(String value) {
            addCriterion("totem_address not like", value, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressIn(List<String> values) {
            addCriterion("totem_address in", values, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressNotIn(List<String> values) {
            addCriterion("totem_address not in", values, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressBetween(String value1, String value2) {
            addCriterion("totem_address between", value1, value2, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andTotemAddressNotBetween(String value1, String value2) {
            addCriterion("totem_address not between", value1, value2, "totemAddress");
            return (Criteria) this;
        }

        public Criteria andProposerIsNull() {
            addCriterion("proposer is null");
            return (Criteria) this;
        }

        public Criteria andProposerIsNotNull() {
            addCriterion("proposer is not null");
            return (Criteria) this;
        }

        public Criteria andProposerEqualTo(String value) {
            addCriterion("proposer =", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotEqualTo(String value) {
            addCriterion("proposer <>", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThan(String value) {
            addCriterion("proposer >", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThanOrEqualTo(String value) {
            addCriterion("proposer >=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThan(String value) {
            addCriterion("proposer <", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThanOrEqualTo(String value) {
            addCriterion("proposer <=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLike(String value) {
            addCriterion("proposer like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotLike(String value) {
            addCriterion("proposer not like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerIn(List<String> values) {
            addCriterion("proposer in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotIn(List<String> values) {
            addCriterion("proposer not in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerBetween(String value1, String value2) {
            addCriterion("proposer between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotBetween(String value1, String value2) {
            addCriterion("proposer not between", value1, value2, "proposer");
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

        public Criteria andConformFlagIsNull() {
            addCriterion("conform_flag is null");
            return (Criteria) this;
        }

        public Criteria andConformFlagIsNotNull() {
            addCriterion("conform_flag is not null");
            return (Criteria) this;
        }

        public Criteria andConformFlagEqualTo(Integer value) {
            addCriterion("conform_flag =", value, "conformFlag");
            return (Criteria) this;
        }

        public Criteria andConformFlagNotEqualTo(Integer value) {
            addCriterion("conform_flag <>", value, "conformFlag");
            return (Criteria) this;
        }

        public Criteria andConformFlagGreaterThan(Integer value) {
            addCriterion("conform_flag >", value, "conformFlag");
            return (Criteria) this;
        }

        public Criteria andConformFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("conform_flag >=", value, "conformFlag");
            return (Criteria) this;
        }

        public Criteria andConformFlagLessThan(Integer value) {
            addCriterion("conform_flag <", value, "conformFlag");
            return (Criteria) this;
        }

        public Criteria andConformFlagLessThanOrEqualTo(Integer value) {
            addCriterion("conform_flag <=", value, "conformFlag");
            return (Criteria) this;
        }

        public Criteria andConformFlagIn(List<Integer> values) {
            addCriterion("conform_flag in", values, "conformFlag");
            return (Criteria) this;
        }

        public Criteria andConformFlagNotIn(List<Integer> values) {
            addCriterion("conform_flag not in", values, "conformFlag");
            return (Criteria) this;
        }

        public Criteria andConformFlagBetween(Integer value1, Integer value2) {
            addCriterion("conform_flag between", value1, value2, "conformFlag");
            return (Criteria) this;
        }

        public Criteria andConformFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("conform_flag not between", value1, value2, "conformFlag");
            return (Criteria) this;
        }

        public Criteria andFailReasonIsNull() {
            addCriterion("fail_reason is null");
            return (Criteria) this;
        }

        public Criteria andFailReasonIsNotNull() {
            addCriterion("fail_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFailReasonEqualTo(String value) {
            addCriterion("fail_reason =", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotEqualTo(String value) {
            addCriterion("fail_reason <>", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonGreaterThan(String value) {
            addCriterion("fail_reason >", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("fail_reason >=", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLessThan(String value) {
            addCriterion("fail_reason <", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLessThanOrEqualTo(String value) {
            addCriterion("fail_reason <=", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLike(String value) {
            addCriterion("fail_reason like", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotLike(String value) {
            addCriterion("fail_reason not like", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonIn(List<String> values) {
            addCriterion("fail_reason in", values, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotIn(List<String> values) {
            addCriterion("fail_reason not in", values, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonBetween(String value1, String value2) {
            addCriterion("fail_reason between", value1, value2, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotBetween(String value1, String value2) {
            addCriterion("fail_reason not between", value1, value2, "failReason");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(String value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(String value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(String value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(String value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(String value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLike(String value) {
            addCriterion("total_money like", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotLike(String value) {
            addCriterion("total_money not like", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<String> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<String> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(String value1, String value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(String value1, String value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
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

        public Criteria andReceiveMoneyIsNull() {
            addCriterion("receive_money is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyIsNotNull() {
            addCriterion("receive_money is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyEqualTo(String value) {
            addCriterion("receive_money =", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyNotEqualTo(String value) {
            addCriterion("receive_money <>", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyGreaterThan(String value) {
            addCriterion("receive_money >", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("receive_money >=", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyLessThan(String value) {
            addCriterion("receive_money <", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyLessThanOrEqualTo(String value) {
            addCriterion("receive_money <=", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyLike(String value) {
            addCriterion("receive_money like", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyNotLike(String value) {
            addCriterion("receive_money not like", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyIn(List<String> values) {
            addCriterion("receive_money in", values, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyNotIn(List<String> values) {
            addCriterion("receive_money not in", values, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyBetween(String value1, String value2) {
            addCriterion("receive_money between", value1, value2, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyNotBetween(String value1, String value2) {
            addCriterion("receive_money not between", value1, value2, "receiveMoney");
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