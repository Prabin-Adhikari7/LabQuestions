package Array;

public class L04Qno31 {

	public static void main(String[] args) {
	
		/*
		  31.	Write a Java Program to sort an array of positive integers of a given array, in the sorted array the value of 
		 
		  the first element should be maximum,
		   second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.   
		 */
		int []array=new int [] {22,23,25,26,27,20,14};
		int i, j,temp=0;
		int n=array.length;
		for( i=0; i<n; i++) {
			for(j=0; j<n-1; j
					++) {
				if (array[j]<array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for( i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
		for ( i=6;i>=0;i--)
			System.out.print(array[i]+" ");
		for(i=0 ;i<n; i++) {
			for( j=0; j<n-1;j++){
				
				array[j+1]=array[n-1-i];
			}
				}	
		//array[i]=array[num]
		//array
		for( i=0; i<n; i++) {
		if(array[i]%2==0) {
		}
		if(array[i]%2!=0) {
			
		}
	}
}
}
