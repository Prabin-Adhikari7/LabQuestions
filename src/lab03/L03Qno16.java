package lab03;

import java.util.Scanner;

public class L03Qno16 {
//16.	Write a program to check whether a number input by user is prime or not.
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		boolean flag= false;
		 for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}
