/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution to the problem <a href="https://www.codechef.com/problems/FLOW017">
 * Second Largest</a>
 * 
 * @author Pratik Sanglikar
 */
public class FLOW017 {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt();
		int[] tempArray = new int[3];
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			tempArray[0] = scanner.nextInt();
			tempArray[1] = scanner.nextInt();
			tempArray[2] = scanner.nextInt();
			Arrays.sort(tempArray);
			sb.append(tempArray[1] + "\n");
		}
		System.out.println(sb.toString());
	}
}
