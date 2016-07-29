<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
					href="#">机房管理</a>&nbsp;-</span>&nbsp;监考详情
			</div>
		</div>
		<div class="page ">
			<!-- 上传广告页面样式 -->
			<input type="hidden" name="success" value="${success}"  id="success"/>
			<div class="banneradd bor">
				<div class="baTopNo">
					<span>机房修改</span>
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
					<form action="<%=path %>/addProctorToDB.action" method="post">
						
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机房名字：
							<%-- <input value="${classroomCustom.classroomname }" name="classroomname" type="text"
								class="input3" /> --%>
								<select name="examroomid" class="input3">
									<c:forEach items="${classroomList }" var="classroom">
										<option value="${classroom.classroomid }">${classroom.classroomname }</option>
									</c:forEach>
								</select>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;监考老师：
								<select name="teacherid" class="input3">
									<c:forEach items="${teacherCustomeList }" var="teacher">
										<option value="${teacher.teacherid }">${teacher.teachername }</option>
									</c:forEach>
								</select>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试年份：
								<select name="year" class="input3">
									<c:forEach begin="2000" end="2050" step="1" var="i">
										<option value="${i }">${i }</option>
									</c:forEach>
								</select>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;学期(上下)：
								<select name="upOrDownYear" class="input3">
									<c:forEach begin="0" end="1" step="1" var="i" >
										<option value="${i }">
											<c:choose>
												<c:when test="${i == 0 }">
													上半年
												</c:when>
												<c:otherwise>
													下半年
												</c:otherwise>
											</c:choose>
										</option>
									</c:forEach>
								</select>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试周次：
								<select name="batch" class="input3">
									<c:forEach begin="1" end="24" step="1" var="i">
										<option value="${i }">${i }</option>
									</c:forEach>
								</select>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试天次：
								<select name="week" class="input3">
									<option value="1">星期一</option>
									<option value="2">星期二</option>
									<option value="3">星期三</option>
									<option value="4">星期四</option>
									<option value="5">星期五</option>
									<option value="6">星期六</option>
									<option value="7">星期日</option>
								</select>
						</div>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试节次：
							<%-- <input value="${classroomCustom.classroomname }" name="classroomname" type="text"
								class="input3" /> --%>
								<select name="periodid" class="input3">
									<c:forEach items="${periodCustomeList }" var="period">
										<option value="${period.periodid }">${period.periodname }</option>
									</c:forEach>
								</select>
								<input type="hidden" value="0" name="ifFinished"/>
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