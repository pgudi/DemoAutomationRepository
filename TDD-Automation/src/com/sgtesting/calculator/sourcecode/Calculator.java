package com.sgtesting.calculator.sourcecode;

public class Calculator {
	
	/**
	 * Author:
	 * Reviewer:
	 * Purpose:
	 * Description:
	 */
	public int addition(int num1,int num2)
	{
		int result=0;
		try
		{
			result=(num1+num2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Author:
	 * Reviewer:
	 * Purpose:
	 * Description:
	 */
	public int substraction(int num1,int num2)
	{
		int result=0;
		try
		{
			result=(num1-num2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Author:
	 * Reviewer:
	 * Purpose:
	 * Description:
	 */
	public int addition(int num1,int num2,int num3)
	{
		int result=0;
		try
		{
			result=(num1+num2+num3);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Author:
	 * Reviewer:
	 * Purpose:
	 * Description:
	 */
	public int substraction(int num1,int num2,int num3)
	{
		int result=0;
		try
		{
			result=(num1-num2-num3);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}

}
