package com.rays.oop.clone;


public class Costumer implements Cloneable {

	public String name;

	public Account no;

	public Costumer(String name) {
		this.name = name;
		no = new Account(100);

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Costumer c = (Costumer) super.clone();
	c.no = (Account) no.clone();

		return c;
	}

}