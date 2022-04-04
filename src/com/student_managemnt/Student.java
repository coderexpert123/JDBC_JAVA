package com.student_managemnt;

import java.awt.print.Printable;

public class Student {
	
	private int studentid;
	private String studenntname;
	private String studentphone;
	private String studentcity;
	public Student(int studentid, String studenntname, String studentphone, String studentcity) {
		super();
		this.studentid = studentid;
		this.studenntname = studenntname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	public Student(String studenntname, String studentphone, String studentcity) {
		super();
		this.studenntname = studenntname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudenntname() {
		return studenntname;
	}
	public void setStudenntname(String studenntname) {
		this.studenntname = studenntname;
	}
	public String getStudentphone() {
		return studentphone;
	}
	public void setStudentphone(String studentphone) {
		this.studentphone = studentphone;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studenntname=" + studenntname + ", studentphone=" + studentphone
				+ ", studentcity=" + studentcity + "]";
	}
	
	
	
	

}
