package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int n = sc.nextInt();
		int count = 0;
		if(n==0 || n==1){
			System.out.println("This not prime numbers, so select check for other numbers.");
		}
		for(int i=2;i<n;i++){
			if(n%i==0){
				count++;
				break;
			}
		}
		if(count==0){
			System.out.println(n+" is a prime number");
		}else{
                        System.out.println(n+" not is a prime number");
		}
	}
}
