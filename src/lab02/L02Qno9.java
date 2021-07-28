package lab02;
import java.util.Scanner;
public class L02Qno9 {
/*
 * 9.	An electronics shop has announced the following seasonal discounts on the purchase of
 *  certain items.
Purchase Amount in Rs.	Discount on Laptops	Discount on Desktop PC
0 - 25,000      	0.0%	5.0%
25,001 – 57,000	    5.0%	7.5%
57,001 – 1,00,000	7.5%	10.0%
More than 1,00,000	10.0%	15.0%
Write a program based on the above criteria, to the purchase amount and the type of purchase,
 L for laptop and D for desktop by a customer. Compute and print the net amount to be
  paid by a customer.
Formula:
discount = (discount rate/100) * amount of purchase
net amount = amount of purchase – discount


 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter l for laptop and d for desktop");
		
		char w= sc.next().charAt(0) ;
		System.out.println("Enter amount u will like to invest ");
		double amtofpur=sc.nextDouble();
				
				double discount=0,netamt=0;
		if (w =='l') {
			if (amtofpur>=0 && amtofpur<=25000) {
				discount= 0;
			}
			else if(amtofpur>=25001 && amtofpur<=57000){
				discount=5;
			}
			else if(amtofpur>=57001 && amtofpur<=100000){
				discount=7.5;
			}
			else if(amtofpur>=100001){
				discount=10;
			}
			}
		else if (w=='d'){
			if (amtofpur>=0 && amtofpur<=25000) {
				discount= 5;
			}
			else if(amtofpur>=25001 && amtofpur<=57000){
				discount=7.5;
			}
			else if(amtofpur>=57001 && amtofpur<=100000){
				discount=10;
			}
			else if(amtofpur>=100001){
				discount=15;
			}
		}
		else {
			System.out.println("some thing went wrong ");
		}

		double discounts = (discount/100)*amtofpur;				
		System.out.println("discount :"+discounts);
		netamt=amtofpur-discounts;
		System.out.println("net amount : "+netamt);
	}

}
