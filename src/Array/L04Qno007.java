package Array;
import java.util.Scanner;
public class L04Qno007 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=4;
		int po,element;
		System.out.println("Enter the array no");
		int []array=new int [n+1];
		for (int i=0; i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.print("output: ");
		for (int i=0; i<n;i++) {
			System.out.print(
					+array[i]+" ");
		}
		System.out.println(" ");
		
		System.out.println(" Enter the index u want to add number ");
		po=sc.nextInt();

		System.out.println("Enter the element in index u want to add number ");
		element=sc.nextInt();
		for (int i=n-1; i>=po; i--) {
			array[i+1]=array[i];
		
		}
		array[po]=element;
		for (int i=0; i<n+1;i++) {
			System.out.println(array[i]);
		}
	}

}
