package com.sgtesting.workshop.sampleprograms;

import java.util.Scanner;

public class IntegerInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Integer Value :");
		int num=scanner.nextInt();
		
		System.out.println(num);

		scanner.close();
	}

}
