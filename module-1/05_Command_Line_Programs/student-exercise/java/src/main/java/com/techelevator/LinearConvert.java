package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		boolean runningLoop = true;

		Scanner myScanner = new Scanner(System.in);
		while (runningLoop) {

			System.out.println("Please enter the length: ");
			int initialLength = myScanner.nextInt();
			myScanner.nextLine();

			System.out.println("Is the measurement in (m)eter, or (f)eet? ");
			String lengthType = myScanner.nextLine();

			if (lengthType.equals("f")) {
				int convertedLength = (int) (initialLength * 0.3048);
				String finalLength = (convertedLength + "m");
				System.out.println(initialLength + lengthType + " is " + finalLength);
			} else if (lengthType.equals("m")) {
				int convertedLength = (int) ((initialLength * 3.2808399));
				String finalLength = (convertedLength + "f");

				System.out.println(initialLength + lengthType + " is " + finalLength);
			}

		}

	}
}
