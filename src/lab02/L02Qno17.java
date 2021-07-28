package lab02;

import java.util.Scanner;

public class L02Qno17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		if(i<0) {
			int j= (-1)*i;
			System.out.println("output: "+j);
			
		}
		else if(i>0) {
			System.out.println("output: "+i);
			
		}
		else {
			System.out.println("it is good u have bugs");
		}
	}

}
