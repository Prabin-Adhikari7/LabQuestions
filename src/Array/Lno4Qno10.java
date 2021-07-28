package Array;

import java.util.Scanner;

//10.	Write a Java Program to reverse an array of integer values.  
public class Lno4Qno10 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n=sc.nextInt();

		System.out.println("enter the elements of an array");
		int []array=new int [n];
		for (int i=0; i<n; i++) {
//			System.out.println("");
		array[i]=sc.nextInt();
		}
		

		System.out.println("the input is  ");
		for (int i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(".\n the reverse form is ");
		for(int a = array.length - 1; a >= 0; a--) 
	      {  
	         System.out.print(array[a] + " ");  
	      }
		
	}

}
