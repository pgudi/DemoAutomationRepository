package com.sgtesting.workshop.methods;

class Calculate
{
	int addition(int x,int y)
	{
		return (x+y);
	}
	
	int substraction(int x,int y)
	{
		int Res=x-y;
		return Res;
	}
	
	void multiplication(int x,int y)
	{
		int Result=x*y;
		System.out.println("Multiplication Result :"+Result);
	}
}
public class MethodsReturnValue {
	public static void main(String[] args) {
		Calculate obj=new Calculate();
		int a=obj.addition(20, 50);
		int b=obj.substraction(10, 5);
		
		obj.multiplication(a, b);

	}

}

