package com.citibank.main;

import java.util.List;

import com.citibank.main.Service.CustomerService;
import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService();
		List<Customer> customerList = customerService.getAllCustomers();
		
		
		System.out.println("--------------------Get Customer List---------------");
		for (Customer customer : customerList)
		{
			System.out.println(customer);
		}
		
		System.out.println();
		System.out.println("--------------------Get customer by customer_Id---------------");
		Customer customer = customerService.getCustomerByCustomerId(1);
		if (customer !=null) {
			System.out.println("customer :" + customer);
					}
		else {
			System.out.println("customer not found");
		}
		System.out.println();
		System.out.println("--------------------Insert---------------");
	
		String name = "Divyansh";
		String address= "Madhya Pradesh";
		
		int customerId = 0;
		customer = new Customer(customerId, name, address);
		customerService.addNewCustomer(customer);
		
		System.out.println();
		System.out.println("--------------------Update---------------");
		
		customerId = 1;
		name = "Devyani";
		address= "Madhya Pradesh";
		
		
		customer = new Customer(customerId, name, address);
		customerService.updateCustomerByCustomerId(customer);
		
		System.out.println();
		System.out.println("-------------------Delete---------------");
		if (customerService.deleteCustomerByCustomerId(1)) {
			System.out.println("updated customer details:: " +customer);
		}
		else {
			System.out.println("customer not found");
		}
	}

}
