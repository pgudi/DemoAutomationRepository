package com.sgtesting.workshop.util;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements();
		queueConcept();
	}
	static void addElements()
	{
		List<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		obj.add(1, "Jack Fruit");
		System.out.println("Elements :"+obj);
		List<String> obj1=new LinkedList<String>();
		obj1.add("Green");
		obj1.add("White");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		List<String> obj=new LinkedList<String>();
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
	
	static void readElements()
	{
		List<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Banana");
		obj.add(1, "Jack Fruit");
		System.out.println("Elements :"+obj);
		
		ListIterator<String> ite=obj.listIterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		System.out.println("++++++++++++++++++++++");
		while(ite.hasPrevious())
		{
			System.out.println(ite.previous());
		}
	}
	
	static void queueConcept()
	{
		Queue<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		obj.remove();
		System.out.println("Elements :"+obj);
		obj.remove();
		System.out.println("Elements :"+obj);
	}
}
