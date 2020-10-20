package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmContentFinalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmContentFinalExample() {
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

        public Criteria andCmContentIdIsNull() {
            addCriterion("cm_content_id is null");
            return (Criteria) this;
        }

        public Criteria andCmContentIdIsNotNull() {
            addCriterion("cm_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmContentIdEqualTo(Integer value) {
            addCriterion("cm_content_id =", value, "cmContentId");
            return (Criteria) this;
        }

        public Criteria andCmContentIdNotEqualTo(Integer value) {
            addCriterion("cm_content_id <>", value, "cmContentId");
            return (Criteria) this;
        }

        public Criteria andCmContentIdGreaterThan(Integer value) {
            addCriterion("cm_content_id >", value, "cmContentId");
            return (Criteria) this;
        }

        public Criteria andCmContentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_content_id >=", value, "cmContentId");
            return (Criteria) this;
        }

        public Criteria andCmContentIdLessThan(Integer value) {
            addCriterion("cm_content_id <", value, "cmContentId");
            return (Criteria) this;
        }

        public Criteria andCmContentIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_content_id <=", value, "cmContentId");
            return (Criteria) this;
        }

        public Criteria andCmContentIdIn(List<Integer> values) {
            addCriterion("cm_content_id in", values, "cmContentId");
            return (Criteria) this;
        }

        public Criteria andCmContentIdNotIn(List<Integer> values) {
            addCriterion("cm_content_id not in", values, "cmContentId");
            return (Criteria) this;
        }

        public Criteria andCmContentIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_content_id between", value1, value2, "cmContentId");
            return (Criteria) this;
        }

        public Criteria andCmContentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_content_id not between", value1, value2, "cmContentId");
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

        public Criteria andContentTypeIsNull() {
            addCriterion("content_type is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("content_type is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(Integer value) {
            addCriterion("content_type =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(Integer value) {
            addCriterion("content_type <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(Integer value) {
            addCriterion("content_type >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_type >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(Integer value) {
            addCriterion("content_type <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("content_type <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<Integer> values) {
            addCriterion("content_type in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<Integer> values) {
            addCriterion("content_type not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(Integer value1, Integer value2) {
            addCriterion("content_type between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("content_type not between", value1, value2, "contentType");
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

        public Criteria andExtendFlagIsNull() {
            addCriterion("extend_flag is null");
            return (Criteria) this;
        }

        public Criteria andExtendFlagIsNotNull() {
            addCriterion("extend_flag is not null");
            return (Criteria) this;
        }

        public Criteria andExtendFlagEqualTo(Integer value) {
            addCriterion("extend_flag =", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagNotEqualTo(Integer value) {
            addCriterion("extend_flag <>", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagGreaterThan(Integer value) {
            addCriterion("extend_flag >", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("extend_flag >=", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagLessThan(Integer value) {
            addCriterion("extend_flag <", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagLessThanOrEqualTo(Integer value) {
            addCriterion("extend_flag <=", value, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagIn(List<Integer> values) {
            addCriterion("extend_flag in", values, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagNotIn(List<Integer> values) {
            addCriterion("extend_flag not in", values, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagBetween(Integer value1, Integer value2) {
            addCriterion("extend_flag between", value1, value2, "extendFlag");
            return (Criteria) this;
        }

        public Criteria andExtendFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("extend_flag not between", value1, value2, "extendFlag");
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

        public Criteria andParseFlagIsNull() {
            addCriterion("parse_flag is null");
            return (Criteria) this;
        }

        public Criteria andParseFlagIsNotNull() {
            addCriterion("parse_flag is not null");
            return (Criteria) this;
        }

        public Criteria andParseFlagEqualTo(Integer value) {
            addCriterion("parse_flag =", value, "parseFlag");
            return (Criteria) this;
        }

        public Criteria andParseFlagNotEqualTo(Integer value) {
            addCriterion("parse_flag <>", value, "parseFlag");
            return (Criteria) this;
        }

        public Criteria andParseFlagGreaterThan(Integer value) {
            addCriterion("parse_flag >", value, "parseFlag");
            return (Criteria) this;
        }

        public Criteria andParseFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("parse_flag >=", value, "parseFlag");
            return (Criteria) this;
        }

        public Criteria andParseFlagLessThan(Integer value) {
            addCriterion("parse_flag <", value, "parseFlag");
            return (Criteria) this;
        }

        public Criteria andParseFlagLessThanOrEqualTo(Integer value) {
            addCriterion("parse_flag <=", value, "parseFlag");
            return (Criteria) this;
        }

        public Criteria andParseFlagIn(List<Integer> values) {
            addCriterion("parse_flag in", values, "parseFlag");
            return (Criteria) this;
        }

        public Criteria andParseFlagNotIn(List<Integer> values) {
            addCriterion("parse_flag not in", values, "parseFlag");
            return (Criteria) this;
        }

        public Criteria andParseFlagBetween(Integer value1, Integer value2) {
            addCriterion("parse_flag between", value1, value2, "parseFlag");
            return (Criteria) this;
        }

        public Criteria andParseFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("parse_flag not between", value1, value2, "parseFlag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andBrotherNumIsNull() {
            addCriterion("brother_num is null");
            return (Criteria) this;
        }

        public Criteria andBrotherNumIsNotNull() {
            addCriterion("brother_num is not null");
            return (Criteria) this;
        }

        public Criteria andBrotherNumEqualTo(Integer value) {
            addCriterion("brother_num =", value, "brotherNum");
            return (Criteria) this;
        }

        public Criteria andBrotherNumNotEqualTo(Integer value) {
            addCriterion("brother_num <>", value, "brotherNum");
            return (Criteria) this;
        }

        public Criteria andBrotherNumGreaterThan(Integer value) {
            addCriterion("brother_num >", value, "brotherNum");
            return (Criteria) this;
        }

        public Criteria andBrotherNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("brother_num >=", value, "brotherNum");
            return (Criteria) this;
        }

        public Criteria andBrotherNumLessThan(Integer value) {
            addCriterion("brother_num <", value, "brotherNum");
            return (Criteria) this;
        }

        public Criteria andBrotherNumLessThanOrEqualTo(Integer value) {
            addCriterion("brother_num <=", value, "brotherNum");
            return (Criteria) this;
        }

        public Criteria andBrotherNumIn(List<Integer> values) {
            addCriterion("brother_num in", values, "brotherNum");
            return (Criteria) this;
        }

        public Criteria andBrotherNumNotIn(List<Integer> values) {
            addCriterion("brother_num not in", values, "brotherNum");
            return (Criteria) this;
        }

        public Criteria andBrotherNumBetween(Integer value1, Integer value2) {
            addCriterion("brother_num between", value1, value2, "brotherNum");
            return (Criteria) this;
        }

        public Criteria andBrotherNumNotBetween(Integer value1, Integer value2) {
            addCriterion("brother_num not between", value1, value2, "brotherNum");
            return (Criteria) this;
        }

        public Criteria andWifeListIsNull() {
            addCriterion("wife_list is null");
            return (Criteria) this;
        }

        public Criteria andWifeListIsNotNull() {
            addCriterion("wife_list is not null");
            return (Criteria) this;
        }

        public Criteria andWifeListEqualTo(String value) {
            addCriterion("wife_list =", value, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListNotEqualTo(String value) {
            addCriterion("wife_list <>", value, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListGreaterThan(String value) {
            addCriterion("wife_list >", value, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListGreaterThanOrEqualTo(String value) {
            addCriterion("wife_list >=", value, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListLessThan(String value) {
            addCriterion("wife_list <", value, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListLessThanOrEqualTo(String value) {
            addCriterion("wife_list <=", value, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListLike(String value) {
            addCriterion("wife_list like", value, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListNotLike(String value) {
            addCriterion("wife_list not like", value, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListIn(List<String> values) {
            addCriterion("wife_list in", values, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListNotIn(List<String> values) {
            addCriterion("wife_list not in", values, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListBetween(String value1, String value2) {
            addCriterion("wife_list between", value1, value2, "wifeList");
            return (Criteria) this;
        }

        public Criteria andWifeListNotBetween(String value1, String value2) {
            addCriterion("wife_list not between", value1, value2, "wifeList");
            return (Criteria) this;
        }

        public Criteria andConnectTypeIsNull() {
            addCriterion("connect_type is null");
            return (Criteria) this;
        }

        public Criteria andConnectTypeIsNotNull() {
            addCriterion("connect_type is not null");
            return (Criteria) this;
        }

        public Criteria andConnectTypeEqualTo(Integer value) {
            addCriterion("connect_type =", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeNotEqualTo(Integer value) {
            addCriterion("connect_type <>", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeGreaterThan(Integer value) {
            addCriterion("connect_type >", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("connect_type >=", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeLessThan(Integer value) {
            addCriterion("connect_type <", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("connect_type <=", value, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeIn(List<Integer> values) {
            addCriterion("connect_type in", values, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeNotIn(List<Integer> values) {
            addCriterion("connect_type not in", values, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeBetween(Integer value1, Integer value2) {
            addCriterion("connect_type between", value1, value2, "connectType");
            return (Criteria) this;
        }

        public Criteria andConnectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("connect_type not between", value1, value2, "connectType");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginIsNull() {
            addCriterion("sub_clan_id_origin is null");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginIsNotNull() {
            addCriterion("sub_clan_id_origin is not null");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginEqualTo(Integer value) {
            addCriterion("sub_clan_id_origin =", value, "subClanIdOrigin");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginNotEqualTo(Integer value) {
            addCriterion("sub_clan_id_origin <>", value, "subClanIdOrigin");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginGreaterThan(Integer value) {
            addCriterion("sub_clan_id_origin >", value, "subClanIdOrigin");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_clan_id_origin >=", value, "subClanIdOrigin");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginLessThan(Integer value) {
            addCriterion("sub_clan_id_origin <", value, "subClanIdOrigin");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginLessThanOrEqualTo(Integer value) {
            addCriterion("sub_clan_id_origin <=", value, "subClanIdOrigin");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginIn(List<Integer> values) {
            addCriterion("sub_clan_id_origin in", values, "subClanIdOrigin");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginNotIn(List<Integer> values) {
            addCriterion("sub_clan_id_origin not in", values, "subClanIdOrigin");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginBetween(Integer value1, Integer value2) {
            addCriterion("sub_clan_id_origin between", value1, value2, "subClanIdOrigin");
            return (Criteria) this;
        }

        public Criteria andSubClanIdOriginNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_clan_id_origin not between", value1, value2, "subClanIdOrigin");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagIsNull() {
            addCriterion("display_flag is null");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagIsNotNull() {
            addCriterion("display_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagEqualTo(Integer value) {
            addCriterion("display_flag =", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagNotEqualTo(Integer value) {
            addCriterion("display_flag <>", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagGreaterThan(Integer value) {
            addCriterion("display_flag >", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_flag >=", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagLessThan(Integer value) {
            addCriterion("display_flag <", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagLessThanOrEqualTo(Integer value) {
            addCriterion("display_flag <=", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagIn(List<Integer> values) {
            addCriterion("display_flag in", values, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagNotIn(List<Integer> values) {
            addCriterion("display_flag not in", values, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagBetween(Integer value1, Integer value2) {
            addCriterion("display_flag between", value1, value2, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("display_flag not between", value1, value2, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalIsNull() {
            addCriterion("member_rel_original is null");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalIsNotNull() {
            addCriterion("member_rel_original is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalEqualTo(String value) {
            addCriterion("member_rel_original =", value, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalNotEqualTo(String value) {
            addCriterion("member_rel_original <>", value, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalGreaterThan(String value) {
            addCriterion("member_rel_original >", value, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("member_rel_original >=", value, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalLessThan(String value) {
            addCriterion("member_rel_original <", value, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalLessThanOrEqualTo(String value) {
            addCriterion("member_rel_original <=", value, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalLike(String value) {
            addCriterion("member_rel_original like", value, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalNotLike(String value) {
            addCriterion("member_rel_original not like", value, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalIn(List<String> values) {
            addCriterion("member_rel_original in", values, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalNotIn(List<String> values) {
            addCriterion("member_rel_original not in", values, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalBetween(String value1, String value2) {
            addCriterion("member_rel_original between", value1, value2, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelOriginalNotBetween(String value1, String value2) {
            addCriterion("member_rel_original not between", value1, value2, "memberRelOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalIsNull() {
            addCriterion("member_name_original is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalIsNotNull() {
            addCriterion("member_name_original is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalEqualTo(String value) {
            addCriterion("member_name_original =", value, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalNotEqualTo(String value) {
            addCriterion("member_name_original <>", value, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalGreaterThan(String value) {
            addCriterion("member_name_original >", value, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("member_name_original >=", value, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalLessThan(String value) {
            addCriterion("member_name_original <", value, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalLessThanOrEqualTo(String value) {
            addCriterion("member_name_original <=", value, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalLike(String value) {
            addCriterion("member_name_original like", value, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalNotLike(String value) {
            addCriterion("member_name_original not like", value, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalIn(List<String> values) {
            addCriterion("member_name_original in", values, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalNotIn(List<String> values) {
            addCriterion("member_name_original not in", values, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalBetween(String value1, String value2) {
            addCriterion("member_name_original between", value1, value2, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberNameOriginalNotBetween(String value1, String value2) {
            addCriterion("member_name_original not between", value1, value2, "memberNameOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalIsNull() {
            addCriterion("member_detail_original is null");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalIsNotNull() {
            addCriterion("member_detail_original is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalEqualTo(String value) {
            addCriterion("member_detail_original =", value, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalNotEqualTo(String value) {
            addCriterion("member_detail_original <>", value, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalGreaterThan(String value) {
            addCriterion("member_detail_original >", value, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("member_detail_original >=", value, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalLessThan(String value) {
            addCriterion("member_detail_original <", value, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalLessThanOrEqualTo(String value) {
            addCriterion("member_detail_original <=", value, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalLike(String value) {
            addCriterion("member_detail_original like", value, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalNotLike(String value) {
            addCriterion("member_detail_original not like", value, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalIn(List<String> values) {
            addCriterion("member_detail_original in", values, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalNotIn(List<String> values) {
            addCriterion("member_detail_original not in", values, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalBetween(String value1, String value2) {
            addCriterion("member_detail_original between", value1, value2, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberDetailOriginalNotBetween(String value1, String value2) {
            addCriterion("member_detail_original not between", value1, value2, "memberDetailOriginal");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewIsNull() {
            addCriterion("member_rel_new is null");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewIsNotNull() {
            addCriterion("member_rel_new is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewEqualTo(String value) {
            addCriterion("member_rel_new =", value, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewNotEqualTo(String value) {
            addCriterion("member_rel_new <>", value, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewGreaterThan(String value) {
            addCriterion("member_rel_new >", value, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewGreaterThanOrEqualTo(String value) {
            addCriterion("member_rel_new >=", value, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewLessThan(String value) {
            addCriterion("member_rel_new <", value, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewLessThanOrEqualTo(String value) {
            addCriterion("member_rel_new <=", value, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewLike(String value) {
            addCriterion("member_rel_new like", value, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewNotLike(String value) {
            addCriterion("member_rel_new not like", value, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewIn(List<String> values) {
            addCriterion("member_rel_new in", values, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewNotIn(List<String> values) {
            addCriterion("member_rel_new not in", values, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewBetween(String value1, String value2) {
            addCriterion("member_rel_new between", value1, value2, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberRelNewNotBetween(String value1, String value2) {
            addCriterion("member_rel_new not between", value1, value2, "memberRelNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewIsNull() {
            addCriterion("member_name_new is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewIsNotNull() {
            addCriterion("member_name_new is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewEqualTo(String value) {
            addCriterion("member_name_new =", value, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewNotEqualTo(String value) {
            addCriterion("member_name_new <>", value, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewGreaterThan(String value) {
            addCriterion("member_name_new >", value, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewGreaterThanOrEqualTo(String value) {
            addCriterion("member_name_new >=", value, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewLessThan(String value) {
            addCriterion("member_name_new <", value, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewLessThanOrEqualTo(String value) {
            addCriterion("member_name_new <=", value, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewLike(String value) {
            addCriterion("member_name_new like", value, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewNotLike(String value) {
            addCriterion("member_name_new not like", value, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewIn(List<String> values) {
            addCriterion("member_name_new in", values, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewNotIn(List<String> values) {
            addCriterion("member_name_new not in", values, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewBetween(String value1, String value2) {
            addCriterion("member_name_new between", value1, value2, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberNameNewNotBetween(String value1, String value2) {
            addCriterion("member_name_new not between", value1, value2, "memberNameNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewIsNull() {
            addCriterion("member_detail_new is null");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewIsNotNull() {
            addCriterion("member_detail_new is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewEqualTo(String value) {
            addCriterion("member_detail_new =", value, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewNotEqualTo(String value) {
            addCriterion("member_detail_new <>", value, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewGreaterThan(String value) {
            addCriterion("member_detail_new >", value, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewGreaterThanOrEqualTo(String value) {
            addCriterion("member_detail_new >=", value, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewLessThan(String value) {
            addCriterion("member_detail_new <", value, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewLessThanOrEqualTo(String value) {
            addCriterion("member_detail_new <=", value, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewLike(String value) {
            addCriterion("member_detail_new like", value, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewNotLike(String value) {
            addCriterion("member_detail_new not like", value, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewIn(List<String> values) {
            addCriterion("member_detail_new in", values, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewNotIn(List<String> values) {
            addCriterion("member_detail_new not in", values, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewBetween(String value1, String value2) {
            addCriterion("member_detail_new between", value1, value2, "memberDetailNew");
            return (Criteria) this;
        }

        public Criteria andMemberDetailNewNotBetween(String value1, String value2) {
            addCriterion("member_detail_new not between", value1, value2, "memberDetailNew");
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