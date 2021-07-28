package lab02;

import java.util.Scanner;

public class L02Qno7 {
/*
 * 7.	Write a program to input the annual income from user and compute the tax according to
 *  the given conditions and display the total tax:
Total Annual Taxable Income	   	Tax Rate
Upto Rs.1,00,000			   No tax
From 1,00,001 to 1,50,000	   10% of the income exceeding Rs.1,00,000
From 1,50,000 to 2,50,000	   Rs.5000 +20% of the income exceeding Rs.1,50,000
Above Rs.2,50,000		   Rs.25,000 +30% of the income exceeding Rs.2,50,000

 */
	public static void main(String[] args) {
		System.out.println("paying tax");
		Scanner sc=new Scanner(System.in);
		int tax= sc.nextInt();
		double extra=0;
		double added=0;
		if(tax<=100000) {
		System.out.println("pay no tax :");
		extra=0;
		added=0;
		}
		else if(tax>=100001 && tax<=150000) {
			extra= (0.1*(int)tax);
		}
		else if(tax>=150001 && tax<=250000) {
			extra=(0.2*(int)tax);
			added=5000;
		}
		else if(tax>=250001) {
			extra=0.3*(int)tax;
		
			
			added=25000;
		}
		double sum= (extra +added);
		System.out.println("total tax: " +sum);
		
	}

	}


