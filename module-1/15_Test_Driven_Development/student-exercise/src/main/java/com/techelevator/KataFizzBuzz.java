package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzzMethod(int number) {

		String numberAsString = Integer.toString(number);
		if (number > 0 && number < 101) {

			if (number % 3 == 0 && number % 5 == 0 || (numberAsString.contains("3") && numberAsString.contains("5"))) {
				return "FizzBuzz";
			} else if (number % 3 == 0 || numberAsString.contains("3")) {
				return "Fizz";
			} else if (number % 5 == 0 || numberAsString.contains("5")) {
				return "Buzz";
			} else {
				return Integer.toString(number);
			}
		} else {
			return "";
		}
	}

}
