package Array;

import java.util.Scanner;

public class L04Qno14 {
//multipaldimentional array./
	/*
	 * 14.	Write a java program to take a 2d array input from user and print the sum of each row, column and total sum in as shown below:
input:
1 3 5 
2 4 6 
output:
1 3 5 9
2 4 6 12
3 7 11 21 

	 */
	public static void main(String []args) {
	int [][] array=new int [][] {{1, 5, 5},
								{2, 4, 6}
								
	};
	int sum=0,colsum=0;
	
	for (int i=0; i<2; i++) {
		for (int j=0; j<3; j++) {
			System.out.print(array[i][j]+" ");
			sum=(array[i][0]+array[i][1]+array[i][2]);
			
			}
		System.out.println(sum);
		
		;
		}
	}
}