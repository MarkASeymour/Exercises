package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class DateFashionTest {

	private DateFashion fashion;
	
	@Before
	public void initialize() {
		fashion = new DateFashion();
	}
	
	@Test
	public void testGetATable() {
		Assert.assertEquals(fashion.getATable(5, 10), 2);
		Assert.assertEquals(fashion.getATable(5, 2), 0);
		Assert.assertEquals(fashion.getATable(5, 5), 1);
	}
	
	
	
}
