package coreProgram;

import java.util.Scanner;

public class PowerOfTwo {
	/**
	 * This method is created to find the power of two.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		int number;
		/**
		 * 1)Taking values from user.
		 */

		System.out.println("Enter Number (N):");
		Scanner cs = new Scanner(System.in);
		number = cs.nextInt();
		/**
		 * 2)Calculating Power of 2.
		 */
		if (number < 31) {
			for (int i = 0; i < number; i++) {
				System.out.println("2 ^ " + i + " " + Math.pow(2, i));
			}
		}

		else {
			System.out.println("Invalid input");
		}
		cs.close();	
	}

	
	}

	 
		
	

