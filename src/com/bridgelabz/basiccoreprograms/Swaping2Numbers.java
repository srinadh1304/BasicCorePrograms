package com.bridgelabz.basiccoreprograms;

public class Swaping2Numbers {
	public static void main(String[] args)
	{
		int number1=(int)(Math.random()*100);
		int number2=(int)(Math.random()*100);
		System.out.println("Numbers before swapping: "+ number1+" "+number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After Swapping: "+ number1+" "+number2);
	}
}
