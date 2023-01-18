package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Vivek", 10000);
		Employee employee2 = new Employee(102, "Paritosh", 10000);
		Employee employee3 = new Employee(103, "Kapil", 10000);
		Employee employee4 = new Employee(104, "Debayan", 10000);
		Employee employee5 = new Employee(105, "Uday", 10000);
		
		//here we are printing each variable one by one
		System.out.println (employee1.getEmployeeId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getSalary());
		
		System.out.println(employee2.getEmployeeId());
		//will give object address - hashcode - address of heap where the object is stored
		System.out.println(employee1);
		
		System.out.println("-------");
		//with the help of toString() method, we print all variables in one go
		//toString is default class coming from Object class.
		System.out.println(employee1.toString());
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5.toString());
		
		System.out.println("-------");
		
		Employee[] allEmployees = new Employee[5];
		Scanner scanner = new Scanner(System.in);
		int employeeId;
		String name;
		double salary;
		
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Emter employeeId");
			employeeId = scanner.nextInt();
			System.out.println("Enter name");
			name = scanner.next();
			System.out.println("Enter salary");
			salary = scanner.nextDouble();
			Employee employee = new Employee(employeeId, name, salary);
			allEmployees[i] = employee;
			System.out.println();
			 
		}
		
//		for (Employee i : allEmployees) {
//			System.out.println(i);
//		}
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
		
	}

}
