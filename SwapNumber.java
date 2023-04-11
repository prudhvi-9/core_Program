package coreProgram;

import java.util.Scanner;

public class SwapNumber {
	/**
	 * This method is created to swap the given numbers.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		/**
		 * 1)Taking values from user.
		 */
		Scanner cs = new Scanner(System.in);
		
		System.out.println("Enter a :");
		int a = cs.nextInt();

		System.out.println("Enter b :");
		int b = cs.nextInt();

		System.out.println("Before swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("After swapping:");
		System.out.println("a = " + b);
		System.out.println("b = " + a);
		cs.close();	
	}
}
