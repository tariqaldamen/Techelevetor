package com.techelevator;

public class KataFizzBuzz {

	
	public String fizzBuzz(int n) {
		
		 if ( n % 3 == 0 && n % 5 == 0) {
			 return "fizzbuzz";
		 }
		
		 if (n % 3 == 0) {
             return "fizz";
		 }
		 else if (n % 5 == 0) {
			 return "buzz";
		 }
		 else {
			 return new Integer(n).toString();
		 }
		

	}
}
