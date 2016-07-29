package cn.cqupt.onlinebooking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.TeacherCustom;
import cn.cqupt.onlinebooking.po.TeacherQueryVo;


public interface TeacherMapperCustom extends TeacherMapper{
	//查询管理员
	public TeacherCustom findTeacherByNameAndPW(TeacherQueryVo teacherQueryVo) throws Exception;
	//插入teacher
	public Integer addTeacher(TeacherCustom teacherCustom) throws Exception;
	//得到所有的老师
	public List<TeacherCustom> getAllTeacher(TeacherCustom teacherCustom) throws Exception;
	//按照页数得到老师
	public List<TeacherCustom> getAllTeacherByPage(TeacherCustom teacherCustom,@Param("pageStart")Integer pageStart,@Param("pageEnd")Integer pageEnd) throws Exception;
	//得到老师的人数
	public Integer getAllTeacherCount() throws Exception;
	//得到老师的名字和id
	public List<TeacherCustom> getAllTeacherNameAndID() throws Exception;
	//查询老师
	public TeacherCustom getTeacherByNameAndPassword(TeacherQueryVo teacherQueryVo) throws Exception;
	//根据监考老师的名字获得其监考信息
	public List<ProctorCustome> getProctorByName(TeacherQueryVo qu) throws Exception;
	//获得目前预约的学生人数
	public int getReservedStudentCount() throws Exception;
	//批量修改学生成绩
	public int batchUpdateStudentScore(@Param("studentNo")String studentNo,@Param("score")Integer score) throws Exception; 
}