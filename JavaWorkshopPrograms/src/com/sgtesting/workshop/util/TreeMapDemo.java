package com.sgtesting.workshop.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
		readElements();

	}

	static void addElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
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
		TreeMap<String,String> obj=new TreeMap<String,String>();
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
	
	static void readElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		
		System.out.println("Elements :"+obj);
		Set set=obj.entrySet();
		Iterator ite=set.iterator();
		
		while(ite.hasNext())
		{
			Map.Entry me=(Map.Entry) ite.next();
			System.out.println(me.getKey()+" ----> "+me.getValue());
		}
		
	}
}
