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
					href="#">机房管理</a>&nbsp;-</span>&nbsp;机房详情
			</div>
		</div>
		<div class="page">
			<!-- banner页面样式 -->
			<div class="banner">
				<div class="add">
				<a class="addA addA1" href="<%=path %>/addNotifyPage.action">添加</a>
				</div>
				<!-- banner 表格 显示 -->
				<div class="banShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td style="display:none;">ID</td>
							<td width="66px" class="tdColor tdC">序号</td>
							<td width="315px" class="tdColor">标题</td>
							<td width="308px" class="tdColor">通知内容</td>
							<td width="450px" class="tdColor">通知添加时间</td>
							<td width="180px" class="tdColor">操作</td>
						</tr>
						<% int i = 1; %>
						<c:forEach items="${systemDataCustomList}" var="systemData">
						<tr>
							<td style="display:none;">${systemData.systemdataid }</td>
							<td><%=i++ %></td>
							<td>${systemData.systemdataname }</td>
							<td>${systemData.systemdatacontent }</td>
							<td>${systemData.datetime }</td>
							<td>
							<a
									href="javascript:if(confirm('确实要删除吗?'))location='<%=path %>/deleteNotifyById.action?
									systemdataid=${systemData.systemdataid }'"><img
									class="operation delban" src="<%=path%>/style/img/delete.png" /></a>
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