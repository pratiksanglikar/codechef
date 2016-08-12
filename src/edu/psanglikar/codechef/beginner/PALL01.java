/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * The solution to the problem - 
 * <a href="https://www.codechef.com/problems/PALL01">
 * The block game </a>
 * 
 * @author Pratik Sanglikar
 */
public class PALL01 {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), n;
		StringBuilder sb = new StringBuilder();
		char[] stringRep = null;
		while (numberOfTestCases-- > 0) {
			n = scanner.nextInt();
			stringRep = Integer.toString(n).toCharArray();
			sb.append(isPallindrome(stringRep));
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param stringRep
	 * @return
	 */
	private static String isPallindrome(char[] stringRep) {
		for (int i = 0; i < (stringRep.length - 1) / 2; i++) {
			if (stringRep[i] != stringRep[stringRep.length - 1 - i]) {
				return "losses\n";
			}
		}
		return "wins\n";
	}
}
