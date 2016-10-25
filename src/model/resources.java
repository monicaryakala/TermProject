package model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.DBconnect;

public class resources {
	private String ID;

private String name;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getSlot() {
	return slot;
}
public void setSlot(String slot) {
	this.slot = slot;
}
public String getNETID() {
	return NETID;
}
public void setNETID(String nETID) {
	NETID = nETID;
}
private String type;
private String details;
private String date;
private String slot;
private String NETID;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public void addresource(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	try {
		PreparedStatement ps=c.prepareStatement("insert into resources values(?,?,?,?)");
		
		ps.setString(1,ID);
		ps.setString(2, name);
		ps.setString(3, type);
		ps.setString(4, details);
		
		
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
public ArrayList<String[]> viewresources(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select ID,name from resources");
		
		while(r.next())
		{
			String[] s1 = new String[2];
			s1[0]=r.getString("ID");
			s1[1]=r.getString("name");
			a.add(s1);
			System.out.println(s1);
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
public ArrayList<String[]> reserveresource(String ID){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select * from resources where ID='"+ID+"'");
		
		while(r.next())
		{
			String[] s1 = new String[4];
			
			s1[0]=r.getString("ID");
			s1[1]=r.getString("name");
			s1[2]=r.getString("type");
			s1[3]=r.getString("details");
			//s1[3]=r.getString("yearofjoining");
			//s1[4]=r.getString("program");
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
public ArrayList<String> bookslot(String id,String date){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String> a=new ArrayList<String>();
   int t=11;
   for(t=1;t<6;t++)
   {
	   a.add(t+"-"+ ++t);
   }
   try{
   Statement s=c.createStatement();
	ResultSet r =s.executeQuery("select slot from reserveresources where date='"+date+"' and name='"+id+"'");
	while(r.next()){
		a.remove(r.getString("slot"));
	}
   System.out.println(a);
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
public void insertslot(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	try {
		PreparedStatement ps=c.prepareStatement("insert into reserveresources values(?,?,?,?)");
		
		ps.setString(1,name);
		ps.setString(2, date);
		ps.setString(3, slot);
		ps.setString(4, NETID);
		System.out.println(name);
		
		
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
}


