package com.student_managemnt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.ResultStreamer;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;
 

public class studentdao {

	
	public static boolean inserttoDb(Student stsStudent) {
		boolean f=false;
		
		try {
			Connection con=cp.cretec();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			//prepred satement
			
			PreparedStatement ptmt=con.prepareStatement(q);
			ptmt.setString(1, stsStudent.getStudenntname());
			ptmt.setString(2, stsStudent.getStudentphone());
			ptmt.setString(3, stsStudent.getStudentcity());
			ptmt.executeUpdate();
			f=true;
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean deletestudent(int userId) {
		// TODO Auto-generated method stub
		
	boolean f=false;
		
		try {
			Connection con=cp.cretec();
			String q = "delete from students where sid=?";
			 
			
			PreparedStatement ptmt=con.prepareStatement(q);
			ptmt.setInt(1, userId);
	 
			ptmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
		
		
		
	}

	public static void showAll() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
	boolean f=false;
		
		try {
			Connection con=cp.cretec();
			String q = "select * from students";
			 
			
		
			Statement stat=con.createStatement();
			
			ResultSet resultSet=stat.executeQuery(q);
			
			while(resultSet.next()) {
				
				int id=resultSet.getInt(1);
				String nameString=resultSet.getString(2);
				
				System.out.println("id"+id);
				System.out.println("id"+nameString);
			}
			
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	 
	}
}
