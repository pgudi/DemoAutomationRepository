package com.sgtesting.workshop.methods;
class Test
{
	public static Test obj=null;
	private Test()
	{
		// private constructor
	}
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
	
	public static Test getInstance()
	{
		if (obj==null)
		{
			obj=new Test();
		}
		return obj;
	}
}
public class SingletonDemo {
	public static void main(String[] args) {
		Test t1=Test.getInstance();
		t1.addition(100, 200);
		t1.multiplication(12, 10);
		
		Test t2=Test.getInstance();
		t2.addition(50, 40);
		t2.multiplication(15, 15);
		
		Test t3=Test.getInstance();
		t3.addition(500, 200);
		t3.multiplication(9, 25);

	}

}
