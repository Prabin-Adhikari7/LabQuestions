package lab02;

import java.util.Scanner;
/*
 * 24.	¬Write a program that takes two numbers as input from users and print the largest 
 * among them using ternary operator.
 */
public class L02Qno24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of i number ");
		int i=sc.nextInt();
		System.out.println("Enter value of j number ");
		int j=sc.nextInt();
		String str= i>j?"i is  largest":"j is largest";
		System.out.print(str);
	}

}
