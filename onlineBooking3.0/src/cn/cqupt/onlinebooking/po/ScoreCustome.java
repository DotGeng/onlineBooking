package cn.cqupt.onlinebooking.po;

public class ScoreCustome extends Student{
	private String year;
	private String week;
	private String day;
	private String period;
	private String examinationRoom;
	private Integer upOrDownYear;
	
	public Integer getUpOrDownYear() {
		return upOrDownYear;
	}
	public void setUpOrDownYear(Integer upOrDownYear) {
		this.upOrDownYear = upOrDownYear;
	}
	public String getExaminationRoom() {
		return examinationRoom;
	}
	public void setExaminationRoom(String examinationRoom) {
		this.examinationRoom = examinationRoom;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	
}
