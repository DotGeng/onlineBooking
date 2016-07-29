package cn.cqupt.onlinebooking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cqupt.onlinebooking.po.ClassroomCustom;
import cn.cqupt.onlinebooking.po.ClassroomQueryVO;


public interface ClassroomMapperCustom extends ClassroomMapper{
	//得到所有的教室信息
	public List<ClassroomCustom> getAllClassroom(ClassroomQueryVO classroomQueryVO);
	//添加教室
	public void addClassroom(ClassroomCustom classroomCustom);
	//根据机房名字删除座位信息
	public void deleteSeatByClassroomName(String classroomName) throws Exception;
	//更新机房信息
	public void updateClassroomByID(ClassroomCustom classroomCustom) throws Exception;
	//删除机房信息
	public void deleteClassroomById(Integer classroomId) throws Exception;
	//得到所有的机房名字信息和id
	public List<ClassroomCustom> getAllClassroomNameAndId() throws Exception;
	//根据机房id得到机房名字
	public String getClassroomNameByClassroomId(@Param("classroomId")int classroomId) throws Exception;
}