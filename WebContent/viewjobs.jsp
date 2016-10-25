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
<% ArrayList<String[]> a=(ArrayList<String[]>)request.getAttribute("viewjob");
if(a!=null){
	%>
	<table>
	<tr>
	<th>Job Title</th>
	<th>Details</th>
	<% 
Iterator i=a.iterator();
while(i.hasNext())
{
String[] s=(String[])i.next();
%>
<tr>
<br>
<td><%=s[0] %></td>
<td><a href="updatejobs.jsp?id=<%=s[0]%>"><%=s[1] %></a></td>
</tr>
   <%} %>
   </table>
<%} %>
</body>
</html>