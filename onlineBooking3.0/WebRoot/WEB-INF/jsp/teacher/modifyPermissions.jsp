<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>权限设置</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  	<table>
  		<tr>
  			<td width="200" height="50"></td>
  			<td></td>
  			<td></td>
  		</tr>
  		<tr>
	  		<td width="200" height="50"></td>
	  		<td>
	  		<div>
	  			<form action="changeLoginPemission.action">
	  				<input type="radio" name="aggreStudentLogin"  value= "0">允许学生登录
	  				<input type="radio" name="aggreStudentLogin"  value= "1">不允许学生登录
	  				<input type="submit" value="提交">
	  			</form>
	  		</div>
	  		<div>
	  			<form action="changeReservationPemission.action">
	  				<input type="radio" name="reservationPemission"  value= "0"  >允许学生预约
	  				<input type="radio" name="reservationPemission"  value= "1"  >不允许学生预约
	  				<input type="submit" value="提交">
	  			</form>
	  		</div>
	  		<script type="text/javascript">
	  			 var radios=document.getElementsByName("aggreStudentLogin");
	  			 for(var i = 0 ; i < radios.length; i ++) {
	  			 	if(radios[i].value == ${aggreStudentLogin}) {
	  			 		radios[i].checked=true;
	  			 	}
	  			 }
	  			 var radios2 = document.getElementsByName("reservationPemission");
	  			 for(var i = 0 ; i < radios2.length; i ++) {
	  			 	if(radios2[i].value == ${reservationPemission}) {
	  			 		radios2[i].checked=true;
	  			 	}
	  			 }
	  		</script>
  			</td>
	  		<td></td>
  		</tr>
  		<tr>
	  		<td width="200" height="50"></td>
	  		<td></td>
	  		<td></td>
  		</tr>
  	</table>
  <body>
    
  </body>
</html>
