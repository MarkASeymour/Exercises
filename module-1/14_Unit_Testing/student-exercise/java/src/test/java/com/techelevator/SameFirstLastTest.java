package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {
	
	private SameFirstLast firstLast;
	
	
	@Before
	public void initialize() {
		firstLast = new SameFirstLast();
	}
	
	@Test
	public void testIsItTheSame() {
		Assert.assertEquals(firstLast.isItTheSame(new int[] {1, 2, 3}), false);
		Assert.assertEquals(firstLast.isItTheSame(new int[] {1, 2, 3, 1}), true);
		Assert.assertEquals(firstLast.isItTheSame(new int[] {1, 2, 1}), true);
		Assert.assertEquals(firstLast.isItTheSame(null), false);
	}

	
}
