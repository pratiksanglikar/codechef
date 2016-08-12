/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * The solution to the problem - 
 * <a href="https://www.codechef.com/problems/TRISQ">
 * Fit squares in triangle </a>
 * 
 * @author Pratik Sanglikar
 *
 */
public class TRISQ {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), base, squares;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			squares = 0;
			base = scanner.nextInt();
			if (base % 2 > 0) {
				base -= 3;
			} else {
				base -= 2;
			}
			for (int i = base; i >= 2; i-=2) {
				squares += i/2;
			}
			sb.append(squares + "\n");
		}
		System.out.println(sb.toString());
	}
}
