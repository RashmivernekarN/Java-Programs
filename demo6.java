// Java Program to Illustrate Unary NOT Operator

// Importing required classes
import java.io.*;

// Main class
class demo6 {

	// Main driver method
	public static void main(String[] args)
	{
		// Initializing variables
		boolean cond = true;
		int a = 10, b = 1;

		// Displaying values stored in above variables
		System.out.println("Cond is: " + cond);
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);

		// Displaying values stored in above variables
		// after applying unary NOT operator
		System.out.println("Now cond is: " + !cond);
		System.out.println("!(a < b) = " + !(a < b));
		System.out.println("!(a > b) = " + !(a > b));
	}
}