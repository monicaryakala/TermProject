package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.DBconnect;

public class exam {
	
	private String name;
	private String date;
	private String details;
	private String result;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public void addexam(){
		Connection c;
		DBconnect db=new DBconnect();
		c=db.getConnection();
		try {
			PreparedStatement ps=c.prepareStatement("insert into exam values(?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2, date);
			ps.setString(3, details);
			ps.setString(4, result);
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
	public void signup(){
		Connection c;
		DBconnect db=new DBconnect();
		c=db.getConnection();
		try {
			PreparedStatement ps=c.prepareStatement("insert into examsignup values(?)");
			ps.setString(1,name);
		
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
	public ArrayList<String[]> viewexam(){
		Connection c;
		DBconnect db=new DBconnect();
		c=db.getConnection();
		ArrayList<String[]>a=new ArrayList<String[]>();
		try{
			Statement s=c.createStatement();
			ResultSet r =s.executeQuery("select name,date,details,result from exam");
			
			while(r.next())
			{
				String[] s1 = new String[4];
				s1[0]=r.getString("name");
				s1[1]=r.getString("date");
                s1[2]=r.getString("details");
                s1[3]=r.getString("result");
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
	public ArrayList<String[]> viewexamonly(){
		Connection c;
		DBconnect db=new DBconnect();
		c=db.getConnection();
		ArrayList<String[]>a=new ArrayList<String[]>();
		try{
			Statement s=c.createStatement();
			ResultSet r =s.executeQuery("select name from exam");
			
			while(r.next())
			{
				String[] s1 = new String[1];
				s1[0]=r.getString("name");
				
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
	public ArrayList<String[]> viewresult(){
		Connection c;
		DBconnect db=new DBconnect();
		c=db.getConnection();
		ArrayList<String[]>a=new ArrayList<String[]>();
		try{
			Statement s=c.createStatement();
			ResultSet r =s.executeQuery("select name,result from exam");
			
			while(r.next())
			{
				String[] s1 = new String[2];
				s1[0]=r.getString("name");
				s1[1]=r.getString("result");
                
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
	public ArrayList<String[]> editresult(){
		Connection c;
		DBconnect db=new DBconnect();
		c=db.getConnection();
		ArrayList<String[]>a=new ArrayList<String[]>();
		try {
			PreparedStatement ps=c.prepareStatement("update exam SET name='"+name+"',date='"+date+"',details='"+details+"',result='"+result+"' where name='"+name+"'");
			
			//System.out.println("update  alumni  SET id='"+id+"',name='"+name+"',program='"+program+",yearofjoining='"+yearofjoining+"' where id='"+id+"'");
			//ps.setString(id);
			//ps.setString(name);
			//ps.setString(3, program);
			//ps.setString(4, yearofjoining);
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

