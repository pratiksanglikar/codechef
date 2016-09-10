/**
 * 
 */
package edu.pratiksanglikar.karumanchi.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Pratik Sanglikar
 *
 */
public class KAryStrings {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static int[] array;

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine().trim());
		int k = Integer.parseInt(br.readLine().trim());
		array = new int[n];
		kAryString(n, k);
	}

	/**
	 * @param n
	 * @param k
	 */
	private static void kAryString(int n, int k) {
		if (n < 1) {
			printArray();
		} else {
			for (int j = 0; j < k; j++) {
				array[n - 1] = j;
				kAryString(n - 1, k);
			}
		}

	}

	/**
	 * 
	 */
	private static void printArray() {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}
}
