package com.sgtesting.workshop.sampleprograms;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String value :");
		String str=scanner.next();
		System.out.println(str);

		scanner.close();
	}

}
