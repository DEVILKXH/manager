package com.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpanseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpanseExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonIsNull() {
            addCriterion("EXPANSE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonIsNotNull() {
            addCriterion("EXPANSE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonEqualTo(String value) {
            addCriterion("EXPANSE_REASON =", value, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonNotEqualTo(String value) {
            addCriterion("EXPANSE_REASON <>", value, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonGreaterThan(String value) {
            addCriterion("EXPANSE_REASON >", value, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("EXPANSE_REASON >=", value, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonLessThan(String value) {
            addCriterion("EXPANSE_REASON <", value, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonLessThanOrEqualTo(String value) {
            addCriterion("EXPANSE_REASON <=", value, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonLike(String value) {
            addCriterion("EXPANSE_REASON like", value, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonNotLike(String value) {
            addCriterion("EXPANSE_REASON not like", value, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonIn(List<String> values) {
            addCriterion("EXPANSE_REASON in", values, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonNotIn(List<String> values) {
            addCriterion("EXPANSE_REASON not in", values, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonBetween(String value1, String value2) {
            addCriterion("EXPANSE_REASON between", value1, value2, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseReasonNotBetween(String value1, String value2) {
            addCriterion("EXPANSE_REASON not between", value1, value2, "expanseReason");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeIsNull() {
            addCriterion("EXPANSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeIsNotNull() {
            addCriterion("EXPANSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeEqualTo(Date value) {
            addCriterion("EXPANSE_TIME =", value, "expanseTime");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeNotEqualTo(Date value) {
            addCriterion("EXPANSE_TIME <>", value, "expanseTime");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeGreaterThan(Date value) {
            addCriterion("EXPANSE_TIME >", value, "expanseTime");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPANSE_TIME >=", value, "expanseTime");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeLessThan(Date value) {
            addCriterion("EXPANSE_TIME <", value, "expanseTime");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXPANSE_TIME <=", value, "expanseTime");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeIn(List<Date> values) {
            addCriterion("EXPANSE_TIME in", values, "expanseTime");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeNotIn(List<Date> values) {
            addCriterion("EXPANSE_TIME not in", values, "expanseTime");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeBetween(Date value1, Date value2) {
            addCriterion("EXPANSE_TIME between", value1, value2, "expanseTime");
            return (Criteria) this;
        }

        public Criteria andExpanseTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXPANSE_TIME not between", value1, value2, "expanseTime");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyIsNull() {
            addCriterion("EXPANSE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyIsNotNull() {
            addCriterion("EXPANSE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyEqualTo(String value) {
            addCriterion("EXPANSE_MONEY =", value, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyNotEqualTo(String value) {
            addCriterion("EXPANSE_MONEY <>", value, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyGreaterThan(String value) {
            addCriterion("EXPANSE_MONEY >", value, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("EXPANSE_MONEY >=", value, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyLessThan(String value) {
            addCriterion("EXPANSE_MONEY <", value, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyLessThanOrEqualTo(String value) {
            addCriterion("EXPANSE_MONEY <=", value, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyLike(String value) {
            addCriterion("EXPANSE_MONEY like", value, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyNotLike(String value) {
            addCriterion("EXPANSE_MONEY not like", value, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyIn(List<String> values) {
            addCriterion("EXPANSE_MONEY in", values, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyNotIn(List<String> values) {
            addCriterion("EXPANSE_MONEY not in", values, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyBetween(String value1, String value2) {
            addCriterion("EXPANSE_MONEY between", value1, value2, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andExpanseMoneyNotBetween(String value1, String value2) {
            addCriterion("EXPANSE_MONEY not between", value1, value2, "expanseMoney");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
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