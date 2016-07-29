package cn.cqupt.onlinebooking.po;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherID is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Integer value) {
            addCriterion("teacherID =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Integer value) {
            addCriterion("teacherID <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Integer value) {
            addCriterion("teacherID >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherID >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Integer value) {
            addCriterion("teacherID <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Integer value) {
            addCriterion("teacherID <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Integer> values) {
            addCriterion("teacherID in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Integer> values) {
            addCriterion("teacherID not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Integer value1, Integer value2) {
            addCriterion("teacherID between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherID not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("teacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("teacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("teacherName =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("teacherName <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("teacherName >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("teacherName >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("teacherName <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("teacherName <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("teacherName like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("teacherName not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("teacherName in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("teacherName not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("teacherName between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("teacherName not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeacherpwIsNull() {
            addCriterion("teacherPw is null");
            return (Criteria) this;
        }

        public Criteria andTeacherpwIsNotNull() {
            addCriterion("teacherPw is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherpwEqualTo(String value) {
            addCriterion("teacherPw =", value, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwNotEqualTo(String value) {
            addCriterion("teacherPw <>", value, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwGreaterThan(String value) {
            addCriterion("teacherPw >", value, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwGreaterThanOrEqualTo(String value) {
            addCriterion("teacherPw >=", value, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwLessThan(String value) {
            addCriterion("teacherPw <", value, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwLessThanOrEqualTo(String value) {
            addCriterion("teacherPw <=", value, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwLike(String value) {
            addCriterion("teacherPw like", value, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwNotLike(String value) {
            addCriterion("teacherPw not like", value, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwIn(List<String> values) {
            addCriterion("teacherPw in", values, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwNotIn(List<String> values) {
            addCriterion("teacherPw not in", values, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwBetween(String value1, String value2) {
            addCriterion("teacherPw between", value1, value2, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherpwNotBetween(String value1, String value2) {
            addCriterion("teacherPw not between", value1, value2, "teacherpw");
            return (Criteria) this;
        }

        public Criteria andTeacherroleIsNull() {
            addCriterion("teacherRole is null");
            return (Criteria) this;
        }

        public Criteria andTeacherroleIsNotNull() {
            addCriterion("teacherRole is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherroleEqualTo(Integer value) {
            addCriterion("teacherRole =", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleNotEqualTo(Integer value) {
            addCriterion("teacherRole <>", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleGreaterThan(Integer value) {
            addCriterion("teacherRole >", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherRole >=", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleLessThan(Integer value) {
            addCriterion("teacherRole <", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleLessThanOrEqualTo(Integer value) {
            addCriterion("teacherRole <=", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleIn(List<Integer> values) {
            addCriterion("teacherRole in", values, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleNotIn(List<Integer> values) {
            addCriterion("teacherRole not in", values, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleBetween(Integer value1, Integer value2) {
            addCriterion("teacherRole between", value1, value2, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherRole not between", value1, value2, "teacherrole");
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