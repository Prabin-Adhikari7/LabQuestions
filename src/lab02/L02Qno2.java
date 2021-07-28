package lab02;

import java.util.Scanner;

public class L02Qno2 {
/*
 * 2.	Write a program that checks if the number input by user
 *  is odd or even and display message accordingly
 */
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter any number ");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("it is even");
		}
		else { 
			System.out.println("it is odd");
		}
	}

}
