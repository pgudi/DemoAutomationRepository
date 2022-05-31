package com.sgtesting.workshop.stringclass;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		appendStr();		
		insertString();
		deleteString();
		reverseStr();
	}
	
	static void appendStr()
	{
		StringBuilder s=new StringBuilder("java");
		StringBuilder s1=s.append(" Program");
		System.out.println(s1);
	}
	
	static void insertString()
	{
		StringBuilder s=new StringBuilder("It is a palace");
		StringBuilder s1=s.insert(8, "new ");
		System.out.println(s1);
		
	}
	
	static void deleteString()
	{
		StringBuilder s=new StringBuilder("It is a new palace");
		StringBuilder s1=s.delete(8, 12);
		System.out.println(s1);
	}
	
	static void reverseStr()
	{
		StringBuilder s=new StringBuilder("java");
		System.out.println(s.reverse());
	}


}
