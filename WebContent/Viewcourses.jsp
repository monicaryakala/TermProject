<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="menu.jsp"></jsp:include>
</head>
<body>
<div align="center">
<h3>List of courses being offered currently</h3>
<p title="Courses Offered">
<%ArrayList<String[]> a=(ArrayList<String[]>)request.getAttribute("course");
if(a!=null){
	%>
	<table>
<tr>
<th>Course Name</th>
<!-- <th>Election ID</th>-->
<th>Course ID</th>

</tr>
	<% 
Iterator i=a.iterator();
while(i.hasNext())
{
String[] s=(String[])i.next();
%>
<tr>
<td><%=s[0] %></td>
<td><a href="CoursesServlet?action=viewofficehrs"><%=s[1] %></a></td>
</tr>
<%} %>
</table>
<%} %>


</div>
</body>
</html>