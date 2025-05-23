package com.may14;

import java.util.Scanner;

public class StudenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value: ");
		int noOfStd=sc.nextInt();
		for(int i=0;i<noOfStd;i++) {
			Student s1=Student.createStudent();
			System.out.println(s1);
		}
		sc.close();

	}

}
