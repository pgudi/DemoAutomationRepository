package com.sgtesting.workshop.methods;

class CallByReference
{
	int a,b;
	
	void calculate(CallByReference obj)
	{
		obj.a+=100;
		obj.b*=15;
		System.out.println("Within Method the value of a :"+obj.a);
		System.out.println("Within Method the value of b :"+obj.b);
		
	}
}
public class CallByReferenceDemo {
	public static void main(String[] args) {
		CallByReference obj=new CallByReference();
		obj.a=10;
		obj.b=5;
		System.out.println("Before Method Execution the value of a :"+obj.a);
		System.out.println("Before Method Execution the value of b :"+obj.b);
		
		obj.calculate(obj);
		
		System.out.println("After Method Execution the value of a :"+obj.a);
		System.out.println("After Method Execution the value of b :"+obj.b);
		

	}

}
