package Array;
import java.util.Scanner;
//9.	Write a Java Program to get the difference between the largest and smallest values in an array
//of integers. The length of the array must be 1 and above.
public class L04Qno9 {
	public static void main(String []args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the length of the array must be greater than 1 ");
	int n=sc.nextInt();
	int max,min,diffrence ;
	int array[]=new int [n];
	System.out.println("Enter the number for array: ");
	
	for (int i=0; i<n; i++) {
		array[i]=sc.nextInt();
		
				}
	System.out.println("the number of an array are as follow");
	for (int i=0; i<n; i++) {
		System.out.println(array[i]);
				}
	max=min=array[0];
	for(int i=0; i<n; i++) {
		if (max<array[i]) {
			max=array[i];
		}

		if (min>array[i]) {
			min=array[i];
		}
		
	}
	System.out.println("the largest number is : " +max);
	System.out.println("the Smallest number is : " +min);
	
	diffrence =max-min;
	System.out.println("diffrence between the lagrgest and smallest number is "+diffrence);

	}

}
