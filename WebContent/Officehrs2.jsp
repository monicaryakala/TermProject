<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="menu.jsp"></jsp:include><br>
<br>
</head>
<body>
<%String monica=request.getParameter("monica");

%>
<form action="CoursesServlet?action=officehrs" method="post" tag="faculty info">
<div align="center">
		<h3>Fill in the blank</h3>
		<table>
		<tr>
		<input type="hidden" name="monica" value="<%=monica%>">
		<tr>	
	<td>Office hours</td>
		<td><input type="text" name="Officehours" /></td>
		</tr>
		<tr>
		<td>TA info</td>
		<td><input type="text" name="TAinfo" /></td>
		</tr>
		<tr>
		<td>Syllabus</td>
		<td>
		<textarea name="syllabus">
		
		</textarea>
		</td>
		</tr>
		<tr>
        <td><input type="submit" value="Submit" /></td>
        </tr>
		</table>
		</div></form>
</body>
</html>