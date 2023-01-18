package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Current;
import com.citibank.main.domain.Savings;


public class BankingApplicationV6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Account account = new Account();
		
		int accountNumber;
		String name;
		double balance;
		char choice;
		double amount;
		String continueChoice;
		boolean isSalary = false;
		String salaryFlag;
		double overdraftLimit;
		Account account;
		
		System.out.println("Welcome to Citi bank");
		System.out.println("Account Menu");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		System.out.println("Enter your choice");
		int acctType = scanner.nextInt();
		
		System.out.println("Enter account number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		scanner.nextLine();
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
					
		if (acctType == 1) {
			System.out.println("Do you want to open a Salary Account");
			salaryFlag = scanner.next();
			if (salaryFlag.equalsIgnoreCase("yes") || salaryFlag.equalsIgnoreCase("y")) {
				isSalary = true;

			} else {
				isSalary = false;

			}
			account = new Savings(accountNumber, name, balance, isSalary);
			
	
			// Savings savings = new Savings(accountNumber, name, balance, isSalary);
		} else {
			System.out.println("Enter your overdraftlimit");
			overdraftLimit = scanner.nextDouble();
			account = new Current(accountNumber, name, balance, overdraftLimit);
			
			// Current current = new Current(101, "Dipti Agrawal", 10000, 50000);
		}
		

//		System.out.println("Enter account number");
//		accountNumber = scanner.nextInt();
//		System.out.println("Enter Name");
//		scanner.nextLine();
//		name = scanner.nextLine();
//		System.out.println("Enter Balance");
//		balance = scanner.nextDouble();
//		System.out.println("Do you want to open a Salary Account");
//		salaryFlag = scanner.next();
//		if (salaryFlag.equalsIgnoreCase("yes") || salaryFlag.equalsIgnoreCase("y")) {
//			isSalary = true;
//		} else {
//			isSalary = false;
//		}

//		savings = new Savings(accountNumber, name, balance, isSalary);

		// new Account().setAccountNumber(accountNumber);
		// new Account().setName(name);
		// new Account().setBalance(balance);
		// account.setAccountNumber(accountNumber);
		// account.setName(name);
		// account.setBalance(balance);

		System.out.println("Your account is opened successfully");
		System.out.println("Account Type is : " + acctType + "\n" + "Account number is : " + account.getAccountNumber() + "\n" + "Account name is :"
				+ account.getName() + "\n" + "Balance is : " + account.getBalance() + "\n" + "Is it a Salary Account : "
				+ isSalary);

		System.out.println();
		do {

			System.out.println("Transaction Menu");
			System.out.println("Press 1. For Deposit");
			System.out.println("Press 2. For Withdraw");
			System.out.println("Press 3. For Check Balance");
			System.out.println("Press 4. For Exit");

			System.out.println();
			System.out.println("Enter your choice");
			// choice = scanner.nextInt();
			choice = scanner.next().charAt(0);

			switch (choice) {
			case '1':
				System.out.println("Enter amount to deposit");
				amount = scanner.nextDouble();
				if (account.deposit(amount)) {
					System.out.println("Deposit Successfull");
					System.out.println("Your current balance is : " + +account.getBalance());
				} else
					System.out.println("Deposit failed");
				break;
			case '2':
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextDouble();
				if (account.withdraw(amount)) {
					System.out.println("Withdraw successfull");
					System.out.println("Your current balance is : " + account.getBalance());
				} else
					System.out.println("Withdraw Failed");
				break;
			case '3':
				System.out.println("Yout current balance is : " + account.getBalance());
				break;
			case '4':
				System.out.println("Thank you!!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("y"));
		System.out.println("Thank You!!");
	}
}
