<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!DOCTYPE html>
<html>
  <head>
    
    <title>上传老师</title>
    
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
  	<form id="itemForm"
		action="<%=path %>/batchImportTeacher.action"
		method="post" enctype="multipart/form-data" >
		<input type="file" name="file" value="请选择老师信息的excel表格" required="required"/>
		<input type="submit" value="提交"/>	
	</form>
  </body>
</html>
