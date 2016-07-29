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
					href="#">公共管理</a>&nbsp;-</span>&nbsp;机房添加
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
					<%-- <div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机房名字：<input value="${seatCustome.classroomname}" name="classroomname" type="text"
								class="input3" />
					</div> --%>
					<form action="<%=path %>/editSeatAllSubmit.action" method="post">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机房名字：<input  style="border:0;" value="${seatCustome.classroomname}"  type="text"
								class="input3" readonly="readonly" required="required"/>
						<div class="bbD">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;座位信息：
						</div>
						<c:forEach items="${seats}" var="seat" varStatus="status">
							
							<div class="bbD">
							
							<input type="hidden" value="${seat.classroomname}" name="seatsList[${status.index}].classroomname" type="text"
								class="input3" required="required"/>
							<input type="hidden" value="${seat.seatno }" name="seatsList[${status.index}].seatno" type="text"
								class="input3" /> 
							<input type="hidden"  value="${seatCustome.classroomid }" name="seatsList[${status.index}].roomid" type="text"
							class="input3" /> 
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${seat.seatno }号座位名字：<input value="${seat.seatname} " name="seatsList[${status.index}].seatname" type="text"
								class="input3" required="required"/>
							</div>
						</c:forEach> 
						
						<div class="bbD">
							<p class="bbDP">
								<button type="submit" class="btn_ok btn_yes">提交</button>
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