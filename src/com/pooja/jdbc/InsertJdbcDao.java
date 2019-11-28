package com.pooja.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertJdbcDao {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.name="Pooja";
		s.rollNo=11;
		StudentDao sd=new StudentDao();
		sd.connect();
		sd.addStudent(s);
		
	}
}


class StudentDao
{
	Connection con;
	PreparedStatement ps;
	Student s;
	void connect()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/3307","root","root");
			Statement st=con.createStatement();		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	void addStudent(Student s)
	{
		
		try {
			ps=con.prepareStatement("Insert into student values (?, ?)");
		ps.setInt(1, s.rollNo);
		ps.setString(2,s.name);
		
		ps.execute();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
}



