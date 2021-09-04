package com.bridgelabz.basiccoreprograms;

public class LargestOfThreeNumbers {
	public static void main(String args[])
	{
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		int number3=(int)(Math.random()*10);
		if( number1 >= number2 && number1 >= number3)
			System.out.println(number1 + " is the largest number.");

		else if (number2 >= number1 && number2 >= number3)
			System.out.println(number2 + " is the largest number.");

		else
			System.out.println(number3 + " is the largest number.");

	}
}
