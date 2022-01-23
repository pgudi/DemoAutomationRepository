package com.sgtesting.calculator.tests;

import org.junit.Assert;
import org.junit.Test;

import com.sgtesting.calculator.sourcecode.Calculator;

public class AdditionIntegerTestCases {
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
	public void addTwoPositiveNumbers()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=70;
			actualResult=calculator.addition(30,40);
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
	public void addTwoNegativeNumbers()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=-60;
			actualResult=calculator.addition(-50,-10);
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
	public void addPositiveAndNegativeNumbers()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=-50;
			actualResult=calculator.addition(-70,20);
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
	public void addPositiveAndZeroValue()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=30;
			actualResult=calculator.addition(30,0);
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
	public void addThreePositiveNumbers()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=90;
			actualResult=calculator.addition(30,40,20);
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
	public void addThreeNegativeNumbers()
	{
		int expectedResult,actualResult;
		try
		{
			expectedResult=-80;
			actualResult=calculator.addition(-50,-10,-20);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
