/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * The solution to the problem -
 * <a href="https://www.codechef.com/problems/FLOW013">
 * Valid Triangles </a>
 * 
 * @author Pratik Sanglikar
 *
 */
public class FLOW013 {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), a = 0, b = 0, c = 0;
		StringBuilder sb = new StringBuilder();
		while(numberOfTestCases-- > 0) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			if(a < 40 || b < 40 || c < 40) {
				sb.append("NO\n");
			} else if(a + b + c == 180) {
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb.toString());
	}
}
