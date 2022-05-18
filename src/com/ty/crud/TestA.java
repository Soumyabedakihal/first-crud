package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestA {
	public static void main(String[] args)
	{
		
		/*----- Insertion of the database ----*/
//		Establish Connection
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
//		insert the data into database
		String sql="insert into student values(10,'mutu','mutu@gmail.com')";
		
		try {
//			Registration
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver loaded");
			
//			Establish the connection
			Connection con=DriverManager.getConnection(url,username,password);
			
//			Establish Statement
			Statement stm=con.createStatement();
			
//			Execute Query
			stm.execute(sql);
//			System.out.println(con);
			
//			close the connection
			con.close();
			
			System.out.println("Data inserted");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
//		When Establish the connection SQLException is occured ,then handle the exception
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
