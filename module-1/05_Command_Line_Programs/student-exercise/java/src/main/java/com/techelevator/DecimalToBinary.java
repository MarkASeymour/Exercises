package com.techelevator;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		boolean runningLoop = true;
		
		Scanner myScanner = new Scanner (System.in);
		
		while (runningLoop) {
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		String initialDecimals = myScanner.nextLine ();
		
		
		String [] decimalArray =  initialDecimals.split(" ");
		for (int i = 0; i < decimalArray.length; i++) {
			
			int decAsInt = Integer.parseInt(decimalArray[i]);
			String binaryNums = "";
			
			while (decAsInt > 0) {
				binaryNums = (decAsInt % 2) + binaryNums;
				decAsInt = decAsInt / 2;
			}
			System.out.println(decimalArray[i] + " in binary is " + binaryNums);
		}
		}

	}

}
