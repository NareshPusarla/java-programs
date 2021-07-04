package com.bridgelabz.javabasics; 
import java.util.Scanner; 
public class WindChill{
	public static void main(String args[]){
		double t = Double.parseDouble("50");
		double v = Double.parseDouble("100");
		double w = 35.74+(0.6215*t)+(((0.4275*t)-35.75)*Math.pow(v,0.16));
		System.out.println(w);
	}
}
