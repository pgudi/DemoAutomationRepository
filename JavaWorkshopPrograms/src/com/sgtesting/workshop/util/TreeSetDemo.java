package com.sgtesting.workshop.util;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
		readElements();
	}
	
	static void addElements()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Zinc");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		System.out.println("Elements :"+obj);
		TreeSet<String> obj1=new TreeSet<String>();
		obj1.add("Green");
		obj1.add("White");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Zinc");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		System.out.println("Elements :"+obj);
		obj.remove("Zinc");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	static void readElements()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Zinc");
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
