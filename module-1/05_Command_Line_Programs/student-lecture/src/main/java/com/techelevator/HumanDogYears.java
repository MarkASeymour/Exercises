package com.techelevator;

import java.util.Scanner;

public class HumanDogYears {


public static void main(String[] args) {
		
		Scanner myScanner = new Scanner (System.in);
		
		System.out.println ("Please enter the amount of the bill: ");
		
		String billAmount = myScanner.nextLine();
		Float billAmountAsInteger = Float.parseFloat(billAmount);
		
		
		
		System.out.println("Please enter the amount tendered: ");
		String tenderedAmount = myScanner.nextLine();
		Float tenderedAmountAsInteger = Float.parseFloat(tenderedAmount);
		
		
		System.out.println("The change required is: " + (tenderedAmountAsInteger - billAmountAsInteger));
		
		
		
	}

}
	
	
	
	
	
	
	
	
	
	
	
	//	public static void main(String[] args) {
//		
//		Scanner myScanner = new Scanner (System.in);
//		
//		System.out.println ("How old are you, human?");
//		
//		String humanAge = myScanner.nextLine();
//		int humanAgeAsInteger = Integer.parseInt(humanAge);
//		
//		System.out.println ("Age of Human: " + humanAge);
//		
//		
//		System.out.println("What is your name?");
//		String name = myScanner.nextLine();
//		
//		System.out.println("Your name is: " + name);
//		
//	}
//
//}



//	public static void main(String[] args) {
//		
//		Scanner myScanner = new Scanner (System.in);
//		
//		System.out.println ("How old are you, human?");
//		
//		int humanAge = myScanner.nextInt();
//		myScanner.nextLine();
//		
//		System.out.println ("Age of Human: " + humanAge);
//		
//		
//		System.out.println("What is your name?");
//		String name = myScanner.nextLine();
//		
//		System.out.println("Your name is: " + name);
//		
//	}
//	
//	}