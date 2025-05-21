package com.rays.oop.constructorCalling;

public class ConstructorCallingTest extends ConstructorCalling {
	
	
	public ConstructorCallingTest(String fName, String lName, String address) {
		super(fName, lName, address);
	}

	public static void main(String[] args) {

		ConstructorCallingTest c = new ConstructorCallingTest("Madhu", "rajarwal", "indore");

	}

}