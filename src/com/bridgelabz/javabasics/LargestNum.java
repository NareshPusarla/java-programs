package com.bridgelabz.javabasics;
import java.util.Scanner;
public class LargestNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int b = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int c = sc2.nextInt();

		if(a>b && a>c){
			System.out.println(a+" is largest number.");
		}else if(b>a && b>c){
			System.out.println(b+" is largest number.");
		}else{
			System.out.println(c+" is largest number.");
		}
	}
}
