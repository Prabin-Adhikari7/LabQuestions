package lab02;

import java.util.Scanner;

public class l02Qno11 {
/*
 * 11.	Declare and initialize three integer variables x, y and z as 15, 2 and 8.
 *  Arrange and print the variables in ascending order.
 */
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter one number ");
	int i=sc.nextInt();
	System.out.println("Enter another number");
	int j=sc.nextInt();
	System.out.println("Enter another number");
	int k=sc.nextInt();
	  
      System.out.println("========aranging the greatest number in ascending order================");
      if (i>j){
          int temp=i;
          i=j;
          j=temp;//swaping
      }
           if(j>k){
              int temp=j;
              j=k;
              k=temp;
      
      }
      if(i>j){
                  int temp=i;
                  i=j;
                  j=temp;//swaping
      }
      System.out.println("The number is arrange in assending order:  " + i + " " + j + " " + k);
	}
}