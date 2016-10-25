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
<form action="resourcesServlet" method="post">
<input type="hidden" name="action" value="addresources">
		<div align="center">
		<h3>New Resource</h3>
		<table>
		<tr>
		<td>Resource ID</td>
		<td><input type="text" name="id" /></td>
		</tr>
		<tr>
		<td>Name of resource</td>
		<td><input type="text" name="Nameofresource" /></td>
		</tr>
		<tr>
		<td>Resource Type</td>
		<td><select name="type">
  <option value="Projector">Projector</option>
  <option value="Conference room">Conference room</option>

</select></td></tr>
<tr>
<td>Details</td>
<td>
<textarea name="details"></textarea></td>
</tr>
</table>	
<tr>
<td>
<form action="Resources.jsp"><input type="submit" value="Add" />
</form></td>
</tr>
		</div>
</form>
</body>
</html>