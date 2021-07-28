package lab02;

import java.util.Scanner;
/*
 * 28.	Write a program to check whether the year input by user in leap year or 
 * not using ternary operator.
29.	¬
 */
public class L02Qno28 {
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();

		String str=i%4==0 && i%100!=0?"it is a leap year":"it is not a loop year";
		System.out.println(str);
	}

}

