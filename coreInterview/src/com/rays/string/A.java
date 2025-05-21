package com.rays.string;

import java.util.Arrays;

public class A {
	
	public static void main(String[] args) {
		
		String a="madhu";
		String b="uhdam";
		
		char[] a1 = a.toCharArray();
		char[] a2= b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2)){
			System.out.println( a+ " " + b + "this is anagram");
		}else {
			System.out.println( a+ " " + b + " this is not anagram");  
		}
	}

}
