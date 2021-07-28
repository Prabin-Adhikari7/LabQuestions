package lab03;

import java.util.Scanner;

public class L03Qno15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number for factorial");
			int i=sc.nextInt();
			int total=1,nu;
			for (int j=1; j<=i; j++) {
				total*=j;
				
			}
			System.out.println(total);
	}

}
