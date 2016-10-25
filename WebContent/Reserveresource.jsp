<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
  
  <script>
  $(document).ready(function() {
    $("#datepicker").datepicker();
  });
  </script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reserve resource</title>
<jsp:include page="menu.jsp"></jsp:include>

</head>
<body> 
  
<%ArrayList<String[]> a=(ArrayList<String[]>)request.getAttribute("viewresources");
if(a!=null){
	%>
	<table>
	<tr>
	<th>Resource ID</th>
<th>Resource Name</th>
<!-- <th>Election ID</th>--> 

</tr>


<% 
Iterator i=a.iterator();
while(i.hasNext())
{
String[] s=(String[])i.next();
%>
<tr>
<td><%=s[0] %></td>
<td><a href="reserveresource2.jsp?id=<%=s[0]%>"><%=s[1] %></a></td>
</tr>
<br>
</table>
<%} %>
<%} %>

</body>
</html>