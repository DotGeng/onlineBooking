package cn.cqupt.onlinebooking.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.cqupt.onlinebooking.mapper.ProctorMapperCustome;
import cn.cqupt.onlinebooking.mapper.SystemdataMapperCustom;
import cn.cqupt.onlinebooking.mapper.TeacherMapperCustom;
import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.SystemDataCustom;
import cn.cqupt.onlinebooking.po.Teacher;
import cn.cqupt.onlinebooking.po.TeacherCustom;
import cn.cqupt.onlinebooking.po.TeacherQueryVo;
import cn.cqupt.onlinebooking.service.TeacherService;

public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	private TeacherMapperCustom teaherMapperCustom;
	@Autowired
	private ProctorMapperCustome proctorMapperCustome;
	@Autowired
	private SystemdataMapperCustom systemdataMapperCustom;
	
	public TeacherCustom findTeacherByNameAndPW(TeacherQueryVo teacherQueryVo)
			throws Exception {
		return teaherMapperCustom.findTeacherByNameAndPW(teacherQueryVo);
	}
	public Integer addTeacher(TeacherCustom teacherCustom) throws Exception {
		teaherMapperCustom.addTeacher(teacherCustom);
		return null;
	}
	public List<TeacherCustom> getAllTeacher(TeacherCustom teacherCustom)
			throws Exception {
		return teaherMapperCustom.getAllTeacher(teacherCustom);
	}
	public Teacher selectTeacherByPriamryKey(Integer teacherId)
			throws Exception {
		return teaherMapperCustom.selectByPrimaryKey(teacherId);
		
	}
	public void updateTeacher(Integer id, TeacherCustom teacherCustom)
			throws Exception {
		teacherCustom.setTeacherid(id);
		teaherMapperCustom.updateByPrimaryKey(teacherCustom);
	}
	public void deleteTeacher(Integer id) throws Exception {
		teaherMapperCustom.deleteByPrimaryKey(id);
	}
	public List<TeacherCustom> getAllTeacherNameAndID() throws Exception {
		return teaherMapperCustom.getAllTeacherNameAndID();
	}
	public TeacherCustom getTeacherByNameAndPassword(
			TeacherQueryVo teacherQueryVo) throws Exception {
		return teaherMapperCustom.getTeacherByNameAndPassword(teacherQueryVo);
	}
	public List<ProctorCustome> getProctorByTeacherName(TeacherQueryVo qu)
			throws Exception {
		return teaherMapperCustom.getProctorByName(qu);
	}
	public int getExamID(int examroomId, int batch, int week, int period)
			throws Exception {
		return proctorMapperCustome.getExamID(examroomId, batch, week, period);
	}
	public int getReservedStudentCount() throws Exception {
		return teaherMapperCustom.getReservedStudentCount();
	}
	public List<SystemDataCustom> getAllSystemData() throws Exception {
		return systemdataMapperCustom.getAllSystemData();
	}
	public void deleteNotifyById(Integer systemdataId) throws Exception {
		//调用反向工程的函数
		systemdataMapperCustom.deleteByPrimaryKey(systemdataId);
	}
	public void addNotifyInformation(String systemdataname,
			String systemdatacontent) throws Exception {
		SystemDataCustom systemDataCustom = new SystemDataCustom();
		systemDataCustom.setSystemdataname(systemdataname);
		systemDataCustom.setSystemdatacontent(systemdatacontent);
		//获取系统时间
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");//设置日期格式
		String dateTmp = df.format(new Date()).toString();
		systemDataCustom.setDatetime(dateTmp);
		systemdataMapperCustom.insert(systemDataCustom);
	}
	public List<TeacherCustom> getAllTeacher(TeacherCustom teacherCustom,
			Integer pageNow, Integer pageSize) throws Exception {
		Integer pageStart = pageSize * pageNow;
		Integer pageEndSart = pageStart + pageSize;
		List<TeacherCustom> TeacherCustomList = teaherMapperCustom.getAllTeacherByPage(teacherCustom,pageStart,pageEndSart);
		return TeacherCustomList;
	}
	public Integer getAllTeacherCount() throws Exception {
		return teaherMapperCustom.getAllTeacherCount();
	}
	public void deleteStudentInformation() throws Exception {
		systemdataMapperCustom.deleteStudentInformation();
	}
	public Integer getStudentBookingByExamId(Integer examID) throws Exception {
		return proctorMapperCustome.getStudentBookingByExamId(examID);
	}

}
