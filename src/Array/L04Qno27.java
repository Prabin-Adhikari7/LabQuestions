package Array;

public class L04Qno27 {
//		27.	Write a Java Program to print all the LEADERS in the array.   
	public static void main(String[]args) {
		System.out.println("pointing the leader");
		int []a=new int [] {2,17,8,6};
		boolean flag=true;
		
		for (int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length-1; j++) {
			
				if (a[i]>a[j]) {
				flag=false;
				
				}
				else {
				flag=true;	
				}
				}
			if(flag!=true)
			{
				System.out.println("the number is the leader"+a[i]);
			}
			flag=false;
		}
	}
}
