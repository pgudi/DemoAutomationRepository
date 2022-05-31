package com.sgtesting.workshop.conditionalstatements;

import java.util.Scanner;

public class IfStatementVerifyGivenNumberDivisibleByFive {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number=scanner.nextInt();
		
		if (number % 5 ==0)
		{
			System.out.println(number+" is Divisible by 5.");
		}

		scanner.close();
	}

}
