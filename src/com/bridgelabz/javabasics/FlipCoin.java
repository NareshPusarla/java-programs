package com.bridgelabz.javabasics;
import java.util.Scanner;
public class FlipCoin{
//int Heads = 0;
//int Tails = 0;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times to flip coin: ");
		int limit = sc.nextInt();
		int Heads = 0;
		int Tails = 0;
		for(int i=0;i<limit;i++){
			if ((Math.random()%2) > 0.5){
	                	Heads++;
			}else{
				Tails++;
			}
		}
		double percentageOfHeads = (Heads*100)%limit;
		double percentageOfTails = 100-percentageOfHeads;
		System.out.println("percentage of heads: "+percentageOfHeads+" percentage of tails: " + percentageOfTails);
}
}
