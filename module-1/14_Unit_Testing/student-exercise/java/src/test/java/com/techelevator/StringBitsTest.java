package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {
	
	private StringBits bits;
	
	@Before
	public void setup() {
		bits = new StringBits();
	}
	
	@Test
	public void testGetBits() {
		Assert.assertEquals(bits.getBits("Hello"), "Hlo");
		Assert.assertEquals(bits.getBits("Hi"), "H");
		Assert.assertEquals(bits.getBits("Heeololeo"), "Hello");
	}

}
