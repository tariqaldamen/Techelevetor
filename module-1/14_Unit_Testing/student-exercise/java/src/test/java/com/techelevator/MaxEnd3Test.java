package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MaxEnd3Test {
	MaxEnd3 test;

	@Before
	public void setUp() throws Exception {
		test= new MaxEnd3();
	}

	@Test
	public void test() {
		assertArrayEquals(new int[]{3, 3, 3},test.makeArray(new int[] {1 ,2 ,3}));
		assertArrayEquals(new int[]{8, 8, 8},test.makeArray(new int[] {8 ,2 ,3}));
		assertArrayEquals(new int[]{11, 11, 11},test.makeArray(new int[] {11 ,2 ,3}));
		assertArrayEquals(new int[]{6, 6, 6},test.makeArray(new int[] {6 ,2 ,3}));


	
	}

}
