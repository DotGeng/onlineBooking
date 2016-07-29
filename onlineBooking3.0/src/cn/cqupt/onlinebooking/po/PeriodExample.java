package cn.cqupt.onlinebooking.po;

import java.util.ArrayList;
import java.util.List;

public class PeriodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeriodExample() {
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

        public Criteria andPeriodidIsNull() {
            addCriterion("periodID is null");
            return (Criteria) this;
        }

        public Criteria andPeriodidIsNotNull() {
            addCriterion("periodID is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodidEqualTo(Integer value) {
            addCriterion("periodID =", value, "periodid");
            return (Criteria) this;
        }

        public Criteria andPeriodidNotEqualTo(Integer value) {
            addCriterion("periodID <>", value, "periodid");
            return (Criteria) this;
        }

        public Criteria andPeriodidGreaterThan(Integer value) {
            addCriterion("periodID >", value, "periodid");
            return (Criteria) this;
        }

        public Criteria andPeriodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("periodID >=", value, "periodid");
            return (Criteria) this;
        }

        public Criteria andPeriodidLessThan(Integer value) {
            addCriterion("periodID <", value, "periodid");
            return (Criteria) this;
        }

        public Criteria andPeriodidLessThanOrEqualTo(Integer value) {
            addCriterion("periodID <=", value, "periodid");
            return (Criteria) this;
        }

        public Criteria andPeriodidIn(List<Integer> values) {
            addCriterion("periodID in", values, "periodid");
            return (Criteria) this;
        }

        public Criteria andPeriodidNotIn(List<Integer> values) {
            addCriterion("periodID not in", values, "periodid");
            return (Criteria) this;
        }

        public Criteria andPeriodidBetween(Integer value1, Integer value2) {
            addCriterion("periodID between", value1, value2, "periodid");
            return (Criteria) this;
        }

        public Criteria andPeriodidNotBetween(Integer value1, Integer value2) {
            addCriterion("periodID not between", value1, value2, "periodid");
            return (Criteria) this;
        }

        public Criteria andPeriodnameIsNull() {
            addCriterion("periodname is null");
            return (Criteria) this;
        }

        public Criteria andPeriodnameIsNotNull() {
            addCriterion("periodname is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodnameEqualTo(String value) {
            addCriterion("periodname =", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameNotEqualTo(String value) {
            addCriterion("periodname <>", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameGreaterThan(String value) {
            addCriterion("periodname >", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameGreaterThanOrEqualTo(String value) {
            addCriterion("periodname >=", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameLessThan(String value) {
            addCriterion("periodname <", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameLessThanOrEqualTo(String value) {
            addCriterion("periodname <=", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameLike(String value) {
            addCriterion("periodname like", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameNotLike(String value) {
            addCriterion("periodname not like", value, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameIn(List<String> values) {
            addCriterion("periodname in", values, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameNotIn(List<String> values) {
            addCriterion("periodname not in", values, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameBetween(String value1, String value2) {
            addCriterion("periodname between", value1, value2, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodnameNotBetween(String value1, String value2) {
            addCriterion("periodname not between", value1, value2, "periodname");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextIsNull() {
            addCriterion("periodContext is null");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextIsNotNull() {
            addCriterion("periodContext is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextEqualTo(String value) {
            addCriterion("periodContext =", value, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextNotEqualTo(String value) {
            addCriterion("periodContext <>", value, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextGreaterThan(String value) {
            addCriterion("periodContext >", value, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextGreaterThanOrEqualTo(String value) {
            addCriterion("periodContext >=", value, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextLessThan(String value) {
            addCriterion("periodContext <", value, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextLessThanOrEqualTo(String value) {
            addCriterion("periodContext <=", value, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextLike(String value) {
            addCriterion("periodContext like", value, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextNotLike(String value) {
            addCriterion("periodContext not like", value, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextIn(List<String> values) {
            addCriterion("periodContext in", values, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextNotIn(List<String> values) {
            addCriterion("periodContext not in", values, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextBetween(String value1, String value2) {
            addCriterion("periodContext between", value1, value2, "periodcontext");
            return (Criteria) this;
        }

        public Criteria andPeriodcontextNotBetween(String value1, String value2) {
            addCriterion("periodContext not between", value1, value2, "periodcontext");
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