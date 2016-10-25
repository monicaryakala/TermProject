<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<jsp:include page="menu.jsp"></jsp:include>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
  
  <script>
  $(document).ready(function() {
    $("#datepicker").datepicker();
  });
  </script>
</head>
<body>
<%ArrayList<String> a=(ArrayList<String>)request.getAttribute("slot");
if(a!=null){
	%>
	<% 
Iterator i=a.iterator();
while(i.hasNext())
{
String s=(String)i.next();%>
<input type="radio" name="slot1" value="<%=a%>"> 

<% out.print(s);
%>

<% String a1 = request.getParameter("id");
%>
<%} %>
<%} %>
<form action="InsertslotServlet" method="post">
 <div align="center">
		<h3>Reserve resources</h3>
		<table>
		<tr>
		
	<td><input type="hidden" name="name" value="<%=a%>"></td>
		
		</tr>
		<tr>
		<td>Date</td>
		<td> <input id="datepicker"  name="date"/></td></tr>
		<!--  <tr>
		<td>slot</td>
		<td><select name="slot">
  <option value="slot1">10:00a.m-01:00p.m</option>
  <option value="slot2">2:00p.m-4:00p.m</option>
        </td>
        </tr>
        <tr>
		<td>NETID</td>
		<td><input type="text" name="NETID" /></td>
		</tr>-->
        
        
        <tr>
<td><input type="submit" value="reserve" /></td>
</tr>
</table>
</div>
</form>
</body>
</html>