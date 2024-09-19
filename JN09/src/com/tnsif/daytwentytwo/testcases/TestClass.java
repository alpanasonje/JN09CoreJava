package com.tnsif.daytwentytwo.testcases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
//@TestInstance(Lifecycle.PER_METHOD) by default
public class TestClass {
	@Test
	public void testMethod1()
	{
		System.out.println("Test Method 1 : "+this);
	}
	@Test
	public void testMethod2()
	{
		System.out.println("Test Method 2 : "+this);
	}
	@Test
	public void testMethod3()
	{
		System.out.println("Test Method 3 : "+this);
	}
	
	@BeforeAll
	public static void testBeforeAll()
	{
		System.out.println("Before all test cases");
	}
	@AfterAll
	public static void testAfterAll()
	{
		System.out.println("After all test cases");
	}
	
	@BeforeEach
	public  void testBeforeEach()
	{
		System.out.println("Before Each test cases");
	}
	@AfterEach
	public  void testAfterEach()
	{
		System.out.println("After Each test cases");
	}
}
