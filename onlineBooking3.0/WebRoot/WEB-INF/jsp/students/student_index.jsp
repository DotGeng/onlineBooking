<%@page import="cn.cqupt.onlinebooking.po.StudentCustom"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%
	StudentCustom s = (StudentCustom)request.getAttribute("studentCustom");
	response.addCookie(new Cookie("userno",s.getStudentno()));
	response.addCookie(new Cookie("password",s.getStudentpw()));
 %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页-在线预约考试系统</title>
</head>

<frameset rows="100,*" cols="*" scrolling="No" framespacing="0"
	frameborder="no" border="0"> <frame src="<%=path %>/style/inc/student_head.jsp"
	name="headmenu" id="mainFrame" title="mainFrame"><!-- 引用头部 -->
<!-- 引用左边和主体部分 --> <frameset rows="100*" cols="220,*" scrolling="No"
	framespacing="0" frameborder="no" border="0"> <frame
	src="<%=path %>/style/inc/student_left.jsp" name="leftmenu" id="mainFrame" title="mainFrame">
<frame src="<%=path %>/studentMain.action" name="main" scrolling="yes" noresize="noresize"
	id="rightFrame" title="rightFrame"></frameset></frameset>
</html>