package cn.cqupt.onlinebooking.po;

public class Student extends StudentKey {
    private String studclass;

    private String studentname;

    private String studentpw;

    private String major;

    private String colledge;

    private Integer passed;

    private Integer score;

    private Integer examtimes;

    private Integer ischeated;

    public String getStudclass() {
        return studclass;
    }

    public void setStudclass(String studclass) {
        this.studclass = studclass == null ? null : studclass.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentpw() {
        return studentpw;
    }

    public void setStudentpw(String studentpw) {
        this.studentpw = studentpw == null ? null : studentpw.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getColledge() {
        return colledge;
    }

    public void setColledge(String colledge) {
        this.colledge = colledge == null ? null : colledge.trim();
    }

    public Integer getPassed() {
        return passed;
    }

    public void setPassed(Integer passed) {
        this.passed = passed;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getExamtimes() {
        return examtimes;
    }

    public void setExamtimes(Integer examtimes) {
        this.examtimes = examtimes;
    }

    public Integer getIscheated() {
        return ischeated;
    }

    public void setIscheated(Integer ischeated) {
        this.ischeated = ischeated;
    }
}