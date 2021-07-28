package Lab;
import java.util.Scanner;
public class L01Qno7 {
	/*
	 * 1.	Write the program to take two numbers from user, swap and display their value.
Sample
input:
a=5
b=8
output
value of a is 8 and b is 5

	 */
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter any two number you want to swap");
		 System.out.println("enter the value of a");
		int a=sc.nextInt();
	
		 System.out.println("enter the value of b:");
			
		int b=sc.nextInt();
		int temp;
		 temp=b;
		  b=a;
		 a=temp;
		 System.out.println(" the value of a:"+a);

		 System.out.println("the value of b:"+b);
	}

}
