package com.techelevator;

public class KataFizzBuzz {

	public String FizzBuzz(int number) {

		Integer convertIntToInteger = (Integer) number;
		String converToString = convertIntToInteger.toString();

		if ((number < 16 && number > 0 && number % 5 == 0 && number % 3 == 0 && number > 0)) {
			return "FizzBuzz";
		} else if (number < 16 && number > 0 && number % 3 == 0) {
			return "Fizz";
		} else if (number < 16 && number > 0 && number % 5 == 0 && number > 0) {
			return "Buzz";
		} else if (number == 0) {
			return "";
		} else if (number > 15 && (converToString.charAt(0) == '3' || converToString.charAt(1) == '3')
				&& (converToString.charAt(0) == '5' || converToString.charAt(1) == '5')) {
			return "FizzBuzz";
		} else if (number > 9 && (converToString.charAt(0) == '3' || converToString.charAt(1) == '3')) {
			return "Fizz";
		} else if (number > 9 && (converToString.charAt(0) == '5' || converToString.charAt(1) == '5')) {
			return "Buzz";
		}

		return converToString;
	}

}
