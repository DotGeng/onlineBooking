package cn.cqupt.onlinebooking.handler;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.cqupt.onlinebooking.po.CheckedAndExamTimes;
import cn.cqupt.onlinebooking.po.ExamID;
import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.ScoreCustome;
import cn.cqupt.onlinebooking.po.Student;
import cn.cqupt.onlinebooking.po.StudentCustom;
import cn.cqupt.onlinebooking.po.StudentbookingCustome;
import cn.cqupt.onlinebooking.po.StudnetQueryVo;
import cn.cqupt.onlinebooking.po.SystemDataCustom;
import cn.cqupt.onlinebooking.service.ClassroomService;
import cn.cqupt.onlinebooking.service.PagingService;
import cn.cqupt.onlinebooking.service.StudentService;
import cn.cqupt.onlinebooking.service.TeacherService;

@Controller
public class StudentsController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private ClassroomService classroomServcie;
	@Autowired
	private PagingService pagingService;
	@Autowired
	private TeacherService teacherService;
	public static int aggreStudentLogin = 1;
	public static int reservationPemission = 1;
	@RequestMapping("/queryStudent")
	public ModelAndView getStudentLsit() throws Exception{
		List<StudentCustom> studentList = studentService.findStudentList(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("studentList", studentList);
		modelAndView.setViewName("students/studentList");
		return modelAndView;
	}
	//登录验证方法
	@RequestMapping("studentlogin")
	public ModelAndView getStudentByStudentNo(StudnetQueryVo studnetQueryVo,String checkCode,HttpSession session)
			throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		if(!session.getAttribute("randCheckCode").equals(checkCode)) {
			modelAndView.addObject("information","验证码错误");
			modelAndView.setViewName("students/login");
			return modelAndView;
		}
		if(aggreStudentLogin == 1 ) {
			modelAndView.setViewName("students/noAggreLogin");
			return modelAndView;
		}
		StudentCustom studentCustom = studentService.findStudentByNameAndPw(studnetQueryVo);
		ExamID ExamIDPO = studentService.ifHasReserved(studnetQueryVo.getStudentCustom().getStudentno());
		if(ExamIDPO == null ) {
			modelAndView.addObject("examId",0);
		}else {
			modelAndView.addObject("examId",ExamIDPO.getExamID());
		}
		if(studentCustom != null) {
			List<ProctorCustome> proctorCustomeList = classroomServcie.getExamInformationNotRepeat(TeacherController.openBatch);
			modelAndView.addObject("studentCustom", studentCustom);
			modelAndView.addObject("proctorCustomeList",proctorCustomeList);
			Integer count = studentService.getifCountStudentBookingAndFinished(studentCustom.getStudentno());
			/*if(count > 0) {
				modelAndView.setViewName("students/hasFinishedBooking");
				return modelAndView;
			}*/
			//得到通知
			List<SystemDataCustom> systemDataCustomList = teacherService.getAllSystemData();
			modelAndView.addObject("systemDataCustomList",systemDataCustomList);
			//modelAndView.setViewName("students/studentLoginSuccess");
			modelAndView.setViewName("students/student_index");
			return modelAndView;
		}else {
			modelAndView.setViewName("students/login");
			return modelAndView;
		}
	}
	@RequestMapping("preOrderDetail")
	public ModelAndView preOrderDetai(String studentno,String studentpw) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if(aggreStudentLogin == 1 ) {
			modelAndView.setViewName("students/noAggreLogin");
			return modelAndView;
		}
		StudnetQueryVo studnetQueryVo = new StudnetQueryVo();
		StudentCustom studentCustomTmp = new StudentCustom();
		studentCustomTmp.setStudentno(studentno);
		studentCustomTmp.setStudentpw(studentpw);
		studnetQueryVo.setStudentCustom(studentCustomTmp);
		StudentCustom studentCustom = studentService.findStudentByNameAndPw(studnetQueryVo);
		ExamID ExamIDPO = studentService.ifHasReserved(studnetQueryVo.getStudentCustom().getStudentno());
		if(ExamIDPO == null ) {
			modelAndView.addObject("examId",0);
		}else {
			modelAndView.addObject("examId",ExamIDPO.getExamID());
		}
		if(studentCustom != null) {
			List<ProctorCustome> proctorCustomeList = classroomServcie.getExamInformationNotRepeat(TeacherController.openBatch);
			modelAndView.addObject("studentCustom", studentCustom);
			modelAndView.addObject("proctorCustomeList",proctorCustomeList);
			//得到通知
			List<SystemDataCustom> systemDataCustomList = teacherService.getAllSystemData();
			modelAndView.addObject("systemDataCustomList",systemDataCustomList);
			modelAndView.setViewName("students/studentLoginSuccess");
			return modelAndView;
		}else {
			modelAndView.setViewName("students/login");
			return modelAndView;
		}
	}
	//按照学号获得学生的成绩
	@RequestMapping("getScoreByStudentNo")
	public ModelAndView getStudentScoreByStudentNo(String studentNo) throws Exception {
		ScoreCustome scoreCustome = studentService.selectScoreByStudentNo(studentNo);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("scoreCustome",scoreCustome);
		modelAndView.setViewName("students/studentScoreByStudentNo");
		return modelAndView;
	}
	//得到学生的界面，里面显示的是通知信息
	@RequestMapping("studentMain")
	public ModelAndView studentMain() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		List<SystemDataCustom> systemDataCustomList = teacherService.getAllSystemData();
		modelAndView.addObject("systemDataCustomList",systemDataCustomList);
		modelAndView.setViewName("students/student_main");
		return modelAndView;
	}
	@RequestMapping("modifyPasswordPage")
	public ModelAndView modifyPasswordPage() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("students/modifyPassword_page");
		
		return modelAndView;
	}
	//得到是否是允许学生登录
	public ModelAndView getStudentAggreState() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if(aggreStudentLogin == 0) {
			modelAndView.addObject("aggreLoginState",0);
		}else {
			modelAndView.addObject("aggreLoginState",1);
		}
		modelAndView.setViewName("teacher/main");
		return modelAndView;
	}
	//得到所有的学生
	@RequestMapping("studentList")
	public ModelAndView getAllStudents(StudentCustom studentCustom,Integer pageNow,Integer pageSize) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		List<StudentCustom> studentList = studentService.findStudentList(null);
		modelAndView.addObject("studentList", studentList);
		modelAndView.setViewName("students/studentList");
		return modelAndView;
	}
	//添加学生
	@RequestMapping("studentaddPage")
	public String studentAddPage(Model model) throws Exception {
		/*studentService.addStudent(studentCustom);
		if( studentCustom.getStudentid() != null) {
			model.addAttribute("success", studentCustom.getStudentid());
		}*/
		return "students/studentadd";
	}
	@RequestMapping("addStudent")
	public String studentAdd(Model model,StudentCustom studentCustom) throws Exception {
		studentService.addStudent(studentCustom);
		if( studentCustom.getStudentid() != null) {
			model.addAttribute("success", studentCustom.getStudentid());
		}
		return "students/studentadd";
	}
	@RequestMapping("uploadStudentPage")
	public String uploadStudentPage() throws Exception {
		return "students/uploadStudent";
	}
	@RequestMapping("uploadStudentScorePage")
	public String uploadStudentScorePage() throws Exception {
		return "students/uploadStudentScore";
	}
	//通知管理
	
	@RequestMapping("updateStudentPage")
	public ModelAndView updateStudentPage(Integer studentID,String studentNo) throws Exception {
		//StudentCustom studentCustom = studentService.
		Student student = studentService.selectStudentById(studentID);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student",student);
		modelAndView.setViewName("students/updateStudent");
		return modelAndView;
	}
	@RequestMapping("udpateStudentToDatabase")
	public ModelAndView updataStudentToDatabase(StudentCustom studentCustom,String studentname) throws Exception {
		studentService.updateStudent(studentCustom.getStudentid(), studentCustom);
		/*StudentsController studentController = new StudentsController();
		return studentController.getAllStudents(null);*/
		ModelAndView modelAndView = new ModelAndView();
		List<StudentCustom> studentList = studentService.findStudentList(null);
		modelAndView.addObject("studentList", studentList);
		modelAndView.setViewName("students/studentList");
		return modelAndView;
	}
	//学生自己修改自己的密码
	@RequestMapping("modifyPasswordToDB")
	public ModelAndView modifyPasswordToDB(String studentNo,String oldPassword, String newPassword) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		StudnetQueryVo studnetQueryVo = new StudnetQueryVo();
		StudentCustom studentCustomTmp = new StudentCustom();
		studentCustomTmp.setStudentno(studentNo);
		studentCustomTmp.setStudentpw(oldPassword);
		studnetQueryVo.setStudentCustom(studentCustomTmp);
		StudentCustom studentCustom = studentService.findStudentByNameAndPw(studnetQueryVo);
		if(studentCustom == null) {
			modelAndView.addObject("information","旧密码错误，请核对后再输");
			modelAndView.setViewName("students/modifyPassword_page");
			return modelAndView;
		}else {
			studentService.updateStdentPassword(studentNo, newPassword);
			modelAndView.setViewName("students/modifyPasswdSuccess");
			return modelAndView;
		}
		
	}
	//签到
	@RequestMapping("qiandao_page")
	public ModelAndView qiandaopage() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("students/qiandao_page");
		return modelAndView;
	}
	
	//按照分页显示分数
	@RequestMapping("studentsScore")
	public ModelAndView getStudentsScore(Integer pageCount) throws Exception {
		List<ScoreCustome> scores = studentService.selectScorePageContent(pageCount);
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject("")
		modelAndView.addObject("scores",scores);
		modelAndView.setViewName("students/studentsScore");
		return modelAndView;
	}
	@RequestMapping("studentsScoreAdd")
	public ModelAndView studentsScoreAdd() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("students/studentsScoreAdd");
		return modelAndView;
	}
	@RequestMapping("modifyScorePage")
	public ModelAndView updateScorePage(String studentNo) throws Exception {
		ScoreCustome score = studentService.selectScoreByStudentNo(studentNo);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("score",score);
		modelAndView.setViewName("students/updateSoresPage");
		return modelAndView;
	}
	//删除学生
	@RequestMapping("deleteStudentByPrimary")
	public ModelAndView deleteStudentByPrimary(Integer studentId,String studentNo) throws Exception {
		studentService.deleteStudentByPrimary(studentId, studentNo);
		return this.getAllStudents(null,1,2);
	}
	//更新分数信息
	@RequestMapping("udpateScoreToDatabase")
	public ModelAndView udpateScoreToDatabase(ScoreCustome scoreCustome) throws Exception {
		studentService.updateScoreToDatabase(scoreCustome);
		return getStudentsScore(1);
	}
	//学生预约考试
	@RequestMapping("studentBooking")
	public ModelAndView studentBooking(@Param("classroonId")Integer classroonId,@Param("examID")Integer examID,@Param("studentNo")String studentNo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if(reservationPemission == 1) {
			modelAndView.setViewName("students/noReservationPemission");
			return modelAndView;
		}
		//根据学号查询学生
		ExamID ExamIDPO  = studentService.ifHasReserved(studentNo);
		if(ExamIDPO != null && ExamIDPO.getExamID() > 0) {
			modelAndView.addObject("information","您已经预约过，请不要重复预约");
			modelAndView.setViewName("students/hasReserved");
			return modelAndView;
		}
		//得到学生的考试次数和作弊情况
		CheckedAndExamTimes checkedAndExamTimes = studentService.getExamTimesAndIschecked(studentNo);
		if(checkedAndExamTimes.getExamTimes() >= 2) {
			modelAndView.addObject("information","您考试次数最多是两次，已不能再次参加考试");
			modelAndView.setViewName("students/hasReserved");
			return modelAndView;
		}
		if(checkedAndExamTimes.getIscheated() == 1) {
			modelAndView.addObject("information","您有相关的作弊记录，已不能参加考试");
			modelAndView.setViewName("students/hasReserved");
			return modelAndView;
		}
		synchronized (this) {
			Integer insertResult = studentService.addStudentBookingInformation(classroonId, examID, studentNo);
			if(insertResult > 0) {
				//System.out.println("插入成功");
				ExamID examIDPOTmp = studentService.ifHasReserved(studentNo);
				if(examIDPOTmp == null ) {
					modelAndView.addObject("examId",0);
				}else {
					modelAndView.addObject("examId",examIDPOTmp.getExamID());
				}
				List<ProctorCustome> proctorCustomeList = classroomServcie.getExamInformationNotRepeat(TeacherController.openBatch);
				modelAndView.addObject("proctorCustomeList",proctorCustomeList);
				modelAndView.setViewName("students/studentLoginSuccess");
				return modelAndView;
			}else {
				modelAndView.setViewName("students/bookingFailure");
			}
			return modelAndView;
		}
	}
	private static ProctorCustome proctorCustomeTmp = null;
	//学生预约详情
	@RequestMapping("bookingDetailPage")
	public ModelAndView bookingDetailPage(ProctorCustome proctorCustome) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		proctorCustomeTmp = proctorCustome;
		modelAndView.addObject("proctorCustome",proctorCustome);
		//得到该场开始的预约信息
		List<StudentbookingCustome> studentBookingCustomeList = 
				studentService.getStudeentBookingByProctorInformation(proctorCustome);
		modelAndView.addObject("studentBookingCustomeList", studentBookingCustomeList);
		modelAndView.setViewName("students/studentBookingByExamList");
		return modelAndView;
	}
	//根据预约的id删除预定信息
	@RequestMapping("deleteStudentBookingById")
	public ModelAndView deleteStudentBookingById(Integer studentBookingId) throws Exception {
		studentService.deleteStudentBookingById(studentBookingId);
		ModelAndView modelAndView = bookingDetailPage(proctorCustomeTmp);
		return modelAndView;
	}
}
