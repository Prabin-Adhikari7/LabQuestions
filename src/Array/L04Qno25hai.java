package Array;

public class L04Qno25hai {

	public static void main(String[] args) {
/*
 * 25.	Write a Java Program to remove the duplicate elements of a given array and return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the Program should return 4 as the new length of the array.  

 */
	 int []a=new int [] {20, 20, 30, 40, 50, 50, 50};
	 int n=a.length;
	
		 for(int j=0; j<n-1; j++) {
			 if(a[j]!=a[j+1]) {
				 System.out.print(a[j]+" ");
				 }
			 }
		 if(a[n-2]!=a[0]) {
				
			 System.out.print(a[n-2]+" ");
		 }
		 
	 }
	}


