package cn.cqupt.onlinebooking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cqupt.onlinebooking.po.ProctorCustome;

public interface ProctorMapperCustome {
	//得到所有的监考员信息
	public List<ProctorCustome> getProctorList() throws Exception;
	//添加所有监考老师和考场信息
	public void insertProctorAndExamToDB(ProctorCustome proctorCustome) throws Exception;
	//根据id获得监考员和考试的信息
	public ProctorCustome getProctorByExamId(Integer examID) throws Exception;
	//根据examid修改监考员和考场信息
	public void updateProctorByExamId(ProctorCustome proctorCustome) throws Exception;
	//根据id删除监考员信息和考试信息
	public void deleteProctorByExamID(Integer examID) throws Exception;
	//查出所有的不重复的考试信息
	public List<ProctorCustome> getExamInformationNotRepeat() throws Exception;
	// 根据监考教师ID，周次，天次，节次获得考试ID
	public int getExamID(@Param("examroomId")int examroomId,@Param("batch")int batch,@Param("week")int week,@Param("period")int period) throws Exception;
	
}
