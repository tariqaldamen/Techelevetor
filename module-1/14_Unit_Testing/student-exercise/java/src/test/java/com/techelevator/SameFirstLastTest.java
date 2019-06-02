package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SameFirstLastTest {
	SameFirstLast test;

	@Before
	public void setUp() throws Exception {
		test = new SameFirstLast();
	}

	@Test
	public void test() {
		Assert.assertFalse(test.isItTheSame(new int[] {1,2,3}));
		Assert.assertTrue(test.isItTheSame(new int[] {1,2,3,1}));
		Assert.assertTrue(test.isItTheSame(new int[] {1,2,1}));
		Assert.assertFalse(test.isItTheSame(new int[] {}));




	}

}
