package com.rays.collection.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class TestSalary {

	public static void main(String[] args) {

		List<EmployeeSalary> list = new ArrayList<EmployeeSalary>();

		list.add(new EmployeeSalary(20000, "jhanvi"));
		list.add(new EmployeeSalary(25000, "neha"));
		list.add(new EmployeeSalary(1000, "astha"));
		list.add(new EmployeeSalary(522, "bulbul"));
		list.add(new EmployeeSalary(600, "chetna"));

		list.stream().filter(e -> e.getSalary() >= 20000) // Filter
				.distinct() // Optional: only if you override equals() and hashCode()
				.sorted(Comparator.comparing(EmployeeSalary::getSalary)) // Sort by salary ascending
				.forEach(e -> System.out.println(e.getSalary() + " = " + e.getName()));
	}
}
