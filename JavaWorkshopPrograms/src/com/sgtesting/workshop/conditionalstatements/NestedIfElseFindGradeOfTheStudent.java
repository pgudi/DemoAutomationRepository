package com.sgtesting.workshop.conditionalstatements;

import java.util.Scanner;

public class NestedIfElseFindGradeOfTheStudent {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Marks Of the Student :");
		int marks=scanner.nextInt();
		
		if ((marks<=100) && (marks>=70))
		{
			System.out.println("Result is Distinction.");
		}
		else if((marks<70) && (marks>=60))
		{
			System.out.println("Result is First Class.");
		}
		else if((marks<60) && (marks>=50))
		{
			System.out.println("Result is Second Class.");
		}
		else if((marks<50) && (marks>=35))
		{
			System.out.println("Result is Pass Class.");
		}
		else if((marks<35) && (marks>=0))
		{
			System.out.println("Result is Failed.");
		}
		else
		{
			System.out.println("Invalid Number !!!");
		}

		scanner.close();
	}

}
