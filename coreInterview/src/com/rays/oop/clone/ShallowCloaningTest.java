package com.rays.oop.clone;

public class ShallowCloaningTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ShallowCloaning s =  new ShallowCloaning();
		s.rollNo = 101;
		
		ShallowCloaning s2 = (ShallowCloaning) s.clone();
		
		s2.rollNo = 500;
		
		System.out.println(s.rollNo);
		System.out.println(s2.rollNo);
		
	}

}