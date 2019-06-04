package com.techelevator;

import java.awt.List;
import java.util.ArrayList;

public class KataRomanNumerals {

	public String convertToRomanNumeral(int n) {
		ArrayList<String> RomanNumeral1_100 = new ArrayList<String>();

		String[] RomanNumeralFrom1_10 = new String[] { " ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		String[] RomanNumeralFrom20s_109s = new String[] { "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC","C" };

		for (int i = 0; i < RomanNumeralFrom1_10.length; i++) {
			RomanNumeral1_100.add(RomanNumeralFrom1_10[i]);
			// System.out.println(RomanNumeral1_100.get(i));
		}
		for (int i = 0; i < RomanNumeralFrom20s_109s.length; i++) {
			RomanNumeral1_100.add(RomanNumeralFrom20s_109s[i]);
			for (int j = 1; j < RomanNumeralFrom1_10.length; j++) {
				RomanNumeral1_100.add(RomanNumeralFrom20s_109s[i] + RomanNumeralFrom1_10[j]);
			}
		}
		 String s = "";
		    while (n >= 1000) {
		        s += "M";
		        n -= 1000;        }
		    while (n >= 900) {
		        s += "CM";
		        n -= 900;
		    }
		    while (n >= 500) {
		        s += "D";
		        n -= 500;
		    }
		    while (n >= 400) {
		        s += "CD";
		        n -= 400;
		    }

		return RomanNumeral1_100.get(n);

	}
}
