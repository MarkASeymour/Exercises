package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		boolean runningLoop = true;

		Scanner myScanner = new Scanner(System.in);
		while (runningLoop) {

			System.out.println("Please enter the temperature: ");
			int initialTemp = myScanner.nextInt();
			myScanner.nextLine();

			System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit? ");
			String tempType = myScanner.nextLine();

			if (tempType.equals("F")) {
				int convertedTemp = (int) ((initialTemp - 32) / 1.8);
				String finalTemp = (convertedTemp + "C");
				System.out.println(initialTemp + tempType + " is " + finalTemp);
			} else if (tempType.equals("C")) {
				int convertedTemp = (int) (initialTemp * 3.2808399);
				String finalTemp = (convertedTemp + "F");

				System.out.println(initialTemp + tempType + " is " + finalTemp);
			}

		}

	}

}
