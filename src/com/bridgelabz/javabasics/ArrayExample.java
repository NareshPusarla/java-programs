package com.bridgelabz.javabasics;
import java.util.Scanner;
public class ArrayExample{
	public static void main(String args[]){
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element: ");
		for(int i=0; i<array.length;i++){
			System.out.println("Enter array["+i+"] index value :");
			array[i] = sc.nextInt();
		}

		//array = {5,10,15,20,25};

		for(int i=0; i<array.length; i++){
			System.out.println(array[i]+",");
		}
	}
}
