package com.rays.oop.polymorphism;

public class RectangleOverriding  extends ShapeOverriding{
	
	public double width;
	public double length;
	
	public RectangleOverriding(double width, double length) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		
		return width * length;
	}

}