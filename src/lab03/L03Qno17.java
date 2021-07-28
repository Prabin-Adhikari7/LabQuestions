package lab03;
import java.util.Scanner;
public class L03Qno17 {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
/*
 * 17.	Write a program to check whether a number input by user is Armstrong or not.
153=1^3+5^3+3^3
 
     }
 */
		int copy=num;
		int remainder=0 ,sum=0;
		while(copy!=0)
	       {
				remainder=copy%10;
				sum=sum+remainder*remainder*remainder;
				copy=copy/10;}
		System.out.println(sum);
	
	}
	

}
