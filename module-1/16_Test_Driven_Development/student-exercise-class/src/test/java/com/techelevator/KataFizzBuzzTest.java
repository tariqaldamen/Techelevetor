package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class KataFizzBuzzTest {
	
	
	
	
	
	
	@Test
	public void fizzBuzzTest () {
		
		KataFizzBuzz buzz = new KataFizzBuzz();
		Assert.assertEquals("fizz", buzz.fizzBuzz(3));
		Assert.assertEquals("fizz", buzz.fizzBuzz(6));
		Assert.assertEquals("buzz", buzz.fizzBuzz(5));
		Assert.assertEquals("fizzbuzz", buzz.fizzBuzz(15));
		Assert.assertEquals("fizzbuzz", buzz.fizzBuzz(30));
		Assert.assertEquals("fizzbuzz", buzz.fizzBuzz(45));
		Assert.assertEquals("2", buzz.fizzBuzz(2));
		Assert.assertEquals("-1", buzz.fizzBuzz(-1));
		Assert.assertEquals("fizz", buzz.fizzBuzz(23));
	
		
	}



}
