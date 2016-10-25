package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.DBconnect;

public class Courses{
	private String ID;
	private String name;
	private String details;
	private String facultyID;
	private String concentration;
	

private String postofficehrs;
private String ta;
private String syllabus;
private String fid1;
private String requirements;
private String fall;
private String computerscience;
private String officelocation;
public String getOfficelocation() {
	return officelocation;
}
public void setOfficelocation(String officelocation) {
	this.officelocation = officelocation;
}
public String getComputerscience() {
	return computerscience;
}
public void setComputerscience(String computerscience) {
	this.computerscience = computerscience;
}
public String getfall() {
	return fall;
}
public void setfall(String fall) {
	this.fall = fall;
}
public String getRequirements() {
	return requirements;
}
public void setRequirements(String requirements) {
	this.requirements = requirements;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getConcentration() {
	return concentration;
}
public void setConcentration(String concentration) {
	this.concentration = concentration;
}
public String getFid1() {
	return fid1;
}
public void setFid1(String fid1) {
	this.fid1 = fid1;
}
public String getPostofficehrs() {
	return postofficehrs;
}
public void setPostofficehrs(String postofficehrs) {
	this.postofficehrs = postofficehrs;
}
public String getTa() {
	return ta;
}
public void setTa(String ta) {
	this.ta = ta;
}
public String getSyllabus() {
	return syllabus;
}
public void setSyllabus(String syllabus) {
	this.syllabus = syllabus;
}

	
public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getFacultyID() {
		return facultyID;
	}
	public void setFacultyID(String facultyID) {
		this.facultyID = facultyID;
	}
public ArrayList<String[]> viewallcourses(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select ID,name,concentration,requirements from course");
		
		while(r.next())
		{
			String[] s1 = new String[4];
			s1[0]=r.getString("ID");
			s1[1]=r.getString("name");
			s1[2]=r.getString("concentration");
			s1[3]=r.getString("requirements");
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
public ArrayList<String[]> viewcomputerscience(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]> a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select ID,name,concentration from course where concentration='computerscience' ");
		
		while(r.next())
		{
			String[] s1 = new String[3];
			s1[0]=r.getString("ID");
			s1[1]=r.getString("name");
			s1[2]=r.getString("concentration");
		
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
public ArrayList<String[]> viewcomputerengineering(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]> a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select ID,name,concentration from course where concentration='computer engineering' ");
		
		while(r.next())
		{
			String[] s1 = new String[3];
			s1[0]=r.getString("ID");
			s1[1]=r.getString("name");
			s1[2]=r.getString("concentration");
		
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
public ArrayList<String[]> viewinformationscience(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]> a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select ID,name,concentration from course where concentration='informationscience' ");
		
		while(r.next())
		{
			String[] s1 = new String[3];
			s1[0]=r.getString("ID");
			s1[1]=r.getString("name");
			s1[2]=r.getString("concentration");
		
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
public ArrayList<String[]> viewacurrentsemester(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select ID,name,concentration from course where concentration='"+fall+"'");
		
		while(r.next())
		{
			String[] s1 = new String[3];
			s1[0]=r.getString("ID");
			s1[1]=r.getString("name");
			s1[2]=r.getString("concentration");
			//System.out.println(ID);
			//System.out.println("name");
			
			
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
public void addcourses(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	try {
		PreparedStatement ps=c.prepareStatement("insert into course values(?,?,?,?,?,?)");
		ps.setString(1,ID);
		ps.setString(2, details);
		ps.setString(3, name);
		ps.setString(4, facultyID);
		ps.setString(5, concentration);
		ps.setString(6, requirements);
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
public ArrayList<String[]> viewmycourses(String id){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]>a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select * from course where facultyID='"+id+"'");
		while(r.next())
		{
			String[] s1 = new String[2];
			s1[0]=r.getString("ID");
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
public void postofficehrs(){
	Connection c1;
	DBconnect db1=new DBconnect();
	c1=db1.getConnection();
	try{
	PreparedStatement ps=c1.prepareStatement("insert into postofficehrs values(?,?,?,?)");
	ps.setString(1,postofficehrs);
	ps.setString(2,ta);
	ps.setString(3, syllabus);
	ps.setString(4, officelocation);
	ps.executeUpdate();
}catch (SQLException e) {
	e.printStackTrace();
}finally {
	try{
		c1.close();
	}catch (SQLException e){
		e.printStackTrace();
	}
}
}
public ArrayList<String[]> viewofficehrs(){
	Connection c;
	DBconnect db=new DBconnect();
	c=db.getConnection();
	ArrayList<String[]> a=new ArrayList<String[]>();
	try{
		Statement s=c.createStatement();
		ResultSet r =s.executeQuery("select * from postofficehrs");
		
		while(r.next())
		{
			String[] s1 = new String[4];
			s1[0]=r.getString("postofficehrs");
			s1[1]=r.getString("ta");
			s1[2]=r.getString("syllabus");
			s1[3]=r.getString("officelocation");
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
