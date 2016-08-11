/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * The Solution to the problem - 
 * <a href="https://www.codechef.com/problems/FLOW005">
 * Smallest Numbers of Notes </a>
 * 
 * @author Pratik Sanglikar
 */
public class FLOW005 {

	private static Scanner scanner = new Scanner(System.in);
	private static int denominations[] = { 1, 2, 5, 10, 50, 100 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), amount = 0, remainingAmount = 0, numberOfNotes = 0;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			numberOfNotes = 0;
			amount = scanner.nextInt();
			remainingAmount = amount;
			for (int i = denominations.length - 1; i >= 0; i--) {
				while (remainingAmount > 0) {
					if (denominations[i] <= remainingAmount) {
						numberOfNotes++;
						remainingAmount -= denominations[i];
					} else {
						break;
					}
				}
			}
			sb.append(numberOfNotes + "\n");
		}
		System.out.println(sb.toString());
	}
}
