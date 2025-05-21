package com.rays.oop.shapeArrayWithConstructor;

public class TestShape {
 
	public static void main(String[] args) {
		Shape[] s = new Shape[2];
		s[0] = new Circle(10);
		s[1] = new Rectangle(10, 5);
		
		//Rectangle r = (Rectangle) s[1];

		
		
		System.out.println(s[0].area());
		System.out.println(s[1].area());
		
		double a= Area(s);
		System.out.println("Area :" +a);
		
	
		
	}
	
	private static double Area(Shape[] s) {
		double totalArea=0;
		for(int i=0; i<s.length; i++) {
			totalArea=totalArea+s[i].area();
		}
		return totalArea ;
	}
}
