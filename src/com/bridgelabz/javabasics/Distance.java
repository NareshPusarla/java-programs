package com.bridgelabz.javabasics;
import java.util.Scanner;
public class Distance{
	public static void main(String args[]){
		int x = Integer.parseInt("9");
		int y = Integer.parseInt("5");
		double dist = Math.sqrt(x*x + y*y);
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	}
}
