<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="menu.jsp"></jsp:include>
</head>
<body>
<div align="center">

<%ArrayList<String[]> a=(ArrayList<String[]>)request.getAttribute("viewexam");
if(a!=null){
	%>
	<table>
<tr>
<th>Exam</th>
<!-- <th>Election ID</th>-->
<th>Date</th>
<th>Details</th>
<th>Result</th>

</tr>
	<% 
Iterator i=a.iterator();
while(i.hasNext())
{
String[] s=(String[])i.next();
%>
<tr>
<td><%=s[0] %></td>
<td><%=s[1] %></td>
<td><%=s[2] %></td>
<td><a href="viewexamresults.jsp?name=<%=s[0]%>"><%=s[3] %></a></td>
</tr>
<%} %>
</table>
<%} %>
</div>
</body>
</html>