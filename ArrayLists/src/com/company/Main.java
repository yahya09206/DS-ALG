package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        // Print items in list
//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.get(1));

        employeeList.set(1, new Employee("John", "Adams", 4568));
//        employeeList.forEach(employee -> System.out.println(employee));

        // Return how many employees were added
//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        // Print out elements
//        for (Employee employee: employeeArray) {
//            System.out.println(employee);
//        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        // Remove items from list
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
