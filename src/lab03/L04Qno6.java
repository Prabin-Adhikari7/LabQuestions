package lab03;
import java.util.Scanner;
public class L04Qno6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the length of the array");
		int n= sc.nextInt();
		int []newarray=new int [n];
		int position;

		System.out.println("Enter the number you want in an array");
		for(int i=0; i<n; i++) {
			newarray[i]=sc.nextInt();
		}

		System.out.println("The number you entered is : ");	
		for(int i=0; i<n; i++) {
		System.out.println(newarray[i]);	
		}
		System.out.println("Enter the index of the number you want to remove");
		position=sc.nextInt();
		for(int i=position;i<n-1;i++) {
			newarray[i]=newarray[i+1];
			}
		n=n-1;
		System.out.println("after delecting the  array : ");	
		for(int i=0; i<n; i++) {
		System.out.println("array["+i+"] ="+newarray[i]);	
		}
	}

}
