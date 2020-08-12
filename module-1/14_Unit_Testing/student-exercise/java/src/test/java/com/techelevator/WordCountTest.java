package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordCountTest {

	private WordCount count;
	
	@Before
	public void setup() {
		count = new WordCount();
	}
	
	@Test
	public void testGetCount() {
		String[] input = new String[] {"ba", "ba", "black", "sheep"};
		Integer object = new Integer(2);
		Assert.assertEquals(object, count.getCount(input).get("ba"));
		
		String[] input2 = new String[] {"a", "b", "a", "c", "b"};
		Integer object2 = new Integer(2);
		Assert.assertEquals(object2, count.getCount(input2).get("a"));
		Assert.assertEquals(object2, count.getCount(input2).get("b"));
	
		
		String[] input3 = new String[] {"c", "b", "a"};
		Integer object3 = new Integer(1);
		Assert.assertEquals(object3, count.getCount(input3).get("c"));
		Assert.assertEquals(object3, count.getCount(input3).get("b"));
		Assert.assertEquals(object3, count.getCount(input3).get("b"));
			
	}
	
}

/*
 * Given an array of strings, return a Dictionary<string, int> with a key for
 * each different string, with the value the number of times that string appears
 * in the array.
 *
 * ** A CLASSIC **
 *
 * getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep":
 * 1 } getCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
 * getCount([]) → {} getCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
 *
 */