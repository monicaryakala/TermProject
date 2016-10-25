package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.DBconnect;

public class userregistration {
	private String NetID;
	private String firstname;
	private String Lastname;
	private String Role;
	private String Program;
	private String yearofjoining;
	private String pwd;
	
	public String getNetID() {
		return NetID;
	}
	public void setNetID(String netID) {
		NetID = netID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getProgram() {
		return Program;
	}
	public void setProgram(String program) {
		Program = program;
	}
	public String getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(String yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public String getpwd() {
		return pwd;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	
public int userRegistration(){
	int i=0;
	Connection c;
	DBconnect db=new DBconnect();
	c = db.getConnection();
	
	try {
		PreparedStatement ps=c.prepareStatement("insert into registration values(?,?,?,?,?,?,?)");
		ps.setString(1,NetID);
		ps.setString(2, pwd);
		ps.setString(3, firstname);
		ps.setString(4, Lastname);
		ps.setString(5, Role); 
		ps.setString(6,yearofjoining);
		ps.setString(7, Program);
		i=ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
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
	return i;
	
}
}
