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
public class AllBinaryStrings {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static int[] array;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		array = new int[n];
		binary(n);
	}

	/**
	 * @param n
	 */
	private static void binary(int n) {
		if(n == 1) {
			printArray();
			return;
		} else {
			array[n-1] = 0;
			binary(n-1);
			array[n-1] = 1;
			binary(n-1);
		}
		return;
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
