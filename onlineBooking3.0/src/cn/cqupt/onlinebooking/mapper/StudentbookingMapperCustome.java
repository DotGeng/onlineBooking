package cn.cqupt.onlinebooking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cqupt.onlinebooking.po.ClassroombookingCustom;
import cn.cqupt.onlinebooking.po.ProctorCustome;
import cn.cqupt.onlinebooking.po.SeatCustome;
import cn.cqupt.onlinebooking.po.StudentbookingCustome;

public interface StudentbookingMapperCustome  extends StudentbookingMapper{
	//添加学生预约信息
	public Integer addStudentBookingInformation(@Param("classroomId")Integer classroomId,@Param("examId")Integer examId,@Param("studentNo")String studentNo,@Param("seatID")Integer seatID) 
			throws Exception;
	//选择没有分配的座位信息(查询在seat表中存在的座位但是在studentBooking中已经分配的)
	public List<SeatCustome> getSeatsNotUsed(Integer classroomId) throws Exception;
	//根据学号查询学生是否预约过，以及预约过的考试是否考完
	public Integer getifCountStudentBookingAndFinished(@Param("studentNo")String studentNo) throws Exception;
	//根据考场的信息查找到学生预定的信息
	public List<StudentbookingCustome> getStudeentBookingByProctorInformation(ProctorCustome proctorCustome) throws Exception;
	//根据预定的id删除学生预定的情况
	public void deleteStudentBookingById(Integer studentBookingId) throws Exception;
	
	
}
