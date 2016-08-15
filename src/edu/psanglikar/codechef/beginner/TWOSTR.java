/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * The solution to the problem -
 * <a href="https://www.codechef.com/problems/TWOSTR"> Chef and the Wildcard
 * Matching </a>
 *
 * @author Pratik Sanglikar
 */
public class TWOSTR {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfTestCases = Integer.parseInt(br.readLine().trim());
		char[] array1, array2;
		boolean isPossible;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			array1 = br.readLine().trim().toCharArray();
			array2 = br.readLine().trim().toCharArray();
			isPossible = true;
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					if (array1[i] != '?' && array2[i] != '?') {
						sb.append("No\n");
						isPossible = false;
						break;
					}
				}
			}
			if (isPossible)
				sb.append("Yes\n");
		}
		System.out.println(sb.toString());
	}
}