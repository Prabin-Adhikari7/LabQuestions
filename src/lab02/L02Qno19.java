package lab02;

import java.util.Scanner;

/*
 * 19.	A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.

 */
public class L02Qno19 {
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
	}

}
