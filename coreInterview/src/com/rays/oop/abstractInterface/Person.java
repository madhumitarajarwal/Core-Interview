package com.rays.oop.abstractInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String name;
	private int age;
	private Date dates;
	private String address;

	public static final String CITY = "kota";

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public Date getDates() {
		return dates;
	}

	public void setDates(Date dates) {
		this.dates = dates;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) throws ParseException {
		
		Person p = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		p.setName("Dipesh");
		p.setAge(22);
		p.setAddress("Indore");
		p.setDates(sdf.parse("31-07-2002"));
		
		System.out.println(p);
		
		System.out.println(CITY);
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getAge());
		System.out.println(p.getDates());
		
		
	}

}