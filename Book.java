package com.may12;

public class Book {
	String title;                 
	String author;       	      
	double price ;
	public Book(String title, String author, double price) {
		super();
		if(price<=0) {
			System.err.println("Invalid price ");
			System.exit(0);
		}
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public void applyDiscount(double discountPercentage) {
		if(discountPercentage<=0) {
			System.err.println("invalid discount");
			System.err.println("Auther"+author);
			System.err.println("prise "+price);
			System.exit(0);
		}
		else {
			double disount=price*(discountPercentage/100);
			price=price-disount;
			System.out.println("the amount after discount "+ price);
			
		}
	}


}
