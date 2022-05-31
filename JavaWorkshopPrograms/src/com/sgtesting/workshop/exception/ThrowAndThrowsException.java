package com.sgtesting.workshop.exception;

class StringTest
{
	int getCharCount(String str) throws Exception
	{
		if (str==null)
		{
			throw new Exception("The input is invalid please enter valid Strng as Input...");
		}
		return str.length();
	}
}
public class ThrowAndThrowsException {
	public static void main(String[] args) {
		StringTest obj=new StringTest();
		try
		{
			System.out.println(obj.getCharCount("java"));
			obj.getCharCount(null);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
