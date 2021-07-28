
package lab02;

import java.util.Scanner;

/*
 * 26.	Write a program that checks if the number input by user is divisible by 5 or not
 *  and display message accordingly using ternary operator
 */
public class L02Qno26 {
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		String str=i%5==0?"it is divided by 5":"it is not divided by 5";
		System.out.println(str);
	}

}
