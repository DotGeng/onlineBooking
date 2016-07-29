package cn.cqupt.onlinebooking.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cqupt.onlinebooking.po.ClassroomCustom;
import cn.cqupt.onlinebooking.po.ClassroomQueryVO;
import cn.cqupt.onlinebooking.po.ClassroombookingCount;
import cn.cqupt.onlinebooking.po.ClassroombookingCustom;
import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.SeatCustome;
import cn.cqupt.onlinebooking.po.StudentbookingCounted;

public interface ClassroomService {
	//得到所有的教室信息
	public List<ClassroomCustom> getAllClassroom(ClassroomQueryVO classroomQueryVO);
	//添加教室
	public void addClassroom(ClassroomCustom classroomCustom);
	//得到对应教室的座位
	public List<SeatCustome> findSeatByClassRoom(String classRoom) throws Exception;
	//根据机房名称删除座位信息
	public void deleteSeatByClassroomName(String classroomName) throws Exception;
	//根据id修改机房信息
	public void updateClassroomByID(ClassroomCustom classroomCustom) throws Exception;
	//根据id删除机房信息
	public void deleteClassroomById(Integer classroomId) throws Exception;
	//更改座位信息
	public void modifySeatAndSubmit(List<SeatCustome> seatsList) throws Exception;
	//得到所有的监考员信息
	public List<ProctorCustome> getProctorList() throws Exception;
	//得到所有的机房名字信息和id
	public List<ClassroomCustom> getAllClassroomNameAndId() throws Exception;
	//添加所有监考老师和考场信息
	public void insertProctorAndExamToDB(ProctorCustome proctorCustome) throws Exception;
	//根据id获得监考员和考试的信息
	public ProctorCustome getProctorByExamId(Integer examID) throws Exception;
	//根据examid修改监考员和考场信息
	public void updateProctorByExamId(Integer examId,ProctorCustome proctorCustome) throws Exception;
	//根据id删除监考员信息和考试信息
	public void deleteProctorByExamID(Integer examID) throws Exception;
	//查出所有的不重复的考试信息
	public List<ProctorCustome> getExamInformationNotRepeat() throws Exception;
	//得到所有的没有分配的座位
	public List<SeatCustome> getSeatsNotUsed(Integer classroomId) throws Exception;
	//根据机房的名字和考试周次获得该周的机房使用情况
	public List<String> getClassroomWithState(Integer examroomid,Integer batch) throws Exception;
	//根据机房id得到机房名字
	public String getClassroomNameByClassroomId(@Param("classroomId")int classroomId) throws Exception;
	//修改机房的状态
	public void updateClassroomState(Integer classroomId,Integer teacherid,Integer batch,Integer week,Integer period,Integer state,Integer wantToState) throws Exception;
	//得到每场考试的预约数（examID，预约数）
	public List<StudentbookingCounted> getStudentbookingCounted() throws Exception;
	//得到每个机房的可预约数
	public List<ClassroombookingCount> getClassroombookingCounts() throws Exception;
	
}
