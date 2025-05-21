package com.rays.oop.abstractInterface;

public class InterfaceTest implements Interface1 {

	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		InterfaceTest t = new InterfaceTest();
		
		int s = t.sum(x, 10);
		System.out.println(s);
	}

}