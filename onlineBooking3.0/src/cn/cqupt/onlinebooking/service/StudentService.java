package cn.cqupt.onlinebooking.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import cn.cqupt.onlinebooking.po.CheckedAndExamTimes;
import cn.cqupt.onlinebooking.po.ExamID;
import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.ScoreCustome;
import cn.cqupt.onlinebooking.po.Student;
import cn.cqupt.onlinebooking.po.StudentCustom;
import cn.cqupt.onlinebooking.po.StudentbookingCustome;
import cn.cqupt.onlinebooking.po.StudnetQueryVo;

public interface StudentService {
	//查询所有的学生
	public List<StudentCustom> findStudentList(StudnetQueryVo studnetQueryVo);
	//登录信息验证并得到登录人员的信息
	public StudentCustom findStudentByNameAndPw(StudnetQueryVo studnetQueryVo) ;
	//添加学生
	public void addStudent(StudentCustom studentCustom);
	//根据id得到学生
	//public Student selectStudentByPrimaryKey(StudentKey studentKey) throws Exception;
	public Student selectStudentById(Integer studentId) throws Exception ;
	//根据主键更新student记录
	public int updateStudent(Integer id, StudentCustom studentCustom) throws Exception;
	//查询所有的学生成绩
	public List<ScoreCustome> selectScorePageContent(Integer scorePage) throws Exception;
		//根据学生的学号查找学生的成绩
	 public ScoreCustome selectScoreByStudentNo(String studentNo);
	 //根据主键删除学生
	 public void deleteStudentByPrimary(Integer studentId,String studentNo) throws Exception;
	 //根据学生学号修改分数信息
	 public void updateScoreToDatabase(ScoreCustome scoreCustome) throws Exception;
	 //学生预约信息添加到数据库
	 public Integer addStudentBookingInformation(Integer classroomId,Integer examId,String studentNo) throws Exception;
	 //根据学号查询学生是否预约过，以及预约过的考试是否考完
	 public Integer getifCountStudentBookingAndFinished(@Param("studentNo")String studentNo) throws Exception;
	 //根据考场的信息查找到学生预定的信息
	 public List<StudentbookingCustome> getStudeentBookingByProctorInformation(ProctorCustome proctorCustome) throws Exception;
	//根据预定的id删除学生预定的情况,反向工程自动生成了，所以这里不再写了
	 public void deleteStudentBookingById(Integer studentBookingId) throws Exception;
	 //根据学年学期导出学生成绩
	 public List<ScoreCustome> getScoreByYearTerm(String year,
			   Integer upOrDownYear) throws Exception;   
	//验证该学生是否预约过
	 public ExamID ifHasReserved(@Param("studentNo")String studentNo) throws Exception;
		//根据学号修改学生密码
	 public void updateStdentPassword(@Param("studentNo")String studentNo,@Param("password")String password) throws Exception;
	 //根据学号得到学生的考试次数和作弊情况
	 public CheckedAndExamTimes getExamTimesAndIschecked(@Param("studentNo")String studentNo) throws Exception;
}
