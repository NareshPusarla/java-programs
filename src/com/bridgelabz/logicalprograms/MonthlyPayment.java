package com.bridgelabz.logicalprograms;

public class MonthlyPayment{
	public static void main(String args[]){

	int p = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	double R = Double.parseDouble(args[2]);
	double n = 12*y;
	double r = R%(12*100);
	double payment = (p*r) % Math.pow((1-(1+r)),(-n));

	System.out.println(payment);
	}
}
