package com.bridgelabz.javabasics;
import java.util.Scanner;
public class LeapYear{
public static void main(String args[]){
	Scanner scanner =  new Scanner(System.in);
	System.out.println("Enter the year to check: ");
	int year = scanner.nextInt();
	if (year%4 == 0){
		System.out.println("Leap Year: " + year);
	}else{
		System.out.println("Leap Year: " + year);
	}
}
}
