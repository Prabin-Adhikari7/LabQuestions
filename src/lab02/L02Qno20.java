package lab02;

import java.util.Scanner;

public class L02Qno20 {
/*
 * 20.	Modify the above question to allow student to sit if 
 * he/she has medical cause. Ask user if he/she has medical 
 * cause or not ( 'Y' or 'N' ) and print accordingly.
 */
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter no of class held ");
		int i=sc.nextInt();
		System.out.println("Enter the number of class attended  ");
		int j=sc.nextInt();
		System.out.println("no of class held "+i);
		System.out.println("no of class attended "+j);
		 double pca=(double)j/i*100; 
		System.out.println("percentage of class attended "+pca);
		if(pca>80) {
			System.out.println("you are allowed to sit in exam");
		}
		else {
			System.out.println("you are not allowed to sit in exam hall");
		}
		System.out.println("enter y if you had medical condition and n for you don't have any");
		char med=sc.next().charAt(0);
		switch(med) {
		case('y'):{
			System.out.println("please contact us at @sunway.mail.com");
		}
		case('n'):{
			System.out.println("please pay us  visit. ");
			
		}
	}
	}

}
