/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * <pre>
 * You're given an integer N. Write a program to calculate the 
 * sum of all the digits of N.
 * 
 * Input
 * The first line contains an integer T, total number of testcases. 
 * Then follow T lines, each line contains an integer N.
 * 
 * Output
 * Calculate the sum of digits of N.
 * 
 * Constraints
 * 1 ≤ T ≤ 1000
 * 1 ≤ N ≤ 100000
 * 
 * Example
 * 
 * Input
 * 3 
 * 12345
 * 31203
 * 2123
 *
 * Output
 * 15
 * 9
 * 8
 * </pre>
 * @author Pratik Sanglikar
 */
public class FLOW006 {
	
	private static Scanner scanner  = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt();
		int number, sum = 0;
		StringBuilder sb = new StringBuilder();
		while(numberOfTestCases-- > 0) {
			number = scanner.nextInt();
			sum = 0;
			while(number > 0) {
				sum += number % 10;
				number /= 10;
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb.toString());
	}
}