package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.DBconnect;

public class Alumni {
private String id;
private String name;
private String program;
private String yearofjoining;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProgram() {
	return program;
}
public void setProgram(String program) {
	this.program = program;
}
public String getYearofjoining() {
	return yearofjoining;
}
public void setYearofjoining(String yearofjoining) {
	this.yearofjoining = yearofjoining;
}
public void addalumni(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	try {
		PreparedStatement ps=c.prepareStatement("insert into alumni values(?,?,?,?)");
		ps.setString(1,id);
		ps.setString(2, name);
		ps.setString(3, program);
		ps.setString(4, yearofjoining);
		ps.executeUpdate();
	}catch (SQLException e) {
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
}
public ArrayList<String[]> viewalumni(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select id,name from alumni");
		
		while(r.next())
		{
			String[] s1 = new String[2];
			s1[0]=r.getString("id");
			s1[1]=r.getString("name");
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

public ArrayList<String[]> editalumni(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try {
		PreparedStatement ps=c.prepareStatement("update  alumni  SET id='"+id+"',name='"+name+"',program='"+program+"',yearofjoining='"+yearofjoining+"' where id='"+id+"'");
		
		
		ps.executeUpdate();
	}catch (SQLException e) {
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
	return a;
	}
}
