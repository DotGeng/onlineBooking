package cn.cqupt.onlinebooking.service;

import java.util.List;

import cn.cqupt.onlinebooking.po.StudentCustom;

public interface PagingService {
	public List<StudentCustom> pagingStudentData(Integer pageNow,Integer pageSize) throws Exception;
}
