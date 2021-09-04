package com.bridgelabz.basiccoreprograms;

public class FlipCoin {

	public static void main(String[] args) {
		int noOfTimesToFilp=(int)(Math.floor(Math.random()*10));
		if(noOfTimesToFilp<0)
		{
			System.out.println("The number of times to flip a coin should be positive");
		}
		else
		{
			int headOrTail=0;
			int headsCount=0,tailsCount=0;
			for(int noOfFlips=0;noOfFlips<noOfTimesToFilp;noOfFlips++)
			{
				headOrTail=(int)(Math.random());
				if(headOrTail<0.5)
				{
					tailsCount+=1;
				}
				else
				{
					headsCount+=1;
				}
			}
			System.out.println("Heads Percentage : "+((headsCount/noOfTimesToFilp)*100));
			System.out.println("Tails Percentage : "+((tailsCount/noOfTimesToFilp)*100));
		}
	}

}
