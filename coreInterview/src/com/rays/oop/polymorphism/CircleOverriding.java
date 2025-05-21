package com.rays.oop.polymorphism;

public class CircleOverriding extends ShapeOverriding {

	public double radius;
	public final double PI = 3.14;

	public CircleOverriding(double radius) {
		this.radius = radius;
	}

	public double area() {

		return PI * radius * radius;
	}

}