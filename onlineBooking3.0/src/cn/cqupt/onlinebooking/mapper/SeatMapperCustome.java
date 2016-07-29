package cn.cqupt.onlinebooking.mapper;


import java.util.List;

import cn.cqupt.onlinebooking.po.ScoreCustome;
import cn.cqupt.onlinebooking.po.SeatCustome;

public interface SeatMapperCustome extends SeatMapper{
	//通过房间名字找到座位
	public List<SeatCustome> findSeatByClassRoom(String classRoom) throws Exception;
	//通过房间名删除座位
	public void deleteSeatByClassroomName(String classroomName) throws Exception;
	//根据房间名字和房间id插入座位信息
	public void insertSeatByClassroomId(SeatCustome seatCustome) throws Exception;
	//按照年份，学期，周次导出学生成绩
	public List<ScoreCustome> getScoreByYearTermAndWeek() throws Exception;
}
