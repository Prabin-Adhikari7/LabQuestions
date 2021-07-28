package Array;
public class L04Qbo19 {
	public static void main(String[]args) {
//		19.	Write a Java Program to find all pairs of elements in an array whose sum is equal to a specified number. 
		
		System.out.println("array");
		int sum=7;
		int array[]=new int [] {1,2,3,4,5};
		for (int i=0; i<array.length;i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]+array[j]==sum) {
					System.out.println("the number are "+array[i]+"and "+array[j]);
				}
			}
		}
	}
	
}
