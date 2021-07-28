package Array;

import java.lang.reflect.Array;

public class L04Qno23 {

	public static void main(String[] args) {
		boolean flag=false;
//		23.	Write a Java Program to check if an array of integers without 0 and -1. 
		int []i=new int [] {23,4,5,6,8,9,-1};
		for (int j=0; j<i.length; j++) {
			
			if (i[j]==-1  || i[j]==0) {
			flag=true;	
			}

		}
		if (flag==true) {
			System.out.println("The array contain 0 or -1");
		}

		if (flag==false) {
			System.out.println("The array  doesn't contain 0 or -1");
		}
	}

}
