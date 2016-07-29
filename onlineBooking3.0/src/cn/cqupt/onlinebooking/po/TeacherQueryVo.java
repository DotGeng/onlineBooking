package cn.cqupt.onlinebooking.po;

import java.util.Map;

public class TeacherQueryVo {
    Map<String, String> nameAndPW;
    private TeacherCustom teacherCustom;
    
	public Map<String, String> getNameAndPW() {
		return nameAndPW;
	}

	public void setNameAndPW(Map<String, String> nameAndPW) {
		this.nameAndPW = nameAndPW;
	}
	public TeacherCustom getTeacherCustom() {
		return teacherCustom;
	}

	public void setTeacherCustom(TeacherCustom teacherCustom) {
		this.teacherCustom = teacherCustom;
	}
}