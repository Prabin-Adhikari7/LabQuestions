package Lab;

public class L01Q05 {
	/*
	 * 5.	Calculate the output of following expression and test it in bluej.
x=5,y=23,z=14,m=11
a.	x++ +y-- *z
b.	a=y++ / ++m * --z + x++
c.	b=a+ z-- % ++m
d.	c=a++ + ++a -b++
e.	a=b++ + --c + c-- + ++b

	 */
	public static void main(String[]args){
		
		System.out.println("output of the expression");
		int x=5,y=23,z=14,m=11;
		System.out.println("i :"+(x++ +y-- *z));
		int a=y++ / ++m * --z + x++;
		System.out.println("y++ / ++m * --z + x++ : "+a);
		int b=a+ z-- % ++m;
				System.out.println("b=a+ z-- % ++m :"+b);
				
		int c=a++ + ++a -b++;
		System.out.println("a++ + ++a -b++:"+c);
		 a=b++ + --c + c-- + ++b;
		System.out.println("b++ + --c + c-- + ++b : "+a);
		
		
		
	}
}
