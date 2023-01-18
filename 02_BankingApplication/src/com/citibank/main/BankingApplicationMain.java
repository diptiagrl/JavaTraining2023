package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicationMain {
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		//object creation
		Account account = new Account();
		
		account.setAccountNumber(101);
		System.out.println("Account number is : " + account.getAccountNumber());
		
		account.setName("Dipti");
		System.out.println ("Name :" +account.getName());
		
		account.setBalance(1000);
		System.out.println ("Balance :" +account.getBalance());
		
		//Function calling
		account.deposit(100);
		System.out.println ("Balance :" + account.getBalance());
		
		account.withdraw(200);
		System.out.println ("Balance :" +account.getBalance());
		
		
				
		System.out.println("main end");
	}
}