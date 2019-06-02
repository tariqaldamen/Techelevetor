package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class StringBitsTest {
	
	StringBits test;

	@Before
	public void setUp() throws Exception {
		test = new StringBits();
	}

	@Test
	public void test() {
		Assert.assertEquals("Hlo", test.getBits("Hello"));
		Assert.assertEquals("H", test.getBits("Hi"));
		Assert.assertEquals("Hello", test.getBits("Heeololeo"));


	}

}
