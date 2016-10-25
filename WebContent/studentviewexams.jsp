<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="menu.jsp"></jsp:include>
<title>Insert title here</title>
</head>
<body>
<%ArrayList<String[]> a=(ArrayList<String[]>)request.getAttribute("mycourses");
if(a!=null){
	%>
<div>
<center>
<h3>MyCourses</h3>
<table>
<tr>
<th>Course ID</th>
<th>Course Name</th>
</tr>
</center>
</div>
<% 
Iterator i=a.iterator();
while(i.hasNext())
{
String[] s=(String[])i.next();
%>
<tr>
<td><%=s[0] %>;</td>
<td><a href="Officehrs2.jsp"><%=s[1] %></a></td>
</tr>
<%} %>
</table>
<%} %>
</body>
</html>