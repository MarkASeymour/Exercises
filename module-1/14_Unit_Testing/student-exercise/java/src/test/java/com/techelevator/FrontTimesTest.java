package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FrontTimesTest {
	
	
	private FrontTimes newString;
	
	
	@Before
	public void setup() {
		newString = new FrontTimes();
	}
	
	
	@Test
	public void testGenerateString() {
		Assert.assertEquals(newString.generateString("Chocolate", 2), "ChoCho");
		Assert.assertEquals(newString.generateString("Chocolate", 3), "ChoChoCho");
		Assert.assertEquals(newString.generateString("Abc", 3), "AbcAbcAbc");
	}

}
