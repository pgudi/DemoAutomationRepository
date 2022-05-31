package com.sgtesting.workshop.polymorphism;

abstract class GeometricFigure
{
	abstract void area();
}

class Rectangle extends GeometricFigure
{
	void area()
	{
		int length,bredth;
		length=10;bredth=20;
		System.out.println("Area of Rectangle :"+(length*bredth));
	}
}

class Square extends GeometricFigure
{
	void area()
	{
		int length;
		length=10;
		System.out.println("Area of Square :"+(length*length));
	}
}

class Circle extends GeometricFigure
{
	void area()
	{
		double radius=2.0;
		System.out.println("Area of Circle :"+(3.14*radius*radius));
	}
}
public class PolymorphismDemo {
	public static void main(String[] args) {
		GeometricFigure figure=null;
		Rectangle rectangle=new Rectangle();
		Square square=new Square();
		Circle circle=new Circle();
		
		figure=rectangle;
		figure.area();
		
		figure=square;
		figure.area();
		
		figure=circle;
		figure.area();
	}

}
