package lab02;

import java.util.Scanner;

public class L02Qno15 {
	/*
	 * 15.	Write a program to check whether the 3-digit number input by user is palindrome or not.
Example: 232 is palindrome since the number is same from forward and reverse direction

	 */
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number ");
		int i =sc.nextInt();
		int p=i%10;
		int m=i/10;
		int c=m/10;
		if (c==p) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
		
	}

}
