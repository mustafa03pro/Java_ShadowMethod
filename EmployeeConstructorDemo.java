package com.may12;

import java.util.Scanner;

public class EmployeeConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EmployeConstructor e1=new EmployeConstructor("md", "mustafa", 101, 300000, 0);
//		
//		System.out.println(e1);
//		e1.calculateSalary();
//EmployeConstructor e2=new EmployeConstructor("md", "mustafa", 103, 300000, 10);
//		
//		System.out.println(e2);
//		e1.calculateSalary();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first name: ");
		String firstName=sc.nextLine();
		System.out.println("enter the last name: ");
		String lastName=sc.nextLine();
		System.out.println("enter the id: ");
		int employeeId=sc.nextInt();
		System.out.println("enter the salary: ");
		double salary=sc.nextDouble();
		System.out.println("enter the no of projects: ");
		int NoOfProject=sc.nextInt();
		EmployeConstructor E1=new EmployeConstructor(firstName, lastName, employeeId, salary, NoOfProject);
		System.out.println(E1);
		E1.calculateSalary();
		
		

	}

}
