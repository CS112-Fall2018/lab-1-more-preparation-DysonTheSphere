/* 
1. The biggest 12 bit signed integer is 2^11, or 2047 as one of the bits represents
a positive or negative integer. The smallest would be -2048.

2. 
	i. int
	ii. float
	iii. double
	iv. String
	v. boolean
	vi. double
*/

public class Arithmetic
{
	public static void main(String[] args)
	{
		int a = 7;
		int b = 13;

		float x = 8;
		float y = 14;

		/*Multiplication*/
		System.out.println(a * b);
		System.out.println(a * x);
		System.out.println(a * y);

		System.out.println(b * x);
		System.out.println(b * y);

		System.out.println(x * y);

		/*Division (when dividing integers, an integer is returned, not a double with decimal points) */
		System.out.println(a / b);
		System.out.println(a / x);
		System.out.println(a / y);

		System.out.println(b / a);
		System.out.println(b / x);
		System.out.println(b / y);

		System.out.println(x / a);
		System.out.println(x / b);
		System.out.println(x / y);

		System.out.println(y / a);
		System.out.println(y / b);
		System.out.println(y / x);

	}
}