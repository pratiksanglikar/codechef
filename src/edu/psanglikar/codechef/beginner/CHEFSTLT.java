/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * The solution to the problem 
 * <a href="https://www.codechef.com/problems/CHEFSTLT">
 * Chef and Two Strings </a>
 * 
 * @author Pratik Sanglikar
 */
public class CHEFSTLT {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfTestCases = Integer.parseInt(br.readLine().trim()), minDiff, maxDiff;
		char[] s1, s2;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			minDiff = maxDiff = 0;
			s1 = br.readLine().trim().toCharArray();
			s2 = br.readLine().trim().toCharArray();
			for (int i = 0; i < s1.length; i++) {
				if (s1[i] == '?' || s2[i] == '?') {
					maxDiff++;
				} else if (s1[i] != s2[i]) {
					minDiff++;
					maxDiff++;
				}
			}
			sb.append(minDiff + " " + maxDiff + "\n");
		}
		System.out.println(sb.toString());
	}
}
