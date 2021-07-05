package com.bridgelabz.logicalprograms;
import com.bridgelabz.logicalprograms.dayOfWeek;
public class dayOfWeekTest{
	public static void main(String args[]){
		String m = String.parseString(args[0]);
		String d = String.parseString(args[1]);
		int y = Integer.parseInt(args[2]);
		dayOfWeek dow = new dayOfWeek();
		System.out.println(dow.date());
	}
}
