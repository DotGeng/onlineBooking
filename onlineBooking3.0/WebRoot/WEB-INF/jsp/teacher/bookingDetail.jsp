<%@ page language="java" import="java.util.*,cn.cqupt.onlinebooking.po.StudentbookingCustome" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生预定详情</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		/* body {
	margin-left: 10px;
	margin-top: 10px;
	margin-right: 10px;
	margin-bottom: 10px;
	}
	table {
		font-size: 12px;
	} */
		
	</style>

  </head>
  
  <body>
  <div>
  	<p>
  		教室：${examroomName} &nbsp;&nbsp;第${batch}周&nbsp;&nbsp;星期${week} &nbsp;&nbsp;第${period}节
  	</p>
  </div>
  <table border="1" cellspacing="0" bordercolor="#000000">
  	<tr>
  		<td width="140">学号</td>
  		<td width="140">姓名</td>
  		<td width="140">班级</td>
  		<td width="140">签到</td>
  	</tr>
  	<%
  		List<StudentbookingCustome> studentbookingCustomeList = (List)request.getAttribute("studentBookingCustomeList");
  		for(StudentbookingCustome studentbookingCustome : studentbookingCustomeList) {
  			String studentNum = studentbookingCustome.getStudentno();
  			String studentName = studentbookingCustome.getStudentName();
  			String studentClass = studentbookingCustome.getStudClass();
  			out.println("<tr>");
  			out.println("<td>");
  				out.println(studentNum);
  			out.println("</td>");
  			out.println("<td>");
  				out.println(studentName);
  			out.println("</td>");
  			out.println("<td>");
  				out.println(studentClass);
  			out.println("</td>");
  			out.println("<td>");
  			out.println("</td>");
  			out.println("</tr>");
  		}
  	 %>
  </table>
  	
  </body>
</html>
