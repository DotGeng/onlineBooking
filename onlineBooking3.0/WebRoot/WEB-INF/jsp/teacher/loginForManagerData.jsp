<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'loginForManagerData.jsp' starting page</title>
    
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
  	<div class="banneradd bor">
  		<div class="baBody">
  			<div class="bbD">
  				<form action="${pageContext.request.contextPath }/managerLoginAgain.action" method="post">
		<input type="text" name="nameAndPW['name']" placeholder="账号" required="required" />
		<input type="password" name="nameAndPW['password']" placeholder="密码" required="required" />
		<button type="submit" class="btn btn-primary btn-block btn-large" >登录</button>
	</form>
  			</div>
  		</div>
  	</div>
  </body>
</html>
