package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DateFashionTest {

	DateFashion test;

	@Before
	public void setUp() throws Exception {

		test = new DateFashion();
	}

	@Test
	public void test() {

		Assert.assertEquals(2, test.getATable(5, 10));
		Assert.assertEquals(2, test.getATable(5, 12));
		Assert.assertEquals(0, test.getATable(5, 2));
		Assert.assertEquals(1, test.getATable(5, 5));
		Assert.assertEquals(0, test.getATable(2, 2));
		Assert.assertEquals(2, test.getATable(8, 8));

	}

}
