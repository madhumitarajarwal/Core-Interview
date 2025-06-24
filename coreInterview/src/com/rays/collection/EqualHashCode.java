package com.rays.collection;

public class EqualHashCode {
	private int id;
	private String name;
	private int salary;

	public EqualHashCode(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// hashcode will not apply in primitive data type

	@Override
	public int hashCode() {
		String s = this.id + this.name + this.salary;
		System.out.println("in hashcode method: " + s.hashCode());
		return s.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		if (!(obj instanceof EqualHashCode)) {
			return false;
		}
		EqualHashCode e = (EqualHashCode) obj;
		String st = this.id + this.name + this.salary;
		String st1 = e.id + e.name + e.salary;

		System.out.println("in equals method: " + st.equals(st1));

		return st.equals(st1);
	}

	@Override
	public String toString() {

		String s = this.id + " " + this.name + " " + this.salary;

		return s;
	}
}