<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<!DOCTYPE html >
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页-在线预约考试系统</title>
</head>
<frameset rows="50,*" cols="*" scrolling="No" framespacing="0"
	frameborder="no" border="0"> 
	<frame src="<%=path %>/main.action"
	name="headmenu" id="mainFrame" title="mainFrame">
	<frame
	src="<%=path %>/main_index/main_bottom.jsp" name="bottom" id="mainFrame" title="mainFrame">
	<%-- <frameset rows="100*" cols="220,*" scrolling="No"
	framespacing="0" frameborder="no" border="0"> <frame
	src="<%=path %>/style/inc/left.jsp" name="leftmenu" id="mainFrame" title="mainFrame">
	<frame src="<%=path %>/main.action" name="main" scrolling="yes" noresize="noresize"
	id="rightFrame" title="rightFrame">
	</frameset> --%>
</frameset>
</html>