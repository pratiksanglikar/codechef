/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * Solution to the problem - 
 * <a href="https://www.codechef.com/problems/FLOW008">
 * Servant</a>
 * 
 * @author Pratik Sanglikar
 *
 */
public class FLOW008 {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), n;
		StringBuilder sb = new StringBuilder();
		while(numberOfTestCases-- > 0) {
			n = scanner.nextInt();
			if(n < 10) {
				sb.append("What an obedient servant you are!\n");
			} else {
				sb.append(-1 + "\n");
			}
		}
		System.out.println(sb.toString());
	}
}
