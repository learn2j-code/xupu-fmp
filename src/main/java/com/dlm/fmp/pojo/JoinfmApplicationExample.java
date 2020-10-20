package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JoinfmApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JoinfmApplicationExample() {
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

        public Criteria andApplicationTypeIsNull() {
            addCriterion("application_type is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeIsNotNull() {
            addCriterion("application_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeEqualTo(Integer value) {
            addCriterion("application_type =", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeNotEqualTo(Integer value) {
            addCriterion("application_type <>", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeGreaterThan(Integer value) {
            addCriterion("application_type >", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("application_type >=", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeLessThan(Integer value) {
            addCriterion("application_type <", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("application_type <=", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeIn(List<Integer> values) {
            addCriterion("application_type in", values, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeNotIn(List<Integer> values) {
            addCriterion("application_type not in", values, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeBetween(Integer value1, Integer value2) {
            addCriterion("application_type between", value1, value2, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("application_type not between", value1, value2, "applicationType");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdIsNull() {
            addCriterion("clan_member__id is null");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdIsNotNull() {
            addCriterion("clan_member__id is not null");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdEqualTo(Integer value) {
            addCriterion("clan_member__id =", value, "clanMemberId");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdNotEqualTo(Integer value) {
            addCriterion("clan_member__id <>", value, "clanMemberId");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdGreaterThan(Integer value) {
            addCriterion("clan_member__id >", value, "clanMemberId");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clan_member__id >=", value, "clanMemberId");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdLessThan(Integer value) {
            addCriterion("clan_member__id <", value, "clanMemberId");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("clan_member__id <=", value, "clanMemberId");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdIn(List<Integer> values) {
            addCriterion("clan_member__id in", values, "clanMemberId");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdNotIn(List<Integer> values) {
            addCriterion("clan_member__id not in", values, "clanMemberId");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("clan_member__id between", value1, value2, "clanMemberId");
            return (Criteria) this;
        }

        public Criteria andClanMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clan_member__id not between", value1, value2, "clanMemberId");
            return (Criteria) this;
        }

        public Criteria andHmIdListIsNull() {
            addCriterion("hm_id_list is null");
            return (Criteria) this;
        }

        public Criteria andHmIdListIsNotNull() {
            addCriterion("hm_id_list is not null");
            return (Criteria) this;
        }

        public Criteria andHmIdListEqualTo(String value) {
            addCriterion("hm_id_list =", value, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListNotEqualTo(String value) {
            addCriterion("hm_id_list <>", value, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListGreaterThan(String value) {
            addCriterion("hm_id_list >", value, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListGreaterThanOrEqualTo(String value) {
            addCriterion("hm_id_list >=", value, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListLessThan(String value) {
            addCriterion("hm_id_list <", value, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListLessThanOrEqualTo(String value) {
            addCriterion("hm_id_list <=", value, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListLike(String value) {
            addCriterion("hm_id_list like", value, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListNotLike(String value) {
            addCriterion("hm_id_list not like", value, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListIn(List<String> values) {
            addCriterion("hm_id_list in", values, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListNotIn(List<String> values) {
            addCriterion("hm_id_list not in", values, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListBetween(String value1, String value2) {
            addCriterion("hm_id_list between", value1, value2, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andHmIdListNotBetween(String value1, String value2) {
            addCriterion("hm_id_list not between", value1, value2, "hmIdList");
            return (Criteria) this;
        }

        public Criteria andSurnameIdIsNull() {
            addCriterion("surname_id is null");
            return (Criteria) this;
        }

        public Criteria andSurnameIdIsNotNull() {
            addCriterion("surname_id is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameIdEqualTo(Integer value) {
            addCriterion("surname_id =", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdNotEqualTo(Integer value) {
            addCriterion("surname_id <>", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdGreaterThan(Integer value) {
            addCriterion("surname_id >", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("surname_id >=", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdLessThan(Integer value) {
            addCriterion("surname_id <", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdLessThanOrEqualTo(Integer value) {
            addCriterion("surname_id <=", value, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdIn(List<Integer> values) {
            addCriterion("surname_id in", values, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdNotIn(List<Integer> values) {
            addCriterion("surname_id not in", values, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdBetween(Integer value1, Integer value2) {
            addCriterion("surname_id between", value1, value2, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("surname_id not between", value1, value2, "surnameId");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNull() {
            addCriterion("surname is null");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNotNull() {
            addCriterion("surname is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameEqualTo(String value) {
            addCriterion("surname =", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotEqualTo(String value) {
            addCriterion("surname <>", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThan(String value) {
            addCriterion("surname >", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThanOrEqualTo(String value) {
            addCriterion("surname >=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThan(String value) {
            addCriterion("surname <", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThanOrEqualTo(String value) {
            addCriterion("surname <=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLike(String value) {
            addCriterion("surname like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotLike(String value) {
            addCriterion("surname not like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameIn(List<String> values) {
            addCriterion("surname in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotIn(List<String> values) {
            addCriterion("surname not in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameBetween(String value1, String value2) {
            addCriterion("surname between", value1, value2, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotBetween(String value1, String value2) {
            addCriterion("surname not between", value1, value2, "surname");
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

        public Criteria andHmIdIsNull() {
            addCriterion("hm_id is null");
            return (Criteria) this;
        }

        public Criteria andHmIdIsNotNull() {
            addCriterion("hm_id is not null");
            return (Criteria) this;
        }

        public Criteria andHmIdEqualTo(Integer value) {
            addCriterion("hm_id =", value, "hmId");
            return (Criteria) this;
        }

        public Criteria andHmIdNotEqualTo(Integer value) {
            addCriterion("hm_id <>", value, "hmId");
            return (Criteria) this;
        }

        public Criteria andHmIdGreaterThan(Integer value) {
            addCriterion("hm_id >", value, "hmId");
            return (Criteria) this;
        }

        public Criteria andHmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hm_id >=", value, "hmId");
            return (Criteria) this;
        }

        public Criteria andHmIdLessThan(Integer value) {
            addCriterion("hm_id <", value, "hmId");
            return (Criteria) this;
        }

        public Criteria andHmIdLessThanOrEqualTo(Integer value) {
            addCriterion("hm_id <=", value, "hmId");
            return (Criteria) this;
        }

        public Criteria andHmIdIn(List<Integer> values) {
            addCriterion("hm_id in", values, "hmId");
            return (Criteria) this;
        }

        public Criteria andHmIdNotIn(List<Integer> values) {
            addCriterion("hm_id not in", values, "hmId");
            return (Criteria) this;
        }

        public Criteria andHmIdBetween(Integer value1, Integer value2) {
            addCriterion("hm_id between", value1, value2, "hmId");
            return (Criteria) this;
        }

        public Criteria andHmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hm_id not between", value1, value2, "hmId");
            return (Criteria) this;
        }

        public Criteria andHmNameIsNull() {
            addCriterion("hm_name is null");
            return (Criteria) this;
        }

        public Criteria andHmNameIsNotNull() {
            addCriterion("hm_name is not null");
            return (Criteria) this;
        }

        public Criteria andHmNameEqualTo(String value) {
            addCriterion("hm_name =", value, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameNotEqualTo(String value) {
            addCriterion("hm_name <>", value, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameGreaterThan(String value) {
            addCriterion("hm_name >", value, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameGreaterThanOrEqualTo(String value) {
            addCriterion("hm_name >=", value, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameLessThan(String value) {
            addCriterion("hm_name <", value, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameLessThanOrEqualTo(String value) {
            addCriterion("hm_name <=", value, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameLike(String value) {
            addCriterion("hm_name like", value, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameNotLike(String value) {
            addCriterion("hm_name not like", value, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameIn(List<String> values) {
            addCriterion("hm_name in", values, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameNotIn(List<String> values) {
            addCriterion("hm_name not in", values, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameBetween(String value1, String value2) {
            addCriterion("hm_name between", value1, value2, "hmName");
            return (Criteria) this;
        }

        public Criteria andHmNameNotBetween(String value1, String value2) {
            addCriterion("hm_name not between", value1, value2, "hmName");
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

        public Criteria andPaidFlagIsNull() {
            addCriterion("paid_flag is null");
            return (Criteria) this;
        }

        public Criteria andPaidFlagIsNotNull() {
            addCriterion("paid_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPaidFlagEqualTo(Integer value) {
            addCriterion("paid_flag =", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagNotEqualTo(Integer value) {
            addCriterion("paid_flag <>", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagGreaterThan(Integer value) {
            addCriterion("paid_flag >", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("paid_flag >=", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagLessThan(Integer value) {
            addCriterion("paid_flag <", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagLessThanOrEqualTo(Integer value) {
            addCriterion("paid_flag <=", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagIn(List<Integer> values) {
            addCriterion("paid_flag in", values, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagNotIn(List<Integer> values) {
            addCriterion("paid_flag not in", values, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagBetween(Integer value1, Integer value2) {
            addCriterion("paid_flag between", value1, value2, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("paid_flag not between", value1, value2, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNull() {
            addCriterion("audit_result is null");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNotNull() {
            addCriterion("audit_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuditResultEqualTo(Integer value) {
            addCriterion("audit_result =", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotEqualTo(Integer value) {
            addCriterion("audit_result <>", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThan(Integer value) {
            addCriterion("audit_result >", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_result >=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThan(Integer value) {
            addCriterion("audit_result <", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThanOrEqualTo(Integer value) {
            addCriterion("audit_result <=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultIn(List<Integer> values) {
            addCriterion("audit_result in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotIn(List<Integer> values) {
            addCriterion("audit_result not in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultBetween(Integer value1, Integer value2) {
            addCriterion("audit_result between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_result not between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
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