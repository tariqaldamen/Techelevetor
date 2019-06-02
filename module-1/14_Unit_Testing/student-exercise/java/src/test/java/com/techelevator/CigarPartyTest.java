package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CigarPartyTest {

	CigarParty test;

	@Before
	public void setUp() throws Exception {
		test = new CigarParty();
	}

	@Test
	public void test() {
		Assert.assertFalse(test.haveParty(5, false));
		Assert.assertFalse(test.haveParty(30, false));
		Assert.assertFalse(test.haveParty(70, false));
		Assert.assertTrue(test.haveParty(60, false));
		Assert.assertTrue(test.haveParty(50, false));
		Assert.assertTrue(test.haveParty(70, true));
	}

}
