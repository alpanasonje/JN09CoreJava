package com.tnsif.daytwentythree.usingpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection cn;
	static
	{
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded successfully...");
			cn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Admin@123");
			System.out.println("Connection established successfully...");
		} catch (ClassNotFoundException | SQLException e) {
			
			System.out.println("Error... "+e.getMessage());
		}
		
	}
	public static Connection getConnection()
	{
		return cn;
	}
	
}
