package com.rays.oop.clone;

public class ShallowCloaning  implements Cloneable{
	
	public int rollNo;
	
	@Override
	protected Object clone() throws CloneNotSupportedException { 
		
		return super.clone();
	}

}