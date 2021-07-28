package Array;

public class L04Qno28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		28.	Write a Java Program to find smallest and second smallest elements of a given array.   
		int []array=new int[] {23,55,12,14,17,85};
		int temp=0, i, j;
		int n=array.length;
		for(i=0; i<n; i++) {
			for (j=0; j<n-1; j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					//swapping the position of an array
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for (i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		
		}
		System.out.println("");
		System.out.println(array[0]+" is the smallest number ");

		System.out.println(array[1]+" is the second smallest number ");
	
	}

}
