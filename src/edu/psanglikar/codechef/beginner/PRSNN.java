/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Pratik Sanglikar
 *
 */
public class PRSNN {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int n, k, maxLen = 0;
		n = Integer.parseInt(br.readLine().trim());
		k = Integer.parseInt(br.readLine().trim());
		for (int i = 1; i <= n; i++) {
			if(maxLen + i != k) {
				maxLen += i;
			}
		}
		System.out.println(maxLen);
	}
}
