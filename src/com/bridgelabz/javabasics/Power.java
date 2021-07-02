package com.bridgelabz.javabasics;
import java.util.Scanner;
	public class Power{
	public static void main(String args[]){
		int a = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the power");
		int b = sc.nextInt();
		for(int i=0;i<b;i++){
			System.out.println("2^"+b+"="+Math.pow(a,i));
		}
	}
}
