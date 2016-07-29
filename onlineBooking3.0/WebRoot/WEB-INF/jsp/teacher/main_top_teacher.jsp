<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@page import="java.util.*,cn.cqupt.onlinebooking.po.TeacherCustom" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main_top.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <div>
		<p>
		</p>
	</div>
	<div>
	<form action="<%=path %>/getClassroomWithStateForTeacher.action" target="bottom">
			&nbsp;&nbsp;&nbsp;&nbsp;请选择实验室：
			<input type="hidden" name="role" value="1"/>
			<input type="hidden" name="loginerName" value="${loginerName}"/>
		<select  id="examroomidSelct" name="examroomid" class="input3">
			<c:forEach items="${classroomLsit }" var="classroom">
				<option value="${classroom.classroomid } ">${classroom.classroomname }</option>
			</c:forEach>
		</select>	
		&nbsp;&nbsp;&nbsp;&nbsp;请选择周次：
		<select name="batch">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
		</select>
		<input type="submit" value="查询" class="input3"/>
	</form>
	</div>
	<script type="text/javascript">
		  window.onload=function(){
		 	var request = new XMLHttpRequest();
		 	request.open("get", "getStudentAggreState.action");
		 	request.setRequestHeader("Content-Type", "text/plain;charset=UTF-8");
		 	request.send();
		 } 
		</script>
  </body>
</html>
