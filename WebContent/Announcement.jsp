<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
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
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="menu.jsp"></jsp:include>
</head>
<body>
<%ArrayList<String[]> a=(ArrayList<String[]>)request.getAttribute("viewjob");
if(a!=null){
	%>
	<% 
Iterator i=a.iterator();
while(i.hasNext())
{
String[] s=(String[])i.next();
%>

     <%} %>
<%} %>

<div style="float: left">
<ul class="monica" >

  <li><a class="active" href="jobannounce.jsp">Job Announcement</a></li>
  <li><a href="newsannounce.jsp">News Announcement</a></li>
   <li><a href="eventsannounce.jsp">Event Announcement</a></li>
    <li><a href="AnnouncementServlet?action=viewjobannouncement">View Job Announcement</a></li>
     <li><a href="AnnouncementServlet?action=vieweventannouncement">View Event Announcement</a></li>
      <li><a href="AnnouncementServlet?action=viewnewsannouncement">View News Announcement</a></li>
   </ul>
   </div>
   <center>
   
   <br><br>
 <!--  <div align="center"><br>
 <label>Job</label><br>
 <textarea name="jobdetails" rows="5" cols="80"></textarea><br><br>
 <label>Event</label><br>
 <textarea name="eventdetails" rows="5" cols="80"></textarea><br><br>
 <label>News</label><br>
 <textarea name="newsdetails" rows="5" cols="80"></textarea>
      </div>-->
      </center>
</body>
</html>