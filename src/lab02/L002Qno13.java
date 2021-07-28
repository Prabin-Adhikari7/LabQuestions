package lab02;

import java.util.Scanner;

public class L002Qno13 {
//13.	Write a program to print the reverse of a 3-digit number input by user.
//	Example: if the number input by user is 325, then the output should be 523.
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 3 digit number");
	int i= sc.nextInt();
	int p=i%10;
	int m=i/10;
	int j=m%10;
	int f=m/10;
	//int m=p%10;
	//int l=m%10;
	System.out.print(" "+p);
	System.out.println(" "+j);
	System.out.println(" "+f);
	//System.out.println(+p+" "+m+" "+l+" ");
	}

}
