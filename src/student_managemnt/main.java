package student_managemnt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.sound.midi.Soundbank;

import com.student_managemnt.Student;
import com.student_managemnt.studentdao;

import java.io.IOException;
public class main {
	
	public static void main(String[] args ) throws IOException {
		System.out.println("Welcome to Student Management Application");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			//id,name,phone,city
			
			System.out.println("1 to Add");
			System.out.println("2 to Delete");
			System.out.println("3 to Display");
			System.out.println("4 to exit ");
			int c=Integer.parseInt(br.readLine());
			
			if (c==1) {
				//add
				System.out.println("Enetr username");
				String name=br.readLine();
				System.out.println("Enetr phone");
				String phone=br.readLine();
				System.out.println("Enetr city");
				String city=br.readLine();
				
				// create student object
				Student stsStudent=new Student(name,phone,city);
				
 				System.out.println(stsStudent);
 				
 			boolean ans=studentdao.inserttoDb(stsStudent);
 			if (ans) {
				System.out.println("Added");
			}
 				
 			else {
 				System.out.println("Not added");
 			}
				
			}
			else if(c==2) {
				
				//delete
				System.out.println("Enter your id");
				int userId=Integer.parseInt(br.readLine());
			boolean f=	studentdao.deletestudent(userId);
			if (f) {
				System.out.println("Deleted");
			}
				
			else {
				
				System.out.println("Not Deleted");
			}
			}
			else if(c==3) {
							
			//display
			}
			else if(c==4) {
					
			//exit
			break;
					
			}
			else {
				
				
			}
		}
System.out.println("Thanks for using student portal \n see you soon :) ");
	}

}
