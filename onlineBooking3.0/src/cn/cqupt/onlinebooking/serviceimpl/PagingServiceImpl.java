package cn.cqupt.onlinebooking.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.cqupt.onlinebooking.mapper.StudentMapperCustom;
import cn.cqupt.onlinebooking.po.StudentCustom;
import cn.cqupt.onlinebooking.service.PagingService;

public class PagingServiceImpl implements PagingService {
	@Autowired
	private StudentMapperCustom studentMapperCustom;
	public List<StudentCustom> pagingStudentData(Integer pageNow,Integer pageSize) throws Exception {
		
		//给学生分页
		List<StudentCustom> studentCustomeList = studentMapperCustom.getStudentsByPaging(pageNow, pageSize);
		return  studentCustomeList;
	}

}
