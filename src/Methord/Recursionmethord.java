package Methord;

public class Recursionmethord {

	public static void main(String[] args) {

		int n=factorial(5);
		System.out.println(n);
	}

	public static int factorial(int a) {
//		base case 
		if(a==1) {
			return 1;
		}
//		recursive part 
		return a*factorial (a-1);
	}
}
