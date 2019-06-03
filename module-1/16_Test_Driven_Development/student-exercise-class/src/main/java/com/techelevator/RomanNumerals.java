package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

	
	Map<Integer, String>  romanMap = new HashMap<Integer, String> ();
	
	
	public String convertToRomanNumeral(int n) {
		
		loadRomanMap();
		
		String roman = "";
		
		
		int divideBy10 = n / 10;
		int mod10Remainder = n % 10;
		
		if (divideBy10 > 0) {
			roman =  romanMap.get(new Integer(divideBy10) * 10);
		}
		
	    if (mod10Remainder > 0) {
		    roman +=  romanMap.get(mod10Remainder);
	    }

		
		return roman;
	}
	
	
	
	private void loadRomanMap() {
		
		romanMap.put(new Integer(1), "I");
		romanMap.put(new Integer(2), "II");
		romanMap.put(new Integer(3), "III");
		romanMap.put(new Integer(4), "IV");
		romanMap.put(new Integer(5), "V");
		romanMap.put(new Integer(6), "VI");
		romanMap.put(new Integer(7), "VII");
		romanMap.put(new Integer(8), "VIII");
		romanMap.put(new Integer(9), "IX");
		romanMap.put(new Integer(10), "X");	
		romanMap.put(new Integer(20), "XX");	
		romanMap.put(new Integer(30), "XXX");
		romanMap.put(new Integer(40), "XL");
		romanMap.put(new Integer(50), "L");
		romanMap.put(new Integer(60), "LX");
		romanMap.put(new Integer(70), "LXX");
		romanMap.put(new Integer(80), "LXXX");
		romanMap.put(new Integer(90), "XC");
		
	}
	
	
}
