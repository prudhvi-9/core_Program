package coreProgram;

import java.util.*;

public class FlipCoin {
	/**
	 * This method is created to Flip the Coin and print percentage of Heads and
	 * Tails.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double heads, tails;
		int times, count1 = 0, count2 = 0;
		/**
		 * 1)Taking values from user.
		 */

		System.out.print("enter no. of times you want to flip the coin: ");
		Scanner cs = new Scanner(System.in);
		times = cs.nextInt();
		
		/**
		 * 2)Calculation to flip the coins .
		 */

		for (int i = 0; i < times; i++) {
			double random = Math.random() * 1;
			if (random > 0.5) {
				count1++;
			}
			else {
				count2++;
			}
		}

		heads = count1 / (double) times * 100;
		tails = count2 / (double) times * 100;
		System.out.println("Percentage of heads: " + heads + "%");
		System.out.println("Percentage of tails: " + tails + "%");
		cs.close();
	}

}