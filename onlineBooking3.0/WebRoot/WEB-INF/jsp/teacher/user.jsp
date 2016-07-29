<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>教师管理</title>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/style/css/css.css" />
<script type="text/javascript" src="<%=path%>/style/js/jquery.min.js"></script>

<!-- <script type="text/javascript" src="js/page.js" ></script> -->
</head>

<body>

	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="<%=path%>/style/img/coin02.png" /><span><a
					href="#">首页</a>&nbsp;-&nbsp;-</span>&nbsp;管理员管理
			</div>
		</div>
		<div class="page">
			<!-- user页面样式 -->
			<div class="connoisseur">
				<div class="conform">
					<form>
						<div class="cfD">
							<!-- <input class="userinput" type="text" placeholder="输入用户名" />&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;
							<input class="userinput vpr" type="text" placeholder="输入用户密码" /> -->
							<a class="addA addA1" href="<%=path%>/connoisseuradd.action">添加</a>
							<a class="addA addA1" href="<%=path %>/uploadTeacher.action" class="userbtn">批量导入</a>
						</div>
					</form>

				</div>
				<!-- user 表格 显示 -->
				<div class="conShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td style="display:none;" class="tdColor tdC">ID</td>
							<td width="66px" class="tdColor tdC">序号</td>
							<td width="435px" class="tdColor">教师姓名</td>
							<td width="400px" class="tdColor">登录密码</td>
							<td width="630px" class="tdColor">角色</td>
							<td width="130px" class="tdColor">操作</td>
						</tr>
						<%
							int i = 1;
						%>
						<c:forEach items="${teacherList}" var="teacher">

							<tr height="40px">

								<td style="display:none;">${teacher.teacherid}</td>
								<td><%=i++%></td>
								<td>${teacher.teachername }</td>
								<td>${teacher.teacherpw }</td>
								<td>
									<c:if test="${teacher.teacherrole==1 }">
										普通管理员
									</c:if>
								</td>
								<!-- 删除弹出框 -->

								<!-- 删除弹出框  end-->
								<td><a
									href="<%=path %>/updateTeacher.action?teacherID=${teacher.teacherid}"><img
										class="operation" src="<%=path%>/style/img/update.png" /> </a > <a 
										href="javascript:if(confirm('确实要删除吗?'))location='<%=path %>/deleteTeacher.action?teacherID=${teacher.teacherid}'"><img
									class="operation delban" src="<%=path%>/style/img/delete.png" /></a>

								</td>
							</tr>
						</c:forEach>
					</table>
					
					<div class="paging">
					<%
						int pageSize = 3;
						int pageNow = Integer.parseInt(request.getAttribute("pageNow") + "");
						//int pageNow = 0;
						int pageNowTmp = pageNow;
						int pageCount= Integer.parseInt(request.getAttribute("pageCount") + "");
						for(int count = (pageNow < 2 ? 0 : pageNow -2 ); count <= (pageNow + 2 < pageCount ? pageNow + 2: pageCount ); count ++) {
							int pageShow = count + 1;
							
							out.println("<a href='"+ path + "/user.action?pageNow="+pageNowTmp+"&pageSize="+pageSize+"' >"+pageShow+"</a> &nbsp");
							pageNowTmp ++;
						}
					 %>
					此处是分页
					</div>
				</div>
				<!-- user 表格 显示 end-->
			</div>
			<!-- user页面样式end -->
		</div>
	</div>
	<div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="<%=path%>/style/img/shanchu.png" /> </a>
			</div>
			<p class="delP1">你确定要删除此条记录吗？</p>
			<p class="delP2">
				<a
					href="<%=path %>/updateTeacher.action?teacherID=${teacher.teacherid}"
					class="ok yes" >确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div>
</body>
<script type="text/javascript">
	// 广告弹出框
	/* $(".delban").click(function() {
		$(".banDel").show();
		
	});
	$(".close").click(function() {
		$(".banDel").hide();
		return 0;
	});
	$(".no").click(function() {
		$(".banDel").hide();
		return 0;
	});  */
	// 广告弹出框 end
</script>
</html>