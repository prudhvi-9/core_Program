package coreProgram;

import java.util.Scanner;

public class HarmonicNumber {
	/**
	 * This method is created to find the haromic value.
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		int number;
		double result = 0;
		/**
		 * 1)Taking values from user.
		 */
		System.out.println("Enter Number :");
		Scanner cs = new Scanner(System.in);
		number = cs.nextInt();
		/**
		 * 2)Calculating the harmonic value..
		 */
		if (number != 0) {
			for (int i = 1; i <= number; i++) {
				result = result + (1.0 / i);
				System.out.println(result);
			}
		}

		else {
			System.out.println("Invalid Input");
		}
		cs.close();	
	}
}
