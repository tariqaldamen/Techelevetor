package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class NonStartTest {
	NonStart test;

	@Before
	public void setUp() throws Exception {
		
		test= new NonStart();
	}

	@Test
	public void test() {
		Assert.assertEquals("ellohere", test.getPartialString("Hello","There"));
		Assert.assertEquals("lloere", test.getPartialString("ello","here"));
		Assert.assertEquals("hotlava", test.getPartialString("shotl","java"));
		Assert.assertEquals("here", test.getPartialString("","There"));
		Assert.assertEquals("here", test.getPartialString("There",""));



	}

}
