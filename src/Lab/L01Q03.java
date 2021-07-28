package Lab;

public class L01Q03 {
/*
 * \3.	Calculate the output of following expression. Also verify your output using bluej.
a=25,b=23,c=10,d=33
a.	a+b/c*d
b.	c*d/b+a
c.	c%4+d/10
d.	c%(4+d)/10
e.	a<d&&b>c
f.	a==b||c>a&&(a+b)>c
g.	f||t&&t

 */
	public static void main(String []args) {
		int a=25, b=23, c=10,d=33;
		 int result=a+b/c*d;
		 
		System.out.println("output of the program : " +result);
		 System.out.println("ii :"+c*d/b+a);
		 System.out.println(c%4+d/10);
		 System.out.println(c%(4+d)/10);
		 System.out.println(a<d&&b>c);
		 System.out.println(a==b||c>a&&(a+b)>c);
		 
	}
}
