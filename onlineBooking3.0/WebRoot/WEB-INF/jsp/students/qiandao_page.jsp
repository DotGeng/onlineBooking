<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'qiandao_page.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<%=path %>/style/css/css.css" />
	<script type="text/javascript" src="<%=path %>/style/js/jquery.min.js"></script>
  </head>
  
  <body>
  <div class="pageAll">
  	 <div class="page">
			<!-- banner页面样式 -->
			<div class="banner">
				<div class="add">
				<a class="addA addA1" href="#">签到</a>
				</div>
			</div>
	</div>
  </div>
    	
  </body>
</html>
