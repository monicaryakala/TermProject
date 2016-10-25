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
<form action='phdstudentServlet' method='post'>
<div align="center">
<h3>PHD students</h3>
<%ArrayList<String[]> a=(ArrayList<String[]>)request.getAttribute("phdstudent");
if(a!=null){
	%>
	<table>
<tr>
<th>Student ID</th>
<!-- <th>Election ID</th>-->
<th>Student Name</th>

</tr>
	<% 
Iterator i=a.iterator();
while(i.hasNext())
{
String[] s=(String[])i.next();
%>
<tr>
<td><%=s[0] %></td>
<td><a href="phdstudentServlet?action=viewphdinfo&id=<%=s[0]%>"><%=s[1] %></td>
</tr>
<%} %>
</table>
<%} %>
<!--  <a href="Phdstudent2.jsp">monica</a> <br>
<a href="Phdstudent2.jsp">sid</a> <br>
<a href="Phdstudent2.jsp">shivam</a> <br>
<a href="Phdstudent2.jsp">abhiram</a> <br>
<a href="Phdstudent2.jsp">abhishek</a> -->
</div>
</form>
</body>

</html>