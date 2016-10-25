<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="menu.jsp"></jsp:include>
<!-- <style>
body {
    margin: 0;
}

.monica {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 17%;
    background-color: #ebdef0 ;
    position: fixed;
    height: 100%;
    overflow: auto;
}


.monica li a {
background-color: #94618E;
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



.monica li a:hover {
    color: #F6D8CE;
    background-color: #49274A;
}
</style>-->
</head>
<body>
<%ArrayList<String[]> a=(ArrayList<String[]>)request.getAttribute("mycourses");
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
<td><a href="resourcesServlet?action=viewmycourses&NETID=<%=s[0]%>"><%=s[1] %></td>
</tr>
<%} %>
</table>
<%} %>
</body>
</html>