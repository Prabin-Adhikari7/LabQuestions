package lab02;
import java.util.Scanner;
public class L02Qno10 {
/*
 * 10.	Write a program to compute the area of a:
i.	Rectangle (length * breadth)
ii.	Circle ( pii* r2), use standard value for pii
iii.	Square (side * side)
     Display a menu to output the area as per the user’s choice.

 */
	public static void main(String[] args) {
		System.out.println("area of rectrangle");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length");
		int length= sc.nextInt();
		System.out.println("Enter a width");
		int width= sc.nextInt();
		
		int Area_of_rectangle=length*width;

		System.out.println("enter the radius ");
		
		double r=sc.nextDouble();
		
		double circle;
	
		double pi=3.14;
		circle= pi*r*r;
		System.out.println("the area of the circle is "+circle);
		System.out.println("the length of tha square ");
		int l=sc.nextInt();
		int areofsquare=l*l;
		System.out.println("square"+ areofsquare);
	
	}

}
