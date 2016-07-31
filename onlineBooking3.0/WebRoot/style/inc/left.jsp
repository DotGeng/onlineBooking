<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页左侧导航</title>
<link rel="stylesheet" type="text/css" href="../css/public.css" />
<script type="text/javascript" src="<%=path %>/style/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=path %>/style/js/public.js"></script>
</head>

<body id="bg">
	<!-- 左边节点 -->
	<div class="container">
		<div class="leftsidebar_box">
			<a href="<%=path %>/main_before.action" target="main"><div class="line">
					<img src="<%=path %>/style/img/coin01.png" />&nbsp;&nbsp;首页
				</div></a>
			<!-- <dl class="system_log">
			<dt><img class="icon1" src="../img/coin01.png" /><img class="icon2"src="../img/coin02.png" />
				首页<img class="icon3" src="../img/coin19.png" /><img class="icon4" src="../img/coin20.png" /></dt>
		</dl> -->
			<dl class="system_log">
				<dt>
					<img class="icon1" src="<%=path %>/style/img/coin03.png" /><img class="icon2"
						src="<%=path %>/style/img/coin04.png" /> 教师管理<img class="icon3"
						src="<%=path %>/style/img/coin19.png" /><img class="icon4"
						src="<%=path %>/style/img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="<%=path %>/style/img/coin111.png" /><img class="coin22"
						src="<%=path %>/style/img/coin222.png" /><a class="cks" href="<%=path %>/user.action"
						target="main">教师详情</a><img class="icon5" src="../img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin05.png" /><img class="icon2"
						src="../img/coin06.png" /> 学生管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="<%=path %>/studentList.action"
						target="main">学生详情</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="<%=path %>/studentsScore.action?pageCount=1"
						target="main">成绩查看</a><img class="icon5" src="../img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin07.png" /><img class="icon2"
						src="../img/coin08.png" /> 机房管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="<%=path %>/classroomList.action" target="main"
						class="cks">机房详情</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="<%=path %>/getProctorList.action" target="main"
						class="cks">监考详情</a><img class="icon5" src="../img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin11.png" /><img class="icon2"
						src="../img/coin12.png" /> 节次管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="<%=path %>/getPeriodList.action" target="main"
						class="cks">节次详情</a><img class="icon5" src="../img/coin21.png" />
				</dd>
			 </dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin14.png" /><img class="icon2"
						src="../img/coin13.png" /> 权限管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="<%=path %>/modifyPermissionsPage.action" target="main"
						class="cks">权限管理</a><img class="icon5" src="../img/coin21.png" />
				</dd>
			</dl>
			
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin15.png" /><img class="icon2"
						src="../img/coin16.png" /> 通知管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="<%=path %>/notifyList.action"
						target="main" class="cks"> 通知管理</a><img class="icon5"
						src="../img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin17.png" /><img class="icon2"
						src="../img/coin18.png" /> 数据管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="<%=path %>/tomanagerLoginpage.action"
						target="main" class="cks">操作数据</a><img class="icon5"
						src="../img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coinL1.png" /><img class="icon2"
						src="../img/coinL2.png" /> 预约周次<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="<%=path %>/changeOpenBatchPage.action"
						target="main" class="cks">周次设置</a><img class="icon5"
						src="../img/coin21.png" />
				</dd> 
			</dl>
			<!-- <dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coinL1.png" /><img class="icon2"
						src="../img/coinL2.png" /> 系统管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="../changepwd.html"
						target="main" class="cks">修改密码</a><img class="icon5"
						src="../img/coin21.png" />
				</dd> 
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks">退出</a><img
						class="icon5" src="../img/coin21.png" />
				</dd>
			</dl>  -->
			
		</div>

	</div>
</body>
</html>
