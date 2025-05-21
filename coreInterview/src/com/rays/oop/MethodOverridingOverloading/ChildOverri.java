package com.rays.oop.MethodOverridingOverloading;

public class ChildOverri extends ParentOverri{
	
	@Override
	public  void speak() {
		System.out.println(" this is child ");
	}
   
	
	
	    public static void main(String[] args) {
	        ParentOverri parent = new ParentOverri();
	         ChildOverri child = new ChildOverri();
	    

	        parent.speak();
	        child.speak();
	        
	    
	}

}
