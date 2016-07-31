<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<!DOCTYPE html >
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link rel="stylesheet" type="text/css" href="<%=path %>/style/css/css.css" />
<script type="text/javascript" src="<%=path %>/style/js/jquery.min.js"></script>

</head>
<body>

	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="<%=path %>/style/img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">公共管理</a>&nbsp;-</span>&nbsp;教师添加
			</div>
		</div>
		<div class="page ">
			<!-- 上传广告页面样式 -->
			<input type="hidden" name="success" value="${success}"  id="success"/>
			<div class="banneradd bor">
				<div class="baTopNo">
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
					<form action="<%=path %>/addStudent.action" method="post" >
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生名字：<input name="studentname" type="text"
								class="input3" required="required"/>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生学号：<input name="studentno" type="text"
								class="input3" required="required"/>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生密码：<input name="studentpw" type="text"
								class="input3" required="required"/>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;专&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业：<input name="major" type="text"
								class="input3" required="required"/>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;院：<input name="colledge" type="text"
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
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;得&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分：<input name="score" type="text"
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
								<!-- <a class="btn_ok btn_no" href="#">取消</a> -->
							</p>
						</div>
					</form>
				</div>
			</div>

			<!-- 上传广告页面样式end -->
		</div>
	</div>
	<script type="text/javascript" >
	var a = -1;
	window.alert(document.getElementById('success').value);
	a = (document.getElementById('success').value == null or document.getElementById('success').value == '')? a : document.getElementById('success').value;
	if(a != -1) {
		window.alert("学生添加成功");
	}
</script>
</body>
</html>