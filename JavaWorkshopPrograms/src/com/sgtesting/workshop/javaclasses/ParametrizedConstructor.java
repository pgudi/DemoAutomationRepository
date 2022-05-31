package com.sgtesting.workshop.javaclasses;

class Human2
{
	String FirstName;
	int age;
	Human2(String FN,int Age)
	{
		FirstName=FN;
		age=Age;
		System.out.println(FirstName);
		System.out.println(age);
		System.out.println("+++++++++++++++++++++++");
	}
}
public class ParametrizedConstructor {
	public static void main(String[] args) {
		Human2 sachi=new Human2("Sachin Tendulkar",49);
		Human2 rahul=new Human2("Rahul Dravid",44);
		

	}

}
