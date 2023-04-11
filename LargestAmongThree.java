package coreProgram;

import java.util.Scanner;

public class LargestAmongThree {
	/**
	 * This method is created to find the largest among the three numbers.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int a, b, c, largest, temp;
		/**
		 * 1)Taking values from user.
		 */
		Scanner sc = new Scanner(System.in);
		
		
	    System.out.println("Enter the first number:");
		a = sc.nextInt();
		
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		
		System.out.println("Enter the third number:");
		c = sc.nextInt();
		
		/**
		 * 2)comparing a and b and storing the largest number in a temp variable.
		 */
		temp = a > b ? a : b;
		
		/**
		 * 3)comparing the temp variable with c and storing the result in the variable.
		 */
		largest = c > temp ? c : temp;
		
		
		System.out.println("The largest number is: " + largest);
sc.close();	
	}
}
