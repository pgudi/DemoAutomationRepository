package com.sgtesting.workshop.sampleprograms;

import java.util.Scanner;

public class DoubleInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Double Value :");
		double num=scanner.nextDouble();
		System.out.println(num);
		
		scanner.close();
	}

}
