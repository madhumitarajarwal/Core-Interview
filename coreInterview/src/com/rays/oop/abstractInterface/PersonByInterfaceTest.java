package com.rays.oop.abstractInterface;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonByInterfaceTest implements PersonByInterface {

	
	public String Aa(String name, int age, Date dates) {
		return name + age + dates;
	}
	
	public static void main(String[] args) throws ParseException {
		
		PersonByInterfaceTest p = new PersonByInterfaceTest();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
	//	System.out.println(p.Aa(name, age, sdf.parse("30-09-2011")));
		
		String a = p.Aa(name , age, sdf.parse("30-09-2011"));
		
		System.out.println(a);
		
		
		
	}

}