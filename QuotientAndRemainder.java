package coreProgram;

import java.util.Scanner;

public class QuotientAndRemainder {
	/**
	 * This method is created to find the quotient and remainder of a number.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * 1)Taking values from user.
		 */
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter Number1 :");
		int num1 = cs.nextInt();
		System.out.println("Enter Number2 :");
		int num2 = cs.nextInt();
		/**
		 * 2)Calculating Quotient and Remainder.
		 */
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
		cs.close();	
	}
}
