package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmContentExample() {
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

        public Criteria andHusbandIsNull() {
            addCriterion("husband is null");
            return (Criteria) this;
        }

        public Criteria andHusbandIsNotNull() {
            addCriterion("husband is not null");
            return (Criteria) this;
        }

        public Criteria andHusbandEqualTo(String value) {
            addCriterion("husband =", value, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandNotEqualTo(String value) {
            addCriterion("husband <>", value, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandGreaterThan(String value) {
            addCriterion("husband >", value, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandGreaterThanOrEqualTo(String value) {
            addCriterion("husband >=", value, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandLessThan(String value) {
            addCriterion("husband <", value, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandLessThanOrEqualTo(String value) {
            addCriterion("husband <=", value, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandLike(String value) {
            addCriterion("husband like", value, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandNotLike(String value) {
            addCriterion("husband not like", value, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandIn(List<String> values) {
            addCriterion("husband in", values, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandNotIn(List<String> values) {
            addCriterion("husband not in", values, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandBetween(String value1, String value2) {
            addCriterion("husband between", value1, value2, "husband");
            return (Criteria) this;
        }

        public Criteria andHusbandNotBetween(String value1, String value2) {
            addCriterion("husband not between", value1, value2, "husband");
            return (Criteria) this;
        }

        public Criteria andMemberRelIsNull() {
            addCriterion("member_rel is null");
            return (Criteria) this;
        }

        public Criteria andMemberRelIsNotNull() {
            addCriterion("member_rel is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRelEqualTo(String value) {
            addCriterion("member_rel =", value, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelNotEqualTo(String value) {
            addCriterion("member_rel <>", value, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelGreaterThan(String value) {
            addCriterion("member_rel >", value, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelGreaterThanOrEqualTo(String value) {
            addCriterion("member_rel >=", value, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelLessThan(String value) {
            addCriterion("member_rel <", value, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelLessThanOrEqualTo(String value) {
            addCriterion("member_rel <=", value, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelLike(String value) {
            addCriterion("member_rel like", value, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelNotLike(String value) {
            addCriterion("member_rel not like", value, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelIn(List<String> values) {
            addCriterion("member_rel in", values, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelNotIn(List<String> values) {
            addCriterion("member_rel not in", values, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelBetween(String value1, String value2) {
            addCriterion("member_rel between", value1, value2, "memberRel");
            return (Criteria) this;
        }

        public Criteria andMemberRelNotBetween(String value1, String value2) {
            addCriterion("member_rel not between", value1, value2, "memberRel");
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

        public Criteria andCopyFlagIsNull() {
            addCriterion("copy_flag is null");
            return (Criteria) this;
        }

        public Criteria andCopyFlagIsNotNull() {
            addCriterion("copy_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCopyFlagEqualTo(Integer value) {
            addCriterion("copy_flag =", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagNotEqualTo(Integer value) {
            addCriterion("copy_flag <>", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagGreaterThan(Integer value) {
            addCriterion("copy_flag >", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("copy_flag >=", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagLessThan(Integer value) {
            addCriterion("copy_flag <", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagLessThanOrEqualTo(Integer value) {
            addCriterion("copy_flag <=", value, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagIn(List<Integer> values) {
            addCriterion("copy_flag in", values, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagNotIn(List<Integer> values) {
            addCriterion("copy_flag not in", values, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagBetween(Integer value1, Integer value2) {
            addCriterion("copy_flag between", value1, value2, "copyFlag");
            return (Criteria) this;
        }

        public Criteria andCopyFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("copy_flag not between", value1, value2, "copyFlag");
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

        public Criteria andPrintErrorIsNull() {
            addCriterion("print_error is null");
            return (Criteria) this;
        }

        public Criteria andPrintErrorIsNotNull() {
            addCriterion("print_error is not null");
            return (Criteria) this;
        }

        public Criteria andPrintErrorEqualTo(String value) {
            addCriterion("print_error =", value, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorNotEqualTo(String value) {
            addCriterion("print_error <>", value, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorGreaterThan(String value) {
            addCriterion("print_error >", value, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorGreaterThanOrEqualTo(String value) {
            addCriterion("print_error >=", value, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorLessThan(String value) {
            addCriterion("print_error <", value, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorLessThanOrEqualTo(String value) {
            addCriterion("print_error <=", value, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorLike(String value) {
            addCriterion("print_error like", value, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorNotLike(String value) {
            addCriterion("print_error not like", value, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorIn(List<String> values) {
            addCriterion("print_error in", values, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorNotIn(List<String> values) {
            addCriterion("print_error not in", values, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorBetween(String value1, String value2) {
            addCriterion("print_error between", value1, value2, "printError");
            return (Criteria) this;
        }

        public Criteria andPrintErrorNotBetween(String value1, String value2) {
            addCriterion("print_error not between", value1, value2, "printError");
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