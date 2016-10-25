package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.DBconnect;

public class phdstudent {
	private String id;
	private String name;
	private String semester;
	private String yearofjoining;
	private String program;
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
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(String yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	
	public ArrayList<String[]> viewphdstudent(){
		Connection c;
		DBconnect db=new DBconnect();
		c=db.getConnection();
		ArrayList<String[]>a=new ArrayList<String[]>();
		try{
			Statement s=c.createStatement();
			ResultSet r =s.executeQuery("select ID,name from phdstudent");
			
			while(r.next())
			{
				String[] s1 = new String[2];
				s1[0]=r.getString("ID");
				s1[1]=r.getString("name");
//				s1[2]=r.getString("details");
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
	public ArrayList<String[]> phdinfo(String id){
		Connection c;
		DBconnect db=new DBconnect();
		c=db.getConnection();
		ArrayList<String[]>a=new ArrayList<String[]>();
		try{
			Statement s=c.createStatement();
			ResultSet r =s.executeQuery("select * from phdstudent where id='"+id+"'");
			
			while(r.next())
			{
				String[] s1 = new String[5];
				s1[0]=r.getString("id");
				s1[1]=r.getString("name");
				s1[2]=r.getString("semester");
				s1[3]=r.getString("yearofjoining");
				s1[4]=r.getString("program");
//				s1[2]=r.getString("details");
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
