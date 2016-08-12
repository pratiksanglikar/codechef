/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * The solution to the problem -
 * <a href="https://www.codechef.com/problems/GDOG">
 * The greedy puppy </a>
 * 
 * @author Pratik Sanglikar
 */
public class GDOG {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), numberOfCoins = 0, maxPeople = 0, maxCoins = 0, tempCoins = 0;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			numberOfCoins = scanner.nextInt();
			maxPeople = scanner.nextInt();
			maxCoins = tempCoins = 0;
			for (int i = 1; i <= maxPeople; i++) {
				tempCoins = numberOfCoins % i;
				if (tempCoins > maxCoins) {
					maxCoins = tempCoins;
				}
			}
			sb.append(maxCoins + "\n");
		}
		System.out.println(sb.toString());
	}
}