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
<table>
<br><br>
<li><a href="CoursesServlet?action=viewcomputerscience">Computer Science</a></li><br>
<li><a href="CoursesServlet?action=viewcomputerengineering">Computer Engineering</a></li><br>
<li><a href="CoursesServlet?action=viewinformationscience">Information Science</a></li>
</table>
</div>
</body>
</html>