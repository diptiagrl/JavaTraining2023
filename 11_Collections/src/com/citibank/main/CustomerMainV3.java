package com.citibank.main;

import java.util.HashSet;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		
		Set<Customer> customerSet = new HashSet<>();
		System.out.println("Adding Customers");
		Customer customer1 = new Customer(101, "Dipti", "Porwal Road, Pune");
		Customer customer2 = new Customer(102, "Bhavik", "Shivaji Nagar, Pune");
		Customer customer3 = new Customer(103, "Granth", "Lohegaon, Pune");
		Customer customer4 = new Customer(104, "Priti", "Mumbai, Mira Road");
		Customer customer5 = new Customer(105, "Akash", "Betul, Madhya Pradesh");
		Customer customer6 = new Customer(105, "Akash", "Betul, Madhya Pradesh");
	

		System.out.println("First customer :: " + customer1.hashCode());
		System.out.println("Adding First Customer ::" + customerSet.add(customer1));
//		System.out.println("Adding Second Customer ::" + customerSet.add(customer2));
//		System.out.println("Adding Third Customer ::" + customerSet.add(customer3));
//		System.out.println("Adding Fourth Customer ::" + customerSet.add(customer4));
		
		System.out.println("Fifth Customer ::" + customer5.hashCode());
		System.out.println("Adding Fifth Customer ::" + customerSet.add(customer5));
		
		System.out.println("Sixth Customer ::" +customer6.hashCode());
		System.out.println("Adding Sixth Customer ::" + customerSet.add(customer6));

		
		System.out.println("---------------------------");
		System.out.println("All customers");
		for (Customer customer : customerSet) {
			System.out.println(customer);
		}
	}

}
