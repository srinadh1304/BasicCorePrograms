package com.bridgelabz.basiccoreprograms;

public class VowelOrConssonant {
	public static void main(String args[]) 
	{
		char character = 'x';

		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' )
			System.out.println(character + " is Vowel");
		else
			System.out.println(character + " is Consonant");
	}
}
