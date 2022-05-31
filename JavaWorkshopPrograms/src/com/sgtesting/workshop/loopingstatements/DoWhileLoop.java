package com.sgtesting.workshop.loopingstatements;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		System.out.println("Display the Odd Numbers.");
		int i=10;
		do
		{
			if (i % 2 ==1)
			{
				System.out.println("Odd Number :"+i);
			}
			i+=1;
		}while(i<=20);


	}

}
