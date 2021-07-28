package Array;

public class L04Qno13 {
//	1.	Write a Java Program to find the second largest element in an array.
	public static void main(String args[]) {
		System.out.println("the array is   ");
		int []array=new int [] {27,23,34,45,56};
		int temp;
		for (int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");//printing the array
		}
		for (int i=0; i<array.length-1;i++) {
			for(int j=0; j<array.length-i-1;j++) {
				if (array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
				}System.out.println(" ");
				
				
		System.out.println("the second higest number is "+array[3]);
				
		
	}
}
