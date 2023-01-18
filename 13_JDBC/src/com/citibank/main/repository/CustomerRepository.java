package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

public class CustomerRepository implements CustomerRepositoryInterface {

	private List<Customer> customerList = new ArrayList<>();

	private String sql;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private int rowCount;

	@Override
	public boolean addNewCustomer(Customer customer) {
		// ConnectionFactory connectionFactory = new ConnectionFactory();
		connection = new ConnectionFactory().getConnection();
		sql = "insert into customer_details(name,address) values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());

			rowCount = preparedStatement.executeUpdate();
			if (rowCount > 0)
				System.out.println("customer added successfully");
			return true;
		} catch (SQLException e) {
			System.out.println("Exception while executing query");
			System.out.println(e.getMessage());
			return false;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connection = connectionFactory.getConnection();
		sql = "select * from customer_details where customer_Id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				customerId = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");

				Customer customer = new Customer(customerId, name, address);
				return (customer);
			}
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connection = connectionFactory.getConnection();
		sql = "select * from customer_details";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int customerId = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");

				Customer customer = new Customer(customerId, name, address);
				customerList.add(customer);
			}
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return customerList;
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		connection = new ConnectionFactory().getConnection();
		sql = "update customer_details set name = ? , address=? where customer_Id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			preparedStatement.setInt(3, customer.getCustomerId());
			
			rowCount = preparedStatement.executeUpdate();
			
			if (rowCount > 0)
				{System.out.println("customer updated successfully");
				return true;}
			else {
				System.out.println("no customer found for update");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Exception while executing query");
			System.out.println(e.getMessage());
			return false;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		connection = new ConnectionFactory().getConnection();
		sql = "delete from customer_details where customer_Id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,customerId);
			
			rowCount = preparedStatement.executeUpdate();
			
			if (rowCount > 0)
				{System.out.println("customer deleted successfully");
				return true;}
			else {
				System.out.println("no customer found for Delete");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Exception while executing query");
			System.out.println(e.getMessage());
			return false;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
	}
}
