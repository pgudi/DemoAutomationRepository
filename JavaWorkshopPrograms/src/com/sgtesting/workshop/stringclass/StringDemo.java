package com.sgtesting.workshop.stringclass;

public class StringDemo {

	public static void main(String[] args) {
		getStrLength() ;
		findStrLength();
		uppercase();
		lowercase();
		strTrim();
		strReplace();
		strSplit();
		compareString1();
		compareString2();
		strExistance();
		strExtract();
		findPosition();
		getCharArray();
	}
	
	static void getStrLength() 
	{
		String s=new String("Programming");
		int a=s.length();
		System.out.println("# of Chars :"+a);
	}
	
	static void findStrLength()
	{
		String s=new String();
		boolean val=s.isEmpty();
		System.out.println("Is it a empty String ?"+val);
	}
	
	static void uppercase()
	{
		String s=new String("programming");
		System.out.println("Uppercase :"+s.toUpperCase());
	}
	
	static void lowercase()
	{
		String s=new String("PROGRAMMING");
		System.out.println("Lowercase :"+s.toLowerCase());
	}

	static void strTrim()
	{
		String s="    java    ";
		System.out.println("before trim the length of Str:"+s.length());
		String s1=s.trim();
		System.out.println("After trim the length of Str:"+s1.length());
	}
	
	static void strReplace()
	{
		String s="It is an old palace";
		System.out.println("Replace Result:"+s.replace("is", "was"));
	}
	
	static void strSplit()
	{
		String s="orange,apple,mango,grapes";
		String s1[]=s.split(",");
		for(String kk:s1) {
			System.out.println(kk);
		}
	}
	
	static void compareString1()
	{
		String s1="Java";
		String s2="java";
		System.out.println("equalsTo :"+s1.equals(s2));
		System.out.println("EqualsToIgnoreCase:"+s1.equalsIgnoreCase(s2));
	}
	
	static void compareString2()
	{
		String s1="Java";
		String s2="java";
		System.out.println("equalsTo :"+s1.compareTo(s2));
		System.out.println("EqualsToIgnoreCase:"+s1.compareToIgnoreCase(s2));
	}
	
	static void strExistance()
	{
		String s="java supports oops concept for programming";
		System.out.println("Starts With 'java' :"+s.startsWith("java"));
		System.out.println("ends With 'ing' :"+s.endsWith("ing"));
		System.out.println("contains 'concept' :"+s.contains("concept"));
	}
	
	static void strExtract()
	{
		String s="Programming";
		System.out.println(s.substring(3, 7));
		System.out.println(s.substring(3));
	}
	
	static void findPosition()
	{
		String s="xxaxxaxxaXXAXXA";
		System.out.println("A position:"+s.indexOf("A"));
		
		System.out.println("A position:"+s.lastIndexOf("A"));
	}
	
	static void getCharArray()
	{
		String s="program";
		char ch[]=s.toCharArray();
		for(char ch1:ch) {
			System.out.println(ch1);
		}
	}

}
