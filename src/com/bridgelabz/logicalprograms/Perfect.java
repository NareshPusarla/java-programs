package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class Perfect{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int n = sc.nextInt();
		int a=0;
		for(int i=1;i<n;i++){
			if(n%i == 0){
				a=a+i;
			}
		}
		if(n == a){
		System.out.println(n+" is a perfect number.");
		}else{
      System.out.println(n+" is a not perfect number.");
		}
	}
}
