package com.bridgelabz.javabasics;
import java.util.Scanner;
public class Quadratic{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

double delta = b*b-4*a*c;
double root1x = (-b+Math.sqrt(delta))/(2*a);
double root2x = (-b-Math.sqrt(delta))/(2*a);
System.out.println(root1x+" "+root2x);
}
}
