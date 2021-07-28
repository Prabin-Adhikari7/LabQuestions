package lab02;
import java.util.Scanner;
public class L02Qno8 {
/*
 * 8.	Write a program to check whether the year input by user in leap year or not.
 */
	public static void main(String[]args) {
		System.out.println("Enter a year that u want to test ");
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		if(i%4==0 && i%100!=0) {
			System.out.println("it is leap year");
		}
		else {
			System.out.println("it is not a leap year");
		}
	}
}
