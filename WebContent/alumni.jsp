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
<form action="AlumniServlet" method=post>
<input type="hidden" name="action" value="addalumni">
		<div align="center">
		<h3>Add Alumni</h3>
		<table>
		<tr>
		<td>ID</td>
		<td><input type="text" name="id" /></td>
		</tr>
		<tr>
		<td>Name</td>
		<td><input type="text" name="name" /></td>
		</tr>
		<tr>
		<td>Program</td>
        <td><select name="Program">
        <option value="BS">BS</option>
        <option value="BA">BA</option>
        <option value="MS">MS</option>
        <option value="PHD">PHD</option>
        </select></td>
        <tr>
		<td>year of joining</td>
		<td><input type="text" name="yearofjoining"></td></tr>
        
<td><input type="submit" value="Add" ></td>
</tr>
</table>
</div>
</form>
</body>
</html>