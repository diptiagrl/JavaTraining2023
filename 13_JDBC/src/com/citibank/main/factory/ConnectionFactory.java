package com.citibank.main.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionFactory {

	private String driverName = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String userId = "root";
	private String password = "root";
	private Connection connection;
	
	public Connection getConnection() {
		try {
			Class.forName(driverName);
			System.out.println("1. Driver loaded successfully");
			connection = DriverManager.getConnection(url, userId, password);
			System.out.println("connection successful");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
		}
		return null;
	}
}
