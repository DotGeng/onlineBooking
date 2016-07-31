<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>changeOpenBatchPage</title>
    
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
  <div style="text-align:center">
  	系统目前开放的预约周次是第${openBatch }周；<br/><br/>
  </div>
  	<div style="text-align:center">
  		<form action="<%=path %>/changeOpenBatch.action">
  	请选择预约周次：
   	 <select name="openBatch">
	   	 <c:forEach begin="0" end="20" step="1" var="i">
	   	 	<option value="${i }" <c:if test="${i == openBatch}">selected</c:if>>${i }</option>
	   	 </c:forEach>
    </select>
    	<input type="submit" value="设置">
  	</form>
  	</div>
  </body>
</html>
