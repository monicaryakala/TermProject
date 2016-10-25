package model;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.DBconnect;

public class Login {
private String NETID;
private String Role;
private String charr;
public String getCharr() {
	return charr;
}
public void setCharr(String charr) {
	this.charr = charr;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public String getNETID() {
	return NETID;
}
public void setNETID(String nETID) {
	NETID = nETID;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
private String Password;



public boolean userLogin(){
	String pswd = "1";
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	Statement s = null;
	try {
		s = c.createStatement();
	ResultSet r = null;
	
		r = s.executeQuery("select pwd from registration where NetID='"+NETID+"' and Role='"+Role+"'");
			while(r.next())
			{
				pswd=r.getString("pwd");
			}
			if(pswd.equals(getPassword())){
				return true;
			}
			else
			{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	return false;
	}
public ArrayList<String[]> setchar(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select char from registration");
		
		while(r.next())
		{
			String[] s1 = new String[0];
			s1[0]=r.getString("char");
			//s1[1]=r.getString("name");
//			s1[2]=r.getString("details");
			a.add(s1);
		}
			
	    }
	catch(Exception e){
		e.printStackTrace();
		
	                   }finally{
	                   try {
						c.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
}
	return a;
}
}
