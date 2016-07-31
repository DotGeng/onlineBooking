package cn.cqupt.onlinebooking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cqupt.onlinebooking.po.SystemDataCustom;

public interface SystemdataMapperCustom extends SystemdataMapper {
	//得到所有的通知信息
	public List<SystemDataCustom> getAllSystemData() throws Exception;
	/*//按照id删除通知信息
	public void deleteNotifyById(@Param("systemdataId")Integer systemdataId) throws Exception;*/
	//清空学生信息
	public void deleteStudentInformation() throws Exception;
	
}
