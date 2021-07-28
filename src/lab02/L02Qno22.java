package lab02;

import java.util.Scanner;

public class L02Qno22 {
/*
 * 22.	Write a Java program that reads in two floating-point numbers 
 * and tests whether they are the same up to three decimal places. 
Test Data
Input floating-point number: 1.256355
Input floating-point another number: 1.25621312
Expected Output :
They are different

 */
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a floting number");
		double a=sc.nextDouble();
		System.out.println("Enter other floting number");
		
		double b=sc.nextDouble();
		int p=(int) a*1000;
		int q=(int) b*1000;
		if(p==q) {
		System.out.println("they are same");
		}
		else {
			System.out.println("they are diffrent");
		}
	
	}
	
}
