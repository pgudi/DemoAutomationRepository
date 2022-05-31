package com.sgtesting.workshop.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
	//	addElements();
		readElements1();

	}

	static void addElements()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		obj.add(1, "Jack Fruit");
		System.out.println("Elements :"+obj);
		Vector<String> obj1=new Vector<String>();
		obj1.add("Green");
		obj1.add("White");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	static void readElements1()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		obj.add(1, "Jack Fruit");
		System.out.println("Elements :"+obj);
		
	    Enumeration<String> ite=obj.elements();
	    while(ite.hasMoreElements())
	    {
	    	System.out.println(ite.nextElement());
	    }
		
	}
}
