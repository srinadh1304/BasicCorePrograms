package com.bridgelabz.basiccoreprograms;

public class LeapYear {
	public static void main(String[] args) {
		int year=1900;
		int noOfDigits=countDigits(year);
		if(noOfDigits<4||noOfDigits>4)
		{
			System.out.println("The year should be in 4 digits");
		}
		else
		{
			if((year%4==0 && year%100!=0)||(year%400==0))
			{
				System.out.println("The year "+year+" is a leap year");
			}
			else
			{
				System.out.println("The year "+year+" is not a leap year");
			}
		}
	}
	static int countDigits(int year)
	{
		int noOfDigits=0;
		while(year>0)
		{
			noOfDigits++;
			year=year/10;
		}
		return noOfDigits;
	}
}
