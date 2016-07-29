package cn.cqupt.onlinebooking.po;

public class ClassroombookingCustom extends Classroombooking{
	
	private Integer teacherID;

	
	public String teacherName;
	
	
	
	public String getTeacherName() {
		return teacherName;
	}

	public Integer getTeacherID() {
		return teacherID;
	}
	

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}



	public void setTeacherID(Integer teacherID) {
		this.teacherID = teacherID;
	}
}
