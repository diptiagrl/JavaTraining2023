package com.citibank.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInterface {

	private List<Customer> customerList = new ArrayList<>();

	@Override
	public boolean addNewCustomer(Customer customer) {
		return customerList.add(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerId) {
				return customer;
			}

		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerList;
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		for (Customer c : customerList) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		for (Customer c : customerList) {
			if (c.getCustomerId() == customerId) {
				//customerList.remove(c);
				//return true;
				return customerList.remove(c);
			}
		}
		return false;

	}
}
