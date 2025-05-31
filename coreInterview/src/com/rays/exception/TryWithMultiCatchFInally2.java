
package com.rays.exception;

public class TryWithMultiCatchFInally2 {
	
	public static void main(String[] args) {
		int a=5;
		String s = null;
		try {
			System.out.println(a/5);
			System.out.println(s.length());
			//System.exit(0);
		} catch (ArithmeticException e) {
			System.out.println(e);
			 //System.exit(0);

		} catch (NullPointerException e) {
			System.out.println(e);
			 //System.exit(0);
		}finally {
			System.out.println("okok");
		}
	
	}
}