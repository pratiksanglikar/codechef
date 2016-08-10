/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * Solution to the problem - 
 * <a href="https://www.codechef.com/problems/FLOW007"> 
 * https://www.codechef.com/problems/FLOW007</a>
 * 
 * @author Pratik Sanglikar
 *
 */
public class FLOW007 {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), number, reverseNumber = 0;
		StringBuilder sb = new StringBuilder();
		while(numberOfTestCases-- > 0) {
			number = scanner.nextInt();
			reverseNumber = 0;
			while(number > 0) {
				reverseNumber *= 10;
				reverseNumber += number % 10;
				number /= 10;
			}
			sb.append(reverseNumber + "\n");
		}
		System.out.println(sb.toString());
	}
}
