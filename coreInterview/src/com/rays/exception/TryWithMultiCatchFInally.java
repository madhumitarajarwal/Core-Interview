package com.rays.exception;

public class TryWithMultiCatchFInally {
	public static void main(String[] args) {
		//int a=5;
		String s = null;
		try {
			
			System.out.println(s.length());
			System.out.println(s.charAt(5));
			
		}  catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.exit(0);
		}catch (NullPointerException e) {
			System.out.println(e);
			
		} finally {
			System.out.println("Finally block");
		}
	}
}