package com.citibank.main;

import java.util.List;
import java.util.Scanner;

import com.citibank.main.Service.CustomerService;
import com.citibank.main.domain.Customer;

public class CustomerMainV2 {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		// add 5 customer

		System.out.println("Adding Customers");
		Customer customer1 = new Customer(101, "Dipti", "Porwal Road, Pune");
		Customer customer2 = new Customer(102, "Bhavik", "Shivaji Nagar, Pune");
		Customer customer3 = new Customer(103, "Granth", "Lohegaon, Pune");
		Customer customer4 = new Customer(104, "Priti", "Mumbai, Mira Road");
		Customer customer5 = new Customer(105, "Akash", "Betul, Madhya Pradesh");

		System.out.println("Adding First Customer ::" + customerService.addNewCustomer(customer1));
		System.out.println("Adding Second Customer ::" + customerService.addNewCustomer(customer2));
		System.out.println("Adding Third Customer ::" + customerService.addNewCustomer(customer3));
		System.out.println("Adding Fourth Customer ::" + customerService.addNewCustomer(customer4));
		System.out.println("Adding Fifth Customer ::" + customerService.addNewCustomer(customer5));

		System.out.println("------------------------------");
		System.out.println("Listing all customers from database::");

		// since you are retrieving all customers in a list, it should be stored be
		// stored in the list.
		// then iterate the list and display customers one by one.
		List<Customer> customerList = customerService.getAllCustomers();
		// System.out.println(customerList);
		for (Customer customer : customerList) {
			System.out.println(customer);
		}

		System.out.println("-------------------------------------");
		System.out.println("Read one customer from database");
		Customer customer = customerService.getCustomerByCustomerId(101);
		System.out.println(customer);

		System.out.println("-------------------------------------");
		System.out.println("Update customer into database");

		Customer customerUpdated = new Customer(101, "Gagan", "MP");
		if (customerService.updateCustomerByCustomerId(customerUpdated)) {
			System.out.println("updated successfully");

		} else {
			System.out.println("Update failed");
		}
		System.out.println("-------------------------------------");
		System.out.println("Display all customers after update");
		for (Customer customerAll : customerList) {
			System.out.println(customerAll);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("Delete customer from database one by one");
		
		if (customerService.deleteCustomerByCustomerId(101)) {
			System.out.println("Delet successfull");
		}
		else {
			System.out.println("Error in deletion");
		}
		System.out.println("-------------------------------------");
		System.out.println("Display all customers after deletion");

		for (Customer customerAll : customerList) {
			System.out.println(customerAll);
		}
	}

}
