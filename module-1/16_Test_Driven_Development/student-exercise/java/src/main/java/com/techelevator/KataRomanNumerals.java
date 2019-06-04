package com.techelevator;

public class KataRomanNumerals {

	
	public String convertToRomanNumeral(int n)
	{
		if(n == 1)
		{
			return "I";
		}
		else if(n == 10)
			return "X";
		return null;
	}
}
