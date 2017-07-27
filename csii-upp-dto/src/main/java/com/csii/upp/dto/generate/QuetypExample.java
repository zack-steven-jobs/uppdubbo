package com.csii.upp.dto.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class QuetypExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    public QuetypExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    protected QuetypExample(QuetypExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
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
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUETYP
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andQuetypcdIsNull() {
            addCriterion("QUETYPCD is null");
            return (Criteria) this;
        }

        public Criteria andQuetypcdIsNotNull() {
            addCriterion("QUETYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andQuetypcdEqualTo(String value) {
            addCriterion("QUETYPCD =", value, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdNotEqualTo(String value) {
            addCriterion("QUETYPCD <>", value, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdGreaterThan(String value) {
            addCriterion("QUETYPCD >", value, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdGreaterThanOrEqualTo(String value) {
            addCriterion("QUETYPCD >=", value, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdLessThan(String value) {
            addCriterion("QUETYPCD <", value, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdLessThanOrEqualTo(String value) {
            addCriterion("QUETYPCD <=", value, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdLike(String value) {
            addCriterion("QUETYPCD like", value, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdNotLike(String value) {
            addCriterion("QUETYPCD not like", value, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdIn(List<String> values) {
            addCriterion("QUETYPCD in", values, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdNotIn(List<String> values) {
            addCriterion("QUETYPCD not in", values, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdBetween(String value1, String value2) {
            addCriterion("QUETYPCD between", value1, value2, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypcdNotBetween(String value1, String value2) {
            addCriterion("QUETYPCD not between", value1, value2, "quetypcd");
            return (Criteria) this;
        }

        public Criteria andQuetypdescIsNull() {
            addCriterion("QUETYPDESC is null");
            return (Criteria) this;
        }

        public Criteria andQuetypdescIsNotNull() {
            addCriterion("QUETYPDESC is not null");
            return (Criteria) this;
        }

        public Criteria andQuetypdescEqualTo(String value) {
            addCriterion("QUETYPDESC =", value, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescNotEqualTo(String value) {
            addCriterion("QUETYPDESC <>", value, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescGreaterThan(String value) {
            addCriterion("QUETYPDESC >", value, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescGreaterThanOrEqualTo(String value) {
            addCriterion("QUETYPDESC >=", value, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescLessThan(String value) {
            addCriterion("QUETYPDESC <", value, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescLessThanOrEqualTo(String value) {
            addCriterion("QUETYPDESC <=", value, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescLike(String value) {
            addCriterion("QUETYPDESC like", value, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescNotLike(String value) {
            addCriterion("QUETYPDESC not like", value, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescIn(List<String> values) {
            addCriterion("QUETYPDESC in", values, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescNotIn(List<String> values) {
            addCriterion("QUETYPDESC not in", values, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescBetween(String value1, String value2) {
            addCriterion("QUETYPDESC between", value1, value2, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andQuetypdescNotBetween(String value1, String value2) {
            addCriterion("QUETYPDESC not between", value1, value2, "quetypdesc");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdIsNull() {
            addCriterion("CALPERIODCD is null");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdIsNotNull() {
            addCriterion("CALPERIODCD is not null");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdEqualTo(String value) {
            addCriterion("CALPERIODCD =", value, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdNotEqualTo(String value) {
            addCriterion("CALPERIODCD <>", value, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdGreaterThan(String value) {
            addCriterion("CALPERIODCD >", value, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdGreaterThanOrEqualTo(String value) {
            addCriterion("CALPERIODCD >=", value, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdLessThan(String value) {
            addCriterion("CALPERIODCD <", value, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdLessThanOrEqualTo(String value) {
            addCriterion("CALPERIODCD <=", value, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdLike(String value) {
            addCriterion("CALPERIODCD like", value, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdNotLike(String value) {
            addCriterion("CALPERIODCD not like", value, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdIn(List<String> values) {
            addCriterion("CALPERIODCD in", values, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdNotIn(List<String> values) {
            addCriterion("CALPERIODCD not in", values, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdBetween(String value1, String value2) {
            addCriterion("CALPERIODCD between", value1, value2, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andCalperiodcdNotBetween(String value1, String value2) {
            addCriterion("CALPERIODCD not between", value1, value2, "calperiodcd");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIsNull() {
            addCriterion("DATELASTMAINT is null");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIsNotNull() {
            addCriterion("DATELASTMAINT is not null");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintEqualTo(Date value) {
            addCriterion("DATELASTMAINT =", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotEqualTo(Date value) {
            addCriterion("DATELASTMAINT <>", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintGreaterThan(Date value) {
            addCriterion("DATELASTMAINT >", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintGreaterThanOrEqualTo(Date value) {
            addCriterion("DATELASTMAINT >=", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintLessThan(Date value) {
            addCriterion("DATELASTMAINT <", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintLessThanOrEqualTo(Date value) {
            addCriterion("DATELASTMAINT <=", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIn(List<Date> values) {
            addCriterion("DATELASTMAINT in", values, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotIn(List<Date> values) {
            addCriterion("DATELASTMAINT not in", values, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintBetween(Date value1, Date value2) {
            addCriterion("DATELASTMAINT between", value1, value2, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotBetween(Date value1, Date value2) {
            addCriterion("DATELASTMAINT not between", value1, value2, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Long value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Long value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Long value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Long value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Long value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Long> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Long> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Long value1, Long value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Long value1, Long value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andTimetorunIsNull() {
            addCriterion("TIMETORUN is null");
            return (Criteria) this;
        }

        public Criteria andTimetorunIsNotNull() {
            addCriterion("TIMETORUN is not null");
            return (Criteria) this;
        }

        public Criteria andTimetorunEqualTo(Date value) {
            addCriterionForJDBCDate("TIMETORUN =", value, "timetorun");
            return (Criteria) this;
        }

        public Criteria andTimetorunNotEqualTo(Date value) {
            addCriterionForJDBCDate("TIMETORUN <>", value, "timetorun");
            return (Criteria) this;
        }

        public Criteria andTimetorunGreaterThan(Date value) {
            addCriterionForJDBCDate("TIMETORUN >", value, "timetorun");
            return (Criteria) this;
        }

        public Criteria andTimetorunGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TIMETORUN >=", value, "timetorun");
            return (Criteria) this;
        }

        public Criteria andTimetorunLessThan(Date value) {
            addCriterionForJDBCDate("TIMETORUN <", value, "timetorun");
            return (Criteria) this;
        }

        public Criteria andTimetorunLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TIMETORUN <=", value, "timetorun");
            return (Criteria) this;
        }

        public Criteria andTimetorunIn(List<Date> values) {
            addCriterionForJDBCDate("TIMETORUN in", values, "timetorun");
            return (Criteria) this;
        }

        public Criteria andTimetorunNotIn(List<Date> values) {
            addCriterionForJDBCDate("TIMETORUN not in", values, "timetorun");
            return (Criteria) this;
        }

        public Criteria andTimetorunBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TIMETORUN between", value1, value2, "timetorun");
            return (Criteria) this;
        }

        public Criteria andTimetorunNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TIMETORUN not between", value1, value2, "timetorun");
            return (Criteria) this;
        }

        public Criteria andFullfilenameIsNull() {
            addCriterion("FULLFILENAME is null");
            return (Criteria) this;
        }

        public Criteria andFullfilenameIsNotNull() {
            addCriterion("FULLFILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullfilenameEqualTo(String value) {
            addCriterion("FULLFILENAME =", value, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameNotEqualTo(String value) {
            addCriterion("FULLFILENAME <>", value, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameGreaterThan(String value) {
            addCriterion("FULLFILENAME >", value, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FULLFILENAME >=", value, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameLessThan(String value) {
            addCriterion("FULLFILENAME <", value, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameLessThanOrEqualTo(String value) {
            addCriterion("FULLFILENAME <=", value, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameLike(String value) {
            addCriterion("FULLFILENAME like", value, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameNotLike(String value) {
            addCriterion("FULLFILENAME not like", value, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameIn(List<String> values) {
            addCriterion("FULLFILENAME in", values, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameNotIn(List<String> values) {
            addCriterion("FULLFILENAME not in", values, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameBetween(String value1, String value2) {
            addCriterion("FULLFILENAME between", value1, value2, "fullfilename");
            return (Criteria) this;
        }

        public Criteria andFullfilenameNotBetween(String value1, String value2) {
            addCriterion("FULLFILENAME not between", value1, value2, "fullfilename");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUETYP
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}