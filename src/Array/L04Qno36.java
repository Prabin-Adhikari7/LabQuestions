package Array;

public class L04Qno36 {

	public static void main(String[] args) {
/*
 * 36.	Write a Java Program to replace each element of the array with product of every other element in a given array of integers.   
Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7}
nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
Output:
Array with product of every other element:
[5040, 2520, 1680, 1260, 1008, 840, 720]
Array with product of every other element:
[5040, 0, 0, 0, 0, 0, 0, 0]
//

 */
		int [] nums1=new int [] { 1, 2, 3, 4, 5, 6, 7};
		int n=nums1.length;
		int i,j,temp=1;
		for(i=0; i<n;i++) {
			for( j=n-1; j>=0; j--) {

				if(nums1[j]!=nums1[i]) {
				temp*=nums1[j];
				
			}
					}
			nums1[i]=temp;
			
		}
		for(i=0; i<n; i++) {
		System.out.print(nums1[i]+" ");
	}

}
}