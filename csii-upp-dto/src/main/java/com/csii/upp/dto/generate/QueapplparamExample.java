package com.csii.upp.dto.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueapplparamExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	public QueapplparamExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	protected QueapplparamExample(QueapplparamExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
		this.distinct = example.distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUEAPPLPARAM
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table QUEAPPLPARAM
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition,
				List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List<Object> list = new ArrayList<Object>();
			list.add(value1);
			list.add(value2);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andQuenbrIsNull() {
			addCriterion("QUENBR is null");
			return (Criteria) this;
		}

		public Criteria andQuenbrIsNotNull() {
			addCriterion("QUENBR is not null");
			return (Criteria) this;
		}

		public Criteria andQuenbrEqualTo(Long value) {
			addCriterion("QUENBR =", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrNotEqualTo(Long value) {
			addCriterion("QUENBR <>", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrGreaterThan(Long value) {
			addCriterion("QUENBR >", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrGreaterThanOrEqualTo(Long value) {
			addCriterion("QUENBR >=", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrLessThan(Long value) {
			addCriterion("QUENBR <", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrLessThanOrEqualTo(Long value) {
			addCriterion("QUENBR <=", value, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrIn(List<Long> values) {
			addCriterion("QUENBR in", values, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrNotIn(List<Long> values) {
			addCriterion("QUENBR not in", values, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrBetween(Long value1, Long value2) {
			addCriterion("QUENBR between", value1, value2, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuenbrNotBetween(Long value1, Long value2) {
			addCriterion("QUENBR not between", value1, value2, "quenbr");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrIsNull() {
			addCriterion("QUESUBNBR is null");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrIsNotNull() {
			addCriterion("QUESUBNBR is not null");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrEqualTo(Long value) {
			addCriterion("QUESUBNBR =", value, "quesubnbr");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrNotEqualTo(Long value) {
			addCriterion("QUESUBNBR <>", value, "quesubnbr");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrGreaterThan(Long value) {
			addCriterion("QUESUBNBR >", value, "quesubnbr");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrGreaterThanOrEqualTo(Long value) {
			addCriterion("QUESUBNBR >=", value, "quesubnbr");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrLessThan(Long value) {
			addCriterion("QUESUBNBR <", value, "quesubnbr");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrLessThanOrEqualTo(Long value) {
			addCriterion("QUESUBNBR <=", value, "quesubnbr");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrIn(List<Long> values) {
			addCriterion("QUESUBNBR in", values, "quesubnbr");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrNotIn(List<Long> values) {
			addCriterion("QUESUBNBR not in", values, "quesubnbr");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrBetween(Long value1, Long value2) {
			addCriterion("QUESUBNBR between", value1, value2, "quesubnbr");
			return (Criteria) this;
		}

		public Criteria andQuesubnbrNotBetween(Long value1, Long value2) {
			addCriterion("QUESUBNBR not between", value1, value2, "quesubnbr");
			return (Criteria) this;
		}

		public Criteria andApplnbrIsNull() {
			addCriterion("APPLNBR is null");
			return (Criteria) this;
		}

		public Criteria andApplnbrIsNotNull() {
			addCriterion("APPLNBR is not null");
			return (Criteria) this;
		}

		public Criteria andApplnbrEqualTo(Long value) {
			addCriterion("APPLNBR =", value, "applnbr");
			return (Criteria) this;
		}

		public Criteria andApplnbrNotEqualTo(Long value) {
			addCriterion("APPLNBR <>", value, "applnbr");
			return (Criteria) this;
		}

		public Criteria andApplnbrGreaterThan(Long value) {
			addCriterion("APPLNBR >", value, "applnbr");
			return (Criteria) this;
		}

		public Criteria andApplnbrGreaterThanOrEqualTo(Long value) {
			addCriterion("APPLNBR >=", value, "applnbr");
			return (Criteria) this;
		}

		public Criteria andApplnbrLessThan(Long value) {
			addCriterion("APPLNBR <", value, "applnbr");
			return (Criteria) this;
		}

		public Criteria andApplnbrLessThanOrEqualTo(Long value) {
			addCriterion("APPLNBR <=", value, "applnbr");
			return (Criteria) this;
		}

		public Criteria andApplnbrIn(List<Long> values) {
			addCriterion("APPLNBR in", values, "applnbr");
			return (Criteria) this;
		}

		public Criteria andApplnbrNotIn(List<Long> values) {
			addCriterion("APPLNBR not in", values, "applnbr");
			return (Criteria) this;
		}

		public Criteria andApplnbrBetween(Long value1, Long value2) {
			addCriterion("APPLNBR between", value1, value2, "applnbr");
			return (Criteria) this;
		}

		public Criteria andApplnbrNotBetween(Long value1, Long value2) {
			addCriterion("APPLNBR not between", value1, value2, "applnbr");
			return (Criteria) this;
		}

		public Criteria andParametercdIsNull() {
			addCriterion("PARAMETERCD is null");
			return (Criteria) this;
		}

		public Criteria andParametercdIsNotNull() {
			addCriterion("PARAMETERCD is not null");
			return (Criteria) this;
		}

		public Criteria andParametercdEqualTo(String value) {
			addCriterion("PARAMETERCD =", value, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdNotEqualTo(String value) {
			addCriterion("PARAMETERCD <>", value, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdGreaterThan(String value) {
			addCriterion("PARAMETERCD >", value, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdGreaterThanOrEqualTo(String value) {
			addCriterion("PARAMETERCD >=", value, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdLessThan(String value) {
			addCriterion("PARAMETERCD <", value, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdLessThanOrEqualTo(String value) {
			addCriterion("PARAMETERCD <=", value, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdLike(String value) {
			addCriterion("PARAMETERCD like", value, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdNotLike(String value) {
			addCriterion("PARAMETERCD not like", value, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdIn(List<String> values) {
			addCriterion("PARAMETERCD in", values, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdNotIn(List<String> values) {
			addCriterion("PARAMETERCD not in", values, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdBetween(String value1, String value2) {
			addCriterion("PARAMETERCD between", value1, value2, "parametercd");
			return (Criteria) this;
		}

		public Criteria andParametercdNotBetween(String value1, String value2) {
			addCriterion("PARAMETERCD not between", value1, value2,
					"parametercd");
			return (Criteria) this;
		}

		public Criteria andParametervalueIsNull() {
			addCriterion("PARAMETERVALUE is null");
			return (Criteria) this;
		}

		public Criteria andParametervalueIsNotNull() {
			addCriterion("PARAMETERVALUE is not null");
			return (Criteria) this;
		}

		public Criteria andParametervalueEqualTo(String value) {
			addCriterion("PARAMETERVALUE =", value, "parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueNotEqualTo(String value) {
			addCriterion("PARAMETERVALUE <>", value, "parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueGreaterThan(String value) {
			addCriterion("PARAMETERVALUE >", value, "parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueGreaterThanOrEqualTo(String value) {
			addCriterion("PARAMETERVALUE >=", value, "parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueLessThan(String value) {
			addCriterion("PARAMETERVALUE <", value, "parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueLessThanOrEqualTo(String value) {
			addCriterion("PARAMETERVALUE <=", value, "parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueLike(String value) {
			addCriterion("PARAMETERVALUE like", value, "parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueNotLike(String value) {
			addCriterion("PARAMETERVALUE not like", value, "parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueIn(List<String> values) {
			addCriterion("PARAMETERVALUE in", values, "parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueNotIn(List<String> values) {
			addCriterion("PARAMETERVALUE not in", values, "parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueBetween(String value1, String value2) {
			addCriterion("PARAMETERVALUE between", value1, value2,
					"parametervalue");
			return (Criteria) this;
		}

		public Criteria andParametervalueNotBetween(String value1, String value2) {
			addCriterion("PARAMETERVALUE not between", value1, value2,
					"parametervalue");
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
			addCriterion("DATELASTMAINT between", value1, value2,
					"datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDatelastmaintNotBetween(Date value1, Date value2) {
			addCriterion("DATELASTMAINT not between", value1, value2,
					"datelastmaint");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrIsNull() {
			addCriterion("DISPLAYSEQNBR is null");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrIsNotNull() {
			addCriterion("DISPLAYSEQNBR is not null");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrEqualTo(Long value) {
			addCriterion("DISPLAYSEQNBR =", value, "displayseqnbr");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrNotEqualTo(Long value) {
			addCriterion("DISPLAYSEQNBR <>", value, "displayseqnbr");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrGreaterThan(Long value) {
			addCriterion("DISPLAYSEQNBR >", value, "displayseqnbr");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrGreaterThanOrEqualTo(Long value) {
			addCriterion("DISPLAYSEQNBR >=", value, "displayseqnbr");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrLessThan(Long value) {
			addCriterion("DISPLAYSEQNBR <", value, "displayseqnbr");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrLessThanOrEqualTo(Long value) {
			addCriterion("DISPLAYSEQNBR <=", value, "displayseqnbr");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrIn(List<Long> values) {
			addCriterion("DISPLAYSEQNBR in", values, "displayseqnbr");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrNotIn(List<Long> values) {
			addCriterion("DISPLAYSEQNBR not in", values, "displayseqnbr");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrBetween(Long value1, Long value2) {
			addCriterion("DISPLAYSEQNBR between", value1, value2,
					"displayseqnbr");
			return (Criteria) this;
		}

		public Criteria andDisplayseqnbrNotBetween(Long value1, Long value2) {
			addCriterion("DISPLAYSEQNBR not between", value1, value2,
					"displayseqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrIsNull() {
			addCriterion("SEQNBR is null");
			return (Criteria) this;
		}

		public Criteria andSeqnbrIsNotNull() {
			addCriterion("SEQNBR is not null");
			return (Criteria) this;
		}

		public Criteria andSeqnbrEqualTo(Long value) {
			addCriterion("SEQNBR =", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrNotEqualTo(Long value) {
			addCriterion("SEQNBR <>", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrGreaterThan(Long value) {
			addCriterion("SEQNBR >", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrGreaterThanOrEqualTo(Long value) {
			addCriterion("SEQNBR >=", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrLessThan(Long value) {
			addCriterion("SEQNBR <", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrLessThanOrEqualTo(Long value) {
			addCriterion("SEQNBR <=", value, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrIn(List<Long> values) {
			addCriterion("SEQNBR in", values, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrNotIn(List<Long> values) {
			addCriterion("SEQNBR not in", values, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrBetween(Long value1, Long value2) {
			addCriterion("SEQNBR between", value1, value2, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andSeqnbrNotBetween(Long value1, Long value2) {
			addCriterion("SEQNBR not between", value1, value2, "seqnbr");
			return (Criteria) this;
		}

		public Criteria andValuechangeynIsNull() {
			addCriterion("VALUECHANGEYN is null");
			return (Criteria) this;
		}

		public Criteria andValuechangeynIsNotNull() {
			addCriterion("VALUECHANGEYN is not null");
			return (Criteria) this;
		}

		public Criteria andValuechangeynEqualTo(String value) {
			addCriterion("VALUECHANGEYN =", value, "valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynNotEqualTo(String value) {
			addCriterion("VALUECHANGEYN <>", value, "valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynGreaterThan(String value) {
			addCriterion("VALUECHANGEYN >", value, "valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynGreaterThanOrEqualTo(String value) {
			addCriterion("VALUECHANGEYN >=", value, "valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynLessThan(String value) {
			addCriterion("VALUECHANGEYN <", value, "valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynLessThanOrEqualTo(String value) {
			addCriterion("VALUECHANGEYN <=", value, "valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynLike(String value) {
			addCriterion("VALUECHANGEYN like", value, "valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynNotLike(String value) {
			addCriterion("VALUECHANGEYN not like", value, "valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynIn(List<String> values) {
			addCriterion("VALUECHANGEYN in", values, "valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynNotIn(List<String> values) {
			addCriterion("VALUECHANGEYN not in", values, "valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynBetween(String value1, String value2) {
			addCriterion("VALUECHANGEYN between", value1, value2,
					"valuechangeyn");
			return (Criteria) this;
		}

		public Criteria andValuechangeynNotBetween(String value1, String value2) {
			addCriterion("VALUECHANGEYN not between", value1, value2,
					"valuechangeyn");
			return (Criteria) this;
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUEAPPLPARAM
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}