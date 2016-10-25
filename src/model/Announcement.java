package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.DBconnect;

public class Announcement {
private String Jobtitle;
private String Eventtitle;
private String Newstitle;
private String jdetails;
private String edetails;
private String ndetails;
private String name;
private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getJobtitle() {
	return Jobtitle;
}
public void setJobtitle(String jobtitle) {
	Jobtitle = jobtitle;
}
public String getEventtitle() {
	return Eventtitle;
}
public void setEventtitle(String eventtitle) {
	Eventtitle = eventtitle;
}
public String getNewstitle() {
	return Newstitle;
}
public void setNewstitle(String newstitle) {
	Newstitle = newstitle;
}
public String getJdetails() {
	return jdetails;
}
public void setJdetails(String jdetails) {
	this.jdetails = jdetails;
}
public String getEdetails() {
	return edetails;
}
public void setEdetails(String edetails) {
	this.edetails = edetails;
}
public String getNdetails() {
	return ndetails;
}
public void setNdetails(String ndetails) {
	this.ndetails = ndetails;
}
public void addjobannouncement(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	try {
		PreparedStatement ps=c.prepareStatement("insert into jobannouncement values(?,?)");
		ps.setString(1,Jobtitle);
		//ps.setString(2,Eventtitle);
		//ps.setString(3,Newstitle);
		ps.setString(2,jdetails);
		//ps.setString(5,edetails);
		//ps.setString(6,ndetails);
		
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
public void applyjobs(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	try {
		PreparedStatement ps=c.prepareStatement("insert into applyjobs values(?,?,?)");
		ps.setString(1,Jobtitle);
	
		ps.setString(2,name);
		ps.setString(3,email);
		
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
public void addeventannouncement(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	try {
		PreparedStatement ps=c.prepareStatement("insert into eventannouncement values(?,?)");
		//ps.setString(1,Jobtitle);
		ps.setString(1,Eventtitle);
		//ps.setString(3,Newstitle);
		//ps.setString(2,jdetails);
		ps.setString(2,edetails);
		//ps.setString(6,ndetails);
		
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
public void addnewsannouncement(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	try {
		PreparedStatement ps=c.prepareStatement("insert into newsannouncement values(?,?)");
		//ps.setString(1,Jobtitle);
		//ps.setString(1,Eventtitle);
		ps.setString(1,Newstitle);
		//ps.setString(2,jdetails);
		//ps.setString(2,edetails);
		ps.setString(2,ndetails);
		
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
public ArrayList<String[]> viewjobannouncement(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select Jobtitle,jdetails from jobannouncement");
		while(r.next())
		{
			String[] s1 = new String[2];
			s1[0]=r.getString("Jobtitle");
			s1[1]=r.getString("jdetails");
			
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
public ArrayList<String[]> viewjobannouncementonly(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select Jobtitle,jdetails from jobannouncement");
		while(r.next())
		{
			String[] s1 = new String[2];
			s1[0]=r.getString("Jobtitle");
			s1[1]=r.getString("jdetails");
			
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
public ArrayList<String[]> viewEventannouncement(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select Eventtitle,edetails from eventannouncement");
		while(r.next())
		{
			String[] s1 = new String[2];
			s1[0]=r.getString("Eventtitle");
			s1[1]=r.getString("edetails");
			
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
public ArrayList<String[]> viewnewsannouncement(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select Eventtitle,edetails from newsannouncement");
		while(r.next())
		{
			String[] s1 = new String[2];
			s1[0]=r.getString("Eventtitle");
			s1[1]=r.getString("edetails");
			
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
public ArrayList<String[]> editjobs(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try {
		PreparedStatement ps=c.prepareStatement("update jobannouncement SET Jobtitle='"+Jobtitle+"',jdetails='"+jdetails+"' where Jobtitle='"+Jobtitle+"'");
		
		
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
public ArrayList<String[]> editevents(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try {
		PreparedStatement ps=c.prepareStatement("update eventannouncement SET Eventtitle='"+Eventtitle+"',edetails='"+edetails+"' where Eventtitle='"+Eventtitle+"'");
		
		
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
public ArrayList<String[]> editnews(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try {
		PreparedStatement ps=c.prepareStatement("update newsannouncement SET Eventtitle='"+Newstitle+"',edetails='"+ndetails+"' where Eventtitle='"+Newstitle+"'");
		
		
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
public void deletenewsannouncement(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	try {
		PreparedStatement ps=c.prepareStatement("DELETE from newsannouncement where Eventtitle='"+Newstitle+"' ");
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
