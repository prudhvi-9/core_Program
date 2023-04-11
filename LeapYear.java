package coreProgram;

import java.util.Scanner;

public class LeapYear {
	/**
	 * This method is created to check whether the year is leap year or not.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		/**
		 * 1)Taking values from user.
		 */

		LeapYear leapYear = new LeapYear();
		System.out.println("Enter Year");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		/**
		 * 1)Checking the year is a leap year or not .
		 */
		if (leapYear.checkingLeapYear(year)) {
			System.out.println(year + " is Leap Year");
		} else
			System.out.println(year + " is not Leap Year");

		sc.close();
	}

	public boolean checkingLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			return true;
		else
			return false;

	}

}
