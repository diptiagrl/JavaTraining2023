package com.citibank.main;

import com.citibank.main.domain.Current;

public class BankingApplicationV5 {

	public static void main(String[] args) {
		Current current = new Current(101, "Dipti Agrawal", 10000, 50000);

		if (current.withdraw(5000)){ 
			// 5000
			System.out.println("Balance :: " + current.getBalance());
			// 50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
		}

		if (current.withdraw(20000)) {
			// 0
			System.out.println("Balance :: " + current.getBalance());
			// 35000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
		}

		if (current.deposit(10000)) {
			// 0
			System.out.println("Balance :: " + current.getBalance());
			// 45000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());

		}

		if (current.deposit(15000)) {
			// 10000
			System.out.println("Balance :: " + current.getBalance());
			// 50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());

		}
		if (current.deposit(5000)) {
			// 10000
			System.out.println("Balance :: " + current.getBalance());
			// 50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());

		}
		if (current.withdraw(70000)) {
			// 10000
			System.out.println("Balance :: " + current.getBalance());
			// 50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());

		}
		else {
			System.out.println("Transaction Failed");
		}
	}
}
