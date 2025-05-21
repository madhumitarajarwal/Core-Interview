package com.rays.oop.clone;

public class Account implements Cloneable {

	public int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}