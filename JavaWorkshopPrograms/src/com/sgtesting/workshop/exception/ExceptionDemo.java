package com.sgtesting.workshop.exception;

class BasicMaths
{
	void addition(int x,int y)
	{
		int Res=x+y;
		System.out.println("Addition Result :"+Res);
	}
	
	void multiplication(int x,int y)
	{
		int Result=x*y;
		System.out.println("Multiplication Result :"+Result);
	}
	
	void findFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of Number "+n+" is :"+fact);
	}
	
	void division(int x,int y)
	{
		try
		{
			int Res=x/y;
			System.out.println("Division Result :"+Res);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This block executes always...");
		}
	}
	
	void substraction(int x,int y)
	{
		int Res=x-y;
		System.out.println("Substraction Result :"+Res);
	}
}
public class ExceptionDemo {
	public static void main(String[] args) {
		BasicMaths obj=new BasicMaths();
		
		obj.findFactorial(4);
		obj.substraction(120, 20);
		obj.division(25, 0);
		obj.addition(12, 58);
		obj.multiplication(10, 20);
		

	}

}
