package com.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("CUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("CUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("CUS_NAME =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("CUS_NAME <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("CUS_NAME >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_NAME >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("CUS_NAME <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("CUS_NAME <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("CUS_NAME like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("CUS_NAME not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("CUS_NAME in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("CUS_NAME not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("CUS_NAME between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("CUS_NAME not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayIsNull() {
            addCriterion("CUS_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayIsNotNull() {
            addCriterion("CUS_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("CUS_BIRTHDAY =", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("CUS_BIRTHDAY <>", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("CUS_BIRTHDAY >", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CUS_BIRTHDAY >=", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("CUS_BIRTHDAY <", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CUS_BIRTHDAY <=", value, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("CUS_BIRTHDAY in", values, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("CUS_BIRTHDAY not in", values, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CUS_BIRTHDAY between", value1, value2, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CUS_BIRTHDAY not between", value1, value2, "cusBirthday");
            return (Criteria) this;
        }

        public Criteria andCusPhoneIsNull() {
            addCriterion("CUS_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCusPhoneIsNotNull() {
            addCriterion("CUS_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCusPhoneEqualTo(String value) {
            addCriterion("CUS_PHONE =", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotEqualTo(String value) {
            addCriterion("CUS_PHONE <>", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneGreaterThan(String value) {
            addCriterion("CUS_PHONE >", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_PHONE >=", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneLessThan(String value) {
            addCriterion("CUS_PHONE <", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneLessThanOrEqualTo(String value) {
            addCriterion("CUS_PHONE <=", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneLike(String value) {
            addCriterion("CUS_PHONE like", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotLike(String value) {
            addCriterion("CUS_PHONE not like", value, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneIn(List<String> values) {
            addCriterion("CUS_PHONE in", values, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotIn(List<String> values) {
            addCriterion("CUS_PHONE not in", values, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneBetween(String value1, String value2) {
            addCriterion("CUS_PHONE between", value1, value2, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusPhoneNotBetween(String value1, String value2) {
            addCriterion("CUS_PHONE not between", value1, value2, "cusPhone");
            return (Criteria) this;
        }

        public Criteria andCusStatusIsNull() {
            addCriterion("CUS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCusStatusIsNotNull() {
            addCriterion("CUS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCusStatusEqualTo(String value) {
            addCriterion("CUS_STATUS =", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotEqualTo(String value) {
            addCriterion("CUS_STATUS <>", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusGreaterThan(String value) {
            addCriterion("CUS_STATUS >", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_STATUS >=", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusLessThan(String value) {
            addCriterion("CUS_STATUS <", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusLessThanOrEqualTo(String value) {
            addCriterion("CUS_STATUS <=", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusLike(String value) {
            addCriterion("CUS_STATUS like", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotLike(String value) {
            addCriterion("CUS_STATUS not like", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusIn(List<String> values) {
            addCriterion("CUS_STATUS in", values, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotIn(List<String> values) {
            addCriterion("CUS_STATUS not in", values, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusBetween(String value1, String value2) {
            addCriterion("CUS_STATUS between", value1, value2, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotBetween(String value1, String value2) {
            addCriterion("CUS_STATUS not between", value1, value2, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusAddressIsNull() {
            addCriterion("CUS_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCusAddressIsNotNull() {
            addCriterion("CUS_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCusAddressEqualTo(String value) {
            addCriterion("CUS_ADDRESS =", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotEqualTo(String value) {
            addCriterion("CUS_ADDRESS <>", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressGreaterThan(String value) {
            addCriterion("CUS_ADDRESS >", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_ADDRESS >=", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressLessThan(String value) {
            addCriterion("CUS_ADDRESS <", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressLessThanOrEqualTo(String value) {
            addCriterion("CUS_ADDRESS <=", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressLike(String value) {
            addCriterion("CUS_ADDRESS like", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotLike(String value) {
            addCriterion("CUS_ADDRESS not like", value, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressIn(List<String> values) {
            addCriterion("CUS_ADDRESS in", values, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotIn(List<String> values) {
            addCriterion("CUS_ADDRESS not in", values, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressBetween(String value1, String value2) {
            addCriterion("CUS_ADDRESS between", value1, value2, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andCusAddressNotBetween(String value1, String value2) {
            addCriterion("CUS_ADDRESS not between", value1, value2, "cusAddress");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCusTypeIsNull() {
            addCriterion("CUS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCusTypeIsNotNull() {
            addCriterion("CUS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCusTypeEqualTo(String value) {
            addCriterion("CUS_TYPE =", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotEqualTo(String value) {
            addCriterion("CUS_TYPE <>", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeGreaterThan(String value) {
            addCriterion("CUS_TYPE >", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_TYPE >=", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeLessThan(String value) {
            addCriterion("CUS_TYPE <", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeLessThanOrEqualTo(String value) {
            addCriterion("CUS_TYPE <=", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeLike(String value) {
            addCriterion("CUS_TYPE like", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotLike(String value) {
            addCriterion("CUS_TYPE not like", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeIn(List<String> values) {
            addCriterion("CUS_TYPE in", values, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotIn(List<String> values) {
            addCriterion("CUS_TYPE not in", values, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeBetween(String value1, String value2) {
            addCriterion("CUS_TYPE between", value1, value2, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotBetween(String value1, String value2) {
            addCriterion("CUS_TYPE not between", value1, value2, "cusType");
            return (Criteria) this;
        }
        
        
        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("GROUP_ID like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("GROUP_ID not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
            return (Criteria) this;
        }
        
        
        public Criteria andBusTypeIsNull() {
            addCriterion("BUS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusTypeIsNotNull() {
            addCriterion("BUS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusTypeEqualTo(String value) {
            addCriterion("BUS_TYPE =", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotEqualTo(String value) {
            addCriterion("BUS_TYPE <>", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeGreaterThan(String value) {
            addCriterion("BUS_TYPE >", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_TYPE >=", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeLessThan(String value) {
            addCriterion("BUS_TYPE <", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeLessThanOrEqualTo(String value) {
            addCriterion("BUS_TYPE <=", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeLike(String value) {
            addCriterion("BUS_TYPE like", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotLike(String value) {
            addCriterion("BUS_TYPE not like", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeIn(List<String> values) {
            addCriterion("BUS_TYPE in", values, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotIn(List<String> values) {
            addCriterion("BUS_TYPE not in", values, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeBetween(String value1, String value2) {
            addCriterion("BUS_TYPE between", value1, value2, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotBetween(String value1, String value2) {
            addCriterion("BUS_TYPE not between", value1, value2, "busType");
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