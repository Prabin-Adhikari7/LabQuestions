package Array;
//8.	Write a Java Program to find the maximum and minimum value of an array
public class L04Qn08 {
	public static void main(String []args) {
		System.out.println("the element of an array is ");
		int []array= new int [] {344,21,454,35,77};
		int max,min;
		for (int i=0; i<=array.length;i++) {
			System.out.println(array[i]);
			 min=max=array[0];
			    for(i=1; i<array.length; i++)
			    {
			         if(min>array[i])
					  min=array[i];   
					   if(max<array[i])
					    max=array[i];       
			    }
			    System.out.println("the maximum value of the array is : "+max);

			    System.out.println("the minimum value of the array is : "+min);
		}
	}

}
