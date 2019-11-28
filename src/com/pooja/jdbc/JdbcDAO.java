package com.pooja.jdbc;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

class StudentbDao{
	
	JdbcDAO j=new JdbcDAO();
	int roll=12;
	
	Student s=j.getDetails(roll);
}
public class JdbcDAO {

	Student s;
	public Student getDetails(int roll)
	{
		s.rollNo=roll;
		try {
			
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pooja","root","pass");
		
		Statement s1=con.createStatement();
		ResultSet rs=s1.executeQuery("Select sname from student where rollno ="+roll);
		rs.next();
		String name =rs.getString(1);
		s.name=name;
		return s;
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return s;
	}
}

class Student 
{
	int rollNo;
	String name;
	
}
