package com.techelevator;

public class ScratchPad {

	public static void main(String[] args) {
		double change = 500 - 13.25;
		double coins  = (change - Math.floor(change)) * 100;
		int bankNotes = (int) (change - (change - Math.floor(change)));
		int twenties = (int) (bankNotes / 20);
		bankNotes = bankNotes % 20;
		int tens = (int) (bankNotes / 10);
		bankNotes = bankNotes % 10;
		int fives = (int) (bankNotes / 5);
		bankNotes = bankNotes % 5;
		int ones = (int)(bankNotes / 1);
		
		int quarters = (int) (coins / 25);
		coins = coins % 25;
		int dimes = (int) (coins / 10);
		coins = coins % 10;
		int nickles = (int) (coins / 5);
		coins = coins % 5;
		int pennies = (int) (coins /1);
		
//		return "$20's: " + twenties + " $10's: " + tens + " $5's: " + fives + " $1's: " + ones + " Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickles + " Pennies: " + pennies;
		System.out.println("$20's: " + twenties + " $10's: " + tens + " $5's: " + fives + " $1's: " + ones + " Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickles + " Pennies: " + pennies);
	}

}
