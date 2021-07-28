package lab02;

import java.util.Scanner;

public class L02Qno16 {
/*
 * 16.	Write a program to check it a number input by user is Armstrong number or not
Example: 153 is Armstrong number since 1^3 +5^3 +3^3= 153

 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter a number :");
		int i=sc.nextInt();
		int p=i%10;
		int g=i/10;
		int m=g%10;
		int c=g/10;
		int cube = (int) (Math.pow(p, 3)+Math.pow(m, 3)+Math.pow(c, 3));
		System.out.println("cube :"+cube);
		if (i==cube ) {
			System.out.println("it is a  armstrong number");
		}
		else {
			System.out.println("it is not a arrmstrong number");
		}
		
	}

}
