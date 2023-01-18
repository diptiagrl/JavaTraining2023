package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMain02 {
	public static void main(String[] args) {

		System.out.println("Welcome to CITI Bank");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Account number");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter Balance");
		double balance = scanner.nextDouble();

		Account account02 = new Account();

		account02.setAccountNumber(accountNumber);
		account02.setName(name);
		account02.setBalance(balance);

		System.out.println("your account is opened successfully");
		System.out.println("Account number is : " + account02.getAccountNumber() + "\n" + "Account name is :"
				+ account02.getName() + "\n" + "Balance is : " + account02.getBalance());
//		System.out.println("Account nameis : " + account02.getName());
//		System.out.println("Account balance is : " + account02.getBalance());

		System.out.println(" ");
		
		System.out.println("Transaction Menu");
		System.out.println("Press 1 For Deposit");
		System.out.println("Press 2 For Withdraw");
		System.out.println("Press 3 For Check Balance");
		System.out.println("Press 4 For Exit");
		
		System.out.println("Enter the amount that you want to deposit");
		double amount = scanner.nextDouble();

		System.out.println("Amount that you have entered is : " + amount);
		System.out.println(" ");

		System.out.println("Press enter to confirm");
		byte enter = scanner.nextByte();

		account02.deposit(amount);
		System.out.println("Your current balance is : " + account02.getBalance());

//		account02.withdraw(50);
//		System.out.println("Your current balance is : " + account02.getBalance());

	}

}
