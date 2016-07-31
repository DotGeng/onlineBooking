<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; 
	request.setCharacterEncoding("utf8");
	response.setCharacterEncoding("utf8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学生成绩添加</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/style/css/css.css" />
<script type="text/javascript" src="<%=path %>/style/js/jquery.min.js"></script>

</head>
<body>

	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="<%=path %>/style/img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">学生成绩</a>&nbsp;-</span>&nbsp;成绩添加
			</div>
		</div>
		<div class="page ">
			<!-- 上传广告页面样式 -->
			<input type="hidden" name="success" value="${success}"  id="success"/>
			<div class="banneradd bor">
				<div class="baTopNo">
					<span>学生添加</span>
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
					<form action="<%=path %>/addStudentsScoreToDB.action">
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生姓名：<input name="studentname" type="text"
								class="input3" />
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生学号：<input name="studentno" type="text"
								class="input3" />
						</div>
						<!-- <div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学院：<input name="studentpw" type="text"
								class="input3" />
						</div> -->
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;专&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业：<input name="major" type="text"
								class="input3" />
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;院：<input name="colledge" type="text"
								class="input3" />
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试年度：<input name="year" type="text"
								class="input3" />
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试周次：<input name="week" type="text"
								class="input3" />
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试天次：
							<select name="day" class="input3">
								<option value="星期一" selected="selected">星期一</option>
								<option value="星期二">星期二</option>
								<option value="星期三">星期三</option>
								<option value="星期四">星期四</option>
								<option value="星期五">星期五</option>
								<option value="星期六">星期六</option>
								<option value="星期日">星期日</option>
							</select>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试场次：<input name="period" type="text"
								class="input3" />
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;场：<input name="examinationRoom" type="text"
								class="input3" />
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;成&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;绩：<input name="score" type="text"
								class="input3" />
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试次数：
							<select name="examtimes" class="input3">
								<option value="0">0</option>
								<option value="1" selected="selected">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
							</select>
						</div>
						<div class="bbD">
							<p class="bbDP">
								<button type="submit" class="btn_ok btn_yes">提交</button>
								<a class="btn_ok btn_no" href="#">取消</a>
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