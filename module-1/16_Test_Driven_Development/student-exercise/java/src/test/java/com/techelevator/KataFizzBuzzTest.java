package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	

	@Test
	public void StringCalculatorTest() {

		KataFizzBuzz test = new KataFizzBuzz();
		Assert.assertEquals("1", test.FizzBuzz(1));
		Assert.assertEquals(("2"), test.FizzBuzz(2));
		Assert.assertEquals(("Fizz"), test.FizzBuzz(3));
		Assert.assertEquals(("4"), test.FizzBuzz(4));
		Assert.assertEquals(("Buzz"), test.FizzBuzz(5));
		Assert.assertEquals(("FizzBuzz"), test.FizzBuzz(15));
		Assert.assertEquals(("22"), test.FizzBuzz(22));
		Assert.assertEquals((""), test.FizzBuzz(0));
		Assert.assertEquals(("Fizz"), test.FizzBuzz(13));
		Assert.assertEquals(("FizzBuzz"), test.FizzBuzz(35));
		Assert.assertEquals(("FizzBuzz"), test.FizzBuzz(53));
		Assert.assertEquals(("Buzz"), test.FizzBuzz(5));
		Assert.assertEquals(("Buzz"), test.FizzBuzz(51));
	
	}
	}
