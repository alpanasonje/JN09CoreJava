package com.tnsif.daytwentytwo.testcases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.tnsif.daytwentytwo.businesslogic.Operations;

//@Disabled
public class MyTestClass {
	@Test
	public void nonPrimeTest()
	{
		Assertions.assertFalse(Operations.checkPrime(12));
	}
	@Test
	public void arraySearchTest()
	{
		int a[]= {1,2,3,5};
		Assertions.assertEquals(2, Operations.sequentialSearch(a, 3));
	}
	//@Test
	@RepeatedTest(2)
	public void primeTest()
	{
		Assertions.assertTrue(Operations.checkPrime(13));
	}
	@Test
	public void arraySearchTestNegative()
	{
		int a[]= {1,2,3,5};
		Assertions.assertEquals(-1, Operations.sequentialSearch(a, 30));
	}
	//@Test - unit testing
	@Test
	public void testAddition()
	{
		Assertions.assertEquals(6, (2+4));
	}
	@Disabled
	@Test
	public void testForNull()
	{
		String s=null;
		Assertions.assertNull(s);
	}
	@Test
	@DisplayName("Test for Not Null value")
	public void testForNotNull()
	{
		String s="Hello";
		Assertions.assertNotNull(s);
	}
}
