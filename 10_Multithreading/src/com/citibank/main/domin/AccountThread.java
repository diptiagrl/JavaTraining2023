package com.citibank.main.domin;

public class AccountThread implements Runnable {

	Account account;
	private int transactionChoice;
	double amount;

	public AccountThread(Account account, int transactionChoice, double amount) {
		super();
		this.account = account;
		this.transactionChoice = transactionChoice;
		this.amount = amount;
	}

	@Override
	public void run() {

		if (transactionChoice == 1) {
			account.withdraw(amount);
			//System.out.println("Balance after withdraw : " + account.getBalance());
		} else {
			account.deposit(amount);
			//System.out.println("Balance after deposit: " + account.getBalance());

		}

	}

}
