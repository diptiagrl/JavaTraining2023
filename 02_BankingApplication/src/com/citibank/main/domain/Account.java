package com.citibank.main.domain;

public abstract class Account {

	private int accountNumber;
	private String name;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor of Account");
	}

	public Account(int accountNumber, String name, double balance) {
		System.out.println("3 Param constructor of Account");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		//setAccountNumber(101);
		
	}

//	public Account(int accountNumber, String name, double balance) {
//		// TODO Auto-generated constructor stub
//		System.out.println("Parametrized constructor called");
//	}	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

//	public boolean withdraw(double amount) {
//		// System.out.println("withdraw called");
//		if (balance >0 && balance > amount) {
//			balance = balance - amount;
//			return true;
//		}
//		return false;
//	}
	
//abstract method
	public abstract boolean withdraw(double amount);

	public abstract boolean deposit(double amount);
	
//	public boolean deposit(double amount) {
//		// System.out.println("deposit called");
//		if (amount > 0) {
//			balance = balance + amount;
//			return true;
//		}
//		return false;
//
//	}
}
