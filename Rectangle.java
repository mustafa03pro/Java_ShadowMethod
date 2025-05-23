package com.may14;

public class Rectangle {
	private double width ;          
	private double height;
	public Rectangle(double width, double height) {
		super();
		if(width<0) {
			System.err.println("negative value not allowed");
			System.exit(0);
		}
		if(height<0) {
			System.err.println("negative value not allowed");
			System.exit(0);
		}
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		double area =width*height;
		System.out.println("the area of the rectangle "+area);
		return area;
		
		
	}
	public double getPeramiter() {
		double paramiter=2*(height+width);
		System.out.println("the paramiter of the rectangle "+paramiter);
		return paramiter;
		
	}
	

}
