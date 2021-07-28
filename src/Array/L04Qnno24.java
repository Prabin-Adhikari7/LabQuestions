package Array;

public class L04Qnno24 {

	public static void main(String[] args) {
//		24.	Write a Java Program to check if an array of integers contains two specified elements 65 and 77. 
		int []array=new int [] {22,23,63,4,556,32,31,65};
		int specific_element=65,asp=77;
		for (int i=0; i<array.length; i++) {
			
			if(array[i]==specific_element) {
				System.out.println("the array contain 65");
			}
			else if(array[i]==asp) {
				System.out.println("the array contain 77");
			}
			else {
				System.out.println("the array doesn't contain any given specific elements");
			}
		}
		
	}

}
