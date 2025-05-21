package com.may12;

import java.util.Scanner;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car c1=new Car("maruthi", 2019, 200000);
		//System.out.println(c1);
		//Car c2=new Car("maruthi", 2012, -200000);
		//System.out.println(c2);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the model: ");
		String  model=sc.nextLine();
		System.out.println("enter the year: ");
		int year=sc.nextInt();
		System.out.println("enter the price: ");
		double price=sc.nextDouble();
		Car car1=new Car(model, year, price);
		System.out.println(car1);
		
		

	}

}
