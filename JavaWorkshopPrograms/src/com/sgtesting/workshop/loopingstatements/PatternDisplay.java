package com.sgtesting.workshop.loopingstatements;

public class PatternDisplay {

	public static void main(String[] args) {
		char ch='#';
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=10;j++)
			{
				System.out.print(ch+"  "); // 2 spaces
			}
			System.out.println();
		}


	}

}
