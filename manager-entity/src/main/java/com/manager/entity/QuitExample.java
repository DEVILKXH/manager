package com.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuitExample() {
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

        public Criteria andQuitReasonIsNull() {
            addCriterion("QUIT_REASON is null");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIsNotNull() {
            addCriterion("QUIT_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andQuitReasonEqualTo(String value) {
            addCriterion("QUIT_REASON =", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotEqualTo(String value) {
            addCriterion("QUIT_REASON <>", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonGreaterThan(String value) {
            addCriterion("QUIT_REASON >", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonGreaterThanOrEqualTo(String value) {
            addCriterion("QUIT_REASON >=", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLessThan(String value) {
            addCriterion("QUIT_REASON <", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLessThanOrEqualTo(String value) {
            addCriterion("QUIT_REASON <=", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLike(String value) {
            addCriterion("QUIT_REASON like", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotLike(String value) {
            addCriterion("QUIT_REASON not like", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIn(List<String> values) {
            addCriterion("QUIT_REASON in", values, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotIn(List<String> values) {
            addCriterion("QUIT_REASON not in", values, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonBetween(String value1, String value2) {
            addCriterion("QUIT_REASON between", value1, value2, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotBetween(String value1, String value2) {
            addCriterion("QUIT_REASON not between", value1, value2, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitTimeIsNull() {
            addCriterion("QUIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andQuitTimeIsNotNull() {
            addCriterion("QUIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andQuitTimeEqualTo(Date value) {
            addCriterion("QUIT_TIME =", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeNotEqualTo(Date value) {
            addCriterion("QUIT_TIME <>", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeGreaterThan(Date value) {
            addCriterion("QUIT_TIME >", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("QUIT_TIME >=", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeLessThan(Date value) {
            addCriterion("QUIT_TIME <", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeLessThanOrEqualTo(Date value) {
            addCriterion("QUIT_TIME <=", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeIn(List<Date> values) {
            addCriterion("QUIT_TIME in", values, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeNotIn(List<Date> values) {
            addCriterion("QUIT_TIME not in", values, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeBetween(Date value1, Date value2) {
            addCriterion("QUIT_TIME between", value1, value2, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeNotBetween(Date value1, Date value2) {
            addCriterion("QUIT_TIME not between", value1, value2, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveIsNull() {
            addCriterion("QUIT_IS_SAVE is null");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveIsNotNull() {
            addCriterion("QUIT_IS_SAVE is not null");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveEqualTo(String value) {
            addCriterion("QUIT_IS_SAVE =", value, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveNotEqualTo(String value) {
            addCriterion("QUIT_IS_SAVE <>", value, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveGreaterThan(String value) {
            addCriterion("QUIT_IS_SAVE >", value, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveGreaterThanOrEqualTo(String value) {
            addCriterion("QUIT_IS_SAVE >=", value, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveLessThan(String value) {
            addCriterion("QUIT_IS_SAVE <", value, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveLessThanOrEqualTo(String value) {
            addCriterion("QUIT_IS_SAVE <=", value, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveLike(String value) {
            addCriterion("QUIT_IS_SAVE like", value, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveNotLike(String value) {
            addCriterion("QUIT_IS_SAVE not like", value, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveIn(List<String> values) {
            addCriterion("QUIT_IS_SAVE in", values, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveNotIn(List<String> values) {
            addCriterion("QUIT_IS_SAVE not in", values, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveBetween(String value1, String value2) {
            addCriterion("QUIT_IS_SAVE between", value1, value2, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsSaveNotBetween(String value1, String value2) {
            addCriterion("QUIT_IS_SAVE not between", value1, value2, "quitIsSave");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeIsNull() {
            addCriterion("QUIT_IS_AGREE is null");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeIsNotNull() {
            addCriterion("QUIT_IS_AGREE is not null");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeEqualTo(String value) {
            addCriterion("QUIT_IS_AGREE =", value, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeNotEqualTo(String value) {
            addCriterion("QUIT_IS_AGREE <>", value, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeGreaterThan(String value) {
            addCriterion("QUIT_IS_AGREE >", value, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("QUIT_IS_AGREE >=", value, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeLessThan(String value) {
            addCriterion("QUIT_IS_AGREE <", value, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeLessThanOrEqualTo(String value) {
            addCriterion("QUIT_IS_AGREE <=", value, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeLike(String value) {
            addCriterion("QUIT_IS_AGREE like", value, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeNotLike(String value) {
            addCriterion("QUIT_IS_AGREE not like", value, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeIn(List<String> values) {
            addCriterion("QUIT_IS_AGREE in", values, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeNotIn(List<String> values) {
            addCriterion("QUIT_IS_AGREE not in", values, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeBetween(String value1, String value2) {
            addCriterion("QUIT_IS_AGREE between", value1, value2, "quitIsAgree");
            return (Criteria) this;
        }

        public Criteria andQuitIsAgreeNotBetween(String value1, String value2) {
            addCriterion("QUIT_IS_AGREE not between", value1, value2, "quitIsAgree");
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