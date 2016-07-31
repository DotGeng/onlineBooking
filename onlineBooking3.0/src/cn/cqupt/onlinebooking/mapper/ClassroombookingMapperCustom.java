package cn.cqupt.onlinebooking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cqupt.onlinebooking.po.CheckedAndExamTimes;
import cn.cqupt.onlinebooking.po.ClassroombookingCount;
import cn.cqupt.onlinebooking.po.ClassroombookingCustom;
import cn.cqupt.onlinebooking.po.ExamID;
import cn.cqupt.onlinebooking.po.StudentbookingCounted;

public interface ClassroombookingMapperCustom extends ClassroombookingMapper{
	//根据机房的名字和考试周次获得该周的机房使用情况
	public List<ClassroombookingCustom> getClassroomWithState(@Param("examroomid")Integer examroomid,@Param("batch")Integer batch) throws Exception;
	//修改机房从无课到有课状态
	public void updateClassroomStateFromNOClassToClass(@Param("classroomId")Integer classroomId,@Param("batch")Integer batch,@Param("week")Integer week,@Param("period")Integer period,@Param("state")Integer state) throws Exception;
	//从有课到无课状态
	public void updateClassroomStateFromClassToNoClass(@Param("classroomId")Integer classroomId,@Param("batch")Integer batch,@Param("week")Integer week,@Param("period")Integer period,@Param("state")Integer state) throws Exception;
	//修改机房有考试的时候的监考老师
	public void updateClassroomProctorID(@Param("classroomId")Integer classroomId,@Param("teacherId")Integer teacherId,@Param("batch")Integer batch,@Param("week")Integer week,@Param("period")Integer period,@Param("state")Integer state) throws Exception;
	//把有考试的时候修改为没有考试
	public void updateTestToNoClass1(@Param("classroomId")Integer classroomId,@Param("batch")Integer batch,@Param("week")Integer week,@Param("period")Integer period,@Param("state")Integer state) throws Exception;
	public void updateTestToNoClass2(@Param("classroomId")Integer classroomId,@Param("batch")Integer batch,@Param("week")Integer week,@Param("period")Integer period,@Param("state")Integer state) throws Exception;
	//把没有考试的时候设置为有考试
	public void updateNoTestToTest1(@Param("classroomId")Integer classroomId,@Param("teacherId")Integer teacherId,@Param("batch")Integer batch,@Param("week")Integer week,@Param("period")Integer period,@Param("state")Integer state) throws Exception;
	public void updateNoTestToTest2(@Param("classroomId")Integer classroomId,@Param("teacherId")Integer teacherId,@Param("batch")Integer batch,@Param("week")Integer week,@Param("period")Integer period,@Param("state")Integer state) throws Exception;
	public void updateNoTestToTest3(@Param("classroomId")Integer classroomId,@Param("teacherId")Integer teacherId,@Param("batch")Integer batch,@Param("week")Integer week,@Param("period")Integer period,@Param("state")Integer state) throws Exception;
	//得到每场考试的预约数（examID，预约数）
	public List<StudentbookingCounted> getStudentbookingCounted() throws Exception;
	//得到每个机房的可预约数
	public List<ClassroombookingCount> getClassroombookingCounts() throws Exception;
	//验证该学生是否预约过
	public ExamID ifHasReserved(@Param("studentNo")String studentNo) throws Exception;
	public CheckedAndExamTimes getExamTimesAndIschecked(@Param("studentNo")String studentNo) throws Exception;
	//清空预约信息
	public void clearUpStudentBooking() throws Exception;
	
}
