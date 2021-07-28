package Array;
import java.util.Scanner;
public class L04Qn07 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
//		7.	Write a Java Program to insert an element (specific position) into an array. 
		int n=sc.nextInt();
		int po, i,addnumber ;
		int array[]=new int [n+1];
		for(i=0; i<n; i++) {
//			System.out.println("");
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the position where you want to enter the input");
		po=sc.nextInt();
		System.out.println("Enter the input for the position");
		
		addnumber=sc.nextInt();
		for( i=n-1; i>=po; i--) {
			
			array[i+1]=array[i];
		}
		
		System.out.println("value of an array is");
		for( i=0; i<n; i++) {
			System.out.println("array["+i+"] =="+array[i]);
		
		}
		}
	}
