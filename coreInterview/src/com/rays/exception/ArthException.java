package com.rays.exception;

public class ArthException {
	public static void main(String[] args) {
		try {
			int i=10/0;
			System.out.println(i);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
