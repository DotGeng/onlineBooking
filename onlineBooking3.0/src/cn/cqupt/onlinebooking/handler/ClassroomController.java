package cn.cqupt.onlinebooking.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.cqupt.onlinebooking.po.ClassroomCustom;
import cn.cqupt.onlinebooking.po.PeriodCustome;
import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.SeatCustome;
import cn.cqupt.onlinebooking.po.SeatQueryVo;
import cn.cqupt.onlinebooking.po.TeacherCustom;
import cn.cqupt.onlinebooking.service.ClassroomService;
import cn.cqupt.onlinebooking.service.PeriodService;
import cn.cqupt.onlinebooking.service.TeacherService;

@Controller
public class ClassroomController {
	@Autowired
	private ClassroomService classroomServcie;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private PeriodService periodService;
	
	//得到所有的机房信息
	@RequestMapping("classroomList")
	public ModelAndView getAllClassRoom() throws Exception {
		List<ClassroomCustom> classroomLsit = classroomServcie.getAllClassroom(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("classroomLsit",classroomLsit);
		modelAndView.setViewName("students/classroomList");
		return modelAndView;
	}
	//跳转到机房的增加页面
	@RequestMapping("classroomaddPage")
	public String intoClassroomAddPage(Model model) throws Exception {
		return "students/classroomadd";
	}
	//添加机房信息到数据库
	@RequestMapping("classroomAdd")
	public String addClassroom(Model model,ClassroomCustom classroomCustom) throws Exception {
		classroomServcie.addClassroom(classroomCustom);
		if(classroomCustom.getClassroomid() == null) {
			return "students/classroomadd";
		}
		return "students/classroomadd";
	}
	//添加机房座位信息到作为表
	/*@RequestMapping("addSeatToDB")
	public ModelAndView addSeatToDB(SeatCustome seatCustome) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		return modelAndView;
	}*/
	//修改座位信息
	@RequestMapping("modifySeatPage")
	public ModelAndView modifySeatPage(String classRoom,Integer classRoomSize,Integer roomid) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		ClassroomCustom seatCustome = new ClassroomCustom();
		seatCustome.setClassroomname(classRoom);
		seatCustome.setMaxsize(classRoomSize);
		seatCustome.setClassroomid(roomid);
		modelAndView.addObject("seatCustome",seatCustome);
		//得到座位信息
		List<SeatCustome> seats= classroomServcie.findSeatByClassRoom(classRoom);
		if(seats.size() < classRoomSize) {
			for(int i = seats.size()+1; i<= classRoomSize; i ++) {
				SeatCustome st = new SeatCustome();
				st.setSeatno(i);
				seats.add(st);
			}
		}
		modelAndView.addObject("seats",seats);
		modelAndView.setViewName("students/modifySeatPage");
		return modelAndView;
	}
	@RequestMapping("ModifyClassroomPage")
	public ModelAndView modifyClassroomPage(Integer classroomid,String classRoom,Integer classRoomSize) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		ClassroomCustom classroomCustom = new ClassroomCustom();
		classroomCustom.setClassroomid(classroomid);
		classroomCustom.setClassroomname(classRoom);
		classroomCustom.setMaxsize(classRoomSize);
		modelAndView.addObject("classroomCustom", classroomCustom);
		modelAndView.setViewName("students/modifyClassroomPage");
		return modelAndView;
	}
	//修改机房信息
	@RequestMapping("updateClassroomToDB")
	public ModelAndView updateClassroomToDB(ClassroomCustom classroomCustome) throws Exception {
		//机房传过类的新旧名字如果不相同就删除数据库表seat中的相关数据
		synchronized (this) {
			if(!classroomCustome.getClassroomname().trim().equals(classroomCustome.getOldclassroomname().trim())) {
				classroomServcie.deleteSeatByClassroomName(classroomCustome.getOldclassroomname());
			}
			//更新机房信息
			classroomServcie.updateClassroomByID(classroomCustome);
		}
		return this.getAllClassRoom();
	}
	//删除机房信息
	@RequestMapping("deleteClassRoomById")
	public ModelAndView deleteClassRoomById(Integer classroomid) throws Exception {
		classroomServcie.deleteClassroomById(classroomid);
		return this.getAllClassRoom();
	}
			
	//批量修改座位信息
	@RequestMapping("editSeatAllSubmit")
	public ModelAndView editSeatAllSubmit(SeatQueryVo seatQueryVo) throws Exception {
		classroomServcie.modifySeatAndSubmit(seatQueryVo.getSeatsList());
		return getAllClassRoom();
	}
	//得到机房监考员信息
	@RequestMapping("getProctorList")
	public ModelAndView getProctorPage() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		List<ProctorCustome> proctorCustomeList = classroomServcie.getProctorList();
		modelAndView.addObject("proctorCustomeList", proctorCustomeList);
		modelAndView.setViewName("students/proctorList");
		return modelAndView;
	}
	
	//进入到监考老师添加界面
	@RequestMapping("addProctorPage")
	public ModelAndView addProctorPage() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		//得到所有机房的名字信息和id
		List<ClassroomCustom> classroomList = classroomServcie.getAllClassroomNameAndId();
		//得到所有老师的名字和id和角色
		List<TeacherCustom> teacherCustomeList = teacherService.getAllTeacherNameAndID();
		//得到所有节数信息和id
		List<PeriodCustome> periodCustomeList = periodService.getPeriodNameAndID();
		modelAndView.addObject("classroomList",classroomList);
		modelAndView.addObject("teacherCustomeList",teacherCustomeList);
		modelAndView.addObject("periodCustomeList", periodCustomeList);
		modelAndView.setViewName("teacher/addProctorPage");
		return modelAndView;
	}
	//添加考试场次并设置监考老师
	@RequestMapping("addProctorToDB")
	public ModelAndView addProctorToDB(ProctorCustome proctorCustome) throws Exception {
		classroomServcie.insertProctorAndExamToDB(proctorCustome);
		return getProctorPage();
	}
	//根据id获取监考员和考试的信息
	@RequestMapping("ModifyProctorPage")
	public ModelAndView ModifyProctorPage(Integer examID) throws Exception {
		ModelAndView modelAndView = addProctorPage();
		ProctorCustome proctorCustome = classroomServcie.getProctorByExamId(examID);
		modelAndView.addObject("proctorCustome", proctorCustome);
		modelAndView.setViewName("teacher/modifyProctorPage");
		return modelAndView;
	}
	//根据id修改监考员和考试的信息
	@RequestMapping("updateProctorToDB")
	public ModelAndView updateProctorToDB(Integer examID,ProctorCustome proctorCustome) throws Exception {
		
		classroomServcie.updateProctorByExamId(examID, proctorCustome);
		ModelAndView  modelAndView = getProctorPage();
		return modelAndView;
	}
	//根据id删除员和考试信息
	@RequestMapping("deleteProctorById")
	public ModelAndView deleteProctorById(Integer examID) throws Exception {
		classroomServcie.deleteProctorByExamID(examID);
		ModelAndView modelAndView = getProctorPage();
		return modelAndView;
	}
}
