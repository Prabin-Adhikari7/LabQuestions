package Methord;

public class L04Qno3 {
	public static void main(String []args) {
		/*
		 * 3.	Write a Java method to find the smallest number among three numbers. 
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:
The smallest value is 25.0

		 */int i=25,j=37,k=29,samal;
		 samal=smallest(i,j,k);
		 System.out.println("the smallest element of an integer is : "+samal);
	}
	public static int smallest(int a,int b,int c) {
	int z;
		if (c<b&&c<a) {
			z=c;
			return z;
	}
		if (a<b&&a<c) {
			z=a;
			return z;
	}if (b<a&&b<c) {
		z=b;
		return z;
}
	return 0;

	
	}

}
