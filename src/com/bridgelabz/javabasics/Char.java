package com.bridgelabz.javabasics;
import java.util.Scanner;
public class Char{
	public static void main(String args[]){
		char [][] s = new char[2][2];

		s[0][0] = 'o';
      s[0][1] = 'x';
      s[1][0] = 'y';
      s[1][1] = 'z';

		for (int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
	}
}
