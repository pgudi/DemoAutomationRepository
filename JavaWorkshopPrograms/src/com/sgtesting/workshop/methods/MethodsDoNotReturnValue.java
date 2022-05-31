package com.sgtesting.workshop.methods;

class Calculate1
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
}
public class MethodsDoNotReturnValue {
	public static void main(String[] args) {
		Calculate1 cal=new Calculate1();
		cal.addition(20, 50);
		cal.multiplication(12, 10);
		
		cal.addition(120, 60);

	}

}
