package cn.cqupt.onlinebooking.po;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudentidIsNull() {
            addCriterion("studentID is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentID =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentID <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentID >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentID >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentID <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentID <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentID in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentID not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentID between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentID not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentnoIsNull() {
            addCriterion("studentNO is null");
            return (Criteria) this;
        }

        public Criteria andStudentnoIsNotNull() {
            addCriterion("studentNO is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnoEqualTo(String value) {
            addCriterion("studentNO =", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotEqualTo(String value) {
            addCriterion("studentNO <>", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoGreaterThan(String value) {
            addCriterion("studentNO >", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoGreaterThanOrEqualTo(String value) {
            addCriterion("studentNO >=", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoLessThan(String value) {
            addCriterion("studentNO <", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoLessThanOrEqualTo(String value) {
            addCriterion("studentNO <=", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoLike(String value) {
            addCriterion("studentNO like", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotLike(String value) {
            addCriterion("studentNO not like", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoIn(List<String> values) {
            addCriterion("studentNO in", values, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotIn(List<String> values) {
            addCriterion("studentNO not in", values, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoBetween(String value1, String value2) {
            addCriterion("studentNO between", value1, value2, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotBetween(String value1, String value2) {
            addCriterion("studentNO not between", value1, value2, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudclassIsNull() {
            addCriterion("studClass is null");
            return (Criteria) this;
        }

        public Criteria andStudclassIsNotNull() {
            addCriterion("studClass is not null");
            return (Criteria) this;
        }

        public Criteria andStudclassEqualTo(String value) {
            addCriterion("studClass =", value, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassNotEqualTo(String value) {
            addCriterion("studClass <>", value, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassGreaterThan(String value) {
            addCriterion("studClass >", value, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassGreaterThanOrEqualTo(String value) {
            addCriterion("studClass >=", value, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassLessThan(String value) {
            addCriterion("studClass <", value, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassLessThanOrEqualTo(String value) {
            addCriterion("studClass <=", value, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassLike(String value) {
            addCriterion("studClass like", value, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassNotLike(String value) {
            addCriterion("studClass not like", value, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassIn(List<String> values) {
            addCriterion("studClass in", values, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassNotIn(List<String> values) {
            addCriterion("studClass not in", values, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassBetween(String value1, String value2) {
            addCriterion("studClass between", value1, value2, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudclassNotBetween(String value1, String value2) {
            addCriterion("studClass not between", value1, value2, "studclass");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("studentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentpwIsNull() {
            addCriterion("studentPw is null");
            return (Criteria) this;
        }

        public Criteria andStudentpwIsNotNull() {
            addCriterion("studentPw is not null");
            return (Criteria) this;
        }

        public Criteria andStudentpwEqualTo(String value) {
            addCriterion("studentPw =", value, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwNotEqualTo(String value) {
            addCriterion("studentPw <>", value, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwGreaterThan(String value) {
            addCriterion("studentPw >", value, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwGreaterThanOrEqualTo(String value) {
            addCriterion("studentPw >=", value, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwLessThan(String value) {
            addCriterion("studentPw <", value, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwLessThanOrEqualTo(String value) {
            addCriterion("studentPw <=", value, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwLike(String value) {
            addCriterion("studentPw like", value, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwNotLike(String value) {
            addCriterion("studentPw not like", value, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwIn(List<String> values) {
            addCriterion("studentPw in", values, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwNotIn(List<String> values) {
            addCriterion("studentPw not in", values, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwBetween(String value1, String value2) {
            addCriterion("studentPw between", value1, value2, "studentpw");
            return (Criteria) this;
        }

        public Criteria andStudentpwNotBetween(String value1, String value2) {
            addCriterion("studentPw not between", value1, value2, "studentpw");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andColledgeIsNull() {
            addCriterion("colledge is null");
            return (Criteria) this;
        }

        public Criteria andColledgeIsNotNull() {
            addCriterion("colledge is not null");
            return (Criteria) this;
        }

        public Criteria andColledgeEqualTo(String value) {
            addCriterion("colledge =", value, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeNotEqualTo(String value) {
            addCriterion("colledge <>", value, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeGreaterThan(String value) {
            addCriterion("colledge >", value, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeGreaterThanOrEqualTo(String value) {
            addCriterion("colledge >=", value, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeLessThan(String value) {
            addCriterion("colledge <", value, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeLessThanOrEqualTo(String value) {
            addCriterion("colledge <=", value, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeLike(String value) {
            addCriterion("colledge like", value, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeNotLike(String value) {
            addCriterion("colledge not like", value, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeIn(List<String> values) {
            addCriterion("colledge in", values, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeNotIn(List<String> values) {
            addCriterion("colledge not in", values, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeBetween(String value1, String value2) {
            addCriterion("colledge between", value1, value2, "colledge");
            return (Criteria) this;
        }

        public Criteria andColledgeNotBetween(String value1, String value2) {
            addCriterion("colledge not between", value1, value2, "colledge");
            return (Criteria) this;
        }

        public Criteria andPassedIsNull() {
            addCriterion("passed is null");
            return (Criteria) this;
        }

        public Criteria andPassedIsNotNull() {
            addCriterion("passed is not null");
            return (Criteria) this;
        }

        public Criteria andPassedEqualTo(Integer value) {
            addCriterion("passed =", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedNotEqualTo(Integer value) {
            addCriterion("passed <>", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedGreaterThan(Integer value) {
            addCriterion("passed >", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedGreaterThanOrEqualTo(Integer value) {
            addCriterion("passed >=", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedLessThan(Integer value) {
            addCriterion("passed <", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedLessThanOrEqualTo(Integer value) {
            addCriterion("passed <=", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedIn(List<Integer> values) {
            addCriterion("passed in", values, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedNotIn(List<Integer> values) {
            addCriterion("passed not in", values, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedBetween(Integer value1, Integer value2) {
            addCriterion("passed between", value1, value2, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedNotBetween(Integer value1, Integer value2) {
            addCriterion("passed not between", value1, value2, "passed");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andExamtimesIsNull() {
            addCriterion("examtimes is null");
            return (Criteria) this;
        }

        public Criteria andExamtimesIsNotNull() {
            addCriterion("examtimes is not null");
            return (Criteria) this;
        }

        public Criteria andExamtimesEqualTo(Integer value) {
            addCriterion("examtimes =", value, "examtimes");
            return (Criteria) this;
        }

        public Criteria andExamtimesNotEqualTo(Integer value) {
            addCriterion("examtimes <>", value, "examtimes");
            return (Criteria) this;
        }

        public Criteria andExamtimesGreaterThan(Integer value) {
            addCriterion("examtimes >", value, "examtimes");
            return (Criteria) this;
        }

        public Criteria andExamtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("examtimes >=", value, "examtimes");
            return (Criteria) this;
        }

        public Criteria andExamtimesLessThan(Integer value) {
            addCriterion("examtimes <", value, "examtimes");
            return (Criteria) this;
        }

        public Criteria andExamtimesLessThanOrEqualTo(Integer value) {
            addCriterion("examtimes <=", value, "examtimes");
            return (Criteria) this;
        }

        public Criteria andExamtimesIn(List<Integer> values) {
            addCriterion("examtimes in", values, "examtimes");
            return (Criteria) this;
        }

        public Criteria andExamtimesNotIn(List<Integer> values) {
            addCriterion("examtimes not in", values, "examtimes");
            return (Criteria) this;
        }

        public Criteria andExamtimesBetween(Integer value1, Integer value2) {
            addCriterion("examtimes between", value1, value2, "examtimes");
            return (Criteria) this;
        }

        public Criteria andExamtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("examtimes not between", value1, value2, "examtimes");
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