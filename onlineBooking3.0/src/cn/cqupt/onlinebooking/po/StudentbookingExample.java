package cn.cqupt.onlinebooking.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentbookingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentbookingExample() {
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

        public Criteria andStudentbookingidIsNull() {
            addCriterion("studentBookingID is null");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidIsNotNull() {
            addCriterion("studentBookingID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidEqualTo(Integer value) {
            addCriterion("studentBookingID =", value, "studentbookingid");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidNotEqualTo(Integer value) {
            addCriterion("studentBookingID <>", value, "studentbookingid");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidGreaterThan(Integer value) {
            addCriterion("studentBookingID >", value, "studentbookingid");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentBookingID >=", value, "studentbookingid");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidLessThan(Integer value) {
            addCriterion("studentBookingID <", value, "studentbookingid");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidLessThanOrEqualTo(Integer value) {
            addCriterion("studentBookingID <=", value, "studentbookingid");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidIn(List<Integer> values) {
            addCriterion("studentBookingID in", values, "studentbookingid");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidNotIn(List<Integer> values) {
            addCriterion("studentBookingID not in", values, "studentbookingid");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidBetween(Integer value1, Integer value2) {
            addCriterion("studentBookingID between", value1, value2, "studentbookingid");
            return (Criteria) this;
        }

        public Criteria andStudentbookingidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentBookingID not between", value1, value2, "studentbookingid");
            return (Criteria) this;
        }

        public Criteria andStudentnoIsNull() {
            addCriterion("studentNo is null");
            return (Criteria) this;
        }

        public Criteria andStudentnoIsNotNull() {
            addCriterion("studentNo is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnoEqualTo(String value) {
            addCriterion("studentNo =", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotEqualTo(String value) {
            addCriterion("studentNo <>", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoGreaterThan(String value) {
            addCriterion("studentNo >", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoGreaterThanOrEqualTo(String value) {
            addCriterion("studentNo >=", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoLessThan(String value) {
            addCriterion("studentNo <", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoLessThanOrEqualTo(String value) {
            addCriterion("studentNo <=", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoLike(String value) {
            addCriterion("studentNo like", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotLike(String value) {
            addCriterion("studentNo not like", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoIn(List<String> values) {
            addCriterion("studentNo in", values, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotIn(List<String> values) {
            addCriterion("studentNo not in", values, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoBetween(String value1, String value2) {
            addCriterion("studentNo between", value1, value2, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotBetween(String value1, String value2) {
            addCriterion("studentNo not between", value1, value2, "studentno");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(Integer value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(Integer value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(Integer value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(Integer value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(Integer value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<Integer> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<Integer> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(Integer value1, Integer value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(Integer value1, Integer value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
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

        public Criteria andSeatidIsNull() {
            addCriterion("seatID is null");
            return (Criteria) this;
        }

        public Criteria andSeatidIsNotNull() {
            addCriterion("seatID is not null");
            return (Criteria) this;
        }

        public Criteria andSeatidEqualTo(Integer value) {
            addCriterion("seatID =", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotEqualTo(Integer value) {
            addCriterion("seatID <>", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThan(Integer value) {
            addCriterion("seatID >", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatID >=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThan(Integer value) {
            addCriterion("seatID <", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThanOrEqualTo(Integer value) {
            addCriterion("seatID <=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidIn(List<Integer> values) {
            addCriterion("seatID in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotIn(List<Integer> values) {
            addCriterion("seatID not in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidBetween(Integer value1, Integer value2) {
            addCriterion("seatID between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotBetween(Integer value1, Integer value2) {
            addCriterion("seatID not between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andBookingtimeIsNull() {
            addCriterion("bookingTime is null");
            return (Criteria) this;
        }

        public Criteria andBookingtimeIsNotNull() {
            addCriterion("bookingTime is not null");
            return (Criteria) this;
        }

        public Criteria andBookingtimeEqualTo(Date value) {
            addCriterion("bookingTime =", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeNotEqualTo(Date value) {
            addCriterion("bookingTime <>", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeGreaterThan(Date value) {
            addCriterion("bookingTime >", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bookingTime >=", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeLessThan(Date value) {
            addCriterion("bookingTime <", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeLessThanOrEqualTo(Date value) {
            addCriterion("bookingTime <=", value, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeIn(List<Date> values) {
            addCriterion("bookingTime in", values, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeNotIn(List<Date> values) {
            addCriterion("bookingTime not in", values, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeBetween(Date value1, Date value2) {
            addCriterion("bookingTime between", value1, value2, "bookingtime");
            return (Criteria) this;
        }

        public Criteria andBookingtimeNotBetween(Date value1, Date value2) {
            addCriterion("bookingTime not between", value1, value2, "bookingtime");
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