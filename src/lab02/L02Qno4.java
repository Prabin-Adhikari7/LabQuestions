package lab02;

import java.util.Scanner;

public class L02Qno4 {
/*
 * 4.	Write a program that checks if the number input by user is both even and divisible by 5 or not
 *  and display message accordingly
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number ");
		int gvn_num=sc.nextInt();
		if (gvn_num%2==0) {
			System.out.print("it is even");
		if (gvn_num%5==0) {
			System.out.print(" and it is divible by five ");}
			else {
				System.out.print(" and it is not divible by five ");
			}
		}
		else {
			System.out.print("it is not even");
			if(gvn_num%5==0){
				System.out.print(" but divisible by 5");
			}
			else {
				System.out.print("and not divisible by 5");
			}
		
		}
		}
		
	}