package coreProgram;

import java.util.*;

public class CheckVowelsOrConsonant {
	/**
	 * This method is created to check whether a letter is  vowel or consonant.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 1)Taking values from user.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char ch = sc.next().charAt(0);
		/**
		 * 2)Switch Case.
		 */

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is a vowel");
			break;
		default:
			System.out.println(ch + " is a consonant");
		}
		sc.close();	
	}

}