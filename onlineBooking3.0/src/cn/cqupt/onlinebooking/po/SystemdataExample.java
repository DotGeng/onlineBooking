package cn.cqupt.onlinebooking.po;

import java.util.ArrayList;
import java.util.List;

public class SystemdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemdataExample() {
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

        public Criteria andSystemdataidIsNull() {
            addCriterion("systemDataID is null");
            return (Criteria) this;
        }

        public Criteria andSystemdataidIsNotNull() {
            addCriterion("systemDataID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemdataidEqualTo(Integer value) {
            addCriterion("systemDataID =", value, "systemdataid");
            return (Criteria) this;
        }

        public Criteria andSystemdataidNotEqualTo(Integer value) {
            addCriterion("systemDataID <>", value, "systemdataid");
            return (Criteria) this;
        }

        public Criteria andSystemdataidGreaterThan(Integer value) {
            addCriterion("systemDataID >", value, "systemdataid");
            return (Criteria) this;
        }

        public Criteria andSystemdataidGreaterThanOrEqualTo(Integer value) {
            addCriterion("systemDataID >=", value, "systemdataid");
            return (Criteria) this;
        }

        public Criteria andSystemdataidLessThan(Integer value) {
            addCriterion("systemDataID <", value, "systemdataid");
            return (Criteria) this;
        }

        public Criteria andSystemdataidLessThanOrEqualTo(Integer value) {
            addCriterion("systemDataID <=", value, "systemdataid");
            return (Criteria) this;
        }

        public Criteria andSystemdataidIn(List<Integer> values) {
            addCriterion("systemDataID in", values, "systemdataid");
            return (Criteria) this;
        }

        public Criteria andSystemdataidNotIn(List<Integer> values) {
            addCriterion("systemDataID not in", values, "systemdataid");
            return (Criteria) this;
        }

        public Criteria andSystemdataidBetween(Integer value1, Integer value2) {
            addCriterion("systemDataID between", value1, value2, "systemdataid");
            return (Criteria) this;
        }

        public Criteria andSystemdataidNotBetween(Integer value1, Integer value2) {
            addCriterion("systemDataID not between", value1, value2, "systemdataid");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameIsNull() {
            addCriterion("systemDataName is null");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameIsNotNull() {
            addCriterion("systemDataName is not null");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameEqualTo(String value) {
            addCriterion("systemDataName =", value, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameNotEqualTo(String value) {
            addCriterion("systemDataName <>", value, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameGreaterThan(String value) {
            addCriterion("systemDataName >", value, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameGreaterThanOrEqualTo(String value) {
            addCriterion("systemDataName >=", value, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameLessThan(String value) {
            addCriterion("systemDataName <", value, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameLessThanOrEqualTo(String value) {
            addCriterion("systemDataName <=", value, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameLike(String value) {
            addCriterion("systemDataName like", value, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameNotLike(String value) {
            addCriterion("systemDataName not like", value, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameIn(List<String> values) {
            addCriterion("systemDataName in", values, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameNotIn(List<String> values) {
            addCriterion("systemDataName not in", values, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameBetween(String value1, String value2) {
            addCriterion("systemDataName between", value1, value2, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatanameNotBetween(String value1, String value2) {
            addCriterion("systemDataName not between", value1, value2, "systemdataname");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentIsNull() {
            addCriterion("systemDataContent is null");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentIsNotNull() {
            addCriterion("systemDataContent is not null");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentEqualTo(String value) {
            addCriterion("systemDataContent =", value, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentNotEqualTo(String value) {
            addCriterion("systemDataContent <>", value, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentGreaterThan(String value) {
            addCriterion("systemDataContent >", value, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentGreaterThanOrEqualTo(String value) {
            addCriterion("systemDataContent >=", value, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentLessThan(String value) {
            addCriterion("systemDataContent <", value, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentLessThanOrEqualTo(String value) {
            addCriterion("systemDataContent <=", value, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentLike(String value) {
            addCriterion("systemDataContent like", value, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentNotLike(String value) {
            addCriterion("systemDataContent not like", value, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentIn(List<String> values) {
            addCriterion("systemDataContent in", values, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentNotIn(List<String> values) {
            addCriterion("systemDataContent not in", values, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentBetween(String value1, String value2) {
            addCriterion("systemDataContent between", value1, value2, "systemdatacontent");
            return (Criteria) this;
        }

        public Criteria andSystemdatacontentNotBetween(String value1, String value2) {
            addCriterion("systemDataContent not between", value1, value2, "systemdatacontent");
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