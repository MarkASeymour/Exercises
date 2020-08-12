package com.techelevator;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}

	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}

	public int withdraw(int amountToWithdraw) {
		int withdrawPlusFee = amountToWithdraw + 2;
		if (amountToWithdraw > super.getBalance()) {
			return super.getBalance();
		} else if ((super.getBalance() - amountToWithdraw) < 150) {
			return super.withdraw(withdrawPlusFee);
		} else {
			return super.withdraw(amountToWithdraw);
		}

	}

}
