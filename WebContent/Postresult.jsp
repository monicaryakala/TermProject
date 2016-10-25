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
<form tag="postresult">
		<div align="center">
		<h3>postresult</h3>
		<table>
		<tr>
		<td>Name of exam</td>
		<td><input type="text" name="nameofresult" /></td>
		</tr>
		<tr>
		<td>Result</td>
		<td><textarea></textarea></td>
		</tr>
		<tr>
        <td><input type="submit" value="Submit" /></td>
        <tr>
		</table>
		</div>
		</form>
		
		
</body>
</html>