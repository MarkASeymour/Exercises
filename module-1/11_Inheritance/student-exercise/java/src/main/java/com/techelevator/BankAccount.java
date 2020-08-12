package com.techelevator;

public class BankAccount {

	private String accountHolderName;
	private String accountNumber;
	private int balance;

	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 0;
	}

	public BankAccount(String accountHolderName, String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public int deposit(int amountToDeposit) {
		return balance += amountToDeposit;
	}

	public int withdraw(int amountToWithdraw) {
		return balance -= amountToWithdraw;
	}

}
