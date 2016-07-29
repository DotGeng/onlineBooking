package cn.cqupt.onlinebooking.po;

public class Teacher {
    private Integer teacherid;

    private String teachername;

    private String teacherpw;

    private Integer teacherrole;

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getTeacherpw() {
        return teacherpw;
    }

    public void setTeacherpw(String teacherpw) {
        this.teacherpw = teacherpw == null ? null : teacherpw.trim();
    }

    public Integer getTeacherrole() {
        return teacherrole;
    }

    public void setTeacherrole(Integer teacherrole) {
        this.teacherrole = teacherrole;
    }
}