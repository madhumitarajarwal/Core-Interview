package com.rays.collection.comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int salary;

	public Student(int id, String name,int salary) {
		this.id = id;
		this.name = name;
		this.salary=salary;
	}

	@Override
	public int compareTo(Student o) {

		if (this.name.equals(o.name)) {

		//	return this.id - o.id;  // agar name same hai toh ID compare karo
			
			return o.salary - this.salary;

		} else {

			return this.name.compareTo(o.name); //// warna name ka alphabetical (lexical) comparison

		}
	}

	@Override
	public String toString() {
		return id + " " + name+ " "+salary;
	}

}