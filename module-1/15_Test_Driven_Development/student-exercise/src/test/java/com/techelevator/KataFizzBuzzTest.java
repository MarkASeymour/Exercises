package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	private KataFizzBuzz kata;
	
	
	@Before
	public void setup() {
		kata = new KataFizzBuzz();
	}
	
	@Test
	public void start() {
		Assert.assertNotNull(kata);
	}
	
	@Test
	public void fizzTest3() {
		Assert.assertEquals("Fizz", kata.fizzBuzzMethod(3));
		Assert.assertEquals("Fizz", kata.fizzBuzzMethod(9));
		Assert.assertEquals("Fizz", kata.fizzBuzzMethod(21));
		Assert.assertEquals("Fizz", kata.fizzBuzzMethod(13));
		Assert.assertEquals("Fizz", kata.fizzBuzzMethod(43));
	}
	
	@Test
	public void buzzTest5() {
		Assert.assertEquals("Buzz", kata.fizzBuzzMethod(5));
		Assert.assertEquals("Buzz", kata.fizzBuzzMethod(20));
		Assert.assertEquals("Buzz", kata.fizzBuzzMethod(50));
		Assert.assertEquals("Buzz", kata.fizzBuzzMethod(59));
		Assert.assertEquals("Buzz", kata.fizzBuzzMethod(56));
	}

	@Test
	public void fizzBuzzTest() {
		Assert.assertEquals("FizzBuzz", kata.fizzBuzzMethod(15));
		Assert.assertEquals("FizzBuzz", kata.fizzBuzzMethod(45));
		Assert.assertEquals("FizzBuzz", kata.fizzBuzzMethod(30));
		Assert.assertEquals("FizzBuzz", kata.fizzBuzzMethod(35));
		Assert.assertEquals("FizzBuzz", kata.fizzBuzzMethod(53));
	}
	@Test
	public void fizzBuzzTestInRange() {
		Assert.assertEquals("1", kata.fizzBuzzMethod(1));
		Assert.assertEquals("2", kata.fizzBuzzMethod(2));
		Assert.assertEquals("98", kata.fizzBuzzMethod(98));
	}
	
	@Test
	public void fizzBuzzTestOutRange() {
		Assert.assertEquals("", kata.fizzBuzzMethod(120));
		Assert.assertEquals("", kata.fizzBuzzMethod(-5));
		Assert.assertEquals("", kata.fizzBuzzMethod(101));
	}


}
