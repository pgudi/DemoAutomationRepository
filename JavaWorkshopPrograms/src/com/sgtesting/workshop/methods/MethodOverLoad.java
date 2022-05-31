package com.sgtesting.workshop.methods;

class OverLoad
{
	void display(String name)
	{
		System.out.println(name);
	}
	
	void display(String name,int age)
	{
		System.out.println(name+" "+age); 
	}
	
	void display(int age)
	{
		System.out.println(age);
	}
}
public class MethodOverLoad {
	public static void main(String[] args) {
		OverLoad obj=new OverLoad();
		obj.display("Santosh");

	}

}

