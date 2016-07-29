<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'modifyClassroomState.jsp' starting page</title>
    
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
  		<p>您正在设置${classroomName }    机房第 ${batch } 周，星期${week }  第${period }  节的状态</p>
  	</div>
  	<table>
  		<tr>
  			<td width="200" height="50"></td>
  			<td></td>
  			<td></td>
  		</tr>
  		<tr>
	  		<td width="200" height="50"></td>
	  		<td>
	  		<form action="addToDBAboutClassroomState.action">
	  			<input type="radio" name="wantTostate" checked="checked" value="1">指定预约
	  			<select name="teacherid">
	  				<c:forEach items="${teacherCustomeList }" var="teacher">
						<option value="${teacher.teacherid }"
							<c:if test="${teacher.teacherid == proctorCustome.teacherid}">selected</c:if>
							>${teacher.teachername }</option>
					</c:forEach>
	  			</select>
	  			<br><br>
  				<input type="radio" name="wantTostate" value="0">置空<br><br>
  				<input type="radio" name="wantTostate" value="2">有课<br><br>
  				<input type="hidden" name="state" value="${state}"/>
  				<input type="hidden" name="examroomId" value="${examroomId }"/>
  				<input type="hidden" name="batch" value="${batch }"/>
  				<input type="hidden" name="week" value="${week }"/>
  				<input type="hidden" name="period" value="${period }"/>
  				<input type="submit" value="提交" >
	  		</form>
  			</td>
	  		<td></td>
  		</tr>
  		<tr>
	  		<td width="200" height="50"></td>
	  		<td></td>
	  		<td></td>
  		</tr>
  	</table>
  	
  </body>
</html>
