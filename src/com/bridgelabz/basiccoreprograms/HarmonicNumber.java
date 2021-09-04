package com.bridgelabz.basiccoreprograms;

public class HarmonicNumber {
	public static void main(String[] args) {
		double number=10;
		if(number==0)
		{
			System.out.println("The number should not be 0");
		}
		else
			System.out.println("The "+(int)number+"th harmonic number is :"+harmonic(number));

	}
	static double harmonic(double number)
	{
		if(number==1)
			return 1;
		else 
			return ((double)1/number)+harmonic(number-1);
	}
}
