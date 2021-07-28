package Array;

public class Lno4Qno29 {//32 is same

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 29.	Write a Java Program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.   
 */
		int []array=new int [] {0,1,1,1,1,1,0,0,0,1,0};
		int n=array.length;
		for(int i=0; i<n; i++) {
			for (int j=0; j<n-1; j++) {
			if(array[j]>array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
			}
		}for (int i=0; i<n; i++) {
		System.out.print(array[i]+" ");
		}
	}

}
