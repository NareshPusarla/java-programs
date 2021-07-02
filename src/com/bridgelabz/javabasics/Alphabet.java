package com.bridgelabz.javabasics;
import java.util.Scanner;
public class Alphabet{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character to check: ");
		char letter = sc.next().charAt(0);
		if(letter == 'a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
			System.out.println(letter+" is a vowel.");
		}else if(letter == 'A' || letter=='E' || letter=='O' || letter=='I' || letter=='U'){
         System.out.println(letter+" is a vowel.");
		}else{
			System.out.println(letter+" is a consonant.");
			}
	}
}
