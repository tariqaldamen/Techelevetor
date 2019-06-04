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

}
	
}
