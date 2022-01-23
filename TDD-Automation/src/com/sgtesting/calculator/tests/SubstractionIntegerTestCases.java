package com.sgtesting.calculator.tests;

import org.junit.Assert;
import org.junit.Test;

import com.sgtesting.calculator.sourcecode.Calculator;

public class SubstractionIntegerTestCases {
	
	Calculator calculator=new Calculator();
	/**
	 * Test case ID:
	 * Test case Name:
	 * Author:
	 * Parameters:
	 * return value:
	 * Purpose:
	 * Description
	 */
	@Test
	public void substractTwoPositiveNumbers()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=20;
			actualResult=calculator.substraction(-30,-50);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Author:
	 * Parameters:
	 * return value:
	 * Purpose:
	 * Description
	 */
	@Test
	public void substractTwoNegativeNumbers()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=-40;
			actualResult=calculator.substraction(-50,-10);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Author:
	 * Parameters:
	 * return value:
	 * Purpose:
	 * Description
	 */
	@Test
	public void substractPositiveAndNegativeNumbers()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=110;
			actualResult=calculator.substraction(70,-40);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Author:
	 * Parameters:
	 * return value:
	 * Purpose:
	 * Description
	 */
	@Test
	public void substractPositiveAndZeroValue()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=30;
			actualResult=calculator.substraction(30,0);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Author:
	 * Parameters:
	 * return value:
	 * Purpose:
	 * Description
	 */
	@Test
	public void substractThreePositiveNumbers()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=20;
			actualResult=calculator.substraction(80,40,20);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Author:
	 * Parameters:
	 * return value:
	 * Purpose:
	 * Description
	 */
	@Test
	public void substractThreeNegativeNumbers()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=-20;
			actualResult=calculator.substraction(-50,-10,-20);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
