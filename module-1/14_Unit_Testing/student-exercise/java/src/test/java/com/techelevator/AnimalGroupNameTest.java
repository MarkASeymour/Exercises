package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {
	
	private AnimalGroupName animals;
	
	@Before
	public void setUp() {
		animals = new AnimalGroupName();
	}
	
	@Test
	public void testInitialization() {
		Assert.assertNotNull(animals);
	}
	
	@Test
	public void testGetHerd() {
		Assert.assertEquals(animals.getHerd("rhino"), "Crash");
		Assert.assertEquals(animals.getHerd(""), "unknown");
		Assert.assertEquals(animals.getHerd("elephants"), "unknown");
		Assert.assertEquals(animals.getHerd("giraffe"), "Tower");
		Assert.assertEquals(animals.getHerd("walrus"), "unknown");
		Assert.assertEquals(animals.getHerd("Rhino"), "Crash");
		Assert.assertEquals(animals.getHerd("pigeon"), "Kit");
	}
	

}
