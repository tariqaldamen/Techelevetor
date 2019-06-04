package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	

	@Test
	public void StringCalculatorTest() {

		KataFizzBuzz test = new KataFizzBuzz();
		Assert.assertEquals("1", test.FizzBuzz(1));
		Assert.assertEquals(("2"), test.FizzBuzz(2));
	
	}
	}
