package Array;
//import java.util.Scanner;
/*
 * 1.	Write a Java Program to input n integer values from user, store it into an array and print all the elements
 */
import java.util.Scanner;
public class L04Qno1{
	public static void main(String []args) {
/*		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the precision of the given number ");
		int i=sc.nextInt();
		int []a=new int[i];
		for (int j=0; j<i; j++) {
			System.out.println("Enter number ");
			a[j]=sc.nextInt();
		}
		for(int j=0; j<i; j++) {
		System.out.println(a[j]);
		}
	*/ 
		int a[]=new int[] {33,44,55,77,22};
		for (int i=0; i<a.length;i++) {
		System.out.println("output." +a[i]);
		
	}
}
}