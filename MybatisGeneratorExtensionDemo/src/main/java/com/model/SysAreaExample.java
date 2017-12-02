package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysAreaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_area
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_area
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_area
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    public SysAreaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @mbg.generated
     */
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andFatherIdIsNull() {
            addCriterion("father_id is null");
            return (Criteria) this;
        }

        public Criteria andFatherIdIsNotNull() {
            addCriterion("father_id is not null");
            return (Criteria) this;
        }

        public Criteria andFatherIdEqualTo(String value) {
            addCriterion("father_id =", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotEqualTo(String value) {
            addCriterion("father_id <>", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThan(String value) {
            addCriterion("father_id >", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThanOrEqualTo(String value) {
            addCriterion("father_id >=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThan(String value) {
            addCriterion("father_id <", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThanOrEqualTo(String value) {
            addCriterion("father_id <=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLike(String value) {
            addCriterion("father_id like", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotLike(String value) {
            addCriterion("father_id not like", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdIn(List<String> values) {
            addCriterion("father_id in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotIn(List<String> values) {
            addCriterion("father_id not in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdBetween(String value1, String value2) {
            addCriterion("father_id between", value1, value2, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotBetween(String value1, String value2) {
            addCriterion("father_id not between", value1, value2, "fatherId");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameIsNull() {
            addCriterion("area_shortname is null");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameIsNotNull() {
            addCriterion("area_shortname is not null");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameEqualTo(String value) {
            addCriterion("area_shortname =", value, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameNotEqualTo(String value) {
            addCriterion("area_shortname <>", value, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameGreaterThan(String value) {
            addCriterion("area_shortname >", value, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("area_shortname >=", value, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameLessThan(String value) {
            addCriterion("area_shortname <", value, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameLessThanOrEqualTo(String value) {
            addCriterion("area_shortname <=", value, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameLike(String value) {
            addCriterion("area_shortname like", value, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameNotLike(String value) {
            addCriterion("area_shortname not like", value, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameIn(List<String> values) {
            addCriterion("area_shortname in", values, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameNotIn(List<String> values) {
            addCriterion("area_shortname not in", values, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameBetween(String value1, String value2) {
            addCriterion("area_shortname between", value1, value2, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaShortnameNotBetween(String value1, String value2) {
            addCriterion("area_shortname not between", value1, value2, "areaShortname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameIsNull() {
            addCriterion("area_fullname is null");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameIsNotNull() {
            addCriterion("area_fullname is not null");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameEqualTo(String value) {
            addCriterion("area_fullname =", value, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameNotEqualTo(String value) {
            addCriterion("area_fullname <>", value, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameGreaterThan(String value) {
            addCriterion("area_fullname >", value, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("area_fullname >=", value, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameLessThan(String value) {
            addCriterion("area_fullname <", value, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameLessThanOrEqualTo(String value) {
            addCriterion("area_fullname <=", value, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameLike(String value) {
            addCriterion("area_fullname like", value, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameNotLike(String value) {
            addCriterion("area_fullname not like", value, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameIn(List<String> values) {
            addCriterion("area_fullname in", values, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameNotIn(List<String> values) {
            addCriterion("area_fullname not in", values, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameBetween(String value1, String value2) {
            addCriterion("area_fullname between", value1, value2, "areaFullname");
            return (Criteria) this;
        }

        public Criteria andAreaFullnameNotBetween(String value1, String value2) {
            addCriterion("area_fullname not between", value1, value2, "areaFullname");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeIsNull() {
            addCriterion("upd_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeIsNotNull() {
            addCriterion("upd_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeEqualTo(Date value) {
            addCriterion("upd_datetime =", value, "updDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeNotEqualTo(Date value) {
            addCriterion("upd_datetime <>", value, "updDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeGreaterThan(Date value) {
            addCriterion("upd_datetime >", value, "updDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_datetime >=", value, "updDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeLessThan(Date value) {
            addCriterion("upd_datetime <", value, "updDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_datetime <=", value, "updDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeIn(List<Date> values) {
            addCriterion("upd_datetime in", values, "updDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeNotIn(List<Date> values) {
            addCriterion("upd_datetime not in", values, "updDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeBetween(Date value1, Date value2) {
            addCriterion("upd_datetime between", value1, value2, "updDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("upd_datetime not between", value1, value2, "updDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdUserIsNull() {
            addCriterion("upd_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdUserIsNotNull() {
            addCriterion("upd_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUserEqualTo(String value) {
            addCriterion("upd_user =", value, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserNotEqualTo(String value) {
            addCriterion("upd_user <>", value, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserGreaterThan(String value) {
            addCriterion("upd_user >", value, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserGreaterThanOrEqualTo(String value) {
            addCriterion("upd_user >=", value, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserLessThan(String value) {
            addCriterion("upd_user <", value, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserLessThanOrEqualTo(String value) {
            addCriterion("upd_user <=", value, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserLike(String value) {
            addCriterion("upd_user like", value, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserNotLike(String value) {
            addCriterion("upd_user not like", value, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserIn(List<String> values) {
            addCriterion("upd_user in", values, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserNotIn(List<String> values) {
            addCriterion("upd_user not in", values, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserBetween(String value1, String value2) {
            addCriterion("upd_user between", value1, value2, "updUser");
            return (Criteria) this;
        }

        public Criteria andUpdUserNotBetween(String value1, String value2) {
            addCriterion("upd_user not between", value1, value2, "updUser");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNull() {
            addCriterion("sort_id is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(Integer value) {
            addCriterion("sort_id =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(Integer value) {
            addCriterion("sort_id <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(Integer value) {
            addCriterion("sort_id >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_id >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(Integer value) {
            addCriterion("sort_id <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(Integer value) {
            addCriterion("sort_id <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<Integer> values) {
            addCriterion("sort_id in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<Integer> values) {
            addCriterion("sort_id not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(Integer value1, Integer value2) {
            addCriterion("sort_id between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_id not between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyIsNull() {
            addCriterion("max_delnum_county is null");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyIsNotNull() {
            addCriterion("max_delnum_county is not null");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyEqualTo(Byte value) {
            addCriterion("max_delnum_county =", value, "maxDelnumCounty");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyNotEqualTo(Byte value) {
            addCriterion("max_delnum_county <>", value, "maxDelnumCounty");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyGreaterThan(Byte value) {
            addCriterion("max_delnum_county >", value, "maxDelnumCounty");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyGreaterThanOrEqualTo(Byte value) {
            addCriterion("max_delnum_county >=", value, "maxDelnumCounty");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyLessThan(Byte value) {
            addCriterion("max_delnum_county <", value, "maxDelnumCounty");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyLessThanOrEqualTo(Byte value) {
            addCriterion("max_delnum_county <=", value, "maxDelnumCounty");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyIn(List<Byte> values) {
            addCriterion("max_delnum_county in", values, "maxDelnumCounty");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyNotIn(List<Byte> values) {
            addCriterion("max_delnum_county not in", values, "maxDelnumCounty");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyBetween(Byte value1, Byte value2) {
            addCriterion("max_delnum_county between", value1, value2, "maxDelnumCounty");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumCountyNotBetween(Byte value1, Byte value2) {
            addCriterion("max_delnum_county not between", value1, value2, "maxDelnumCounty");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseIsNull() {
            addCriterion("max_delnum_base is null");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseIsNotNull() {
            addCriterion("max_delnum_base is not null");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseEqualTo(Byte value) {
            addCriterion("max_delnum_base =", value, "maxDelnumBase");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseNotEqualTo(Byte value) {
            addCriterion("max_delnum_base <>", value, "maxDelnumBase");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseGreaterThan(Byte value) {
            addCriterion("max_delnum_base >", value, "maxDelnumBase");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseGreaterThanOrEqualTo(Byte value) {
            addCriterion("max_delnum_base >=", value, "maxDelnumBase");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseLessThan(Byte value) {
            addCriterion("max_delnum_base <", value, "maxDelnumBase");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseLessThanOrEqualTo(Byte value) {
            addCriterion("max_delnum_base <=", value, "maxDelnumBase");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseIn(List<Byte> values) {
            addCriterion("max_delnum_base in", values, "maxDelnumBase");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseNotIn(List<Byte> values) {
            addCriterion("max_delnum_base not in", values, "maxDelnumBase");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseBetween(Byte value1, Byte value2) {
            addCriterion("max_delnum_base between", value1, value2, "maxDelnumBase");
            return (Criteria) this;
        }

        public Criteria andMaxDelnumBaseNotBetween(Byte value1, Byte value2) {
            addCriterion("max_delnum_base not between", value1, value2, "maxDelnumBase");
            return (Criteria) this;
        }
    }

    /**
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * @mbg.generated
     */
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