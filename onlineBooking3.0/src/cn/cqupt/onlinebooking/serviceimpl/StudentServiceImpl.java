package cn.cqupt.onlinebooking.serviceimpl;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.cqupt.onlinebooking.mapper.ClassroombookingMapperCustom;
import cn.cqupt.onlinebooking.mapper.StudentMapperCustom;
import cn.cqupt.onlinebooking.mapper.StudentbookingMapper;
import cn.cqupt.onlinebooking.mapper.StudentbookingMapperCustome;
import cn.cqupt.onlinebooking.po.CheckedAndExamTimes;
import cn.cqupt.onlinebooking.po.ExamID;
import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.ScoreCustome;
import cn.cqupt.onlinebooking.po.SeatCustome;
import cn.cqupt.onlinebooking.po.Student;
import cn.cqupt.onlinebooking.po.StudentCustom;
import cn.cqupt.onlinebooking.po.StudentKey;
import cn.cqupt.onlinebooking.po.StudentbookingCustome;
import cn.cqupt.onlinebooking.po.StudnetQueryVo;
import cn.cqupt.onlinebooking.service.StudentService;

public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapperCustom studentMapperCuster;
	@Autowired
	private StudentbookingMapperCustome studentbookingMapperCustome;
	@Autowired
	private ClassroombookingMapperCustom classroombookingMapperCustom;
	public List<StudentCustom> findStudentList(StudnetQueryVo studnetQueryVo) {
		
		return studentMapperCuster.findAllStudnets(studnetQueryVo);
	}
	public StudentCustom findStudentByNameAndPw(StudnetQueryVo studnetQueryVo) {
		
		return studentMapperCuster.findStudentByNameAndPw(studnetQueryVo);
	}
	public void addStudent(StudentCustom studentCustom) {
		studentMapperCuster.addStudent(studentCustom);
	}
	/*public Student selectStudentByPrimaryKey(StudentKey studentKey)
			throws Exception {
		return studentMapperCuster.selectByPrimaryKey(studentKey);
	}*/
	public Student selectStudentById(Integer studentId) throws Exception {
		
		return studentMapperCuster.selectStudentByID(studentId);
	}
	public int updateStudent(Integer id, StudentCustom studentCustom)
			throws Exception {
		studentCustom.setStudentid(id);
		return studentMapperCuster.updateByPrimaryKey(studentCustom);
	}
	public List<ScoreCustome> selectScorePageContent(Integer scorePage)
			throws Exception {
		System.out.println(scorePage);
		Integer offset = (scorePage-1)*10;
		Integer endPage = scorePage*10;
		List<ScoreCustome> ScoreList = studentMapperCuster.selectScorePageContent(offset,endPage);
		System.out.println(ScoreList.size());
		return ScoreList;
	}
	public ScoreCustome selectScoreByStudentNo(String studentNo) {
		return studentMapperCuster.selectScoreByStudentNo(studentNo);
	}
	public void deleteStudentByPrimary(Integer studentId, String studentNo)
			throws Exception {
		StudentKey sk = new StudentKey();
		sk.setStudentid(studentId);
		sk.setStudentno(studentNo);
		studentMapperCuster.deleteByPrimaryKey(sk);
	}
	public void updateScoreToDatabase(ScoreCustome scoreCustome)
			throws Exception {
		studentMapperCuster.udpateScoreToDatabase(scoreCustome);
	}
	public Integer addStudentBookingInformation(Integer classroomId,
			Integer examId, String studentNo) throws Exception {
		//给考生分配座位
		List<SeatCustome> seatCustomeList = studentbookingMapperCustome.getSeatsNotUsed(classroomId);
		int max=seatCustomeList.size();
        Random random = new Random();
        int s = random.nextInt(max);
        SeatCustome seatCustome = seatCustomeList.get(s);
        //得到随机获得的seatId
        Integer seatId = seatCustome.getSeatid();
        
		return studentbookingMapperCustome.addStudentBookingInformation(classroomId, examId, studentNo,seatId);
	}
	public Integer getifCountStudentBookingAndFinished(String studentNo)
			throws Exception {
		return studentbookingMapperCustome.getifCountStudentBookingAndFinished(studentNo);
	}
	public List<StudentbookingCustome> getStudeentBookingByProctorInformation(
			ProctorCustome proctorCustome) throws Exception {
		return studentbookingMapperCustome.getStudeentBookingByProctorInformation(proctorCustome);
		
	}
	public void deleteStudentBookingById(Integer studentBookingId)
			throws Exception {
		studentbookingMapperCustome.deleteByPrimaryKey(studentBookingId);
	}
	public List<ScoreCustome> getScoreByYearTerm(String year,
			Integer upOrDownYear) throws Exception {
		List<ScoreCustome> ScoreCustomeList = studentMapperCuster.getScoreByYearTerm(year, upOrDownYear);
		return ScoreCustomeList;
	}
	public ExamID ifHasReserved(String studentNo) throws Exception {
		//int i = classroombookingMapperCustom.ifHasReserved(studentNo);
		return classroombookingMapperCustom.ifHasReserved(studentNo);
	}
	public void updateStdentPassword(String studentNo, String password)
			throws Exception {
		studentMapperCuster.updateStdentPassword(studentNo, password);
	}
	public CheckedAndExamTimes getExamTimesAndIschecked(String studentNo)
			throws Exception {
		
		return classroombookingMapperCustom.getExamTimesAndIschecked(studentNo);
	}
	

}
