package com.sgtesting.workshop.util;

import java.util.Hashtable;
public class HashtableDemo {
	public static void main(String[] args) {
	//	addElements();
		removeElements();

	}
	
	static void addElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
		obj.remove("Camel");
		String val=obj.get("Camel");
		System.out.println(val);
	}

}
