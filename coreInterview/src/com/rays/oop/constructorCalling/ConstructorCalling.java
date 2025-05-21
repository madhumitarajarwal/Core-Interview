package com.rays.oop.constructorCalling;

public class ConstructorCalling {

	String fname;
	String lname;
	String address;

	public ConstructorCalling(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		System.out.println(fname);
		System.out.println(lname);
	}

	public ConstructorCalling(String fname, String lname, String address) {
		this(fname,lname);
		
		this.address = address;
		System.out.println(address);
	}

}