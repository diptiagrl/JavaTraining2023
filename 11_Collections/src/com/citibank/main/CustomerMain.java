package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {

		Customer customer1 = new Customer(101, "Dipti", "Porwal Road, Pune");
		Customer customer2 = new Customer(102, "Bhavik", "Shivaji Nagar, Pune");
		Customer customer3 = new Customer(103, "Granth", "Lohegaon, Pune");
		Customer customer4 = new Customer(104, "Priti", "Mumbai, Mira Road");
		Customer customer5 = new Customer(105, "Akash", "Betul, Madhya Pradesh");

		List<Customer> customerList = new ArrayList<>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);

		System.out.println("size :: " + customerList.size());
		System.out.println("customerList:: " + customerList);
		printAllCustomers(customerList);

		Scanner scanner = new Scanner(System.in);
		
//		int customerId;
//		System.out.println("Enter Customer Id :: ");
//		customerId = scanner.nextInt();
//		printCustomerbyCustomerId(customerList, customerId);
		int customerId;
		String name, address;
		System.out.println("Enter Customer Id :: ");
		customerId = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter new name::");
		name = scanner.nextLine();
		
		System.out.println("Enter new address::");
		address = scanner.nextLine();
		
		Customer customerUpdate = new Customer(customerId, name, address);
		
		updateCustomerByCustomerId(customerList, customerUpdate);
		printAllCustomers(customerList);
		
		System.out.println("Enter Customer Id which you want to delete:: ");
		customerId = scanner.nextInt();
		
		deleteCustomerByCustomerId(customerList, customerId);
		printAllCustomers(customerList);
	}
	
	public static void deleteCustomerByCustomerId(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for (Customer c : customerList) {
			if (c.getCustomerId() == customerId) {
				customerList.remove(c);
				System.out.println("customer details deleted successfully");
				flag = true;
				break;
			}
		}
			if (flag == false) {
				System.out.println("Customer id not found");
				
				
			}
		}
	
	public static void updateCustomerByCustomerId(List<Customer> customerList, Customer customer) {
		boolean flag = false;
		for (Customer c : customerList) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				System.out.println("customer details updated successfully");
				System.out.println(c);
				flag = true;
				break;
			}
		}
			if (flag == false) {
				System.out.println("Customer id not found");
				
				
			}
		}
	

	public static void printCustomerbyCustomerId(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerId) {
				{
					System.out.println("Customer id is found ::" + customerId);
					flag = true;
					break;
				}
			}
		}
			if (flag == false) {
				System.out.println("No Customer found");
			
		}
	}

	public static void printAllCustomers(List<Customer> customerList) {
		System.out.println("All customers");
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}
}
