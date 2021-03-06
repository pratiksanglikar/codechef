/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * Solution for the problem - 
 * <a href="https://www.codechef.com/problems/FLOW007">
 * https://www.codechef.com/problems/FLOW007</a>
 * 
 * @author Pratik Sanglikar
 *
 */
public class FLOW002 {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), a, b;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			sb.append((a % b) + "\n");
		}
		System.out.println(sb.toString());
	}
}
