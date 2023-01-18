package com.citibank.main.domin;

public class Account {
	private double balance;
	private double amount;

	
	public Account(double balance, double amount) {
		super();
		this.balance = 50000;
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public synchronized boolean withdraw(double amount) {
		System.out.println("Withdraw start");
		if (amount < balance) {
			balance = balance - amount;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("withdraw is successfull.Balance is :: " + balance);
			return true;
		} else {
			System.out.println("withdraw is unsuccessful");
			return false;
		}
	}

	public synchronized void deposit(double amount) {
		System.out.println("deposit start");
		balance = balance + amount;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("deposit is successfull.Balance is ::" + balance);
		
	}
}
