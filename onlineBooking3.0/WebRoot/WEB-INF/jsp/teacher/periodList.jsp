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
					href="#">节次管理</a>&nbsp;-</span>&nbsp;节次详情
			</div>
		</div>
		<div class="page">
			<!-- banner页面样式 -->
			<div class="banner">
				<div class="add">
				<a class="addA addA1" href="<%=path %>/addPeriodPage.action">添加</a>
				</div>
				<!-- banner 表格 显示 -->
				<div class="banShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td style="display:none;">ID</td>
							<td width="900px" class="tdColor tdC">节次</td>
							<td width="900px" class="tdColor">节次名称</td>
							<td width="900px" class="tdColor">操作</td>
						</tr>
						<% int i = 1; %>
						<c:forEach items="${periodCustomeList}" var="period">
						<tr>
							<td style="display:none;">${period.periodid }</td>
							<td>${period.periodid }</td>
							<td>${period.periodname }</td>
							<td><%-- <a href="<%=path %>/updateStudentPage.action?studentNo='${student.studentno }'&studentID=${student.studentid}"><img class="operation"
									src="<%=path %>/style/img/update.png"></a>--%> 
									<a  
									href="javascript:if(confirm('确实要删除吗?'))location='<%=path %>/deletePeriodInformationFromDB.action?
									periodid=${period.periodid }&periodname=${period.periodname }'"><img
									class="operation delban" src="<%=path%>/style/img/delete.png" /></a>
									</td>
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
	<%-- <div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="<%=path %>/style/img/shanchu.png" /></a>
			</div>
			<p class="delP1">你确定要删除此条记录吗？</p>
			<p class="delP2">
				<a href="#" class="ok yes" onclick="del()">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div> --%>
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