package com.bridgelabz.javabasics;

public class MultiDimensional{
	public static void main(String args[]){
		int [][] array = new int[2][2];

		array[0][0] = 5;
      array[0][1] = 15;
      array[1][0] = 20;
      array[1][1] = 25;

		for (int i=0;i<2;i++){
			for(int j=0; j<2;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
