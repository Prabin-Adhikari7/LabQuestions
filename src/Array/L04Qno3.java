package Array;

import java.util.Scanner;
public class L04Qno3{
//	3.	Write a Java Program to test if an array contains a specific value. (Linear Search)
	public static void main(String []ars) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Ente the specific number ");
		int n=sc.nextInt();
		int j,pot;
		int arr[]=new int [] {22,34,55,66};
		for(j=0; j<arr.length; j++) {
			
			System.out.println(arr[j]);
			
			if (n==arr[j]) {
				System.out.println("the number matched");
			}
			else {
				System.out.println("the number did not matched");
					
			}
			
			
			}
		
	}
}