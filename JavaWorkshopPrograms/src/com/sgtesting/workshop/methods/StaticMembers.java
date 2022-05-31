package com.sgtesting.workshop.methods;

class StaticTest
{
	static String firstname;
	static int age;
	
	static
	{
		firstname="Santosh";
		showName();
		showAge();
	}
	
	static void showName()
	{
		System.out.println(firstname);
	}
	
	static void showAge()
	{
		System.out.println(age);
	}
}
public class StaticMembers {
	public static void main(String[] args) {
		StaticTest.age=17;
		System.out.println(StaticTest.age);

	}

}
