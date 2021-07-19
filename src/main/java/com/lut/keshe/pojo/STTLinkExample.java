package com.lut.keshe.pojo;

import java.util.ArrayList;
import java.util.List;

public class STTLinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public STTLinkExample() {
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

        public Criteria andStudentIDIsNull() {
            addCriterion("StudentID is null");
            return (Criteria) this;
        }

        public Criteria andStudentIDIsNotNull() {
            addCriterion("StudentID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIDEqualTo(Integer value) {
            addCriterion("StudentID =", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDNotEqualTo(Integer value) {
            addCriterion("StudentID <>", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDGreaterThan(Integer value) {
            addCriterion("StudentID >", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("StudentID >=", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDLessThan(Integer value) {
            addCriterion("StudentID <", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDLessThanOrEqualTo(Integer value) {
            addCriterion("StudentID <=", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDIn(List<Integer> values) {
            addCriterion("StudentID in", values, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDNotIn(List<Integer> values) {
            addCriterion("StudentID not in", values, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDBetween(Integer value1, Integer value2) {
            addCriterion("StudentID between", value1, value2, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("StudentID not between", value1, value2, "studentID");
            return (Criteria) this;
        }

        public Criteria andTimuNameIsNull() {
            addCriterion("TimuName is null");
            return (Criteria) this;
        }

        public Criteria andTimuNameIsNotNull() {
            addCriterion("TimuName is not null");
            return (Criteria) this;
        }

        public Criteria andTimuNameEqualTo(String value) {
            addCriterion("TimuName =", value, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameNotEqualTo(String value) {
            addCriterion("TimuName <>", value, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameGreaterThan(String value) {
            addCriterion("TimuName >", value, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameGreaterThanOrEqualTo(String value) {
            addCriterion("TimuName >=", value, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameLessThan(String value) {
            addCriterion("TimuName <", value, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameLessThanOrEqualTo(String value) {
            addCriterion("TimuName <=", value, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameLike(String value) {
            addCriterion("TimuName like", value, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameNotLike(String value) {
            addCriterion("TimuName not like", value, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameIn(List<String> values) {
            addCriterion("TimuName in", values, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameNotIn(List<String> values) {
            addCriterion("TimuName not in", values, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameBetween(String value1, String value2) {
            addCriterion("TimuName between", value1, value2, "timuName");
            return (Criteria) this;
        }

        public Criteria andTimuNameNotBetween(String value1, String value2) {
            addCriterion("TimuName not between", value1, value2, "timuName");
            return (Criteria) this;
        }

        public Criteria andTeacherIDIsNull() {
            addCriterion("TeacherID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIDIsNotNull() {
            addCriterion("TeacherID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIDEqualTo(Integer value) {
            addCriterion("TeacherID =", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDNotEqualTo(Integer value) {
            addCriterion("TeacherID <>", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDGreaterThan(Integer value) {
            addCriterion("TeacherID >", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("TeacherID >=", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDLessThan(Integer value) {
            addCriterion("TeacherID <", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDLessThanOrEqualTo(Integer value) {
            addCriterion("TeacherID <=", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDIn(List<Integer> values) {
            addCriterion("TeacherID in", values, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDNotIn(List<Integer> values) {
            addCriterion("TeacherID not in", values, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDBetween(Integer value1, Integer value2) {
            addCriterion("TeacherID between", value1, value2, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDNotBetween(Integer value1, Integer value2) {
            addCriterion("TeacherID not between", value1, value2, "teacherID");
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