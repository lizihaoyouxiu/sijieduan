package com.fp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Double value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Double value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Double value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Double value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Double value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Double value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Double> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Double> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Double value1, Double value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Double value1, Double value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNull() {
            addCriterion("employee_gender is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNotNull() {
            addCriterion("employee_gender is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderEqualTo(String value) {
            addCriterion("employee_gender =", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotEqualTo(String value) {
            addCriterion("employee_gender <>", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThan(String value) {
            addCriterion("employee_gender >", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThanOrEqualTo(String value) {
            addCriterion("employee_gender >=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThan(String value) {
            addCriterion("employee_gender <", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThanOrEqualTo(String value) {
            addCriterion("employee_gender <=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLike(String value) {
            addCriterion("employee_gender like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotLike(String value) {
            addCriterion("employee_gender not like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIn(List<String> values) {
            addCriterion("employee_gender in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotIn(List<String> values) {
            addCriterion("employee_gender not in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderBetween(String value1, String value2) {
            addCriterion("employee_gender between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotBetween(String value1, String value2) {
            addCriterion("employee_gender not between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthIsNull() {
            addCriterion("employee_birth is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthIsNotNull() {
            addCriterion("employee_birth is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthEqualTo(Date value) {
            addCriterion("employee_birth =", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthNotEqualTo(Date value) {
            addCriterion("employee_birth <>", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthGreaterThan(Date value) {
            addCriterion("employee_birth >", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_birth >=", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthLessThan(Date value) {
            addCriterion("employee_birth <", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthLessThanOrEqualTo(Date value) {
            addCriterion("employee_birth <=", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthIn(List<Date> values) {
            addCriterion("employee_birth in", values, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthNotIn(List<Date> values) {
            addCriterion("employee_birth not in", values, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthBetween(Date value1, Date value2) {
            addCriterion("employee_birth between", value1, value2, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthNotBetween(Date value1, Date value2) {
            addCriterion("employee_birth not between", value1, value2, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardIsNull() {
            addCriterion("employee_ID_card is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardIsNotNull() {
            addCriterion("employee_ID_card is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardEqualTo(String value) {
            addCriterion("employee_ID_card =", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardNotEqualTo(String value) {
            addCriterion("employee_ID_card <>", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardGreaterThan(String value) {
            addCriterion("employee_ID_card >", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("employee_ID_card >=", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardLessThan(String value) {
            addCriterion("employee_ID_card <", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardLessThanOrEqualTo(String value) {
            addCriterion("employee_ID_card <=", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardLike(String value) {
            addCriterion("employee_ID_card like", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardNotLike(String value) {
            addCriterion("employee_ID_card not like", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardIn(List<String> values) {
            addCriterion("employee_ID_card in", values, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardNotIn(List<String> values) {
            addCriterion("employee_ID_card not in", values, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardBetween(String value1, String value2) {
            addCriterion("employee_ID_card between", value1, value2, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardNotBetween(String value1, String value2) {
            addCriterion("employee_ID_card not between", value1, value2, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceIsNull() {
            addCriterion("employee_native_place is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceIsNotNull() {
            addCriterion("employee_native_place is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceEqualTo(String value) {
            addCriterion("employee_native_place =", value, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceNotEqualTo(String value) {
            addCriterion("employee_native_place <>", value, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceGreaterThan(String value) {
            addCriterion("employee_native_place >", value, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("employee_native_place >=", value, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceLessThan(String value) {
            addCriterion("employee_native_place <", value, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("employee_native_place <=", value, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceLike(String value) {
            addCriterion("employee_native_place like", value, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceNotLike(String value) {
            addCriterion("employee_native_place not like", value, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceIn(List<String> values) {
            addCriterion("employee_native_place in", values, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceNotIn(List<String> values) {
            addCriterion("employee_native_place not in", values, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceBetween(String value1, String value2) {
            addCriterion("employee_native_place between", value1, value2, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeNativePlaceNotBetween(String value1, String value2) {
            addCriterion("employee_native_place not between", value1, value2, "employeeNativePlace");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentIsNull() {
            addCriterion("employee_department is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentIsNotNull() {
            addCriterion("employee_department is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentEqualTo(String value) {
            addCriterion("employee_department =", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentNotEqualTo(String value) {
            addCriterion("employee_department <>", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentGreaterThan(String value) {
            addCriterion("employee_department >", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("employee_department >=", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentLessThan(String value) {
            addCriterion("employee_department <", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentLessThanOrEqualTo(String value) {
            addCriterion("employee_department <=", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentLike(String value) {
            addCriterion("employee_department like", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentNotLike(String value) {
            addCriterion("employee_department not like", value, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentIn(List<String> values) {
            addCriterion("employee_department in", values, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentNotIn(List<String> values) {
            addCriterion("employee_department not in", values, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentBetween(String value1, String value2) {
            addCriterion("employee_department between", value1, value2, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeDepartmentNotBetween(String value1, String value2) {
            addCriterion("employee_department not between", value1, value2, "employeeDepartment");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelIsNull() {
            addCriterion("employee_tel is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelIsNotNull() {
            addCriterion("employee_tel is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelEqualTo(Double value) {
            addCriterion("employee_tel =", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotEqualTo(Double value) {
            addCriterion("employee_tel <>", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelGreaterThan(Double value) {
            addCriterion("employee_tel >", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelGreaterThanOrEqualTo(Double value) {
            addCriterion("employee_tel >=", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelLessThan(Double value) {
            addCriterion("employee_tel <", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelLessThanOrEqualTo(Double value) {
            addCriterion("employee_tel <=", value, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelIn(List<Double> values) {
            addCriterion("employee_tel in", values, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotIn(List<Double> values) {
            addCriterion("employee_tel not in", values, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelBetween(Double value1, Double value2) {
            addCriterion("employee_tel between", value1, value2, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelNotBetween(Double value1, Double value2) {
            addCriterion("employee_tel not between", value1, value2, "employeeTel");
            return (Criteria) this;
        }

        public Criteria andEmployeePostIsNull() {
            addCriterion("employee_post is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePostIsNotNull() {
            addCriterion("employee_post is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePostEqualTo(String value) {
            addCriterion("employee_post =", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostNotEqualTo(String value) {
            addCriterion("employee_post <>", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostGreaterThan(String value) {
            addCriterion("employee_post >", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostGreaterThanOrEqualTo(String value) {
            addCriterion("employee_post >=", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostLessThan(String value) {
            addCriterion("employee_post <", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostLessThanOrEqualTo(String value) {
            addCriterion("employee_post <=", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostLike(String value) {
            addCriterion("employee_post like", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostNotLike(String value) {
            addCriterion("employee_post not like", value, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostIn(List<String> values) {
            addCriterion("employee_post in", values, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostNotIn(List<String> values) {
            addCriterion("employee_post not in", values, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostBetween(String value1, String value2) {
            addCriterion("employee_post between", value1, value2, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeePostNotBetween(String value1, String value2) {
            addCriterion("employee_post not between", value1, value2, "employeePost");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeIsNull() {
            addCriterion("employee_entrytime is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeIsNotNull() {
            addCriterion("employee_entrytime is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeEqualTo(Date value) {
            addCriterion("employee_entrytime =", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeNotEqualTo(Date value) {
            addCriterion("employee_entrytime <>", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeGreaterThan(Date value) {
            addCriterion("employee_entrytime >", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_entrytime >=", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeLessThan(Date value) {
            addCriterion("employee_entrytime <", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeLessThanOrEqualTo(Date value) {
            addCriterion("employee_entrytime <=", value, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeIn(List<Date> values) {
            addCriterion("employee_entrytime in", values, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeNotIn(List<Date> values) {
            addCriterion("employee_entrytime not in", values, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeBetween(Date value1, Date value2) {
            addCriterion("employee_entrytime between", value1, value2, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrytimeNotBetween(Date value1, Date value2) {
            addCriterion("employee_entrytime not between", value1, value2, "employeeEntrytime");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageIsNull() {
            addCriterion("employee_wage is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageIsNotNull() {
            addCriterion("employee_wage is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageEqualTo(Double value) {
            addCriterion("employee_wage =", value, "employeeWage");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageNotEqualTo(Double value) {
            addCriterion("employee_wage <>", value, "employeeWage");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageGreaterThan(Double value) {
            addCriterion("employee_wage >", value, "employeeWage");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageGreaterThanOrEqualTo(Double value) {
            addCriterion("employee_wage >=", value, "employeeWage");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageLessThan(Double value) {
            addCriterion("employee_wage <", value, "employeeWage");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageLessThanOrEqualTo(Double value) {
            addCriterion("employee_wage <=", value, "employeeWage");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageIn(List<Double> values) {
            addCriterion("employee_wage in", values, "employeeWage");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageNotIn(List<Double> values) {
            addCriterion("employee_wage not in", values, "employeeWage");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageBetween(Double value1, Double value2) {
            addCriterion("employee_wage between", value1, value2, "employeeWage");
            return (Criteria) this;
        }

        public Criteria andEmployeeWageNotBetween(Double value1, Double value2) {
            addCriterion("employee_wage not between", value1, value2, "employeeWage");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkIsNull() {
            addCriterion("employee_remark is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkIsNotNull() {
            addCriterion("employee_remark is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkEqualTo(String value) {
            addCriterion("employee_remark =", value, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkNotEqualTo(String value) {
            addCriterion("employee_remark <>", value, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkGreaterThan(String value) {
            addCriterion("employee_remark >", value, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("employee_remark >=", value, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkLessThan(String value) {
            addCriterion("employee_remark <", value, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkLessThanOrEqualTo(String value) {
            addCriterion("employee_remark <=", value, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkLike(String value) {
            addCriterion("employee_remark like", value, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkNotLike(String value) {
            addCriterion("employee_remark not like", value, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkIn(List<String> values) {
            addCriterion("employee_remark in", values, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkNotIn(List<String> values) {
            addCriterion("employee_remark not in", values, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkBetween(String value1, String value2) {
            addCriterion("employee_remark between", value1, value2, "employeeRemark");
            return (Criteria) this;
        }

        public Criteria andEmployeeRemarkNotBetween(String value1, String value2) {
            addCriterion("employee_remark not between", value1, value2, "employeeRemark");
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