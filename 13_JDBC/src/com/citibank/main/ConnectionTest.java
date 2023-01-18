package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.citibank.main.Service.CustomerService;
import com.mysql.cj.xdevapi.PreparableStatement;

public class ConnectionTest {

	public static void main(String[] args) {
		System.out.println("Main start");
		
		Connection connection = null;
		try {
	//Class is a ClassName and forName is static method. 
	//below statement will load a class, so static block is executed
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded successfully");
	//Connection is interface. DriverManager is a class. getConnection method of Driver Manager class
	// returns an object and assigns to Connection Interface. Its polymorphism.
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root", "root");
			System.out.println("connection successful");
	//sql is a String variable. Prepared statement is not prepared here in below line. Only String 
	//statement is given.
			String sql = "insert into customer_details(name,address) values(?,?)";
	//Above statement can also be written like below. In this case, you need to supply all column values
	//	String sql = "insert into customer_details values(?,?,?)";
	
			//Now use PrepareStatement and pass the sql.		
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			Scanner scanner = new Scanner(System.in);
			int totalNoOfRows = 0;
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter name :: ");
				String name = scanner.nextLine();
				
				System.out.println("Enter Address :: ");
				String address = scanner.nextLine();
				
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, address);
				
				int rowCount = preparedStatement.executeUpdate();
				if (rowCount > 0) {
					System.out.println("Record inserted successfully.  :: ");
					totalNoOfRows = i + 1;
				} else {
					System.out.println("No rows inserted");
				}
			}
			System.out.println("Total number of rows : " +totalNoOfRows);
			
			
			
	//		preparedStatement.setString(1, "Dipti Agrawal");
	//		preparedStatement.setString(2, "Pune");
	//		preparedStatement.setLong(3, 101);
  //executeUpdate method gives you count of rows which are changed. Other methods like execute() or
//executeQuery() gives you boolean.
//			int rowCount = preparedStatement.executeUpdate();
//			if (rowCount > 0) {
//				System.out.println("Record inserted successfully");
//			}else {
//				System.out.println("No Rows inserted!!");
//			}
		
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver not found");
			System.out.println(e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main End");

	}

}
