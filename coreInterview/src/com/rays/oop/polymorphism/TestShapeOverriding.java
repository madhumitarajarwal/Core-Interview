package com.rays.oop.polymorphism;

public class TestShapeOverriding {
	
	public static void main(String[] args) {
		
		ShapeOverriding s = new RectangleOverriding(10, 10);
		ShapeOverriding s1 = new CircleOverriding(2);
		
		System.out.println(s.area());
		System.out.println(s1.area());
		
	}

}