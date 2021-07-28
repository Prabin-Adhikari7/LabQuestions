package lab02;
import java.util.Scanner;
public class L02Qn05 {
	/*
	 * 5.	Write a program to test if the character input by user is upper case 
	 * or lower case or other character
	 */
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any alphabet (upper case or lower):");
		char input_char= sc.next().charAt(0);
		if (input_char>=65 && input_char<=90) {
			System.out.println("it is capital");
			
		}
		if (input_char>=97 && input_char<=122) {
			System.out.println("it is small letter");
		}
		
	}

}
