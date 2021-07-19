package com.lut.keshe.pojo;

import java.util.ArrayList;
import java.util.List;

public class TimuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimuExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTimunatureIsNull() {
            addCriterion("timunature is null");
            return (Criteria) this;
        }

        public Criteria andTimunatureIsNotNull() {
            addCriterion("timunature is not null");
            return (Criteria) this;
        }

        public Criteria andTimunatureEqualTo(String value) {
            addCriterion("timunature =", value, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureNotEqualTo(String value) {
            addCriterion("timunature <>", value, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureGreaterThan(String value) {
            addCriterion("timunature >", value, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureGreaterThanOrEqualTo(String value) {
            addCriterion("timunature >=", value, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureLessThan(String value) {
            addCriterion("timunature <", value, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureLessThanOrEqualTo(String value) {
            addCriterion("timunature <=", value, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureLike(String value) {
            addCriterion("timunature like", value, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureNotLike(String value) {
            addCriterion("timunature not like", value, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureIn(List<String> values) {
            addCriterion("timunature in", values, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureNotIn(List<String> values) {
            addCriterion("timunature not in", values, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureBetween(String value1, String value2) {
            addCriterion("timunature between", value1, value2, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimunatureNotBetween(String value1, String value2) {
            addCriterion("timunature not between", value1, value2, "timunature");
            return (Criteria) this;
        }

        public Criteria andTimutypeIsNull() {
            addCriterion("timutype is null");
            return (Criteria) this;
        }

        public Criteria andTimutypeIsNotNull() {
            addCriterion("timutype is not null");
            return (Criteria) this;
        }

        public Criteria andTimutypeEqualTo(String value) {
            addCriterion("timutype =", value, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeNotEqualTo(String value) {
            addCriterion("timutype <>", value, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeGreaterThan(String value) {
            addCriterion("timutype >", value, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeGreaterThanOrEqualTo(String value) {
            addCriterion("timutype >=", value, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeLessThan(String value) {
            addCriterion("timutype <", value, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeLessThanOrEqualTo(String value) {
            addCriterion("timutype <=", value, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeLike(String value) {
            addCriterion("timutype like", value, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeNotLike(String value) {
            addCriterion("timutype not like", value, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeIn(List<String> values) {
            addCriterion("timutype in", values, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeNotIn(List<String> values) {
            addCriterion("timutype not in", values, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeBetween(String value1, String value2) {
            addCriterion("timutype between", value1, value2, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimutypeNotBetween(String value1, String value2) {
            addCriterion("timutype not between", value1, value2, "timutype");
            return (Criteria) this;
        }

        public Criteria andTimusourceIsNull() {
            addCriterion("timusource is null");
            return (Criteria) this;
        }

        public Criteria andTimusourceIsNotNull() {
            addCriterion("timusource is not null");
            return (Criteria) this;
        }

        public Criteria andTimusourceEqualTo(Integer value) {
            addCriterion("timusource =", value, "timusource");
            return (Criteria) this;
        }

        public Criteria andTimusourceNotEqualTo(Integer value) {
            addCriterion("timusource <>", value, "timusource");
            return (Criteria) this;
        }

        public Criteria andTimusourceGreaterThan(Integer value) {
            addCriterion("timusource >", value, "timusource");
            return (Criteria) this;
        }

        public Criteria andTimusourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("timusource >=", value, "timusource");
            return (Criteria) this;
        }

        public Criteria andTimusourceLessThan(Integer value) {
            addCriterion("timusource <", value, "timusource");
            return (Criteria) this;
        }

        public Criteria andTimusourceLessThanOrEqualTo(Integer value) {
            addCriterion("timusource <=", value, "timusource");
            return (Criteria) this;
        }

        public Criteria andTimusourceIn(List<Integer> values) {
            addCriterion("timusource in", values, "timusource");
            return (Criteria) this;
        }

        public Criteria andTimusourceNotIn(List<Integer> values) {
            addCriterion("timusource not in", values, "timusource");
            return (Criteria) this;
        }

        public Criteria andTimusourceBetween(Integer value1, Integer value2) {
            addCriterion("timusource between", value1, value2, "timusource");
            return (Criteria) this;
        }

        public Criteria andTimusourceNotBetween(Integer value1, Integer value2) {
            addCriterion("timusource not between", value1, value2, "timusource");
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