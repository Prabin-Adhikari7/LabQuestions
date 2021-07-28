package Array;

import java.util.Scanner;

/*
 * 37.	Write a Java Program to find maximum difference between two elements in a given array 
 * of integers such that smaller element appears before larger element.   
Example:
Input :
nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 }
Output:
The maximum difference between two elements of the said array elements
10
*/
public class Qno37 {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);//calling Scanner class
		System.out.println("Enter the length of an array");
		int temp=0;
		int length=sc.nextInt();//length of an array
		int []nums=new int [length];
		for(int i=0; i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}

		System.out.print("the original array ::");
		for(int i=0; i<nums.length;i++) {
			System.out.print(" "+nums[i]);
		}
		for(int i=0; i<nums.length;i++) {
			for(int j=0; j<nums.length-1;j++) {
//				System.out.println(nums);
				if(nums[j]>nums[j+1]) {
				temp=nums[j];
				nums[j]=nums[j+1];
				nums[j+1]=temp;
				}
		}
	}
		System.out.println(" ");
		System.out.print("the shorted array ::");
		for(int i=0; i<nums.length;i++) {
			System.out.print(" "+nums[i]);
		}

		int l=nums.length;
		int diff=nums[l-1]-nums[0];
		System.out.println("\n"
				+ " the length of the array was:"+l);

		System.out.println("The maximum difference between two elements of the said array elements:"+diff);
}
}