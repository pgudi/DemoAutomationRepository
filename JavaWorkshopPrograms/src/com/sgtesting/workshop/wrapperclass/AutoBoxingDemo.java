package com.sgtesting.workshop.wrapperclass;

public class AutoBoxingDemo {

	public static void main(String[] args) {

		int i=125;
		System.out.println("i value :"+i);
		
		Integer a=Integer.valueOf(i);
		System.out.println("a value :"+a);
		
		Integer b=i;
		System.out.println("b value :"+b);

	}

}
