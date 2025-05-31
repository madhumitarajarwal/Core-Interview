package com.rays.exception;

public class TryWithMultiCatchFInally {
	public static void main(String[] args) {
		//int a=5;
		String s = null;
		try {
			
			System.out.println(s.length());
			System.out.println(s.charAt(5));
			
		} catch (NullPointerException e) {
			System.out.println(e);
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.exit(0);
		} finally {
			System.out.println("Finally block");
		}
	}
}