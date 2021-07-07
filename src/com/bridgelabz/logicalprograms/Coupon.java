package com.bridgelabz.logicalprograms;
public class Coupon{
	public static int getCoupon(int n){
		return (int) (Math.random()*n);
	}

	public static int collect(int n){
		int [] random = new int[n];
		int count = 0;
		int distinct = 0;

		while(distinct<n){
			int value = getCoupon(n);
			count++;
			for(int i = 0;i<n;i++){
				if(value != random[i]){
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int count = collect(n);
		System.out.println(count);
	}
}

