/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * The solution to the problem -
 * <a href= "https://www.codechef.com/problems/SMPAIR"> The Smallest Pair </a>
 * 
 * @author Pratik Sanglikar
 */
public class SMPAIR {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), n, array[];
		StringBuilder sb = new StringBuilder();

		while (numberOfTestCases-- > 0) {
			n = scanner.nextInt();
			array = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = scanner.nextInt();
			}
			sb.append(getSmallestSum(array) + "\n");
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param array
	 * @return
	 */
	private static int getSmallestSum(int[] array) {
		int min = 99999999, smallestSum = 99999999;
		for (int i = array.length - 1; i >= 0; i--) {
			smallestSum = Math.min(smallestSum, array[i] + min);
			min = Math.min(min, array[i]);
		}
		return smallestSum;
	}
}
