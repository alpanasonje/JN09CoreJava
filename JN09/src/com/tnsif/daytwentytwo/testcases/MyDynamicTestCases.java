package com.tnsif.daytwentytwo.testcases;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.tnsif.daytwentytwo.businesslogic.Operations;

public class MyDynamicTestCases {
	
	@TestFactory
	public DynamicTest testCases()
	{
		return DynamicTest.dynamicTest("My Dynamic Test", ()->{Assertions.assertNull(null);}); 
	}
	@TestFactory
	public  List<DynamicTest>  generatingDynamicTestCases()
	{
		List<DynamicTest> lists=new ArrayList<DynamicTest>();
		lists.add(DynamicTest.dynamicTest("First Dynamic Test", ()->{Assertions.assertNull(null);}));
		lists.add(DynamicTest.dynamicTest("Second Dynamic Test", ()->{Assertions.assertEquals(1, Operations.sequentialSearch(new int[] {1,2,3}, 2));}));
		lists.add(DynamicTest.dynamicTest("Third Dynamic Test", ()->{Assertions.assertTrue(Operations.checkPrime(2));}));
		lists.add(DynamicTest.dynamicTest("Fourth Dynamic Test", ()->{Assertions.assertFalse(Operations.checkPrime(20));}));
		return lists;
	}
}
