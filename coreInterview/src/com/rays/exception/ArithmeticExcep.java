package com.rays.exception;

public class ArithmeticExcep {
     
	public static void main(String[] args) {
		
		try {
			int c=10/0;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
