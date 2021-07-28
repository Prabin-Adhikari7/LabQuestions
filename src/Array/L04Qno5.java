package Array;
import java.util.Scanner;
public class L04Qno5 {
//	5.	Write a Java Program to remove a specific element from an array.  
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of length of array");
		int n=sc.nextInt();
		int i,p;
		int array[]=new int[n];
		for ( i=0; i<array.length; i++) {
			array[i]=sc.nextInt();
		}
//		for(i=0; i<n; i++) {
//			System.out.println(array[i]);
//		}
		System.out.println("Enter the position of array you want to delet ");
		p=sc.nextInt();
		for( i=p; i<n-1; i++) {
			array[i]=array[i+1];
			}
		n=n-1;
		System.out.println("\nOn deleting new array we get is\n");
	     for(i=0;i<n;i++) 
	     {
	         System.out.println("array["+i+"] = "+array[i]);
	     }
	}

}
