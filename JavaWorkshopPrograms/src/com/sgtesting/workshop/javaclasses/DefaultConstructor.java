package com.sgtesting.workshop.javaclasses;

class Human1
{
	String FirstName;
	int age;
	Human1()
	{
		FirstName="Sachin Tendulkar";
		age=49;
		System.out.println(FirstName);
		System.out.println(age);
	}
}

class Birds1
{
	String FeatherColor;
	Birds1()
	{
		FeatherColor="Gray Color";
		System.out.println(FeatherColor);
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		Human1 sachi=new Human1();

		Birds1 sparrow=new Birds1();
		
	}
}