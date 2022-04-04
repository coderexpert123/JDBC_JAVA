package com.student_managemnt;

import java.sql.Connection;
import java.sql.DriverManager;

public class cp {
	static Connection con;
	
	public static Connection cretec() {
		
		try {
			//Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			String user="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/student_m";
			
			
			
			con=DriverManager.getConnection(url,user,password);
			 
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
		
	}

}
