package com.bridgelabz.javabasics;
import java.util.Scanner;
public class Swap{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		Scanner sc1 =  new Scanner(System.in);
		System.out.println("Enter 2nd number: ");
		int b = sc1.nextInt();
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println(a+" "+b);
	}
}
