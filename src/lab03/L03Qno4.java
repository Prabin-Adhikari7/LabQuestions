package lab03;

import java.util.Scanner;

public class L03Qno4 {

	public static void main(String[] args) {
//4.	Write a program in Java to input 5 numbers from keyboard and find their sum and average.

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements you want to sum");
		int n=sc.nextInt();
		int sum=0;
		double avg;
		for(int i=1; i<=n; i++) {
			System.out.println("enter a number");
			int j=sc.nextInt();
			sum+=j;
			
		}
		System.out.println("sum"+sum);
		avg=sum/n;
		System.out.println("avg : "+avg);
		
		
	}

}
