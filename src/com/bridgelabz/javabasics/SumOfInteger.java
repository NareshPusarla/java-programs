package com.bridgelabz.javabasics;
import java.util.Scanner;
public class SumOfInteger{
	int[] intArray = new int[10];
	int result=0;
   public int code(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array element: ");
		for(int i=0; i<intArray.length; i++){
			System.out.println("Enter array["+i+"] index value: ");
			intArray[i] = sc.nextInt();
		}
		for(int i=0;i<intArray.length;i++){
			for (int j=0;j<intArray.length-1;j++){
				for(int k=0;k<intArray.length-2;k++){
					if(intArray[i]+intArray[j]+intArray[k] == 0){
						result = intArray[i]+intArray[j]+intArray[k];
						//return result;
					}
				}
			}
		}
		return result;
	}
}
