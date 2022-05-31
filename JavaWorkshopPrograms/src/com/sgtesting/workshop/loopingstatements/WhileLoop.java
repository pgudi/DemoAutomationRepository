package com.sgtesting.workshop.loopingstatements;

public class WhileLoop {

	public static void main(String[] args) {

		System.out.println("Display the Odd Numbers.");
		int i=10;
		while(i<=20)
		{
			if (i % 2 ==1)
			{
				System.out.println("Odd Number :"+i);
			}
			i+=1;
		}


	}

}
