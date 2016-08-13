/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * The solution to the problem 
 * <a href="https://www.codechef.com/problems/CHOPRT">
 * Chef and Operators </a>
 * 
 * @author Pratik Sanglikar
 */
public class CHOPRT {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int numberOfTestCases = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		int number1, number2;
		while (numberOfTestCases-- > 0) {
			number1 = scanner.nextInt();
			number2 = scanner.nextInt();
			if (number1 == number2) {
				sb.append("=\n");
			} else if (number1 < number2) {
				sb.append("<\n");
			} else {
				sb.append(">\n");
			}
		}
		System.out.println(sb.toString());
	}
}