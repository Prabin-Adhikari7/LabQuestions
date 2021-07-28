package Array;

import java.util.Scanner;

public class L04Qno16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//taking row and column
			System.out.println("Enter the  row of a matrix");
		int row=sc.nextInt();
		System.out.println("Enter the  column of a matrix");
		int col=sc.nextInt();
		System.out.println("Enter the elements of row and column");
		int [][]array=new int [row][col];
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter the elments of second array");
		System.out.println("Enter the  row of a matrix");
		int r=sc.nextInt();
		System.out.println("Enter the  column of a matrix");
		int c=sc.nextInt();
		System.out.println("Enter the elements of row and column");

		int [][]narray=new int [r][c];
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				narray[i][j]=sc.nextInt();
			}
		}
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.print(narray[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("the multiplication of the matrix is ");
		int [] [] mul=new int [row][c];
		for (int i=0; i<row; i++) {
			for (int j=0; j<c; j++) {
				if(col==r) {
				mul[i][j]=array[i][j]*narray[i][j]+array[i][1]*narray[1][j];
				System.out.print(mul[i][j]+" ");
			
			}
				
	}
			
}
		if(col!=r) {
			System.out.println("unknown");
			}
}
}