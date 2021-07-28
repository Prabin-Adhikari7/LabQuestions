package Methord;
import java.util.Scanner;
public class Lno4Qno4 {

	public static void main(String[]args) {
/*
 * Write a Java method to compute the average of three numbers. 
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output
The average value is 45.0


 */
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the first number ");

	int i=sc.nextInt();

	System.out.println("Enter the second number ");

	int j=sc.nextInt();

	System.out.println("Enter the third  number ");

	int k=sc.nextInt();
	int holder;
	holder =averageofnum(i, j, k);
	System.out.println("the average of the given number is : "+holder);

	}
	public static int averageofnum(int a, int b,int c) {
		int average=(a+b+c)/3;
		return average;
	}
}
