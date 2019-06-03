package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class RomanNumeralsTest {
	
	RomanNumerals nums = new RomanNumerals();

	@Test
	public void numbers_to_romanTest_from_0_to_10 () {
		
	
		
		Assert.assertEquals("I", nums.convertToRomanNumeral(1));
		Assert.assertEquals("II", nums.convertToRomanNumeral(2));
		Assert.assertEquals("III", nums.convertToRomanNumeral(3));
		Assert.assertEquals("IV", nums.convertToRomanNumeral(4));
		Assert.assertEquals("V", nums.convertToRomanNumeral(5));
		Assert.assertEquals("VI", nums.convertToRomanNumeral(6));
		Assert.assertEquals("VII", nums.convertToRomanNumeral(7));
		Assert.assertEquals("VIII", nums.convertToRomanNumeral(8));
		Assert.assertEquals("IX", nums.convertToRomanNumeral(9));
		Assert.assertEquals("X", nums.convertToRomanNumeral(10));
		
	}
	
	@Test
	public void numbers_to_romanTest_from_11_to_100 () {
		
		Assert.assertEquals("XI", nums.convertToRomanNumeral(11));
		Assert.assertEquals("XII", nums.convertToRomanNumeral(12));
		Assert.assertEquals("XIII", nums.convertToRomanNumeral(13));
		Assert.assertEquals("XX", nums.convertToRomanNumeral(20));
		Assert.assertEquals("XXX", nums.convertToRomanNumeral(30));
		Assert.assertEquals("XL", nums.convertToRomanNumeral(40));
		Assert.assertEquals("L", nums.convertToRomanNumeral(50));
		Assert.assertEquals("LX", nums.convertToRomanNumeral(60));
		Assert.assertEquals("LXX", nums.convertToRomanNumeral(70));
		Assert.assertEquals("LXXX", nums.convertToRomanNumeral(80));

		
	}

}
