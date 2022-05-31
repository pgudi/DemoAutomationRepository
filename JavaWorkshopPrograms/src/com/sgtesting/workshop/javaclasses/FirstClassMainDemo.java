package com.sgtesting.workshop.javaclasses;

class Human
{
	String FirstName;
	int age;
}

class DomesticAnimal
{
	String QuantityOfMilkProvides;
}

class Birds
{
	String FeatherColor;

}

public class FirstClassMainDemo {
	public static void main(String[] args) {
		Human virat=new Human();
		virat.FirstName="Virat Kholi";
		virat.age=22;
		System.out.println(virat.FirstName);
		System.out.println(virat.age);
		System.out.println("++++++++++++++++++");
		Birds sparrow=new Birds();
		sparrow.FeatherColor="Gray Color";
		System.out.println(sparrow.FeatherColor);
		System.out.println("++++++++++++++++++");
		DomesticAnimal cow=new DomesticAnimal();
		cow.QuantityOfMilkProvides="10 Liters";
		System.out.println(cow.QuantityOfMilkProvides);
	}

}
