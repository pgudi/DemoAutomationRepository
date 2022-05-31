package com.sgtesting.workshop.methods;

class Outer
{
	String firstname;
	Inner inner=new Inner();
	Outer(String FN,int age)
	{
		firstname=FN;
		inner.age=age;
	}
	
	void showAge()
	{
		System.out.println(inner.age);
	}
	
	void displayFN()
	{
		inner.showFN();
	}
	class Inner
	{
		int age;
		void showFN()
		{
			System.out.println(firstname);
		}
	}
}
public class OuterAndInnerClassDemo {
	public static void main(String[] args) {
		Outer outer=new Outer("Santosh",17);
		outer.showAge();
		outer.displayFN();
	}

}
