package lab02;

import java.util.Scanner;

public class L02Qno31 {
/*
 * 31.	Write a program to input the three sides of triangle and check if the sides of 
 * triangle are valid or not. If the triangle is valid, print its type
 *  (scalene, isosceles, equilateral)
 */
	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
				System.out.println("Enter the sides of a triangle ");
				int i=sc.nextInt();
				int j=sc.nextInt();
				int k=sc.nextInt();
				if (i+j>k&&j+k>i&&k+i>j) {
					System.out.println("it is valid");
				}
			if(i==j && j==k) {
				System.out.println("it is equileteral");
			}
			if(i==j || j==k || k==i) {
				System.out.println("it is isosceles");
			}
			if(i!=j && j!=k) {
				System.out.println("it is scalene");
			}
	}

}
