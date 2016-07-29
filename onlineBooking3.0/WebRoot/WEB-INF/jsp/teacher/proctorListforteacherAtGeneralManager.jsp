<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学生列表</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/style/css/css.css" />
<script type="text/javascript" src="<%=path %>/style/js/jquery.min.js"></script>
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="<%=path %>/style/img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">公共管理</a>&nbsp;-</span>&nbsp;意见管理
			</div>
		</div>
		<div class="page">
			<!-- banner页面样式 -->
			<div class="banner">
				<!-- <div class="add">
				</div> -->
				<br/>
				<br/>
				<!-- banner 表格 显示 -->
				<div class="banShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td >ID</td>
							<td width="66px" class="tdColor tdC">序号</td>
							<td width="315px" class="tdColor">教师姓名</td>
							<td width="308px" class="tdColor">机房</td>
							<td width="308px" class="tdColor">周次</td>
							<td width="308px" class="tdColor">天次</td>
							<td width="308px" class="tdColor">节数</td>
							<td width="308px" class="tdColor">年份</td>
							<td width="308px" class="tdColor">上半年(下半年)</td>
							<td width="308px" class="tdColor">是否考完</td>
							<td width="380px" class="tdColor">操作</td>
						</tr>
						<% int i = 1; %>
						<c:forEach items="${proctorCustomeList}" var="proctor">
						<tr>
							<td>${proctor.examid }</td>
							<td><%=i++ %></td>
							<td>${proctor.teacherName }</td>
							<td>${proctor.classroomName }</td>
							<td>${proctor.batch }</td>
							<td>${proctor.week }</td>
							<td>${proctor.periodname }</td>
							<td>${proctor.year }</td>
							<td>${proctor.upOrDownYear }</td>
							<td>
								<c:choose>
									<c:when test="${proctor.ifFinished == 0 }">
										否
									</c:when>
									<c:otherwise>
										是
									</c:otherwise>
								</c:choose>
								
							</td>
							<td><%-- <a href="<%=path %>/ModifyProctorPage.action?examID=${proctor.examid }
								"><img class="operation"
									src="<%=path %>/style/img/update.png"></a>
									<a href="javascript:if(confirm('确实要删除吗?'))location='<%=path %>/deleteProctorById.action?examID=${proctor.examid }'">
									<img class="operation delban" src="<%=path %>/style/img/delete.png"></a> --%>
								<a href="<%=path %>/bookingDetailPage.action?examid=${proctor.examid }
								&teacherName=${proctor.teacherName}&classroomName=${proctor.classroomName}
								&batch=${proctor.batch }&week=${proctor.week }
								&periodname=${proctor.periodname }&year=${proctor.year}
								&upOrDownYear=${proctor.upOrDownYear}
								&ifFinished=${proctor.ifFinished}">预定详情</a> 
							</td>
						</tr>
						</c:forEach>
					</table>
					<!-- <div class="paging">此处是分页</div> -->
				</div>
				<!-- banner 表格 显示 end-->
			</div>
			<!-- banner页面样式end -->
		</div>
	</div>
	<!-- 删除弹出框 -->
	<div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="<%=path %>/style/img/shanchu.png" /></a>
			</div>
			<p class="delP1">你确定要删除此条记录吗？</p>
			<p class="delP2">
				<a href="#" class="ok yes" onclick="del()">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div>
	<!-- 删除弹出框  end-->
</body>

<script type="text/javascript">
// 广告弹出框
/* $(".delban").click(function(){
  $(".banDel").show();
});
$(".close").click(function(){
  $(".banDel").hide();
});
$(".no").click(function(){
  $(".banDel").hide();
}); */
// 广告弹出框 end

function del(){
    var input=document.getElementsByName("check[]");
    for(var i=input.length-1; i>=0;i--){
       if(input[i].checked==true){
           //获取td节点
           var td=input[i].parentNode;
          //获取tr节点
          var tr=td.parentNode;
          //获取table
          var table=tr.parentNode;
          //移除子节点
          table.removeChild(tr);
        }
    }     
}
</script>
</html>