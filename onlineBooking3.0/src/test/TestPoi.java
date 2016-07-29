package test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import cn.cqupt.onlinebooking.handler.StudentsController;
import cn.cqupt.onlinebooking.mapper.StudentMapperCustom;
import cn.cqupt.onlinebooking.mapper.TeacherMapperCustom;
import cn.cqupt.onlinebooking.po.StudentCustom;
import cn.cqupt.onlinebooking.po.StudnetQueryVo;
import cn.cqupt.onlinebooking.po.TeacherQueryVo;

public class TestPoi {
	@Autowired
	private TeacherMapperCustom teacherMapperCuster;
	public static void main(String args[]) throws Exception {
	/*	StudentCustom st = new StudentCustom();
		st.setStudentno("1");
		
		StudnetQueryVo vo = new StudnetQueryVo();
		vo.setStudentCustom(st);
		System.out.println(vo.getStudentCustom().getStudentno());*/
//		vo.getStudentCustom().setStudentno("1");
		TestPoi t = new TestPoi();
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "admin");
		map.put("password", "123");
		TeacherQueryVo qu = new TeacherQueryVo();
		qu.setNameAndPW(map);
		t.teacherMapperCuster.findTeacherByNameAndPW(qu);
	}
}
