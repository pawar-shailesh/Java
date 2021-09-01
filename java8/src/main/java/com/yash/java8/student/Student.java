package com.yash.java8.student;

import java.time.LocalDate;
import java.time.Month;

public class Student 
{
	int studentId;
	String studentName;
	String department;
	double marks;
	LocalDate dob;
	public Student() {
		super();
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Student(int studentId, String studentName, String department, double marks, LocalDate dob) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.marks = marks;
		this.dob = dob;
	}
	public Student(int studentId, String studentName, String department, double marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.marks = marks;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", department=" + department
				+ ", marks=" + marks + ", DOB=" + dob + "]";
	}
	
	

}
