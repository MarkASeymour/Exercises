package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int fn1 = 0;
		int fn2 = 1;
		
		Scanner myScanner = new Scanner (System.in);
		
		System.out.println("Enter a Fibonnaci number: ");
		
		String endNumAsStr = myScanner.nextLine();
		int endNum = Integer.parseInt (endNumAsStr);
		
		
		System.out.print("The sequence is: ");
		while (fn1 < endNum) {
			System.out.print(fn1 + " ");
			
			int nextFn = fn1 + fn2;
			fn1 = fn2;
			fn2 = nextFn;
		}

	}

}
