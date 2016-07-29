<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html >
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改密码页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="<%=path %>/style/js/jquery.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=path %>/style/css/css.css" />
	<script type="text/javascript">
		function myfun() {
			var inf = "${information}";
			if(inf != null && inf != "") {
				alert(inf);
			}
		}
		window.onload=myfun;//不要括号
	</script>
  </head>
  
  <body>
    <form action="modifyPasswordToDB.action" id="passwordForm" method="post">
    <div class="bbD">
    <input type="hidden"  name="studentNo" value="<%=studentNo%>"/>
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请输入旧密码：<input name="oldPassword" type="password" class="input3" required="required"/><br>
    	</div>
    	<div class="bbD">
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请输入新密码：<input id="newPassword1" name="newPassword" type="password" class="input3" required="required"/><br>
    	</div>
    	<div class="bbD">
    	&nbsp;&nbsp;&nbsp;请再次输入新密码：<input id="newPassword2" name="newPassword2" type="password" class="input3" required="required"/><br>
    	</div>
		<div class="bbD">
			<p class="bbDP">
				<button type="submit" class="btn_ok btn_yes" onclick="return checkNewPassword();">提交</button>
			</p>
		</div>
		<script type="text/javascript">
			function checkNewPassword() {
				var newPassword1 = document.getElementById("newPassword1").value;
				var newPasswoed2 = document.getElementById("newPassword2").value;
				if(newPassword1 != newPasswoed2) {
					alert("两次输入的新密码不一致");
					document.getElementById("newPassword1").focus();   
       				return false;  
				}else {
					 document.getElementById("passwordForm").sumbit();   
				}
			}
		</script>
    	
    </form>
  </body>
</html>
