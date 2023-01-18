package com.citibank.main;

import com.citibank.main.domin.Account;
import com.citibank.main.domin.AccountThread;

public class AccountThreadMain {

	public static void main(String[] args) {
		
		double balance = 0;
		double amount = 500;
		int transactionChoice;
		Account account = new Account(balance, amount);
		
		
		transactionChoice = 1;
		AccountThread accountThread1 = new AccountThread(account, transactionChoice, amount);
		
		Thread thread1 = new Thread(accountThread1);
		thread1.start();
		
		amount = 300;
		transactionChoice = 2;
		AccountThread accountThread2 = new AccountThread(account, transactionChoice, amount);
		
		Thread thread2 = new Thread(accountThread2);
		thread2.start();

	}

}
