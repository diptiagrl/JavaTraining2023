package com.citibank.main.Service;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository;
import com.citibank.main.repository.CustomerRepositoryInterface;

public class CustomerService implements CustomerServiceInterface {

	//create object of repository class and make it private. We make it private because main should not access
	// repository directly. Here we dont make getters/setters.
	//private CustomerRepository customerRepository = new CustomerRepository();
	//composition - this means CustomerServie Class has access to Customer Repository class. Hence
	//its called composition.
	private CustomerRepositoryInterface customerRepository = new CustomerRepository();
	
	@Override
	public boolean addNewCustomer(Customer customer) {
		return customerRepository.addNewCustomer(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		return customerRepository.getCustomerByCustomerId(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		return customerRepository.updateCustomerByCustomerId(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		return customerRepository.deleteCustomerByCustomerId(customerId);
	}

}
