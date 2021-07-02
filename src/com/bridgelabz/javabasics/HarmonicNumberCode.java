package com.bridgelabz.javabasics;
public class HarmonicNumberCode{
	int a =1;
	int b = 1/2;
	int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int N = sc.nextInt();
	public int code(){
		for(int i=3;i<N;i++){
			c = 1/i;
			int ans = a+b;
			a = b;
			b = c;
			return ans;
		}
	}
}
