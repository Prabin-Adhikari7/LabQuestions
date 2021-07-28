package Methord;

import java.util.Scanner;
import java.util.ArrayList;
public class L03Qno22 {
/*
 * 22.	Write the definition of different methods as utility function for array as
a.	a method to add item into array at last
b.	a method to add item into array at position specified by user
c.	a method to remove an item from last of array
d.	a method to remove an item for the position specified by user
e.	a method to remove an item specified by user, return false if the item is not found.
f.	a method to return the size of an array.
g.	a method to display all the items in array.
h.	a method to return the item from index specified by user.
i.	a method to return the index of item specified by user, return -1 if the item is not found.
j.	a method to check if array is empty.
k.	a method to check if array is full.
l.	a method to replace occurrence of old item by new item, both specified by user.

 */
	public static void main(String[] args) { 
		Scanner sc=new Scanner (System.in);
//		a method to add item into array at last
//		b.	a method to add item into array at position specified by user
	ArrayList myList=new ArrayList();
	myList.add(1);
	myList.add(3);
	myList.add(5);
	myList.add(7);
	myList.add(9);
	System.out.println(myList);
	myList.add(3,18);
	System.out.println(myList);
	System.out.println("Enter the position you want to add new number at");
	int i=sc.nextInt();
	System.out.println("Enter the element you want to add ");
	int j=sc.nextInt();
	myList.add(i,j);
	System.out.println(myList);
	//Qn03&Qno4
	System.out.println("Enter the position you want to remove new number at");
	int o=sc.nextInt();
	myList.remove(o);
	System.out.println(myList);
	//a method to remove an item specified by user, return false if the item is not found.
//	System.out.println("Enter the remove a specific elemenr");
//	int specificelement=sc.nextInt();
	
	}
		
	}


