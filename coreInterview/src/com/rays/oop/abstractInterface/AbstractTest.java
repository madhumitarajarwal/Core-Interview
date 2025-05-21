package com.rays.oop.abstractInterface;

public class AbstractTest  extends Abstract1{

	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		AbstractTest t = new AbstractTest();
		
		System.out.println(t.sum(x, 10));
	}

}