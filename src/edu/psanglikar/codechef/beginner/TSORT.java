/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <pre>
 * Given the list of numbers, you are to sort them in non decreasing order.
 * Input
 * t – the number of numbers in list, then t lines follow [t ≤ 10^6]. 
 * Each line contains one integer: N [0 ≤ N ≤ 10^6]
 * 
 * Output
 * Output given numbers in non decreasing order.
 * Example
 * 
 * Input:
 * 5
 * 5
 * 3
 * 6
 * 7
 * 1
 * 
 * Output:
 * 1
 * 3
 * 5
 * 6
 * 7
 * </pre>
 * 
 * @author Pratik Sanglikar
 *
 */
public class TSORT {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int lengthOfArray = 0;
		lengthOfArray = scanner.nextInt();
		int[] array = readInput(lengthOfArray);
		 Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]).append("\n");
		}
		System.out.print(sb.toString());
	}

	

	private static int[] readInput(int lengthOfArray) {
		int[] array = new int[lengthOfArray];
		int i = 0;
		while (lengthOfArray-- > 0) {
			array[i++] = scanner.nextInt();
		}
		return array;
	}

}
