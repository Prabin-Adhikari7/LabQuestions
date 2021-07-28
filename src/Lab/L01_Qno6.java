package Lab;
import java.util.Scanner;
public class L01_Qno6 {
	/*
	 * 6.	Write a program to input inches and display the output in following format.
input: 66
output: 5 ft 6 inches

	 */
	
	public static void main(String[]args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length in inches");
		double a= sc.nextDouble();
		//conversion of inches into ft and inches
		int  ft=(int)a/12;
		double pn=a/12;
		double b=pn-ft;
		
//		System.out.println(b);
		
		System.out.println(ft+"ft"+b+"inches");
	
		
	}

}
