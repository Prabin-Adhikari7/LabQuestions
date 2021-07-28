package Lab;

import java.util.Scanner;

/*
 * 	Write a java program for:
	input the sides of rectangle and outputs the area and perimeter of rectangle
	inputs three sides of triangle and calculates its perimeter and area.
 Area= (s(s-a)(s-b)(s-c))1/2, s=(a+b+c)/2
	

 */
public class L01Q04 {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the length of rectangle ");
		double length=sc.nextDouble();
		System.out.println("Enter the width of rectangle ");
		double width=sc.nextDouble();
		double perimeter=2*(length+width);
		System.out.println("The perimeter of rectangle is: "+perimeter);
		double area= length*width;
		System.out.println("The area of rectangle is: "+area);
		System.out.println("Enter the three sides of triangles ");
		double a=sc.nextInt();
		double  b=sc.nextInt();
		double c=sc.nextInt();
		double sum=(a+b+c)/2;
		
	System.out.println("perimeter of rectangle : "+sum);
	double area_of_triangle =(sum*(sum-a)*(sum-b)*(sum-c))/2;
	System.out.println("area of rectangle : " +area_of_triangle);
	/*inputs temperature in Fahrenheit and outputs into Celsius.
	c=(f-32)/9*5 
	*/
	System.out.println("Enter the temprature in fahrenheit");
	double fhrit=sc.nextDouble();
	double celsius=(fhrit-32)*5/9;
	System.out.println(celsius);
	
	}
}
