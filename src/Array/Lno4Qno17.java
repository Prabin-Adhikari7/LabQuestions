package Array;

import java.util.Scanner;

public class Lno4Qno17 {

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
		int [][]transpose=new int[row][col];
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				transpose[i][j]=array[j][i];
			}
		}
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				System.out.print(transpose[i][j]+" ");
		}
		System.out.println(" ");
		
		

}
}
}