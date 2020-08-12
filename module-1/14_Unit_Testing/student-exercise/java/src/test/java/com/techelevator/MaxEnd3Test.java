package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {
	
	private MaxEnd3 maxEnd;
	
	
	@Before
	public void setup() {
		maxEnd = new MaxEnd3();
	}
	
	@Test
	public void testMakeArray() {
		Assert.assertArrayEquals(maxEnd.makeArray(new int[] {1, 2, 3}), maxEnd.makeArray(new int [] {3, 3, 3}));
		Assert.assertArrayEquals(maxEnd.makeArray(new int[] {11, 5, 9}), maxEnd.makeArray(new int [] {11, 11, 11}));
		Assert.assertArrayEquals(maxEnd.makeArray(new int[] {2, 11, 3}), maxEnd.makeArray(new int [] {3, 3, 3}));
	}
	
	

}
