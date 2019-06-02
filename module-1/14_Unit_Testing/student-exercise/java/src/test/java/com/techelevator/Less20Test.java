package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Less20Test {
	Less20 test;

	@Before
	public void setUp() throws Exception {

		test = new Less20();
	}

	@Test
	public void test() {
		Assert.assertFalse(test.isLessThanMultipleOf20(2));
		Assert.assertFalse(test.isLessThanMultipleOf20(3));
		Assert.assertFalse(test.isLessThanMultipleOf20(20));
		Assert.assertTrue(test.isLessThanMultipleOf20(18));
		Assert.assertTrue(test.isLessThanMultipleOf20(19));
	}

}
