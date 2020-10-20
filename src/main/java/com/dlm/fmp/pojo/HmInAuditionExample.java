package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HmInAuditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HmInAuditionExample() {
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

        public Criteria andHouseholdMemberIdIsNull() {
            addCriterion("household_member_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdIsNotNull() {
            addCriterion("household_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdEqualTo(Integer value) {
            addCriterion("household_member_id =", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdNotEqualTo(Integer value) {
            addCriterion("household_member_id <>", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdGreaterThan(Integer value) {
            addCriterion("household_member_id >", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("household_member_id >=", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdLessThan(Integer value) {
            addCriterion("household_member_id <", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("household_member_id <=", value, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdIn(List<Integer> values) {
            addCriterion("household_member_id in", values, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdNotIn(List<Integer> values) {
            addCriterion("household_member_id not in", values, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("household_member_id between", value1, value2, "householdMemberId");
            return (Criteria) this;
        }

        public Criteria andHouseholdMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("household_member_id not between", value1, value2, "householdMemberId");
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

        public Criteria andMainFlagIsNull() {
            addCriterion("main_flag is null");
            return (Criteria) this;
        }

        public Criteria andMainFlagIsNotNull() {
            addCriterion("main_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMainFlagEqualTo(Integer value) {
            addCriterion("main_flag =", value, "mainFlag");
            return (Criteria) this;
        }

        public Criteria andMainFlagNotEqualTo(Integer value) {
            addCriterion("main_flag <>", value, "mainFlag");
            return (Criteria) this;
        }

        public Criteria andMainFlagGreaterThan(Integer value) {
            addCriterion("main_flag >", value, "mainFlag");
            return (Criteria) this;
        }

        public Criteria andMainFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_flag >=", value, "mainFlag");
            return (Criteria) this;
        }

        public Criteria andMainFlagLessThan(Integer value) {
            addCriterion("main_flag <", value, "mainFlag");
            return (Criteria) this;
        }

        public Criteria andMainFlagLessThanOrEqualTo(Integer value) {
            addCriterion("main_flag <=", value, "mainFlag");
            return (Criteria) this;
        }

        public Criteria andMainFlagIn(List<Integer> values) {
            addCriterion("main_flag in", values, "mainFlag");
            return (Criteria) this;
        }

        public Criteria andMainFlagNotIn(List<Integer> values) {
            addCriterion("main_flag not in", values, "mainFlag");
            return (Criteria) this;
        }

        public Criteria andMainFlagBetween(Integer value1, Integer value2) {
            addCriterion("main_flag between", value1, value2, "mainFlag");
            return (Criteria) this;
        }

        public Criteria andMainFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("main_flag not between", value1, value2, "mainFlag");
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

        public Criteria andInMoneyIsNull() {
            addCriterion("in_money is null");
            return (Criteria) this;
        }

        public Criteria andInMoneyIsNotNull() {
            addCriterion("in_money is not null");
            return (Criteria) this;
        }

        public Criteria andInMoneyEqualTo(String value) {
            addCriterion("in_money =", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotEqualTo(String value) {
            addCriterion("in_money <>", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyGreaterThan(String value) {
            addCriterion("in_money >", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("in_money >=", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyLessThan(String value) {
            addCriterion("in_money <", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyLessThanOrEqualTo(String value) {
            addCriterion("in_money <=", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyLike(String value) {
            addCriterion("in_money like", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotLike(String value) {
            addCriterion("in_money not like", value, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyIn(List<String> values) {
            addCriterion("in_money in", values, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotIn(List<String> values) {
            addCriterion("in_money not in", values, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyBetween(String value1, String value2) {
            addCriterion("in_money between", value1, value2, "inMoney");
            return (Criteria) this;
        }

        public Criteria andInMoneyNotBetween(String value1, String value2) {
            addCriterion("in_money not between", value1, value2, "inMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountsIsNull() {
            addCriterion("discounts is null");
            return (Criteria) this;
        }

        public Criteria andDiscountsIsNotNull() {
            addCriterion("discounts is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountsEqualTo(String value) {
            addCriterion("discounts =", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotEqualTo(String value) {
            addCriterion("discounts <>", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsGreaterThan(String value) {
            addCriterion("discounts >", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsGreaterThanOrEqualTo(String value) {
            addCriterion("discounts >=", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsLessThan(String value) {
            addCriterion("discounts <", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsLessThanOrEqualTo(String value) {
            addCriterion("discounts <=", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsLike(String value) {
            addCriterion("discounts like", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotLike(String value) {
            addCriterion("discounts not like", value, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsIn(List<String> values) {
            addCriterion("discounts in", values, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotIn(List<String> values) {
            addCriterion("discounts not in", values, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsBetween(String value1, String value2) {
            addCriterion("discounts between", value1, value2, "discounts");
            return (Criteria) this;
        }

        public Criteria andDiscountsNotBetween(String value1, String value2) {
            addCriterion("discounts not between", value1, value2, "discounts");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyIsNull() {
            addCriterion("story_money is null");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyIsNotNull() {
            addCriterion("story_money is not null");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyEqualTo(String value) {
            addCriterion("story_money =", value, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyNotEqualTo(String value) {
            addCriterion("story_money <>", value, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyGreaterThan(String value) {
            addCriterion("story_money >", value, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("story_money >=", value, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyLessThan(String value) {
            addCriterion("story_money <", value, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyLessThanOrEqualTo(String value) {
            addCriterion("story_money <=", value, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyLike(String value) {
            addCriterion("story_money like", value, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyNotLike(String value) {
            addCriterion("story_money not like", value, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyIn(List<String> values) {
            addCriterion("story_money in", values, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyNotIn(List<String> values) {
            addCriterion("story_money not in", values, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyBetween(String value1, String value2) {
            addCriterion("story_money between", value1, value2, "storyMoney");
            return (Criteria) this;
        }

        public Criteria andStoryMoneyNotBetween(String value1, String value2) {
            addCriterion("story_money not between", value1, value2, "storyMoney");
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