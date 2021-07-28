package Array;
import java.util.Scanner;
public class L04Qno2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of item you want to add");
		int n=sc.nextInt();
		int add=0;
		int singlearray[]=new int [n];
		for(int i=0; i<n; i++) {
			System.out.println("enter the value ");
			singlearray[i]=sc.nextInt();
			
		}
		for (int i=0; i<n; i++) {
			add+=singlearray[i]; 
				}
		System.out.println("the sum of given number is "+add);
		
	}

}
