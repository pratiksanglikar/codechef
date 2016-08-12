/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * The solution to the problem - 
 * <a href="https://www.codechef.com/problems/PRB01">
 * Primalirity Test </a>
 * 
 * @author Pratik Sanglikar
 *
 */
public class PRB01 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int numberOfTestCases = scanner.nextInt(), number = 0;
		while (numberOfTestCases-- > 0) {
			number = scanner.nextInt();
			sb.append(isPrime(number));
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param number
	 * @return
	 */
	private static String isPrime(int number) {
		if (number <= 1) {
			return "no\n";
		} else if (number <= 3) {
			return "yes\n";
		} else if (number % 2 == 0 || number % 3 == 0) {
			return "no\n";
		} else {
			for (int i = 5; i * i <= number; i += 6) {
				if (number % i == 0 || number % (i + 2) == 0) {
					return "no\n";
				}
			}
			return "yes\n";
		}
	}
}