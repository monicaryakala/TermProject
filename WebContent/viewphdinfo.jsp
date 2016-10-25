<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ArrayList<String[]> a=(ArrayList<String[]>)request.getAttribute("phdinfo");
if(a!=null){
	%>
	<table>
	<tr>
<th>ID</th>
<!-- <th>Election ID</th>-->
<th>Name</th>
<th>Semester</th>
<th>Year of Joining</th>
<th>Program</th>

</tr>
	<% 
Iterator i=a.iterator();
while(i.hasNext())
{
String[] s=(String[])i.next();
%>
<tr>
<td><%=s[0] %>;</td>
<td><%=s[1] %></td>
<td><%=s[2] %></td>
<td><%=s[3] %></td>
<td><%=s[4] %></td>
</tr>
<%} %>
</table>
<%} %>
 <!--  <div align="center">
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
        <textarea name="details"></textarea></td>
        </tr>
        </table>
        </div>-->
<!--  <td><input type="submit" value="Add" /></td>-->

</body>
</html>