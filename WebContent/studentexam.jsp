<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="menu.jsp"></jsp:include>
<style>
body {
    margin: 0;
}

.monica {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 17%;
    background-color: #F8EEE7;
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

.monica li a:hover:not(.active) {
    background-color: #49274A;
    color: BLACK;
}



</style>
</head>
<body>
<div style="float: left">
<ul class="monica" >
<li><a class="active" href="examServlet?action=viewexamonly">SignUP</a></li>
  <li><a class="active" href="examServlet?action=viewexam">View Exams</a></li>
  <li><a href="examServlet?action=viewresult">View Results</a></li>

  
   </ul>
   </div>
</body>
</html>