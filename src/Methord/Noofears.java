package Methord;

public class Noofears {
	public static void main (String[]args) {
		int ear= noofear(5);
		System.out.println("the total no of ears of a dog is : "+ear);
	}
	public static int noofear(int i) {
		/*
		 * base case
		 * i=0;
		 * recursive part
		 * 
		 * noofear(i-1);
		 * 
		 */
		if(i==0) {
			return 0;
		}
		if(i%2==0) {
			return 3+noofear (i-1);
		}

		else  {
			return 2+noofear (i-1);
		}
	}
	}



