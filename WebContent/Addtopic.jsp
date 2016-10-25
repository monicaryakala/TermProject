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
<form action="CoursesServlet" method=post>
<input type="hidden" name="action" value="addcourse">
		<div align="center">
		<h3>Add Course</h3>
		<table>
		<tr>
		<td>Name of the Course</td>
		<td><input type="text" name="Course" /></td>
		</tr>
		<tr>
		<td>Course ID</td>
		<td><input type="text" name="courseID"></td></tr>
		<tr>
        <td>Details</td>
        <td>
        <textarea name="details"></textarea></td></tr>
<tr>
<td>concentration</td>        
<td><input type="text" name="concentration"></td>
</tr>
<tr>
<td>Requirements</td>
<td><input type="text" name="requirements"></td>
</tr>
        
<td><input type="submit" value="Add" /></td>
</tr>
</table>
</div>
</form>
</body>
</html>