package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techelevator.inclass.Calculator;
import com.techelevator.inclass.Result;
import com.techelevator.inclass.WrappedNumbers;


public class CalculatorTest {
	
	Calculator calc;
	
	@BeforeClass
	public static void beforeMyTestsRun() {
		System.out.println("I run BEFORE ALL the tests have started" );
	}
	
	@AfterClass
	public static void afterMyTestsRun() {
		System.out.println("I run AFTER ALL the tests have been completed" );
	}
	
	@After
	public void anything() throws Exception {
		System.out.println("I run after EACH test" );
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("I run before EACH test" );
		calc = new Calculator();
	}



	
	@Test
	public void addSimpleIntegerTest() {
		
		//arrange ?  -->   No
		//act  ?  --> Yes
		//assert ? --> Yes
		
		System.out.println("I am addSimpleIntegerTest" );

		
		Assert.assertEquals(2, calc.add(1, 1));
		Assert.assertEquals(1, calc.add(0, 1));
		Assert.assertEquals(0, calc.add(-1, 1));
	}
	
	@Test
	public void addWrappedTest() {
		
		System.out.println("I am addWrappedTest" );
		//arrange
		WrappedNumbers numbers1 = new WrappedNumbers(2,3);
		WrappedNumbers numbers2 = new WrappedNumbers(0,3);
		
		Result sum1 = calc.add(numbers1);
		Assert.assertEquals(5, sum1.getResult());
		
		Assert.assertEquals(3, calc.add(numbers2).getResult());
	}
	
	@Test
	public void isAGreaterThanBTest() {
		System.out.println("isAGreaterThanBTest" );
		
		Assert.assertTrue(calc.isAGreaterThanB(5, 1));
		Assert.assertFalse(calc.isAGreaterThanB(1, 5));
	}
	
	@Test
	public void fizzBuzzTest() {
		Assert.assertEquals("fizz", calc.fizzBuzz(3));
		Assert.assertEquals("buzz", calc.fizzBuzz(5));
		Assert.assertEquals("fizzbuzz", calc.fizzBuzz(15));
		Assert.assertEquals("2", calc.fizzBuzz(2));
	}
	
	@Test
	public void nullTest() {
		Assert.assertNull(calc.returnNull());;
	}
	
	@Test
	public void notNullTest() {
		Assert.assertNotNull(new Calculator());
	}
	
	

}
