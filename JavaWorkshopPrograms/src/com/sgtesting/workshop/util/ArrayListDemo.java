package com.sgtesting.workshop.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
		rawApproach();
	}
	
	static void addElements()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		obj.add(1, "Jack Fruit");
		System.out.println("Elements :"+obj);
		List<String> obj1=new ArrayList<String>();
		obj1.add("Green");
		obj1.add("White");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		obj.add(1, "Jack Fruit");
		System.out.println("Elements :"+obj);
		obj.remove("Mango");
		System.out.println("Elements :"+obj);
		obj.remove(1);
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	static void readElements1()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		obj.add(1, "Jack Fruit");
		System.out.println("Elements :"+obj);
		
		Iterator<String> ite=obj.iterator();
		
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
	}

	
	static void rawApproach()
	{
		List obj=new ArrayList();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add("Mango");
		obj.add('Y');
		System.out.println("Elements :"+obj);
	}
}
