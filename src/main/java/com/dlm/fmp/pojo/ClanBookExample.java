package com.dlm.fmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClanBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClanBookExample() {
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

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andVolumeNumIsNull() {
            addCriterion("volume_num is null");
            return (Criteria) this;
        }

        public Criteria andVolumeNumIsNotNull() {
            addCriterion("volume_num is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeNumEqualTo(Integer value) {
            addCriterion("volume_num =", value, "volumeNum");
            return (Criteria) this;
        }

        public Criteria andVolumeNumNotEqualTo(Integer value) {
            addCriterion("volume_num <>", value, "volumeNum");
            return (Criteria) this;
        }

        public Criteria andVolumeNumGreaterThan(Integer value) {
            addCriterion("volume_num >", value, "volumeNum");
            return (Criteria) this;
        }

        public Criteria andVolumeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume_num >=", value, "volumeNum");
            return (Criteria) this;
        }

        public Criteria andVolumeNumLessThan(Integer value) {
            addCriterion("volume_num <", value, "volumeNum");
            return (Criteria) this;
        }

        public Criteria andVolumeNumLessThanOrEqualTo(Integer value) {
            addCriterion("volume_num <=", value, "volumeNum");
            return (Criteria) this;
        }

        public Criteria andVolumeNumIn(List<Integer> values) {
            addCriterion("volume_num in", values, "volumeNum");
            return (Criteria) this;
        }

        public Criteria andVolumeNumNotIn(List<Integer> values) {
            addCriterion("volume_num not in", values, "volumeNum");
            return (Criteria) this;
        }

        public Criteria andVolumeNumBetween(Integer value1, Integer value2) {
            addCriterion("volume_num between", value1, value2, "volumeNum");
            return (Criteria) this;
        }

        public Criteria andVolumeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("volume_num not between", value1, value2, "volumeNum");
            return (Criteria) this;
        }

        public Criteria andCoverImageIsNull() {
            addCriterion("cover_image is null");
            return (Criteria) this;
        }

        public Criteria andCoverImageIsNotNull() {
            addCriterion("cover_image is not null");
            return (Criteria) this;
        }

        public Criteria andCoverImageEqualTo(String value) {
            addCriterion("cover_image =", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotEqualTo(String value) {
            addCriterion("cover_image <>", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageGreaterThan(String value) {
            addCriterion("cover_image >", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageGreaterThanOrEqualTo(String value) {
            addCriterion("cover_image >=", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLessThan(String value) {
            addCriterion("cover_image <", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLessThanOrEqualTo(String value) {
            addCriterion("cover_image <=", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageLike(String value) {
            addCriterion("cover_image like", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotLike(String value) {
            addCriterion("cover_image not like", value, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageIn(List<String> values) {
            addCriterion("cover_image in", values, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotIn(List<String> values) {
            addCriterion("cover_image not in", values, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageBetween(String value1, String value2) {
            addCriterion("cover_image between", value1, value2, "coverImage");
            return (Criteria) this;
        }

        public Criteria andCoverImageNotBetween(String value1, String value2) {
            addCriterion("cover_image not between", value1, value2, "coverImage");
            return (Criteria) this;
        }

        public Criteria andDealFlagIsNull() {
            addCriterion("deal_flag is null");
            return (Criteria) this;
        }

        public Criteria andDealFlagIsNotNull() {
            addCriterion("deal_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDealFlagEqualTo(Integer value) {
            addCriterion("deal_flag =", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagNotEqualTo(Integer value) {
            addCriterion("deal_flag <>", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagGreaterThan(Integer value) {
            addCriterion("deal_flag >", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_flag >=", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagLessThan(Integer value) {
            addCriterion("deal_flag <", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagLessThanOrEqualTo(Integer value) {
            addCriterion("deal_flag <=", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagIn(List<Integer> values) {
            addCriterion("deal_flag in", values, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagNotIn(List<Integer> values) {
            addCriterion("deal_flag not in", values, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagBetween(Integer value1, Integer value2) {
            addCriterion("deal_flag between", value1, value2, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_flag not between", value1, value2, "dealFlag");
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

        public Criteria andRelationModifyFlagIsNull() {
            addCriterion("relation_modify_flag is null");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagIsNotNull() {
            addCriterion("relation_modify_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagEqualTo(Integer value) {
            addCriterion("relation_modify_flag =", value, "relationModifyFlag");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagNotEqualTo(Integer value) {
            addCriterion("relation_modify_flag <>", value, "relationModifyFlag");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagGreaterThan(Integer value) {
            addCriterion("relation_modify_flag >", value, "relationModifyFlag");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_modify_flag >=", value, "relationModifyFlag");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagLessThan(Integer value) {
            addCriterion("relation_modify_flag <", value, "relationModifyFlag");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagLessThanOrEqualTo(Integer value) {
            addCriterion("relation_modify_flag <=", value, "relationModifyFlag");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagIn(List<Integer> values) {
            addCriterion("relation_modify_flag in", values, "relationModifyFlag");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagNotIn(List<Integer> values) {
            addCriterion("relation_modify_flag not in", values, "relationModifyFlag");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagBetween(Integer value1, Integer value2) {
            addCriterion("relation_modify_flag between", value1, value2, "relationModifyFlag");
            return (Criteria) this;
        }

        public Criteria andRelationModifyFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_modify_flag not between", value1, value2, "relationModifyFlag");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagIsNull() {
            addCriterion("content_modify_flag is null");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagIsNotNull() {
            addCriterion("content_modify_flag is not null");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagEqualTo(Integer value) {
            addCriterion("content_modify_flag =", value, "contentModifyFlag");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagNotEqualTo(Integer value) {
            addCriterion("content_modify_flag <>", value, "contentModifyFlag");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagGreaterThan(Integer value) {
            addCriterion("content_modify_flag >", value, "contentModifyFlag");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_modify_flag >=", value, "contentModifyFlag");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagLessThan(Integer value) {
            addCriterion("content_modify_flag <", value, "contentModifyFlag");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagLessThanOrEqualTo(Integer value) {
            addCriterion("content_modify_flag <=", value, "contentModifyFlag");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagIn(List<Integer> values) {
            addCriterion("content_modify_flag in", values, "contentModifyFlag");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagNotIn(List<Integer> values) {
            addCriterion("content_modify_flag not in", values, "contentModifyFlag");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagBetween(Integer value1, Integer value2) {
            addCriterion("content_modify_flag between", value1, value2, "contentModifyFlag");
            return (Criteria) this;
        }

        public Criteria andContentModifyFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("content_modify_flag not between", value1, value2, "contentModifyFlag");
            return (Criteria) this;
        }

        public Criteria andAncestorIdIsNull() {
            addCriterion("ancestor_id is null");
            return (Criteria) this;
        }

        public Criteria andAncestorIdIsNotNull() {
            addCriterion("ancestor_id is not null");
            return (Criteria) this;
        }

        public Criteria andAncestorIdEqualTo(Integer value) {
            addCriterion("ancestor_id =", value, "ancestorId");
            return (Criteria) this;
        }

        public Criteria andAncestorIdNotEqualTo(Integer value) {
            addCriterion("ancestor_id <>", value, "ancestorId");
            return (Criteria) this;
        }

        public Criteria andAncestorIdGreaterThan(Integer value) {
            addCriterion("ancestor_id >", value, "ancestorId");
            return (Criteria) this;
        }

        public Criteria andAncestorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ancestor_id >=", value, "ancestorId");
            return (Criteria) this;
        }

        public Criteria andAncestorIdLessThan(Integer value) {
            addCriterion("ancestor_id <", value, "ancestorId");
            return (Criteria) this;
        }

        public Criteria andAncestorIdLessThanOrEqualTo(Integer value) {
            addCriterion("ancestor_id <=", value, "ancestorId");
            return (Criteria) this;
        }

        public Criteria andAncestorIdIn(List<Integer> values) {
            addCriterion("ancestor_id in", values, "ancestorId");
            return (Criteria) this;
        }

        public Criteria andAncestorIdNotIn(List<Integer> values) {
            addCriterion("ancestor_id not in", values, "ancestorId");
            return (Criteria) this;
        }

        public Criteria andAncestorIdBetween(Integer value1, Integer value2) {
            addCriterion("ancestor_id between", value1, value2, "ancestorId");
            return (Criteria) this;
        }

        public Criteria andAncestorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ancestor_id not between", value1, value2, "ancestorId");
            return (Criteria) this;
        }

        public Criteria andAncestorNameIsNull() {
            addCriterion("ancestor_name is null");
            return (Criteria) this;
        }

        public Criteria andAncestorNameIsNotNull() {
            addCriterion("ancestor_name is not null");
            return (Criteria) this;
        }

        public Criteria andAncestorNameEqualTo(String value) {
            addCriterion("ancestor_name =", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameNotEqualTo(String value) {
            addCriterion("ancestor_name <>", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameGreaterThan(String value) {
            addCriterion("ancestor_name >", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameGreaterThanOrEqualTo(String value) {
            addCriterion("ancestor_name >=", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameLessThan(String value) {
            addCriterion("ancestor_name <", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameLessThanOrEqualTo(String value) {
            addCriterion("ancestor_name <=", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameLike(String value) {
            addCriterion("ancestor_name like", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameNotLike(String value) {
            addCriterion("ancestor_name not like", value, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameIn(List<String> values) {
            addCriterion("ancestor_name in", values, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameNotIn(List<String> values) {
            addCriterion("ancestor_name not in", values, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameBetween(String value1, String value2) {
            addCriterion("ancestor_name between", value1, value2, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andAncestorNameNotBetween(String value1, String value2) {
            addCriterion("ancestor_name not between", value1, value2, "ancestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdIsNull() {
            addCriterion("book_ancestor_id is null");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdIsNotNull() {
            addCriterion("book_ancestor_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdEqualTo(Integer value) {
            addCriterion("book_ancestor_id =", value, "bookAncestorId");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdNotEqualTo(Integer value) {
            addCriterion("book_ancestor_id <>", value, "bookAncestorId");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdGreaterThan(Integer value) {
            addCriterion("book_ancestor_id >", value, "bookAncestorId");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_ancestor_id >=", value, "bookAncestorId");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdLessThan(Integer value) {
            addCriterion("book_ancestor_id <", value, "bookAncestorId");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_ancestor_id <=", value, "bookAncestorId");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdIn(List<Integer> values) {
            addCriterion("book_ancestor_id in", values, "bookAncestorId");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdNotIn(List<Integer> values) {
            addCriterion("book_ancestor_id not in", values, "bookAncestorId");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdBetween(Integer value1, Integer value2) {
            addCriterion("book_ancestor_id between", value1, value2, "bookAncestorId");
            return (Criteria) this;
        }

        public Criteria andBookAncestorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_ancestor_id not between", value1, value2, "bookAncestorId");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameIsNull() {
            addCriterion("book_ancestor_name is null");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameIsNotNull() {
            addCriterion("book_ancestor_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameEqualTo(String value) {
            addCriterion("book_ancestor_name =", value, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameNotEqualTo(String value) {
            addCriterion("book_ancestor_name <>", value, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameGreaterThan(String value) {
            addCriterion("book_ancestor_name >", value, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_ancestor_name >=", value, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameLessThan(String value) {
            addCriterion("book_ancestor_name <", value, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameLessThanOrEqualTo(String value) {
            addCriterion("book_ancestor_name <=", value, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameLike(String value) {
            addCriterion("book_ancestor_name like", value, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameNotLike(String value) {
            addCriterion("book_ancestor_name not like", value, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameIn(List<String> values) {
            addCriterion("book_ancestor_name in", values, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameNotIn(List<String> values) {
            addCriterion("book_ancestor_name not in", values, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameBetween(String value1, String value2) {
            addCriterion("book_ancestor_name between", value1, value2, "bookAncestorName");
            return (Criteria) this;
        }

        public Criteria andBookAncestorNameNotBetween(String value1, String value2) {
            addCriterion("book_ancestor_name not between", value1, value2, "bookAncestorName");
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

        public Criteria andSubClanSettingIsNull() {
            addCriterion("sub_clan_setting is null");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingIsNotNull() {
            addCriterion("sub_clan_setting is not null");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingEqualTo(String value) {
            addCriterion("sub_clan_setting =", value, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingNotEqualTo(String value) {
            addCriterion("sub_clan_setting <>", value, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingGreaterThan(String value) {
            addCriterion("sub_clan_setting >", value, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingGreaterThanOrEqualTo(String value) {
            addCriterion("sub_clan_setting >=", value, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingLessThan(String value) {
            addCriterion("sub_clan_setting <", value, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingLessThanOrEqualTo(String value) {
            addCriterion("sub_clan_setting <=", value, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingLike(String value) {
            addCriterion("sub_clan_setting like", value, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingNotLike(String value) {
            addCriterion("sub_clan_setting not like", value, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingIn(List<String> values) {
            addCriterion("sub_clan_setting in", values, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingNotIn(List<String> values) {
            addCriterion("sub_clan_setting not in", values, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingBetween(String value1, String value2) {
            addCriterion("sub_clan_setting between", value1, value2, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andSubClanSettingNotBetween(String value1, String value2) {
            addCriterion("sub_clan_setting not between", value1, value2, "subClanSetting");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIsNull() {
            addCriterion("open_flag is null");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIsNotNull() {
            addCriterion("open_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOpenFlagEqualTo(Integer value) {
            addCriterion("open_flag =", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotEqualTo(Integer value) {
            addCriterion("open_flag <>", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagGreaterThan(Integer value) {
            addCriterion("open_flag >", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_flag >=", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLessThan(Integer value) {
            addCriterion("open_flag <", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLessThanOrEqualTo(Integer value) {
            addCriterion("open_flag <=", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIn(List<Integer> values) {
            addCriterion("open_flag in", values, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotIn(List<Integer> values) {
            addCriterion("open_flag not in", values, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagBetween(Integer value1, Integer value2) {
            addCriterion("open_flag between", value1, value2, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("open_flag not between", value1, value2, "openFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagIsNull() {
            addCriterion("publish_flag is null");
            return (Criteria) this;
        }

        public Criteria andPublishFlagIsNotNull() {
            addCriterion("publish_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPublishFlagEqualTo(Integer value) {
            addCriterion("publish_flag =", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagNotEqualTo(Integer value) {
            addCriterion("publish_flag <>", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagGreaterThan(Integer value) {
            addCriterion("publish_flag >", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_flag >=", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagLessThan(Integer value) {
            addCriterion("publish_flag <", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagLessThanOrEqualTo(Integer value) {
            addCriterion("publish_flag <=", value, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagIn(List<Integer> values) {
            addCriterion("publish_flag in", values, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagNotIn(List<Integer> values) {
            addCriterion("publish_flag not in", values, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagBetween(Integer value1, Integer value2) {
            addCriterion("publish_flag between", value1, value2, "publishFlag");
            return (Criteria) this;
        }

        public Criteria andPublishFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_flag not between", value1, value2, "publishFlag");
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

        public Criteria andWatermarkFlagIsNull() {
            addCriterion("watermark_flag is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagIsNotNull() {
            addCriterion("watermark_flag is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagEqualTo(Integer value) {
            addCriterion("watermark_flag =", value, "watermarkFlag");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagNotEqualTo(Integer value) {
            addCriterion("watermark_flag <>", value, "watermarkFlag");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagGreaterThan(Integer value) {
            addCriterion("watermark_flag >", value, "watermarkFlag");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("watermark_flag >=", value, "watermarkFlag");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagLessThan(Integer value) {
            addCriterion("watermark_flag <", value, "watermarkFlag");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagLessThanOrEqualTo(Integer value) {
            addCriterion("watermark_flag <=", value, "watermarkFlag");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagIn(List<Integer> values) {
            addCriterion("watermark_flag in", values, "watermarkFlag");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagNotIn(List<Integer> values) {
            addCriterion("watermark_flag not in", values, "watermarkFlag");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagBetween(Integer value1, Integer value2) {
            addCriterion("watermark_flag between", value1, value2, "watermarkFlag");
            return (Criteria) this;
        }

        public Criteria andWatermarkFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("watermark_flag not between", value1, value2, "watermarkFlag");
            return (Criteria) this;
        }

        public Criteria andBranchTypeIsNull() {
            addCriterion("branch_type is null");
            return (Criteria) this;
        }

        public Criteria andBranchTypeIsNotNull() {
            addCriterion("branch_type is not null");
            return (Criteria) this;
        }

        public Criteria andBranchTypeEqualTo(Integer value) {
            addCriterion("branch_type =", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeNotEqualTo(Integer value) {
            addCriterion("branch_type <>", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeGreaterThan(Integer value) {
            addCriterion("branch_type >", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("branch_type >=", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeLessThan(Integer value) {
            addCriterion("branch_type <", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeLessThanOrEqualTo(Integer value) {
            addCriterion("branch_type <=", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeIn(List<Integer> values) {
            addCriterion("branch_type in", values, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeNotIn(List<Integer> values) {
            addCriterion("branch_type not in", values, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeBetween(Integer value1, Integer value2) {
            addCriterion("branch_type between", value1, value2, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("branch_type not between", value1, value2, "branchType");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemIsNull() {
            addCriterion("generation_poem is null");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemIsNotNull() {
            addCriterion("generation_poem is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemEqualTo(String value) {
            addCriterion("generation_poem =", value, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemNotEqualTo(String value) {
            addCriterion("generation_poem <>", value, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemGreaterThan(String value) {
            addCriterion("generation_poem >", value, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemGreaterThanOrEqualTo(String value) {
            addCriterion("generation_poem >=", value, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemLessThan(String value) {
            addCriterion("generation_poem <", value, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemLessThanOrEqualTo(String value) {
            addCriterion("generation_poem <=", value, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemLike(String value) {
            addCriterion("generation_poem like", value, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemNotLike(String value) {
            addCriterion("generation_poem not like", value, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemIn(List<String> values) {
            addCriterion("generation_poem in", values, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemNotIn(List<String> values) {
            addCriterion("generation_poem not in", values, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemBetween(String value1, String value2) {
            addCriterion("generation_poem between", value1, value2, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andGenerationPoemNotBetween(String value1, String value2) {
            addCriterion("generation_poem not between", value1, value2, "generationPoem");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordIsNull() {
            addCriterion("book_ancestor_word is null");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordIsNotNull() {
            addCriterion("book_ancestor_word is not null");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordEqualTo(String value) {
            addCriterion("book_ancestor_word =", value, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordNotEqualTo(String value) {
            addCriterion("book_ancestor_word <>", value, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordGreaterThan(String value) {
            addCriterion("book_ancestor_word >", value, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordGreaterThanOrEqualTo(String value) {
            addCriterion("book_ancestor_word >=", value, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordLessThan(String value) {
            addCriterion("book_ancestor_word <", value, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordLessThanOrEqualTo(String value) {
            addCriterion("book_ancestor_word <=", value, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordLike(String value) {
            addCriterion("book_ancestor_word like", value, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordNotLike(String value) {
            addCriterion("book_ancestor_word not like", value, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordIn(List<String> values) {
            addCriterion("book_ancestor_word in", values, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordNotIn(List<String> values) {
            addCriterion("book_ancestor_word not in", values, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordBetween(String value1, String value2) {
            addCriterion("book_ancestor_word between", value1, value2, "bookAncestorWord");
            return (Criteria) this;
        }

        public Criteria andBookAncestorWordNotBetween(String value1, String value2) {
            addCriterion("book_ancestor_word not between", value1, value2, "bookAncestorWord");
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