package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class TestB {

	public static void main(String[] args) {
		
/*-------Delete data from the database program------*/
//		Establish Connection
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
//		 Delete the data from the database
		String res="Delete From student where id=5";
		
		try {
//			Registration
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver loaded");
			
//			Establish the connection
			Connection con=DriverManager.getConnection(url,username,password);
			
//			Establish Statement
			Statement stm=con.createStatement();
			
//			Execute Query
			stm.execute(res);
//			System.out.println(con);
			
//			close the connection
			con.close();
			
			System.out.println("Record deleted");
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
