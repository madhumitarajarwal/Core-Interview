package com.rays.collection.streamAPI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    private String name;
    private int departmentId;

    public Employee(String name, int departmentId) {
        this.name = name;
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }


    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ram", 2000));
        employees.add(new Employee("Shyam", 1500));
        employees.add(new Employee("Jay", 800));
        employees.add(new Employee("Vijay", 5000));


        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getDepartmentId))
                .collect(Collectors.toCollection(ArrayList::new));

        sortedEmployees.forEach( employee -> System.out.println(employee.getName() + " " + employee.getDepartmentId()));

    }
}
