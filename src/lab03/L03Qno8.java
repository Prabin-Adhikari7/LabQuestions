package lab03;

import java.util.Scanner;

public class L03Qno8 {
/*
 * 8.	Write a program in Java to display the pattern like right angle triangle with a number. Test Data
Input number of rows : 10
Expected Output :
1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910

 * 
 */
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int n=sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}
