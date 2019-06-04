package com.techelevator;

import java.awt.List;
import java.util.ArrayList;

public class KataRomanNumerals {

	
	public String convertToRomanNumeral(int n)
	{
		ArrayList<String> RomanNumeral1_100 = new ArrayList<String>();
		
		String [] RomanNumeralFrom1_10 = new String[] {" ","I","II","III","IV","V","VI","VII","VIII","IX"};
		String [] RomanNumeralFrom20s_100s = new String[] {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
		
		for (int i = 0; i < RomanNumeralFrom1_10.length; i++) {
				RomanNumeral1_100.add(RomanNumeralFrom1_10[i]);
				//System.out.println(RomanNumeral1_100.get(i));
		}
		for (int i = 0; i < RomanNumeralFrom20s_100s.length; i++) {
			RomanNumeral1_100.add(RomanNumeralFrom20s_100s[i]);
			for (int j = 1; j < RomanNumeralFrom1_10.length; j++) {
			RomanNumeral1_100.add(RomanNumeralFrom20s_100s[i] + RomanNumeralFrom1_10[j]);
	}
		}
		for (int i = 0; i < RomanNumeral1_100.size(); i++) {
			System.out.println(RomanNumeral1_100.get(i));
		}
		return RomanNumeral1_100.get(n);
	
}
}
