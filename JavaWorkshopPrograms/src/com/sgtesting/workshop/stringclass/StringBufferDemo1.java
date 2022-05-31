package com.sgtesting.workshop.stringclass;

public class StringBufferDemo1 {
	public static void main(String[] args) {
		appendStr();		
		insertString();
		deleteString();
		reverseStr();
	}
	
	static void appendStr()
	{
		StringBuffer s=new StringBuffer("java");
		StringBuffer s1=s.append(" Program");
		System.out.println(s1);
	}
	
	static void insertString()
	{
		StringBuffer s=new StringBuffer("It is a palace");
		StringBuffer s1=s.insert(8, "new ");
		System.out.println(s1);
		
	}
	
	static void deleteString()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		StringBuffer s1=s.delete(8, 12);
		System.out.println(s1);
	}
	
	static void reverseStr()
	{
		StringBuffer s=new StringBuffer("java");
		System.out.println(s.reverse());
	}

}
