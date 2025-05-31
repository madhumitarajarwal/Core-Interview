package com.rays.exception;

class Parent {

	void msg() {
		System.out.println("parent method");
	}
}

public class MethodOverridingInException extends Parent {

	// overriding the method in child class
	// gives compile time error
	// Because if we throw an exception from child method it must handled by  parent class
	void msg(){ //   throws IOException
		System.out.println("Test Exception Child");
	}

	public static void main(String args[]) {
		Parent p = new MethodOverridingInException();
		p.msg();
	}
}