package com.sgtesting.workshop.conditionalstatements;

import java.util.Scanner;

public class IfElseVerifyThePersonEligibleForVoting {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Age of the Person :");
		int age=scanner.nextInt();
		if (age >= 18)
		{
			System.out.println("The Person is eligible for Voting ...");
		}
		else
		{
			System.out.println("The Person is not eligible for Voting ...");
		}
		scanner.close();

	}

}
