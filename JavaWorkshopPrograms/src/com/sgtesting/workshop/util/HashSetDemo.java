package com.sgtesting.workshop.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
		readElements();
	}
	
	static void addElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		System.out.println("Elements :"+obj);
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("Green");
		obj1.add("White");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		System.out.println("Elements :"+obj);
		obj.remove("Orange");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}

	static void readElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
}
