package com.sgtesting.workshop.inheritance;

class Calculator11
{
	void addition(int x,int y)
	{
		int Res=x+y;
		System.out.println("Addition Result :"+Res);
	}
}

class Calculator22 extends Calculator11
{
	void substraction(int x,int y)
	{
		int Res=x-y;
		System.out.println("Substraction Result :"+Res);
	}
}

class Calculator33 extends Calculator11
{
	void division(int x,int y)
	{
		int Res=x/y;
		System.out.println("Division Result :"+Res);
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		Calculator33 obj=new Calculator33();
		obj.addition(120, 50);
		obj.division(12, 2);
		
		Calculator22 obj1=new Calculator22();
		obj1.addition(100, 300);
		obj1.substraction(100, 30);
	}

}
