package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NonStartTest {
	
	
	private NonStart nonStart;
	
	@Before
	public void setUp() {
		nonStart = new NonStart();
	}
	
	@Test
	public void testGetPartialString() {
		Assert.assertEquals(nonStart.getPartialString("Hello", "There"), "ellohere");
		Assert.assertEquals(nonStart.getPartialString("java", "code"), "avaode");
		Assert.assertEquals(nonStart.getPartialString("shotl", "java"), "hotlava");
	}

}
