package Array;

public class L04Qno20 {

	public static void main(String[] args) {
//		20.	Write a Java Program to test the equality of two arrays.
		int []array=new int [] {23,44,5,67,7};
		int []array2=new int [] {23,44,5,67,7};
		int i,count=0;

		if (array.length==array2.length) {
			System.out.println("the size of the array is same ");
		}
		for (i=0; i<array.length; i++) {
			if (array[i]==array2[i]) {
				count=count+1;
			}
			
		}
		System.out.println("there are almst "+count+" same.");
	}

}
