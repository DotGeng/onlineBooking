package cn.cqupt.onlinebooking.po;

import java.util.ArrayList;
import java.util.List;

public class ClassroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassroomExample() {
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

        public Criteria andClassroomidIsNull() {
            addCriterion("classroomID is null");
            return (Criteria) this;
        }

        public Criteria andClassroomidIsNotNull() {
            addCriterion("classroomID is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomidEqualTo(Integer value) {
            addCriterion("classroomID =", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidNotEqualTo(Integer value) {
            addCriterion("classroomID <>", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidGreaterThan(Integer value) {
            addCriterion("classroomID >", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroomID >=", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidLessThan(Integer value) {
            addCriterion("classroomID <", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidLessThanOrEqualTo(Integer value) {
            addCriterion("classroomID <=", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidIn(List<Integer> values) {
            addCriterion("classroomID in", values, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidNotIn(List<Integer> values) {
            addCriterion("classroomID not in", values, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidBetween(Integer value1, Integer value2) {
            addCriterion("classroomID between", value1, value2, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidNotBetween(Integer value1, Integer value2) {
            addCriterion("classroomID not between", value1, value2, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomnameIsNull() {
            addCriterion("classroomName is null");
            return (Criteria) this;
        }

        public Criteria andClassroomnameIsNotNull() {
            addCriterion("classroomName is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomnameEqualTo(String value) {
            addCriterion("classroomName =", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameNotEqualTo(String value) {
            addCriterion("classroomName <>", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameGreaterThan(String value) {
            addCriterion("classroomName >", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameGreaterThanOrEqualTo(String value) {
            addCriterion("classroomName >=", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameLessThan(String value) {
            addCriterion("classroomName <", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameLessThanOrEqualTo(String value) {
            addCriterion("classroomName <=", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameLike(String value) {
            addCriterion("classroomName like", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameNotLike(String value) {
            addCriterion("classroomName not like", value, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameIn(List<String> values) {
            addCriterion("classroomName in", values, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameNotIn(List<String> values) {
            addCriterion("classroomName not in", values, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameBetween(String value1, String value2) {
            addCriterion("classroomName between", value1, value2, "classroomname");
            return (Criteria) this;
        }

        public Criteria andClassroomnameNotBetween(String value1, String value2) {
            addCriterion("classroomName not between", value1, value2, "classroomname");
            return (Criteria) this;
        }

        public Criteria andMaxsizeIsNull() {
            addCriterion("maxSize is null");
            return (Criteria) this;
        }

        public Criteria andMaxsizeIsNotNull() {
            addCriterion("maxSize is not null");
            return (Criteria) this;
        }

        public Criteria andMaxsizeEqualTo(Integer value) {
            addCriterion("maxSize =", value, "maxsize");
            return (Criteria) this;
        }

        public Criteria andMaxsizeNotEqualTo(Integer value) {
            addCriterion("maxSize <>", value, "maxsize");
            return (Criteria) this;
        }

        public Criteria andMaxsizeGreaterThan(Integer value) {
            addCriterion("maxSize >", value, "maxsize");
            return (Criteria) this;
        }

        public Criteria andMaxsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxSize >=", value, "maxsize");
            return (Criteria) this;
        }

        public Criteria andMaxsizeLessThan(Integer value) {
            addCriterion("maxSize <", value, "maxsize");
            return (Criteria) this;
        }

        public Criteria andMaxsizeLessThanOrEqualTo(Integer value) {
            addCriterion("maxSize <=", value, "maxsize");
            return (Criteria) this;
        }

        public Criteria andMaxsizeIn(List<Integer> values) {
            addCriterion("maxSize in", values, "maxsize");
            return (Criteria) this;
        }

        public Criteria andMaxsizeNotIn(List<Integer> values) {
            addCriterion("maxSize not in", values, "maxsize");
            return (Criteria) this;
        }

        public Criteria andMaxsizeBetween(Integer value1, Integer value2) {
            addCriterion("maxSize between", value1, value2, "maxsize");
            return (Criteria) this;
        }

        public Criteria andMaxsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("maxSize not between", value1, value2, "maxsize");
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