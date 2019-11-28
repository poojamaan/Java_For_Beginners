package com.pooja.jdbc;

import java.sql.*;
/*
 * Steps to perform JDBC connection 
 * 1. Import package
 * 2. Register and load driver
 * 3. Establish a connection 
 * 4. create a statement 
 * 5.execute the query
 * 6. Process Result 
 * 7. Close
 */

public class JdbcDemo  {
	
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3307/dbname";
		String uname="root";
		String pass= "root";
		String query="Select username from student where userId=3";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con= DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	ResultSet rs= st.executeQuery(query);
	
	rs.next();
	// this is for single date , what if we have lots of user data
	String name = rs.getString("username");
	System.out.println(name);
	
	// how to fetch multiple data from db
	
	ResultSet rs1= st.executeQuery("Select * from student");;
	while(rs.next())
	System.out.println(rs.getInt(1)+ ":"+ rs.getString(2)); 
	
	
	// How to insert the date dynamically into data base
	
	int userid=4;
	String username="Pooja";
	PreparedStatement ps=con.prepareStatement("insert into student values (?,?)"); // prepared statement 
	ps.setInt(1, userid);
	ps.setString(2, username);
	
	int count=ps.executeUpdate();
	System.out.println("1 row affected");
	
	
	rs.close();
	st.close();
	con.close();
	}
}
