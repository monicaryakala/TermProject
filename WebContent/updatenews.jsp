<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="menu.jsp"></jsp:include>
</head>
<body>
<% String id= request.getParameter("id"); %>
<form action="AnnouncementServlet" method=post>
<input type="hidden" name="action" value="updatenews" >
		<div align="center">
		<h3>Upcoming news</h3>
		<table>
		<tr>
		<td>News Title</td>
		<td><input type="text" name="newstitle" value="<%=id %>"/></td>
		</tr>
		<tr>
        <td>Details</td>
        <td>
        <textarea name="ndetails"></textarea></td>
        
<td><input type="submit" value="Update" /></td>
        
</tr>
</table>
</div>
</form>
</body>
</html>