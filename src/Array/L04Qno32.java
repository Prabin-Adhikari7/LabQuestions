package Array;

public class L04Qno32 {

	public static void main(String[] args) {
		/*
		 * 32.	Write a Java Program to separate even and odd numbers of a given array of integers.
		 *  Put all even numbers first, and then odd numbers
		 */
		int []a=new int [] {23,24,25,6,63,778,32,665};
		int n= a.length;
		int i,j,temp=0;
		for( i=0; i<n; i++) {
			for(j=0; j<n-1; j++) {
		
				if(a[j]%2==0) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
			}
		}
		}
		for(i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		for(i=n-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}

	}
}