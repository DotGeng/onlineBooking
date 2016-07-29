package cn.cqupt.onlinebooking.mapper;

import cn.cqupt.onlinebooking.po.ScoreCustome;
import cn.cqupt.onlinebooking.po.StudentCustom;
import cn.cqupt.onlinebooking.po.StudnetQueryVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StudentMapperCustom extends StudentMapper{
   //查看所有的学生
   public List<StudentCustom> findAllStudnets(StudnetQueryVo studnetQueryVo) ;
   //分页查看学生成绩
   public List<StudentCustom> getStudentsByPaging(@Param("pageNow")Integer pageNow,@Param("pageSize")Integer pageSize) throws Exception;
   //根据学号和密码查询学生是否存在
   public StudentCustom findStudentByNameAndPw(StudnetQueryVo studnetQueryVo) ;
   //单个添加学生
   public void addStudent(StudentCustom studentCustom) ;
   //根据id查找学生
   public StudentCustom selectStudentByID(Integer studentID);
   //查询学生成绩
   public List<ScoreCustome> selectScorePageContent(@Param("offset") Integer offset,@Param("endPage") Integer endPage);
   //根据学生学号在学生表中查找学生成绩
   public ScoreCustome selectScoreByStudentNo(@Param("studentNo") String studentNo);
   //根据学号修改学生信息
   public void udpateScoreToDatabase(ScoreCustome scoreCustome) throws Exception;
   //根据学年，学期，周次导出学生成绩
   public List<ScoreCustome> getScoreByYearTermAndWeek(@Param("year")String year,
		   @Param("upOrDownYear")Integer upOrDownYear,@Param("week")Integer week) throws Exception;
   //根据学年学期导出学生成绩
   public List<ScoreCustome> getScoreByYearTerm(@Param("year")String year,
		   @Param("upOrDownYear")Integer upOrDownYear) throws Exception;
   //根据学号修改学生密码
   public void updateStdentPassword(@Param("studentNo")String studentNo,@Param("password")String password) throws Exception;
}

