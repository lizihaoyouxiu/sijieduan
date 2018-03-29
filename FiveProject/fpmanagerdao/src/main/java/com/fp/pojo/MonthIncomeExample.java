package com.fp.pojo;

import java.util.ArrayList;
import java.util.List;

public class MonthIncomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonthIncomeExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Long value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Long value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Long value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Long value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Long value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Long value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Long> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Long> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Long value1, Long value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Long value1, Long value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyIsNull() {
            addCriterion("monthnoney is null");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyIsNotNull() {
            addCriterion("monthnoney is not null");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyEqualTo(Double value) {
            addCriterion("monthnoney =", value, "monthnoney");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyNotEqualTo(Double value) {
            addCriterion("monthnoney <>", value, "monthnoney");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyGreaterThan(Double value) {
            addCriterion("monthnoney >", value, "monthnoney");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("monthnoney >=", value, "monthnoney");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyLessThan(Double value) {
            addCriterion("monthnoney <", value, "monthnoney");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyLessThanOrEqualTo(Double value) {
            addCriterion("monthnoney <=", value, "monthnoney");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyIn(List<Double> values) {
            addCriterion("monthnoney in", values, "monthnoney");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyNotIn(List<Double> values) {
            addCriterion("monthnoney not in", values, "monthnoney");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyBetween(Double value1, Double value2) {
            addCriterion("monthnoney between", value1, value2, "monthnoney");
            return (Criteria) this;
        }

        public Criteria andMonthnoneyNotBetween(Double value1, Double value2) {
            addCriterion("monthnoney not between", value1, value2, "monthnoney");
            return (Criteria) this;
        }

        public Criteria andAllwagesIsNull() {
            addCriterion("allwages is null");
            return (Criteria) this;
        }

        public Criteria andAllwagesIsNotNull() {
            addCriterion("allwages is not null");
            return (Criteria) this;
        }

        public Criteria andAllwagesEqualTo(Double value) {
            addCriterion("allwages =", value, "allwages");
            return (Criteria) this;
        }

        public Criteria andAllwagesNotEqualTo(Double value) {
            addCriterion("allwages <>", value, "allwages");
            return (Criteria) this;
        }

        public Criteria andAllwagesGreaterThan(Double value) {
            addCriterion("allwages >", value, "allwages");
            return (Criteria) this;
        }

        public Criteria andAllwagesGreaterThanOrEqualTo(Double value) {
            addCriterion("allwages >=", value, "allwages");
            return (Criteria) this;
        }

        public Criteria andAllwagesLessThan(Double value) {
            addCriterion("allwages <", value, "allwages");
            return (Criteria) this;
        }

        public Criteria andAllwagesLessThanOrEqualTo(Double value) {
            addCriterion("allwages <=", value, "allwages");
            return (Criteria) this;
        }

        public Criteria andAllwagesIn(List<Double> values) {
            addCriterion("allwages in", values, "allwages");
            return (Criteria) this;
        }

        public Criteria andAllwagesNotIn(List<Double> values) {
            addCriterion("allwages not in", values, "allwages");
            return (Criteria) this;
        }

        public Criteria andAllwagesBetween(Double value1, Double value2) {
            addCriterion("allwages between", value1, value2, "allwages");
            return (Criteria) this;
        }

        public Criteria andAllwagesNotBetween(Double value1, Double value2) {
            addCriterion("allwages not between", value1, value2, "allwages");
            return (Criteria) this;
        }

        public Criteria andAllmoneyIsNull() {
            addCriterion("allmoney is null");
            return (Criteria) this;
        }

        public Criteria andAllmoneyIsNotNull() {
            addCriterion("allmoney is not null");
            return (Criteria) this;
        }

        public Criteria andAllmoneyEqualTo(Double value) {
            addCriterion("allmoney =", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotEqualTo(Double value) {
            addCriterion("allmoney <>", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyGreaterThan(Double value) {
            addCriterion("allmoney >", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("allmoney >=", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyLessThan(Double value) {
            addCriterion("allmoney <", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyLessThanOrEqualTo(Double value) {
            addCriterion("allmoney <=", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyIn(List<Double> values) {
            addCriterion("allmoney in", values, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotIn(List<Double> values) {
            addCriterion("allmoney not in", values, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyBetween(Double value1, Double value2) {
            addCriterion("allmoney between", value1, value2, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotBetween(Double value1, Double value2) {
            addCriterion("allmoney not between", value1, value2, "allmoney");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Long value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Long value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Long value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Long value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Long value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Long value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Long> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Long> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Long value1, Long value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Long value1, Long value2) {
            addCriterion("bid not between", value1, value2, "bid");
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