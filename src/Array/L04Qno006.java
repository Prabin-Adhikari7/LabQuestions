package Array;

import java.util.Scanner;

public class L04Qno006 {
//6.	Write a Java Program to  copy an array by iterating the array.
	public static void main(String []args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the length of an array");
		int n=sc.nextInt();
		int []array=new int [n];
		for (int i=0; i<n; i++){
			array[i]=sc.nextInt();
		}
		System.out.println("this is the array you have inputed ");
		for (int i=0; i<n; i++){
		System.out.println(array[i]);
		}
		//coping the array

		System.out.println("this is the copied array : ");
		int []pp=new int [n];
		for(int i=0; i<pp.length; i++) {
			pp[i]=array[i];
			System.out.println(pp[i]);
		}
		}
}