package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {

	
	
	KataRomanNumerals test;
	
	@Before
	public void setUp() throws Exception {

		test = new KataRomanNumerals();
	}
	
	@Test
	public void StringCalculatorTest() {

		
		Assert.assertEquals("I", test.convertToRomanNumeral(1));
		Assert.assertEquals("X", test.convertToRomanNumeral(10));
		Assert.assertEquals("VII", test.convertToRomanNumeral(7));
		Assert.assertEquals("VIII", test.convertToRomanNumeral(8));
		Assert.assertEquals("V", test.convertToRomanNumeral(5));
		Assert.assertEquals("XVIII", test.convertToRomanNumeral(18));
		Assert.assertEquals("XXIII", test.convertToRomanNumeral(23));
		Assert.assertEquals("C", test.convertToRomanNumeral(100));
		Assert.assertEquals("CIX", test.convertToRomanNumeral(109));
		Assert.assertEquals("CI", test.convertToRomanNumeral(101));
		Assert.assertEquals("CL", test.convertToRomanNumeral(150));
		Assert.assertEquals("CLXXIX", test.convertToRomanNumeral(179));


		

}
	
}
