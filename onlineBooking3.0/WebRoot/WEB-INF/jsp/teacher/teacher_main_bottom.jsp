<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main_bottom.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
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
