package coreProgram;

import java.util.Scanner;

public class CheckEvenOrOdd {
	/**
	 * This method is created to check whether the number is a even or odd.
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		/**
		 * 1)Taking values from user.
		 */
		Scanner cs = new Scanner(System.in);

		System.out.println("Enter a :");
		int number = cs.nextInt();
		
		/**
		 * 2)checking whether number is a even or odd.
		 */
		if (number % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		cs.close();	
	}
	
}