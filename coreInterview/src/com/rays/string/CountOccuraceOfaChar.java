package com.rays.string;

public class CountOccuraceOfaChar {
	public static void main(String[] args) {
		
		String name="madhumita";
		
		int count=0;
		
		for(int i=0; i<name.length(); i++) {
			
			char ch= name.charAt(i);
			
			String m = String.valueOf(ch);
			
			if(m.matches("m")) {
				count++;
			}
		}
		System.out.println("d:" + count);
	}

}
