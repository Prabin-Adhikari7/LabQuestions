package lab02;
import java.util.Scanner;
public class L02Q03 {
/*
 * 3.	Write a program that checks if the number input by user is divisible by 5
 *  or not and display message accordingly
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number ");
		int gvn_num=sc.nextInt();
		if (gvn_num%5==0) {
			System.out.print("It is divisibel by 5");
			
		}
		else {
			System.out.println("it is not divisible by 5");
		}
		

	}

}
