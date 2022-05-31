package com.sgtesting.workshop.inheritance;

class Calculator1
{
	void addition(int x,int y)
	{
		int Res=x+y;
		System.out.println("Addition Result :"+Res);
	}
}

class Calculator2 extends Calculator1
{
	void substraction(int x,int y)
	{
		int Res=x-y;
		System.out.println("Substraction Result :"+Res);
	}
}
public class SimpleInheritance {
	public static void main(String[] args) {
		Calculator2 obj=new Calculator2();
		obj.addition(120, 50);
		obj.substraction(200, 120);

	}

}
