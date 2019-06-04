package com.techelevator;

public class KataFizzBuzz {
	
	
public String FizzBuzz(int number)
{
	if(number % 3 == 0)
	{
		return "Fizz";
	}
	else if(number % 5 == 0)
	{
		return "Buzz";
	}
	
	Integer convertIntToInteger= (Integer)number;
	String converToString = convertIntToInteger.toString();
	return converToString;
}

}
