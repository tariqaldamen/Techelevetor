package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Lucky13Test {

	Lucky13 test;
	@Before
	public void setUp() throws Exception {
		
		test = new Lucky13();
	}

	@Test
	public void test() {
		Assert.assertFalse(test.getLucky(new int[] { 5 ,3, 4}));
		Assert.assertFalse(test.getLucky(new int[] { 1 ,2, 4}));
		Assert.assertFalse(test.getLucky(new int[] { 1 ,3, 4}));
		Assert.assertTrue(test.getLucky(new int[] { 0 ,2, 4}));
	}

}
