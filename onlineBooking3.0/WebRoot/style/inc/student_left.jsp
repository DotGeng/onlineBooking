<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<%
	Cookie[] userno=request.getCookies();
	String studentNo = "";
	String sudentPw="" ; 
	for(int i  = 0 ; i < userno.length; i ++) {
		if(userno[i].getName().equals("userno")) {
			studentNo = userno[i].getValue();	
		}
		if(userno[i].getName().equals("password")) {
			sudentPw = userno[i].getValue();
		}
	}
	/* out.println(userno[1].getValue());
	out.println(userno[2].getValue()); */
 %>
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

</div>
	<!-- 左边节点 -->
	<div class="container">
		<div class="leftsidebar_box">
			<a href="<%=path %>/studentMain.action" target="main"><div class="line">
					<img src="<%=path %>/style/img/coin01.png" />&nbsp;&nbsp;首页
				</div></a>
			
			<dl class="system_log">
				<dt>
					<img class="icon1" src="<%=path %>/style/img/coin03.png" /><img class="icon2"
						src="<%=path %>/style/img/coin04.png" /> 在线预约<img class="icon3"
						src="<%=path %>/style/img/coin19.png" /><img class="icon4"
						src="<%=path %>/style/img/coin20.png" />
						
				</dt>
				<dd>
					<img class="coin11" src="<%=path %>/style/img/coin111.png" /><img class="coin22"
						src="<%=path %>/style/img/coin222.png" /> <a class="cks" href="<%=path %>/preOrderDetail.action?studentno=<%=studentNo %>&studentpw=<%=sudentPw %>"
						target="main">预约详情</a> 
						<img class="icon5" src="../img/coin21.png" />
				</dd>
			</dl>
			
			  <dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin11.png" /><img class="icon2"
						src="../img/coin12.png" /> 学生成绩<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="<%=path %>/getScoreByStudentNo.action?studentNo=<%=studentNo %>" target="main"
						class="cks">成绩详情</a><img class="icon5" src="../img/coin21.png" />
				</dd>
			 </dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin05.png" /><img class="icon2"
						src="../img/coin06.png" /> 学生签到<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="<%=path %>/qiandao_page.action"
						target="main">学生签到</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin07.png" /><img class="icon2"
						src="../img/coin08.png" /> 用户中心<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="<%=path %>/modifyPasswordPage.action" target="main"
						class="cks">修改密码</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="<%=path %>/studentLogin.jsp"  target="_top"
						class="cks">退出系统</a><img class="icon5" src="../img/coin21.png" />
				</dd>
			</dl>
			<!--<dl class="system_log">
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
						src="../img/coin18.png" /> 收支管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="../balance.html"
						target="main" class="cks">收支管理</a><img class="icon5"
						src="../img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
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
			</dl> -->
		</div>

	</div>
</body>
</html>
