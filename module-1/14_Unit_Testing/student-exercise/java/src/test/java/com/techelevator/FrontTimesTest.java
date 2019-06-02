package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FrontTimesTest {

	FrontTimes test;

	@Before
	public void setUp() throws Exception {

		test = new FrontTimes();
	}

	@Test
	public void test() {
		Assert.assertEquals("ChoCho", test.generateString("Chocolate", 2));
		Assert.assertEquals("ChoChoCho", test.generateString("Chocolate", 3));
		Assert.assertEquals("AbcAbcAbc", test.generateString("Abc", 3));

	}

}
