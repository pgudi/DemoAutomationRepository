package com.sgtesting.workshop.conditionalstatements;

import java.util.Scanner;

public class SwitchBlockVerifyGivenCharIsVowelOrConsonant {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Character :");
		String input=scanner.next();
		char ch=input.charAt(0);
		
		switch(ch)
		{
		case 'a':case 'A':
			System.out.println(ch+" is Vowel");
			break;
		case 'e':case 'E':
			System.out.println(ch+" is Vowel");
			break;
		case 'i':case 'I':
			System.out.println(ch+" is Vowel");
			break;
		case 'o':case 'O':
			System.out.println(ch+" is Vowel");
			break;
		case 'u':case 'U':
			System.out.println(ch+" is Vowel");
			break;
		default:
			System.out.println(ch+" is Consonant");
		}

		scanner.close();
	}

}
