package com.may14;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private String grade;
	public Student(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public static Student createStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String sname=sc.nextLine();
		
		System.out.print("Enter your age: ");
		int sage=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter your grade: ");
		String grade=sc.nextLine();
		Student s1=new Student(sname, sage, grade);
		return s1;
		
			//return new Student(sname, sage, grade);
			
		
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	

}
