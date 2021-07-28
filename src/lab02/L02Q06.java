package lab02;

import java.util.Scanner;

public class L02Q06 {
/*
 * 6.	Write a program to convert the case of character input by user.
 *  For example, if the user inputs character ‘x’, output must be ‘X’
 */
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any alphabet (upper case or lower):");
		char input_char= sc.next().charAt(0);
		if (input_char>=65 && input_char<=90) {
			char r=(char) (input_char+32);
			System.out.println("it is small now :" +r);
			
		}
		if (input_char>=97 && input_char<=122) {
			char m=(char) (input_char-32);
			System.out.println("it is capital now :" +m);
		}
		
	}

}
