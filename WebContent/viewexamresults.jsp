<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
  
  <script>
  $(document).ready(function() {
    $("#datepicker").datepicker();
  });
  </script>
<jsp:include page="menu.jsp"></jsp:include>
<title>Insert title here</title>
</head>
<body>
<% String name= request.getParameter("name"); %>
<form action="examServlet" method="post">
<input type="hidden" name="action" value="updateresult">
		<div align="center">
		<h3>Results</h3>
		<table>
		<tr>
		<td>Exam </td>
		<td><input type="textbox" name="name" value="<%=name %>"/></td>
		</tr>
		
		<tr>
		<td>old papers</td>
		<td><input type="text" name="details" /></td>
		</tr>
		<tr>
		<td>Date</td>
       <td><input id="datepicker" name="date" /></td>
		</tr>
		<tr>
		<td>Result</td>
		<td><input type="text" name="result" /></td>
		</tr>
		
		
		<tr>
<td><input type="submit" value="Submit" /></td>
</tr>
		</table>
		</div>
		</form>
</body>
</html>