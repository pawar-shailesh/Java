package com.yash.java8.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class StudentApp 
{
	public static void main(String[] args) {
		ArrayList<Student>student=new ArrayList<>();
		student.add(new Student(1,"Askshay","Computer",85.76,LocalDate.of(1998,Month.AUGUST,17)));
		student.add(new Student(2,"Usha","E&TC",79.54,LocalDate.of(1995,Month.FEBRUARY,26)));
		student.add(new Student(3,"Kushagra","Information Technology",89.7,LocalDate.of(1993,Month.JULY,02)));
		student.add(new Student(4,"Shailesh","Computer",76.8,LocalDate.of(1992,Month.MARCH,23)));
		student.add(new Student(5,"Harshada","Electronics",91,LocalDate.of(1995,Month.NOVEMBER,26)));
		student.stream().forEach(std->System.out.println(std));
		ArrayList<Double> marks=(ArrayList<Double>) student.stream().filter(p->p.marks>=85).limit(2).map(p->p.marks).collect(Collectors.toList());
		System.out.println(marks);
	
		long count=student.stream().count();
		System.out.println(count);
		
		ArrayList<Student> byName=(ArrayList<Student>)student.stream().filter(std->std.getStudentName().equals("Akshay")).collect(Collectors.toList());
		byName.stream().forEach(std->System.out.println(std));
	}

}

