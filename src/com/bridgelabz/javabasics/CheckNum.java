package com.bridgelabz.javabasics;
import java.util.Scanner;
public class CheckNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
			if(num%2==0){
				System.out.println(num+" is a Even number");
			}else{
				System.out.println(num+" is an odd number");
			}
	}
}
