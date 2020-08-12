package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accountsList = new ArrayList<Accountable>();
	private Accountable[] accounts;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Accountable[] getAccounts() {
		
		return accounts;
	}
	
	public void addAccount(Accountable newAccount) {
		accountsList.add(newAccount);
		Accountable[] accounts = new Accountable[accountsList.size()];
		
		for (int i = 0; i < accountsList.size(); i++) {
			accounts[i] = accountsList.get(i);
		}
		this.accounts = accounts;
	}
	
	
	
	public boolean isVip() {
		int sumBal = 0;
		for (Accountable eachAccount : accountsList) {
			sumBal += eachAccount.getBalance();
		}
		if(sumBal >= 25000) {
			return true;
		}
		else { 
			return false;
		}
		
	}
	
	
	

	}





