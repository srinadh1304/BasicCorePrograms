package com.bridgelabz.basiccoreprograms;

public class PowerOf2 {
	public static void main(String[] args)
	{
		int powerValue = Integer.parseInt(args[0]);
		if(powerValue<0 || powerValue > 30) 
		{
			System.err.println("The power value must be in range \"0 <= N < 31\"");
		}
		else 
		{
			for(int i=0;i<=powerValue;i++) 
			{
				System.out.println("2^"+i+" is : "+ (int)Math.pow(2,i));
			}
			int year = (int)Math.pow(2, powerValue);
			if((year%4 == 0 && year%100 != 0) || year % 400 == 0)
			{
				System.out.println(year +" : is a leap year");
			}
			else
			{
				System.out.println(year+" : is not a leap year");
			}
		}
	}
}
