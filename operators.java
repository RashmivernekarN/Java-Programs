// Java program to illustrate
// bitwise operators

public class operators {
	public static void main(String[] args)
	{
		// Initial values
		int a = 5;
		int b = 7;

		// bitwise and
		// 0101 & 0111=0101 = 5
		System.out.println("a&b = " + (a & b));

		// bitwise or
		// 0101 | 0111=0111 = 7
		System.out.println("a|b = " + (a | b));

		// bitwise xor
		// 0101 ^ 0111=0010 = 2
		System.out.println("a^b = " + (a ^ b));

		// bitwise not
		// ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
		// will give 2's complement (32 bit) of 5 = -6
		System.out.println("~a = " + ~a);

		// can also be combined with
		// assignment operator to provide shorthand
		// assignment
		// a=a&b
		a &= b;
		System.out.println("a= " + a);
	}
}