package cn.cqupt.onlinebooking.handler;



import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.NDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.cqupt.onlinebooking.po.ClassroomCustom;
import cn.cqupt.onlinebooking.po.PeriodCustome;
import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.StudentbookingCustome;
import cn.cqupt.onlinebooking.po.SystemDataCustom;
import cn.cqupt.onlinebooking.po.Teacher;
import cn.cqupt.onlinebooking.po.TeacherCustom;
import cn.cqupt.onlinebooking.po.TeacherQueryVo;
import cn.cqupt.onlinebooking.service.ClassroomService;
import cn.cqupt.onlinebooking.service.PeriodService;
import cn.cqupt.onlinebooking.service.StudentService;
import cn.cqupt.onlinebooking.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private ClassroomService classroomServcie;
	@Autowired
	private PeriodService periodService;
	@Autowired
	private StudentService studentService;
	//管理员登录
		@RequestMapping("managerLogin")
		public ModelAndView getManagerByNameAndPW(TeacherQueryVo qu,String checkCode,HttpSession session) throws Exception {
			TeacherCustom teacher = teacherService.findTeacherByNameAndPW(qu);
			ModelAndView modelAndView = new ModelAndView();
			if(!session.getAttribute("randCheckCode").equals(checkCode)) {
				modelAndView.addObject("information","验证码错误");
				modelAndView.setViewName("teacher/managerLogin");
				return modelAndView;
			}
			if(teacher == null) {
				modelAndView.setViewName("teacher/managerLogin");
				return modelAndView;
			}
			modelAndView.addObject("teacher", teacher);
			//modelAndView.addObject("teacherName",teacherName);
			modelAndView.setViewName("teacher/index");
			return modelAndView;
		}
		@RequestMapping("tomanagerLoginpage")
		public ModelAndView atomanagerLoginpage() throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("teacher/loginForManagerData");
			return modelAndView;
		}
		@RequestMapping("managerLoginAgain")
		public ModelAndView getManagerByNameAndPWAgain(TeacherQueryVo qu,String checkCode,HttpSession session) throws Exception {
			TeacherCustom teacher = teacherService.findTeacherByNameAndPW(qu);
			ModelAndView modelAndView = new ModelAndView();
			
			if(teacher == null) {
				modelAndView.setViewName("teacher/loginForManagerData");
				return modelAndView;
			}
			modelAndView.addObject("teacher", teacher);
			//modelAndView.addObject("teacherName",teacherName);
			modelAndView.setViewName("teacher/manageData");
			return modelAndView;
		}
		@RequestMapping("teacherloginbefore")
		public ModelAndView getTeacherByNameAndPasswordbefore(TeacherQueryVo qu,String checkCode,HttpSession session) throws Exception {
			TeacherCustom teacher = teacherService.getTeacherByNameAndPassword(qu);
			ModelAndView modelAndView = new ModelAndView();
			if(!session.getAttribute("randCheckCode").equals(checkCode)) {
				modelAndView.addObject("information","验证码错误");
				modelAndView.setViewName("teacher/teacherLogin");
				return modelAndView;
			}
			teacherService.getTeacherByNameAndPassword(qu);
			
			if(teacher == null) {
				modelAndView.setViewName("teacher/teacherLogin");
				return modelAndView;
			}
			modelAndView.addObject("loginerName",teacher.getTeachername());
			modelAndView.setViewName("teacher/mainNormalTeacher_index");
			return modelAndView;
		}
		//普通教师登录
		@RequestMapping("teacherlogin")
		public ModelAndView getTeacherByNameAndPassword(TeacherQueryVo qu,String checkCode,HttpSession session) throws Exception {
			TeacherCustom teacher = teacherService.getTeacherByNameAndPassword(qu);
			ModelAndView modelAndView = new ModelAndView();
			if(!session.getAttribute("randCheckCode").equals(checkCode)) {
				modelAndView.addObject("information","验证码错误");
				modelAndView.setViewName("teacher/teacherLogin");
				return modelAndView;
			}
			teacherService.getTeacherByNameAndPassword(qu);
			
			if(teacher == null) {
				modelAndView.setViewName("teacher/teacherLogin");
				return modelAndView;
			}
			//得到所有的机房的名字
			List<ClassroomCustom> classroomLsit = classroomServcie.getAllClassroom(null);
			modelAndView.addObject("classroomLsit",classroomLsit);
			modelAndView.addObject("loginerName",teacher.getTeachername());
			modelAndView.setViewName("teacher/teahcer_main_bottom");
			return modelAndView;
		}
		//根据监考老师得到监考信息
		public ModelAndView getProctorByName(TeacherQueryVo qu) throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			List<ProctorCustome> proctorCustomeList = teacherService.getProctorByTeacherName(qu);
			modelAndView.addObject("proctorCustomeList", proctorCustomeList);
			modelAndView.setViewName("teacher/proctorListforteacher");
			return modelAndView;
		}
		
		//得到学生的预约详情（table中的实现）
		@RequestMapping("getBookingDetailPageThroughTable")
		public ModelAndView getBookingDetailPageThroughTable(String examroomName,Integer examroomId,Integer batch,Integer week,Integer period) throws Exception {
			int examID = teacherService.getExamID(examroomId, batch, week, period);
			//根据xamid得到学生预约名单
			ProctorCustome proctorCustome = new ProctorCustome();
			proctorCustome.setExamid(examID);
			//得到该场开始的预约信息
			ModelAndView modelAndView = new ModelAndView();
			List<StudentbookingCustome> studentBookingCustomeList = 
					studentService.getStudeentBookingByProctorInformation(proctorCustome);
			int count = teacherService.getReservedStudentCount();
			modelAndView.addObject("studentbookingCount",count);
			modelAndView.addObject("studentBookingCustomeList", studentBookingCustomeList);
			modelAndView.addObject("examroomName",examroomName);
			modelAndView.addObject("batch",batch);
			modelAndView.addObject("week",week);
			modelAndView.addObject("period",period);
			modelAndView.setViewName("teacher/bookingDetail");
			return modelAndView;
		}
		//按照机房名字和周次得到某一个机房的一周的状态
		@RequestMapping("getClassroomWithState")
		public ModelAndView getClassroomWithState(Integer examroomid,Integer batch,Integer role,String loginerName) throws Exception {
			//得到所有的节次信息
			List<PeriodCustome> periodCustomList = periodService.getPeriodNameAndID();
			//得到当天当周的安排信息的信息
			String classroomName = classroomServcie.getClassroomNameByClassroomId(examroomid);
			List<String>  classroomStateList =classroomServcie.getClassroomWithState(examroomid, batch);
			List<ClassroomCustom> classroomLsit = classroomServcie.getAllClassroom(null);
			
			ModelAndView modelAndView = new ModelAndView();
			//modelAndView.addObject("periodCustomList", periodCustomList);
			int countPeriod = 0;
			for(PeriodCustome periodCustome: periodCustomList) {
				//把每节课的名字传到前台
				countPeriod++;
				modelAndView.addObject(periodCustome.getPeriodid()+"th",periodCustome.getPeriodname());
			}
			int count = teacherService.getReservedStudentCount();
			modelAndView.addObject("loginerName",loginerName);
			modelAndView.addObject("studentbookingCount",count);
			modelAndView.addObject("classroomName",classroomName);
			modelAndView.addObject("examroomid",examroomid);
			modelAndView.addObject("batch",batch);
			modelAndView.addObject("countPeriod",countPeriod);
			modelAndView.addObject("classroomStateList",classroomStateList);
			modelAndView.addObject("classroomLsit",classroomLsit);
			if(role != null) {
				modelAndView.setViewName("teacher/mainNormalTeacher");
				return modelAndView;
			}
			modelAndView.setViewName("teacher/main_bottom");
			return modelAndView;
		}
		@RequestMapping("getClassroomWithStateForTeacher")
		public ModelAndView getClassroomWithStateForTeacher(Integer examroomid,Integer batch,Integer role,String loginerName) throws Exception {
			//得到所有的节次信息
			List<PeriodCustome> periodCustomList = periodService.getPeriodNameAndID();
			//得到当天当周的安排信息的信息
			String classroomName = classroomServcie.getClassroomNameByClassroomId(examroomid);
			List<String>  classroomStateList =classroomServcie.getClassroomWithState(examroomid, batch);
			List<ClassroomCustom> classroomLsit = classroomServcie.getAllClassroom(null);
			
			ModelAndView modelAndView = new ModelAndView();
			//modelAndView.addObject("periodCustomList", periodCustomList);
			int countPeriod = 0;
			for(PeriodCustome periodCustome: periodCustomList) {
				//把每节课的名字传到前台
				countPeriod++;
				modelAndView.addObject(periodCustome.getPeriodid()+"th",periodCustome.getPeriodname());
			}
			int count = teacherService.getReservedStudentCount();
			modelAndView.addObject("loginerName",loginerName);
			modelAndView.addObject("studentbookingCount",count);
			modelAndView.addObject("classroomName",classroomName);
			modelAndView.addObject("examroomid",examroomid);
			modelAndView.addObject("batch",batch);
			modelAndView.addObject("countPeriod",countPeriod);
			modelAndView.addObject("classroomStateList",classroomStateList);
			modelAndView.addObject("classroomLsit",classroomLsit);
			if(role != null) {
				modelAndView.setViewName("teacher/teacher_main_bottom");
				return modelAndView;
			}
			modelAndView.setViewName("teacher/main_bottom");
			return modelAndView;
		}
		//设置机房的状态（考试，没课，有课）；
		@RequestMapping("settingClassroomState")
		public ModelAndView settingClassroomState(Integer state,String teacherName,Integer examroomId,Integer batch,Integer week,Integer period) throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			//得到机房名字
			String classroomName = classroomServcie.getClassroomNameByClassroomId(examroomId);
			//得到所有老师列表
			List<TeacherCustom> teacherCustomeList = teacherService.getAllTeacherNameAndID();
			
			modelAndView.addObject("classroomName",classroomName);
			modelAndView.addObject("teacherCustomeList",teacherCustomeList);
			modelAndView.addObject("state",state);
			modelAndView.addObject("examroomId",examroomId);
			modelAndView.addObject("batch",batch);
			modelAndView.addObject("week",week);
			modelAndView.addObject("period",period);
			modelAndView.setViewName("teacher/modifyClassroomState");
			return modelAndView;
		}
		@RequestMapping("addToDBAboutClassroomState")
		public ModelAndView addToDBAboutClassroomState(Integer state,Integer wantTostate,Integer teacherid, Integer examroomId,Integer batch,Integer week, Integer period) throws Exception {
			classroomServcie.updateClassroomState(examroomId, teacherid, batch, week, period, state, wantTostate);
			//得到所有的节次信息
			List<PeriodCustome> periodCustomList = periodService.getPeriodNameAndID();
			//得到当天当周的安排信息的信息
			String classroomName = classroomServcie.getClassroomNameByClassroomId(examroomId);
			List<String>  classroomStateList =classroomServcie.getClassroomWithState(examroomId, batch);
			List<ClassroomCustom> classroomLsit = classroomServcie.getAllClassroom(null);
			
			ModelAndView modelAndView = new ModelAndView();
			//modelAndView.addObject("periodCustomList", periodCustomList);
			int countPeriod = 0;
			for(PeriodCustome periodCustome: periodCustomList) {
				//把每节课的名字传到前台
				countPeriod++;
				modelAndView.addObject(periodCustome.getPeriodid()+"th",periodCustome.getPeriodname());
			}
			int count = teacherService.getReservedStudentCount();
			modelAndView.addObject("studentbookingCount",count);
			modelAndView.addObject("classroomName",classroomName);
			modelAndView.addObject("examroomid",examroomId);
			modelAndView.addObject("batch",batch);
			modelAndView.addObject("countPeriod",countPeriod);
			modelAndView.addObject("classroomStateList",classroomStateList);
			modelAndView.addObject("classroomLsit",classroomLsit);
			modelAndView.setViewName("teacher/main");
			return modelAndView;
		}
		@RequestMapping("head")
		public String getIndexOne(Model model) throws Exception {
			return "teacher/indexone";
		}
		@RequestMapping("main_before")
		public ModelAndView getMainIndex() throws Exception {
			//得到所有的机房的名字loginerName
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.setViewName("teacher/main_index");
			
			return modelAndView;
		}
		@RequestMapping("main")
		public ModelAndView getIndexTwo(Model model) throws Exception {
			//得到所有的机房的名字
			List<ClassroomCustom> classroomLsit = classroomServcie.getAllClassroom(null);
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.addObject("classroomLsit",classroomLsit);
			modelAndView.setViewName("teacher/main_top");
			
			return modelAndView;
		}
		@RequestMapping("main_teacher")
		public ModelAndView getIndexTwoForTeacher(String loginerName) throws Exception {
			//得到所有的机房的名字
			List<ClassroomCustom> classroomLsit = classroomServcie.getAllClassroom(null);
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.addObject("classroomLsit",classroomLsit);
			modelAndView.addObject("loginerName",loginerName);
			modelAndView.setViewName("teacher/main_top_teacher");
			
			return modelAndView;
		}
		/*public String getTeacherList(Model model) throws Exception {
			return "teacher/user";
		}*/
		@RequestMapping("connoisseuradd")
		public String getConnoisseuradd() throws Exception {
			return "teacher/connoisseuradd";
		}
		//修改学生的权限
		@RequestMapping("modifyPermissionsPage")
		public ModelAndView modifyPermissions() throws Exception {
			ModelAndView modelAndView  = new ModelAndView();
			modelAndView.addObject("aggreStudentLogin",StudentsController.aggreStudentLogin);
			modelAndView.addObject("reservationPemission",StudentsController.reservationPemission);
			modelAndView.setViewName("teacher/modifyPermissions");
			return modelAndView;
		}
		//改变学生登录权限到持久化数据中
		@RequestMapping("changeLoginPemission")
		public ModelAndView changeLoginPemission(Integer aggreStudentLogin) throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			StudentsController.aggreStudentLogin = aggreStudentLogin;
			modelAndView.addObject("aggreStudentLogin",StudentsController.aggreStudentLogin);
			modelAndView.addObject("reservationPemission",StudentsController.reservationPemission);
			modelAndView.setViewName("teacher/modifyPermissions");
			return modelAndView;
		}
		//改变学生的预定权限
		@RequestMapping("changeReservationPemission")
		public ModelAndView changeReservationPemission(Integer reservationPemission) throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			StudentsController.reservationPemission = reservationPemission;
			modelAndView.addObject("aggreStudentLogin",StudentsController.aggreStudentLogin);
			modelAndView.addObject("reservationPemission",StudentsController.reservationPemission);
			modelAndView.setViewName("teacher/modifyPermissions");
			return modelAndView;
		}
		//添加老师
		@RequestMapping("addTeacher")
		public String addTeacher(Model model,TeacherCustom teacherCustom) throws Exception {
			teacherService.addTeacher(teacherCustom);
			if( teacherCustom.getTeacherid() != null) {
				model.addAttribute("success", teacherCustom.getTeacherid());
			}
			return "teacher/connoisseuradd";
		}
		//得到所有的老师
		@RequestMapping("user")
		public ModelAndView getAllTeacher(TeacherCustom teacherCustom,Integer pageNow,Integer pageSize) throws Exception {
			if(pageNow == null) {
				pageNow = 0;
				pageSize = 10;
			}
			List<TeacherCustom> teacherList = teacherService.getAllTeacher(null,pageNow,pageSize);
			int rowCount = teacherService.getAllTeacherCount();
			int pageCount = rowCount/pageSize;
			Iterator<TeacherCustom> iterator = teacherList.iterator();
			while(iterator.hasNext()) {
				if(iterator.next().getTeacherrole().equals(0)) {
					iterator.remove();
				}
			}
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("teacherList",teacherList);
			modelAndView.addObject("pageCount",pageCount);
			modelAndView.addObject("pageNow",pageNow);
			modelAndView.setViewName("teacher/user");
			return modelAndView;
		}
		@RequestMapping("updateTeacher")
		public ModelAndView updateTeacher(Integer teacherID) throws Exception {
			Teacher teacher = teacherService.selectTeacherByPriamryKey(teacherID);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("teacher",teacher);
			modelAndView.setViewName("teacher/updateTeacher");
			return modelAndView;
		}	
		@RequestMapping("updateTeacherToDatabase")
		public ModelAndView updateTeacherToDatabase(TeacherCustom teacherCustom) throws Exception {
			teacherService.updateTeacher(teacherCustom.getTeacherid(), teacherCustom);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("teacher/updateTeacher");
			return modelAndView;
		}
		//得到所有的通知
		@RequestMapping("notifyList")
		public ModelAndView getNotifyList() throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			
			List<SystemDataCustom> systemDataCustomList = teacherService.getAllSystemData();
			modelAndView.addObject("systemDataCustomList",systemDataCustomList);
			modelAndView.setViewName("teacher/notifyList");
			return modelAndView;
		}
		//按照id删除通知
		@RequestMapping("deleteNotifyById")
		public ModelAndView deleteNotifyById(Integer systemdataid) throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			teacherService.deleteNotifyById(systemdataid);
			List<SystemDataCustom> systemDataCustomList = teacherService.getAllSystemData();
			modelAndView.addObject("systemDataCustomList",systemDataCustomList);
			modelAndView.setViewName("teacher/notifyList");
			return modelAndView;
		}
		//添加通知信息
		@RequestMapping("addNotifyPage")
		public ModelAndView addNotifyPage() throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("teacher/addNotifyPage");
			return modelAndView;
		}
		//添加通知信息到数据库
		@RequestMapping("addNotifyToDB")
		public ModelAndView addNotifyToDB(String systemdataname,
				String systemdatacontent) throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			teacherService.addNotifyInformation(systemdataname, systemdatacontent);
			List<SystemDataCustom> systemDataCustomList = teacherService.getAllSystemData();
			modelAndView.addObject("systemDataCustomList",systemDataCustomList);
			modelAndView.setViewName("teacher/notifyList");
			return modelAndView;
		}
		//按照id删除老师
		@RequestMapping("deleteTeacher")
		public ModelAndView deleteTeacher(Integer teacherID) throws Exception {
			teacherService.deleteTeacher(teacherID);
			ModelAndView modelAndView = this.getAllTeacher(null,0,10);
			return modelAndView;
		}
		@RequestMapping("uploadTeacher")
		public String editUploadTeacherPage() throws Exception {
			return "teacher/uploadTeacher";
		}
}
