package com.property.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
	


		    // Database connection parameters
		    private static  String URL = "jdbc:mysql://localhost:3306/paymentdb";
		    private static  String USER = "root";
		    private static  String PASSWORD = "Reeta0603"; // Add your password if set

		    // Method to establish and return the database connection
		    public static Connection con;
		    
		    public static Connection getConnection () {;
		    
		        try {
		            
		            Class.forName("com.mysql.jdbc.Driver");
		            con = DriverManager.getConnection(URL, USER, PASSWORD);
		        } catch (Exception e) {
		            System.out.println("MySQL JDBC Driver not found!");
		            
		        }

		        
		        return con;
		    }

}



