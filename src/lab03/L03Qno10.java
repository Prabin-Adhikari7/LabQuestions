package lab03;

import java.util.Scanner;

public class L03Qno10 {
/*
 * 10.	Write a program in Java to make such a pattern like 
 * \right angle triangle with number increased by 1. The pattern like : 
1
2 3
4 5 6
7 8 9 10

 */
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int n=sc.nextInt();
		int k=1;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(k++);
		
			}
			System.out.println(" ");
		}
	}
}