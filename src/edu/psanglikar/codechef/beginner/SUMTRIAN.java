/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * <pre>
 * Let's consider a triangle of numbers in which 
 * a number appears in the first line, 
 * two numbers appear in the second line, 
 * three in the third line, etc. 
 * Develop a program which will compute the largest 
 * of the sums of numbers that appear on the paths 
 * starting from the top towards the base, so that:
 * 
 * on each path the next number is located on the row below, 
 * more precisely either directly below or 
 * below and one place to the right;
 * the number of rows is strictly positive, but less than 100
 * all numbers are positive integers between O and 99.
 * 
 * Input
 * In the first line integer n - the number of test 
 * cases (equal to about 1000). 
 * Then n test cases follow. 
 * Each test case starts with the number of lines 
 * which is followed by their content.
 * 
 * Output
 * For each test case write the determined value 
 * in a separate line.
 * 
 * Example
 * Input:
 * 2
 * 3
 * 1
 * 2 1
 * 1 2 3
 * 4 
 * 1 
 * 1 2 
 * 4 1 2
 * 2 3 1 1 
 * 
 * Output:
 * 5
 * 9
 * </pre>
 * 
 * @author Pratik Sanglikar
 */
public class SUMTRIAN {

	private static Scanner scanner = new Scanner(System.in);
	private static int matrix[][];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int numberOfTestCases = scanner.nextInt();
		while (numberOfTestCases-- > 0) {
			int numberOfLines = scanner.nextInt();
			sb.append(getMaxSum(numberOfLines) + "\n");
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param numberOfLines
	 * @return
	 */
	private static int getMaxSum(int numberOfLines) {
		matrix = new int[numberOfLines][];
		for (int i = 0; i < numberOfLines; i++) {
			matrix[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		return getMaxSum(0, 0);
	}

	private static int getMaxSum(int i, int j) {
		if (i >= matrix.length) {
			return 0;
		}
		if (j + 1 >= matrix[i].length + 1) {
			return 0;
		}
		int downSum = getMaxSum(i + 1, j);
		int downRightSum = getMaxSum(i + 1, j + 1);
		if (downSum > downRightSum) {
			return matrix[i][j] + downSum;
		}
		return matrix[i][j] + downRightSum;
	}
}
