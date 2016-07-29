package cn.cqupt.onlinebooking.po;

public class Proctor {
    private Integer examid;

    private Integer teacherid;

    private Integer examroomid;

    private Integer batch;

    private Integer week;

    private Integer periodid;

    private String year;
    
    private String upOrDownYear;
    
    private Integer ifFinished;
    
	public Integer getExamid() {
        return examid;
    }

    public void setExamid(Integer examid) {
        this.examid = examid;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public Integer getExamroomid() {
        return examroomid;
    }

    public void setExamroomid(Integer examroomid) {
        this.examroomid = examroomid;
    }

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getPeriodid() {
        return periodid;
    }

    public void setPeriodid(Integer periodid) {
        this.periodid = periodid;
    }
    public String getUpOrDownYear() {
		return upOrDownYear;
	}

	public void setUpOrDownYear(String upOrDownYear) {
		this.upOrDownYear = upOrDownYear;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getIfFinished() {
		return ifFinished;
	}

	public void setIfFinished(Integer ifFinished) {
		this.ifFinished = ifFinished;
	}

	
}