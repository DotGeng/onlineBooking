<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*,cn.cqupt.onlinebooking.po.TeacherCustom" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>

</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/style/css/css.css" />
<script type="text/javascript" src="<%=path %>/style/js/jquery.min.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div>
		<p>
			&nbsp;&nbsp;&nbsp;&nbsp;这里存放通知
		</p>
	</div>
	<div>
	<form action="<%=path %>/getClassroomWithState.action">
			&nbsp;&nbsp;&nbsp;&nbsp;请选择实验室：
			<input type="hidden" name="role" value="1"/>
			<input type="hidden" name="loginerName" value="${loginerName}"/>
		<select  id="examroomidSelct" name="examroomid" class="input3">
			<c:forEach items="${classroomLsit }" var="classroom">
				<option value="${classroom.classroomid } ">${classroom.classroomname }</option>
			</c:forEach>
		</select>	
		&nbsp;&nbsp;&nbsp;&nbsp;请选择周次：
		<select name="batch">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
		</select>
		<input type="submit" value="查询" class="input3"/>
	</form>
	</div>
	<script type="text/javascript">
		  window.onload=function(){
		 	var request = new XMLHttpRequest();
		 	request.open("get", "getStudentAggreState.action");
		 	request.setRequestHeader("Content-Type", "text/plain;charset=UTF-8");
		 	request.send();
		 } 
		</script>
	<div>
		<p>实验室：${classroomName };第  ${batch } 周 ;本次已经预约人数：${studentbookingCount}</p>
		<table  border="1" cellspacing="0" bordercolor="#000000">
			<%
				out.println("<tr>"+"<td width=100px>节次/星期</td><td width=80px>星期一</td><td width=80px>星期二</td><td width=80px>星期三</td><td width=80px>星期四</td><td width=80px>星期五</td><td width=80px>星期六</td><td width=80px>星期日</td>"+"</tr>");
				
				int count = Integer.parseInt((request.getAttribute("countPeriod")==null ? "0": request.getAttribute("countPeriod")).toString());
				//out.println(count);
				 for(int i = 1 ; i <= count;i ++) {
					out.println("<tr height=60px >");
					out.println("<td >");
						String key = i + "th";
						String periodName = request.getAttribute(key).toString();
						out.print(periodName);
					out.println("</td>");
					List<String> list = (List)request.getAttribute("classroomStateList");
					for(int j = (i-1)*7+1; j <= 7*i ;j ++) {
								int examroomId = Integer.parseInt(request.getAttribute("examroomid").toString());
								int batch = Integer.parseInt(request.getAttribute("batch").toString());
								String classroomName = request.getAttribute("classroomName").toString();
						if(list.get(j-1).equals("0")) {
							out.println("<td >");
							out.println("</td>");
						}else if(list.get(j-1).equals("2")) {
							out.println("<td >");
								out.println("有课<br>");
							out.println("</td>");
						}else {
							out.println("<td >");
								out.println(list.get(j-1));
								out.println("<br/>"); 
								if(request.getAttribute("loginerName").toString().equals(list.get(j-1))) {
									out.println("<a  href="+'"'+
								"getBookingDetailPageThroughTable.action?examroomName="+classroomName+"&examroomId="+ 
								examroomId +"&batch="+batch+"&week="+j%7+"&period="+i+'"'+" target="+"_blank"+">学生名单</a>");
								out.println("<br/>"); 
								}
								out.println("<br/>");
								out.println("</td>");
						}
					}
					out.println("</tr>");
				}  
			 %>
		</table>
	</div>
</body>
</html>