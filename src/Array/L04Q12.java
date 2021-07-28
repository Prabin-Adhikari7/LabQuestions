package Array;

public class L04Q12 {
//	12.	Write a Java Program to find the common elements between two arrays of integers. 
	public static void main(String []args) {
		System.out.println("Finding the common elements in the array");
		int [] arr=new int [] {23,4,5,1,6};
		int []ii=new int [] {44,5,31,55,8};
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<ii.length; j++) {
				if (arr[i]==ii[j]) {
					System.out.println("The common elements of an array is at ["+i+"] index ="+arr[i]);
				}
			}
			
		}
	}

}
