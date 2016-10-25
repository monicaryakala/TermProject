<%@ page import="java.util.*"%>
<%@ page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.Statement"%>
<%@page import="DAO.DBconnect" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String NETID=request.getParameter("NETID");
String Password=request.getParameter("Password");
String Role=request.getParameter("Role");
Connection c;
DBconnect db=new DBconnect();
c=db.getConnection();
Statement s = null;
try {
   //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   // Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=demoLoginAdminUser", "sa", "sa");
   // Statement st = con.createStatement();
    //ResultSet rs = st.executeQuery("select * from reg");
    s = c.createStatement();
	ResultSet r = null;
	
		r = s.executeQuery("select pwd from registration where NetID='"+NETID+"' and Role='"+Role+"'");
    int x = 0;
    while (r.next()) {
        if ((r.getString("username").equals(NETID)) && r.getString("password").equals(Password)) {
            String stp = r.getString("uType");
            if (stp.equals("admin")) {
                x = 1;
                break;
            } else {
                x = 2;
                break;
            }
        }
    }
    if (x == 2) {
        response.sendRedirect("studentmenu.jsp");
    } else if (x == 1) {
        response.sendRedirect("menu.jsp");
    } else {
        out.println("Either you enter Invalid UserName or Password! Please Try Again");
%>
     
    <%}
        } catch (Exception e) {
            out.println(e);
        }
        session.setAttribute("NetID", NETID);
    %> 
</body>
</html>