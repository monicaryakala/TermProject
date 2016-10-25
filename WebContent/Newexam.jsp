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
<title>Insert title here</title>
<jsp:include page="menu.jsp"></jsp:include>
<style>
body {
    margin: 0;
}

.monica {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 17%;
    background-color: #F8EEE7;
    position: fixed;
    height: 100%;
    overflow: auto;
}

.monica li a {
background-color: #94618E;
    display: block;
    color: #000;
    padding: 8px 0 8px 16px;
    text-decoration: none;
}

.monica li a.active {
    background-color: #94618E;
    color: BLACK;
}

.monica li a:hover:not(.active) {
    background-color: #49274A;
    color: BLACK;
}



</style>
</head>
<body>

<form action="examServlet" method="post">
<input type="hidden" name="action" value="addexam">
		<div align="center">
		<h3>Exams</h3>
		<table>
		<tr>
		<td>Name of the exam</td>
		<td><input type="text" name="examname" /></td>
		</tr>
		
		<tr>
		<td>old papers</td>
		<td><input type="text" name="details" /></td>
		</tr>
		<tr>
		<td>Date</td> 
		<tr>
       <td><input id="datepicker" name="date" /></td>
		</tr>
		<tr>
		<td>Result</td>
		<td><input type="text" name="result"></td>
		</tr>
		<tr>
<td><input type="submit" value="Submit" /></td>
</tr>
		</table>
		</div>
		</form>
	 

</body>	
</html>