package com.sgtesting.workshop.inheritance;

class Calculator3
{
	void addition(int x,int y)
	{
		int Res=x+y;
		System.out.println("Addition Result :"+Res);
	}
}

class Calculator4 extends Calculator3
{
	void substraction(int x,int y)
	{
		int Res=x-y;
		System.out.println("Substraction Result :"+Res);
	}
}

class Calculator5 extends Calculator4
{
	void division(int x,int y)
	{
		int Res=x/y;
		System.out.println("Division Result :"+Res);
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		Calculator5 obj=new Calculator5();
		obj.addition(120, 50);
		obj.substraction(200, 120);
		obj.division(12, 2);
	}

}
