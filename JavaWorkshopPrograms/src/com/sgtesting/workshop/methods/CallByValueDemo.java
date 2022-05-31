package com.sgtesting.workshop.methods;

class CallByValue
{
	void calculate(int a,int b)
	{
		a+=100;
		b*=15;
		System.out.println("within Method the value of a :"+a);
		System.out.println("within Method the value of b :"+b);
	}
}
public class CallByValueDemo {
	public static void main(String[] args) {
		int a,b;
		a=10;b=5;
		System.out.println("Before Method Execution the value of a :"+a);
		System.out.println("Before Method Execution the value of b :"+b);
		
		CallByValue obj=new CallByValue();
		obj.calculate(a, b);
		
		System.out.println("After Method Execution the value of a :"+a);
		System.out.println("After Method Execution the value of b :"+b);
	}

}

