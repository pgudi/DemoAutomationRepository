package com.sgtesting.workshop.wrapperclass;

public class UnBoxingDemo {

	public static void main(String[] args) {
		
		Integer i=new Integer(125);
		System.out.println("i value :"+i);
		
		int b=i.intValue();
		System.out.println("b value :"+b);
		
		int a=i;
		System.out.println("a value :"+a);

	}

}
