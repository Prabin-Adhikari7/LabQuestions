package lab02;

import java.util.Scanner;

public class L02Qno12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//12.	Write a program to find whether a given character is a digit or a letter. Test your program.
		Scanner sc= new Scanner (System.in);
		char gvninp=sc.next().charAt(0);
		
		if ((gvninp>='a'&& gvninp<='z')||(gvninp>='A'&& gvninp<='Z')) {
			System.out.println("it is alphabets");
		}
		if (gvninp>='0' && gvninp<='9') {
			System.out.println("it is an integers");
		}
		else {
			System.out.println("it is symbol");
		}
}
}
