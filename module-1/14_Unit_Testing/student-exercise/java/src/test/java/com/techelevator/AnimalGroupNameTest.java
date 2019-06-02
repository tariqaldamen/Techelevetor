package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AnimalGroupNameTest {

	AnimalGroupName test;

	@Before
	public void setUp() throws Exception {
		test = new AnimalGroupName();
	}

	@Test
	public void test() {

		Assert.assertEquals("Tower", test.getHerd("giraffe"));
		Assert.assertEquals("unknown", test.getHerd(""));
		Assert.assertEquals("unknown", test.getHerd("walrus"));
		Assert.assertEquals("Crash", test.getHerd("Rhino"));
		Assert.assertEquals("Crash", test.getHerd("rhino"));

	}

}
