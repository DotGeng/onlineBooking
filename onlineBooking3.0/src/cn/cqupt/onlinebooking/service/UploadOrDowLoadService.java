package cn.cqupt.onlinebooking.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import cn.cqupt.onlinebooking.po.ScoreCustome;

public interface UploadOrDowLoadService {
	//上传老师的信息
	public void uploadTeacher(MultipartFile file) throws Exception;
	//上传学生的信息
	public void uploadStudents(MultipartFile file) throws Exception ;
	//根据学年学期周次把学生成绩导出成excel
	public List<ScoreCustome> getScoreByYearTermAndWeek(String year,
			   Integer upOrDownYear,Integer week) throws Exception;
	//批量修改学生成绩
	public int batchUpdateStudentScore(MultipartFile Mfile) throws Exception; 
}
