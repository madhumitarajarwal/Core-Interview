package com.rays.string;

public class DublicateOfString {
	
	public static void main(String[] args) {
		
		String str="madhumita";
		char[] ch=str.toCharArray();
		int count=0;
		
		for(int i=0; i<ch.length; i++) {
			count=1;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count>1 && ch[i]!=0) {
				System.out.println(ch[i]);
			}
		}
	}

}
