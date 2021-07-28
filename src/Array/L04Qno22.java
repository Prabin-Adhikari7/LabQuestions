package Array;

public class L04Qno22 {

	public static void main(String[] args) {
//		22.	Write a Java Program to compute the average value of an array of integers except the largest and smallest values. 

		int [] array=new int [] {23,254,25,226,626,77};
		int min,max,sum=0,average;
		min=max=array[0];
		for(int i=0;i<array.length; i++) {
		
				if (max<array[i]) {
					max=array[i];
				}

				if (min>array[i]) {
					min=array[i];
				}
			}
//		System.out.println("the largest value is"+max);
//		System.out.println("the largest value is"+min);
			for (int i=0;i<array.length; i++) {
				 sum+=array[i];
				
			}
			int app=array.length-2;
			average=(sum-max-min)/app;

			System.out.println("average is : "+average);
	}
				
	}


