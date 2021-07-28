package Array;

public class L04Qno26 {
	public static void main(String[]args) {
		/*
		 * 26.	Write a Java Program to find the sum of the two elements of a given array which is equal to a given integer.
Sample array: [1,2,4,5,6]
Target value: 6.  

		 */

		System.out.println("array");
		int sum=6;
		int array[]=new int [] {1,2,4,5,6};
		for (int i=0; i<array.length;i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]+array[j]==sum) {
					System.out.println("the number are "+array[i]+"and "+array[j]);
				}
			}
		}
	}

}
