/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * The solution to the problem -
 * <a href="https://www.codechef.com/problems/FSQRT">
 * FSQRT </a>
 * 
 * @author Pratik Sanglikar
 */
public class FSQRT {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##");
		int numberOfTestCases = scanner.nextInt(), number;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			number = scanner.nextInt();
			sb.append(df.format(Math.sqrt(number)) + "\n");
		}
		System.out.println(sb.toString());
	}
}
