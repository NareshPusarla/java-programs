package src.com.bridgelabz.javabasics;
import java.util.Scanner;
public class FlipCoin{
	public static void main(String args[]){
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter number of times to flip coin: ");
		int limit = 6;//int limit = sc.nextInt();
		int Heads = 0;
		int Tails = 0;
		for(int i=0;i<limit;i++){
			if (Math.random() > 0.5){
	                	Heads+=1;
			}else{
				Tails+=1;
			}
		}
		double percentageOfHeads = Heads/limit*100;
		double percentageOfTails = Tails/10*100;
		System.out.println("percentage of heads: "+percentageOfHeads+" percentage of tails: " + percentageOfTails);
}
}
