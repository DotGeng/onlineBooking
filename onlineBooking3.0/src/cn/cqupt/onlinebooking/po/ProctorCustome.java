package cn.cqupt.onlinebooking.po;

public class ProctorCustome extends Proctor{
	private String teacherName;
	private String classroomName;
	private String periodname;
	private Integer studentBookingCount;
	private Integer classroomBookingSize;
	
	public Integer getStudentBookingCount() {
		return studentBookingCount;
	}
	public void setStudentBookingCount(Integer studentBookingCount) {
		this.studentBookingCount = studentBookingCount;
	}
	public Integer getClassroomBookingSize() {
		return classroomBookingSize;
	}
	public void setClassroomBookingSize(Integer classroomBookingSize) {
		this.classroomBookingSize = classroomBookingSize;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getClassroomName() {
		return classroomName;
	}
	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}
	public String getPeriodname() {
		return periodname;
	}
	public void setPeriodname(String periodname) {
		this.periodname = periodname;
	}
	
}
