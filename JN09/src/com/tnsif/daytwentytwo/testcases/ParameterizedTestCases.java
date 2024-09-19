package com.tnsif.daytwentytwo.testcases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.tnsif.daytwentytwo.businesslogic.Operations;

public class ParameterizedTestCases {
	
	@ParameterizedTest
	@CsvSource({"2, true","3, true","6, false"})
	public void testForPrimeNumbers(int n,boolean result)
	{
		Assertions.assertEquals(result, Operations.checkPrime(n));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {0, 1, 4, 6})
	public void testForFactorial(int n)
	{
		Operations.displayFactorial(n);
	}
	
	@ParameterizedTest
	@ValueSource(ints= {0, 1, 42, 6})
	public void testForNonPrime(int n)
	{
		Assertions.assertFalse(Operations.checkPrime(n));
	}
	

}
