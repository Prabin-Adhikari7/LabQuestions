package lab02;

import java.util.Scanner;

public class L02Qno14 {
	/*
	 * 14.	Write a program to find the sum of 3-digit number input by user.
Example: if the sum of 234 is 2+3+4=9.

	 */
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int i= sc.nextInt();
		int p= i%10;
		int q=i/10;
		int m= q%10;
		int o=q/10;
		System.out.println(p+m+o);
		
		
	}

}
