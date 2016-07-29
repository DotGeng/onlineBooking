<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学生预约</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/style/css/css.css" />
<script type="text/javascript" src="<%=path %>/style/js/jquery.min.js"></script>
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="<%=path %>/style/img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">学生预约</a>&nbsp;</span>&nbsp;
			</div>
		</div>
		
		<div class="page">
			<!-- banner页面样式 -->
			<div class="banner">
				<!-- banner 表格 显示 -->
				<br />
				<div class="banShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td style="display: none;">ID</td>
							<td width="66px" class="tdColor tdC">序号</td>
							<td width="308px" class="tdColor">机房</td>
							<td width="308px" class="tdColor">周次</td>
							<td width="308px" class="tdColor">天次</td>
							<td width="308px" class="tdColor">节数</td>
							<!-- <td width="308px" class="tdColor">年份</td>
							<td width="308px" class="tdColor">上半年(下半年)</td> -->
							<td width="308px" class="tdColor">已预约/可预约人数</td>
							<td width="180px" class="tdColor">操作</td>
						</tr>
						<% int i = 1; %>
						<c:forEach items="${proctorCustomeList}" var="proctor">
						<tr>
							<td style="display: none;">${proctor.examid }</td>
							<td><%=i++ %></td>
							<td>${proctor.classroomName }</td>
							<td>${proctor.batch }</td>
							<td>${proctor.week }</td>
							<td>${proctor.periodname }</td>
							<%-- <td>${proctor.year }</td>
							<td>${proctor.upOrDownYear }</td> --%>
							<td><c:if test="${proctor.studentBookingCount == null }" >0</c:if>
							<c:if test="${proctor.studentBookingCount != null }">${proctor.studentBookingCount  }</c:if>/${proctor.classroomBookingSize }</td>
							<td>
								<%-- <form action="javascript:if(confirm('确实要预约吗?预约后将不可修改'))location='<%=path %>/studentBooking.action'" method="post">
									<input  value="${proctor.examroomid }" name="classroonId"/>
									<input  value="${proctor.examid }" name="examID"/>
									<input  value="${studentCustom.studentno }" name="studentNo"/>
									<input type="submit" value="预约"/>
								</form> --%>
								<c:if test="${examId == proctor.examid }">已预约</c:if>
								<c:if test="${examId != proctor.examid }">
									<a href="javascript:if(confirm('确实要预约吗?预约后将不可修改'))location='<%=path %>/studentBooking.action?
									classroonId=${proctor.examroomid }&examID=${proctor.examid }&studentNo=${studentCustom.studentno }'">预约</a>
								</c:if>  
									 </td> 
						</tr>
						</c:forEach>
					</table>
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