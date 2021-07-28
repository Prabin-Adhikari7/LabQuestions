package lab03;

import java.util.Scanner;

public class L03Qn7 {
	/*
	 * 7.	Write a program in Java to display the n terms of odd natural number and their sum. 
Test Data
Input number of terms is: 5
Expected Output :
The odd numbers are :                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9                                                                                
The Sum of odd Natural Number upto 5 terms is: 25

	 */
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Input number of terms is : ");
		int n=sc.nextInt();
		int count=0,sum=0;
		for (int i=1; i<=20; i++) {
		
			if (i%2!=0) {
				
			System.out.println(i);
			count++;
			sum+=i;
			
			}
			if(count>=n) {
			break;
		}
			
			
		
}
		System.out.println("sum of the natural number is "+sum);
}
}