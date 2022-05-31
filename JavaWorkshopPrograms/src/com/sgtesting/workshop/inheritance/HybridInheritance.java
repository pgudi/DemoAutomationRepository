package com.sgtesting.workshop.inheritance;

class CalculatorNew1
{
	void addition(int x,int y)
	{
		int Res=x+y;
		System.out.println("Addition Result :"+Res);
	}
}

class CalculatorNew2 extends CalculatorNew1
{
	void substraction(int x,int y)
	{
		int Res=x-y;
		System.out.println("Substraction Result :"+Res);
	}
}

class CalculatorNew3 extends CalculatorNew1
{
	void division(int x,int y)
	{
		int Res=x/y;
		System.out.println("Division Result :"+Res);
	}
}

class CalculatorNew4 extends CalculatorNew3
{
	void multiplication(int x,int y)
	{
		int Res=x*y;
		System.out.println("Multiplication Result :"+Res);
	}
}
public class HybridInheritance {
	public static void main(String[] args) {
		CalculatorNew4 obj=new CalculatorNew4();
		obj.addition(120, 50);
		obj.division(12, 2);
		obj.multiplication(10, 9);
		
		CalculatorNew2 obj1=new CalculatorNew2();
		obj1.addition(100, 300);
		obj1.substraction(100, 30);
	}

}
