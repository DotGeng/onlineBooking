package cn.cqupt.onlinebooking.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.SystemDataCustom;
import cn.cqupt.onlinebooking.po.Systemdata;
import cn.cqupt.onlinebooking.po.Teacher;
import cn.cqupt.onlinebooking.po.TeacherCustom;
import cn.cqupt.onlinebooking.po.TeacherQueryVo;

public interface TeacherService {
	//查询管理员
	public TeacherCustom findTeacherByNameAndPW(TeacherQueryVo teacherQueryVo) throws Exception;
	//查询老师
	public TeacherCustom getTeacherByNameAndPassword(TeacherQueryVo teacherQueryVo) throws Exception;
	//插入teacher
	public Integer addTeacher(TeacherCustom teacherCustom) throws Exception;
	//得到所有的老师
	public List<TeacherCustom> getAllTeacher(TeacherCustom teacherCustom) throws Exception;
	//按照页数得到所有的老师
	public List<TeacherCustom> getAllTeacher(TeacherCustom teacherCustom,Integer pageNow,Integer pageSize) throws Exception;
	//得到老师的人数
	public Integer getAllTeacherCount() throws Exception;
	//根据id得到老师
	public Teacher selectTeacherByPriamryKey(Integer teacherId) throws Exception;
	//更新老师信息
	public void updateTeacher(Integer id, TeacherCustom teacherCustom) throws Exception ;
	//按照id删除老师
	public void deleteTeacher(Integer id) throws Exception;
	//得到老师的名字和id
	public List<TeacherCustom> getAllTeacherNameAndID() throws Exception;
	//根据监考老师的名字获得其监考信息
	public List<ProctorCustome> getProctorByTeacherName(TeacherQueryVo qu) throws Exception;
	// 根据监考教师ID1，周次，天次，节次获得考试ID
	public int getExamID(int examroomId,int batch,int week,int period) throws Exception;
	//获得目前预约的学生人数
	public int getReservedStudentCount() throws Exception;
	//得到所有的通知信息
	public List<SystemDataCustom> getAllSystemData() throws Exception;
	//按照id删除通知信息
	public void deleteNotifyById(Integer systemdataId) throws Exception;
	//添加通知信息
	public void addNotifyInformation(String systemdataname,String systemdatacontent) throws Exception;
	//删除学生信息
	public void deleteStudentInformation() throws Exception; 
	//根据examID查看是否该考试下还有预约的信息
	public Integer getStudentBookingByExamId(Integer examID) throws Exception;
}
