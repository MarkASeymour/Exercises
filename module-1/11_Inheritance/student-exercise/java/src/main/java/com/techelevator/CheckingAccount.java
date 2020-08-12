package com.techelevator;

public class CheckingAccount extends BankAccount {

	private int checkingBalance = super.getBalance();

	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}

	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}

	public int withdraw(int amountToWithdraw) {
		int withdrawPlusFee = amountToWithdraw + 10;
		if ((checkingBalance - amountToWithdraw) <= -100) {
			return checkingBalance;
		} else if ((checkingBalance - amountToWithdraw) < 0) {
			return super.withdraw(withdrawPlusFee);
		} else {
			return super.withdraw(amountToWithdraw);
		}
	}

}
