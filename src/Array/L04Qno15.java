package Array;
import java.util.Scanner;
public class L04Qno15 {
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
	int [][]narray=new int [row][col];
	for (int i=0; i<row; i++) {
		for (int j=0; j<col; j++) {
			narray[i][j]=sc.nextInt();
		}
	}
	for (int i=0; i<row; i++) {
		for (int j=0; j<col; j++) {
			System.out.print(narray[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("the sum of the matrix is ");
	int [] [] sum=new int [row][col];
	for (int i=0; i<row; i++) {
		for (int j=0; j<col; j++) {
			sum[i][j]=narray[i][j]+array[i][j];
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	}
	}

}
