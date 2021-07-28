package lab02;

import java.util.Scanner;

/*
 * 	Write a Java program to solve quadratic equations (use if, else if and else). 
 * Hint: The equation is ax2 + bx + c=0, Take a, b, c as input from user. 
 * There are three nature of root of a quadratic equation. imaginary, real and equal, real and unequal.
 *  Write complete code for all possible cases. In case of imaginary number display the roots are
 *   imaginary (you need not calculate the root).
Hint: x1,x2=(-b±√(b^2-4ac))/2a, b2-4ac is called determinant of the root
	if b2<4ac roots are imaginary
	else if b2>4ac roots are real

 */
public class L02Qno21 {
	  public static void main(String[] Strings) {

	        Scanner input = new Scanner(System.in);

	            System.out.print("Input a: ");
	            double a = input.nextDouble();
	            System.out.print("Input b: ");
	            double b = input.nextDouble();
	            System.out.print("Input c: ");
	            double c = input.nextDouble();

	            double result = b * b - 4.0 * a * c;

	            if (result > 0.0) {
	                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
	                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
	                System.out.println("The roots are " + r1 + " and " + r2);
	            } else if (result == 0.0) {
	                double r1 = -b / (2.0 * a);
	                System.out.println("The root is " + r1);
	            } else {
	                System.out.println("The equation has no real roots.");
	            }

	    }
	}