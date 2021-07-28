package lab03;

import java.util.Scanner;
/*
 * 14.	Write a Java program that reads a positive integer and count the number of 
 * digits the number (less than ten billion) has. 10,000,000,000
Test Data
Input an integer number less than ten billion: 125463
Expected Output : 6

 */
public class L03Qno14 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("input a intger less than ten billon");
		
		long p = n.nextLong();
		int count = 0;
	
		while (p != 0) {
			p /= 10;
			count++;
		}
		System.out.println("the number of digits is   " +count);
	}

}
