package cn.cqupt.onlinebooking.po;

public class Period {
	
    private Integer periodid;

    private Integer periodNum;
    
    private String periodname;

    private String periodcontext;

    private Integer ifFinished;
    
    
    public Integer getPeriodid() {
        return periodid;
    }

    public void setPeriodid(Integer periodid) {
        this.periodid = periodid;
    }

    public String getPeriodname() {
        return periodname;
    }

    public void setPeriodname(String periodname) {
        this.periodname = periodname == null ? null : periodname.trim();
    }

    public String getPeriodcontext() {
        return periodcontext;
    }

    public void setPeriodcontext(String periodcontext) {
        this.periodcontext = periodcontext == null ? null : periodcontext.trim();
    }

	public Integer getIfFinished() {
		return ifFinished;
	}

	public void setIfFinished(Integer ifFinished) {
		this.ifFinished = ifFinished;
	}

	public Integer getPeriodNum() {
		return periodNum;
	}

	public void setPeriodNum(Integer periodNum) {
		this.periodNum = periodNum;
	}
    
}