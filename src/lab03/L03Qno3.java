package lab03;

import java.util.Scanner;

public class L03Qno3 {
/*
 * 3.	Write a program in Java to display n terms of natural numbers and their sum.
 */
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any term of number upto which u want to sum");
		int i=sc.nextInt();
		int sum=0; 
		for (int j=1; j<=i; j++) {
		sum += j;	
		}
		System.out.println(sum);
	}
}
