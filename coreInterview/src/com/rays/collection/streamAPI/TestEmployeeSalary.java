package com.rays.collection.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// salary >= 20000
public class TestEmployeeSalary {

	public static void main(String[] args) {

		List<EmployeeSalary> list = new ArrayList<EmployeeSalary>();

		list.add(new EmployeeSalary(200000, "jhanvi"));
		list.add(new EmployeeSalary(25000, "neha"));
		list.add(new EmployeeSalary(1000, "astha"));
		list.add(new EmployeeSalary(522, "bulbul"));
		list.add(new EmployeeSalary(600, "chetna"));

		list.stream().distinct().filter(c -> (c.getSalary() >= 20000))
				.forEach(c -> System.out.println(c.getSalary() + "=" + c.getName()));

		//list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst()
				//.ifPresent(e -> System.out.println(e));

	}

}