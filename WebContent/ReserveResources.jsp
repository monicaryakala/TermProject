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
<%ArrayList<String[]> a=(ArrayList<String[]>)request.getAttribute("viewresources");
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
<td><%=s[0] %>;</td>
</tr>

<!--  <td><a href="resourcesServlet?action=bookresource"><%=s[0]%></td>-->

<%} %>
<%} %>


<br><br>
<!--  <table>
<tr>
<th>Resource Name</th>
<th><input type="textbox" value="name"></th>
</tr>

<tr>
<th>Details</th>
<th><input type="textarea" value="details"></th>
</tr>
<tr>
<th>Date</th>
<th><input id="datepicker" /></th>
</tr>
<tr>
<td><input type="submit" value="Add" /></td>
</tr>
</table>-->
</form>
</body>
</html>