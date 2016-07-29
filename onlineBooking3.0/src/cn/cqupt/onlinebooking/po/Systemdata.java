package cn.cqupt.onlinebooking.po;

public class Systemdata {
    private Integer systemdataid;

    private String systemdataname;

    private String systemdatacontent;

    private String datetime;

    public Integer getSystemdataid() {
        return systemdataid;
    }

    public void setSystemdataid(Integer systemdataid) {
        this.systemdataid = systemdataid;
    }

    public String getSystemdataname() {
        return systemdataname;
    }

    public void setSystemdataname(String systemdataname) {
        this.systemdataname = systemdataname == null ? null : systemdataname.trim();
    }

    public String getSystemdatacontent() {
        return systemdatacontent;
    }

    public void setSystemdatacontent(String systemdatacontent) {
        this.systemdatacontent = systemdatacontent == null ? null : systemdatacontent.trim();
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }
}