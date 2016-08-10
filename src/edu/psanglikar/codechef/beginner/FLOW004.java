/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * The solution to the problem  - 
 * <a href="https://www.codechef.com/problems/FLOW004">
 * https://www.codechef.com/problems/FLOW004</a>
 * 
 * @author Pratik Sanglikar
 */
public class FLOW004 {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt();
		int number, firstDigit, lastDigit;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			number = scanner.nextInt();
			firstDigit = 0;
			lastDigit = number % 10;
			while (number >= 10) {
				firstDigit = number / 10;
				number /= 10;
			}
			sb.append((firstDigit+lastDigit) + "\n");
		}
		System.out.println(sb.toString());
	}
}
