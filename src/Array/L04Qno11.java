package Array;

import java.util.Scanner;

public class L04Qno11 {
//	11.	Write a Java Program to find the duplicate values of an array of integer values
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n= sc.nextInt();
		int []ar=new int [n];
		for (int i=0; i<n; i++) {
//			System.out.println(a);
			ar[i]=sc.nextInt();
			
		}System.out.println("the value of an array are");
		for (int i=0; i<n; i++) {
			System.out.println(ar[i]);
			
		}
		System.out.println(" the duplicate value is");
		
		// the duplicate value is 
		int []j=new int [n];
		for (int i=0; i<n; i++) {
			j[i]=ar[i];
			System.out.println(j[i]);
		}
		
		
	}

}
