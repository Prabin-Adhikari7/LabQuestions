package Methord;

public class Fib {

	public static void main(String[] args) {
		int a=fibona(5);
		System.out.println(a);
	}
	public static int fibona(int n) {
		/*
		 * 0,1,1,2,3,5,8,13...
		 * t(n)=t(n-1)+t(n-2);
		 * base case
		 * t(1)=0;
		 * t(2)=1;
		 * 
		 */
		if (n==1) {
			return 0;
		}
		if (n==2) {
			return 1;
		}
		return fibona(n-1)+fibona(n-2);
				
	}

}
