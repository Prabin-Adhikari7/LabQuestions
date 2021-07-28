package lab02;

import java.util.Scanner;
/*
 * 
 */
public class L02Qno27 {
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		String str=i%5==0 && i%2==0?"it falls in divided by 5 and is even":"it falls in not divided by 5 and even";
		System.out.println(str);
	}

}
