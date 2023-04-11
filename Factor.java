package coreProgram;

import java.util.Scanner;

public class Factor {
	/**
	 * This method is created to find the prime factor.
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		/**
		 * 1)Taking values from user.
		 */
		System.out.println("Enter Number :");
		Scanner cs = new Scanner(System.in);
		int number = cs.nextInt();
		/**
		 * 2)Calcultion to find the prime factor.
		 */
		for (int i = 1; i * i <= number; i++) {
			if (number % i == 0)

				System.out.println("Prime factor of " + number + " is :" + i);
		}
		cs.close();	
	}
}
