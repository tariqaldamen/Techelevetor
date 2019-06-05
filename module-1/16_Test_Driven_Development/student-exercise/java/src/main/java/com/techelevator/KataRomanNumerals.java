package com.techelevator;

import java.awt.List;
import java.util.ArrayList;

public class KataRomanNumerals {

	public String convertToRomanNumeral(int n) {
		ArrayList<String> RomanNumeral1_100 = new ArrayList<String>();

		String[] RomanNumeralFrom1_10 = new String[] { " ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		String[] RomanNumeralFrom20s_109s = new String[] { "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC",
				"C" };

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
		if (n > 100 && n < 200) {
			int mode = n % 100;

			return "C" + RomanNumeral1_100.get(mode);
		}
		if (n >= 200 && n < 300) {
			int mode = n % 200;
			if (mode == 0) {
				return "CC";
			}
			return "CC" + RomanNumeral1_100.get(mode);
		}
		if (n >= 300 && n < 400) {
			int mode = n % 300;
			if (mode == 0) {
				return "CCC";
			}
			return "CCC" + RomanNumeral1_100.get(mode);
		}
		if (n >= 400 && n < 500) {
			int mode = n % 400;
			if (mode == 0) {
				return "CD";
			}
			return "CD" + RomanNumeral1_100.get(mode);
		}
		if (n >= 500 && n < 600) {
			int mode = n % 500;
			if (mode == 0) {
				return "D";
			}
			return "D" + RomanNumeral1_100.get(mode);
		}

		return RomanNumeral1_100.get(n);

	}

}
