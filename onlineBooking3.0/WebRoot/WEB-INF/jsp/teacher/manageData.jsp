<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>数据管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript">
  	function message() {
  		var message1 = "${message1}";
  		var message2 = "${message2}";
  		if(message1 != null && message1 != "") {
				alert(message1);
		}
		if(message2 != null && message2 != "") {
			alert(message2);
		}
  	}
  	window.onload=message;
  </script>
  <body>
    <div id="pageAll">
    	<div id="page">
    		<div id="banner">
    			<form action="<%=path %>/clearUpStudentBooking.action">
    				<input class="addA" type="submit" value="清空预约信息" />
    			</form>
    			<form action="<%=path %>/clearUpStudentInformation.action">
    				<input class="addA" type="submit" value="清空学生相关信息" />
    			</form>
    		</div>
    	</div>
    </div>
  </body>
</html>
