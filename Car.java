package com.may12;

public class Car 
{
	private String model;   	
	private int year;   	
	private double price ;
	public Car(String model, int year, double price) {
		super();
		if(year<2010) {
			System.err.println("Year must be grater than 2010");
			System.exit(0);
		}
		if(price<0) {
			System.err.println("prise must be grater than 0");
			System.exit(0);
		}
		this.model = model;
		this.year = year;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
}
