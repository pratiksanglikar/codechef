/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * The solution for -  
 * <a href="https://www.codechef.com/problems/HEADBOB">
 * Tanu and Head-bob </a>
 * 
 * @author Pratik Sanglikar
 */
public class HEADBOB {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt();
		String line = null;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			scanner.nextInt();
			line = scanner.next();
			if (line.contains("I")) {
				sb.append("INDIAN\n");
			} else if (line.contains("Y")) {
				sb.append("NOT INDIAN\n");
			} else {
				sb.append("NOT SURE\n");
			}
		}
		System.out.println(sb.toString());
	}
}
