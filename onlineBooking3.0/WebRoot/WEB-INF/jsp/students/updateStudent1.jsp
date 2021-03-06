<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setCharacterEncoding("utf8");
response.setCharacterEncoding("utf8");
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE HTML >
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateStudent.jsp' starting page</title>
    
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

	<div id="pageAll">
		<div class="pageTop">
		
			<div class="page">
				<img src="<%=path %>/style/img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">学生管理</a>&nbsp;-</span>&nbsp;学生修改
			</div>
		</div>
		<div class="page ">
			<!-- 上传广告页面样式 -->
			<input type="hidden" name="success" value="${success}"  id="success"/>
			<div class="banneradd bor">
				<div class="baTopNo">
					<span>学生信息修改</span>
				</div>
				<div class="baBody">
					<%-- <div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;头像：
						<div class="vipHead vipHead1">
							<img src="<%=path %>/style/img/userPICS.png" />
							<p class="vipP">更换头像</p>
							<input class="file1" type="file" />
						</div>
					</div> --%>
					<form action="<%=path %>/udpateStudentToDatabase.action">
					<input type="hidden" name="studentid" value="${student.studentid }" />
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生名字：<%-- <input value="${student.studentname }" name="studentname" 
								class="input3" required="required"/> --%>
								<input value="${student.studentname }" name="studentname" >
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生学号：<input value="${student.studentno}" name="studentno" 
								class="input3" required="required" readonly="readonly"/>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input value="${student.studentpw} " name="studentpw" 
							class="input3" required="required"/>
							<!-- <select name="teacherrole" class="input3" >
								<option value="1">普通管理员</option>
							</select> -->
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;专&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业：<input value="${student.major}" name="major" 
								class="input3" required="required"/>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;所在学院：<input value="${student.colledge}" name="colledge" 
								class="input3" required="required"/>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是否通过：
								<select name="passed" Class="input3">
									<option value="0" <c:if test="${0==student.passed }">selected</c:if>>否</option>
									<option value="1" <c:if test="${1==student.passed }">selected</c:if>>是</option>
								</select>
						</div>
						 <div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;是否作弊：
								<select name="ischeated" Class="input3">
									<option value="0" <c:if test="${student.ischeated == 0}">selected</c:if>>否</option>
									<option value="1" <c:if test="${student.ischeated == 1}">selected</c:if>>是</option>
								</select>
						</div> 
			
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数：<input value="${student.score}" name="score" 
								class="input3" required="required"/>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试次数：
							<select name="examtimes" class="input3">
									<c:forEach begin="0" end="3" step="1" var="i">
										<option value="${i }"  
											<%-- <c:if test="${i==proctorCustome.examroomid }">selected</c:if> --%>
										>${i }</option>
									</c:forEach>
							</select>
						</div>
						<div class="bbD">
							<p class="bbDP">
								<button type="submit" class="btn_ok btn_yes">提交</button>
							</p>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
