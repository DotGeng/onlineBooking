<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学生成绩</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/style/css/css.css" />
<script type="text/javascript" src="<%=path %>/style/js/jquery.min.js"></script>
<%-- <script type="text/javascript" src="<%=path %>/js/WdatePicker.js"></script> --%>
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="<%=path %>/style/img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">学生分数</a>&nbsp;-</span>&nbsp;分数管理
			</div>
		</div>
		<div class="page">
			<!-- banner页面样式 -->
			<div class="banner">
				<div class="add">
				<%-- <a class="addA addA1" href="<%=path %>/studentsScoreAdd.action">添加</a> --%>
				 <form action="batchExportStudentsScore.action">
				<input type="hidden" name="year" value="2000"/>
				<%-- <select name="year" class="input3">
					<c:forEach begin="2000" end="2050" step="1" var="i">
						<option value="${i }">${i } </option>
					</c:forEach>
				</select> --%>
				<input type="hidden" name="upOrDownTeam" value="0"/>
				<!-- <select  name="upOrDownTeam" >
					<option value='0'>春季</option>
					<option value='1'>秋季</option>
				</select> -->
					<input class="addA" type="submit" value="批量导出" />
				</form> 
				</div>
				<!-- banner 表格 显示 -->
				<div class="banShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td width="66px" class="tdColor tdC">序号</td>
							<td width="220px" class="tdColor">学号</td>
							<td width="220px" class="tdColor">学生姓名</td>
							<td width="220px" class="tdColor">学院</td>
							<td width="220px" class="tdColor">系(专业)</td>
							<td width="220px" class="tdColor">班(年级)</td>
							<td width="220px" class="tdColor">学年</td>
							<!-- <td width="220px" class="tdColor">学期（上半年，下半年）</td> -->
							<td width="220px" class="tdColor">考试周次</td>
							<td width="220px" class="tdColor">考试日期</td>
							<td width="220px" class="tdColor">考试场次</td>
							<td width="220px" class="tdColor">是否通过</td> 
							<td width="220px" class="tdColor">成绩</td>
							<td width="220px" class="tdColor">考试次数</td>
							<!-- <td width="220px" class="tdColor">操作</td> -->
						</tr>
						<% int i = 1; %>
						<c:forEach items="${scores}" var="score">
						<tr>
							
							<td><%=i++ %></td>
							<td>${score.studentno }</td>
							<td>${score.studentname }</td>
							<td>${score.colledge }</td>
							<td>${score.major }</td>
							<td>${score.studclass }</td>
							<td>${score.year }</td>
							<%-- <td>${score.upOrDownYear }</td> --%>
							<td>${score.week }</td>
							<td>${score.day }</td>
							<td>${score.period }</td>
							<td><c:if test="${ score.score >= 60}"> 是 </c:if>
								<c:if test="${ score.score < 60}"> 否 </c:if>
							</td>
							<td>${score.score }</td> 
							<td>${score.examtimes }</td>
							<%-- <td><a href="<%=path %>/modifyScorePage.action?studentNo=${score.studentno }"><img class="operation"
									src="<%=path %>/style/img/update.png"></a> <img class="operation delban"
								src="<%=path %>/style/img/delete.png"></td> --%>
						</tr>
						</c:forEach>
					</table>
					<div class="paging">此处是分页</div>
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
$(".delban").click(function(){
  $(".banDel").show();
});
$(".close").click(function(){
  $(".banDel").hide();
});
$(".no").click(function(){
  $(".banDel").hide();
});
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