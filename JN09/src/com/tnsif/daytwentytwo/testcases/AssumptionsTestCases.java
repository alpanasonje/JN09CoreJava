package com.tnsif.daytwentytwo.testcases;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTestCases {
	@Test
	public void testSquare()
	{
		int a=2;
		int b=4;
		Assumptions.assumeTrue(b==a*a);
		System.out.println("testing");
	}
	
	@Test
	public void testAddition()
	{
		int a=2,b=3;
		int c=a+b;
		Assumptions.assumingThat(c==5, ()->{System.out.print("assumptions are correct");});
	}
}
