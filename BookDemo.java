package com.may12;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book b1=new Book("harry", "potter", 1000);
		//System.out.println(b1);
		//Book b2=new Book("harry", "potter", 1110);
		//System.out.println(b2);
		//b2.applyDiscount(10);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the title: ");
		String  title=sc.nextLine();
		System.out.println("enter the auther: ");
		String  auther=sc.nextLine();
		System.out.println("enter the price: ");
		int price=sc.nextInt();
		System.out.println("enter the discount persentage: ");
		double discountPercentage=sc.nextDouble();
		Book book=new Book(title, auther, price);
		System.out.println(book);
		book.applyDiscount(discountPercentage);
		sc.close();
		
		
		
	}

}
