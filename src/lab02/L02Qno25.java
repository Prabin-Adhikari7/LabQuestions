package lab02;

import java.util.Scanner;

public final class L02Qno25 {
/*\25.	Write a program that checks if the number input by user is odd or even and display
 *  message accordingly using ternary operator
 * 
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i= sc.nextInt();
		String Str=i%2==0? "it is even":"it is odd";
		System.out.println(Str);
		
	}

}
