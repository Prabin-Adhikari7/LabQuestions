package lab02;

import java.util.Scanner;
/*
 * 18.	Write a Java program that input a number from the user and checks if the number
 *  is between 1-7 or not. If the number is not between 1-7, your program should make 
 *  the number fall in the range, then displays the name of the weekday.
Sample Output:
input: 4 Output: Wednesday
input 10 Output: Tuesday

 */
public class L02Qno18 {
	public static void main(String[]args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter a number");
    int i = sc.nextInt();
    	
    	switch (i) {
    	  case 1:
    	    System.out.println("Monday");
    	    break;
    	  case 2:
    	    System.out.println("Tuesday");
    	    break;
    	  case 3:
    	    System.out.println("Wednesday");
    	    break;
    	  case 4:
    	    System.out.println("Thursday");
    	    break;
    	  case 5:
    	    System.out.println("Friday");
    	    break;
    	  case 6:
    	    System.out.println("Saturday");
    	    break;
    	  case 7:
      	    System.out.println("Sunday");
      	    break;
    }
	}    
}
