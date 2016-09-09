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
public class MISSP {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfTestCases = Integer.parseInt(br.readLine().trim()), n, temp;
		boolean[] array;
		StringBuilder sb = new StringBuilder();
		while (numberOfTestCases-- > 0) {
			n = Integer.parseInt(br.readLine().trim());
			array = new boolean[n + 1];
			for (int i = 1; i <= n; i++) {
				temp = Integer.parseInt(br.readLine().trim());
				array[temp] = !array[temp];
			}
			for (int i = 0; i < array.length; i++) {
				if (array[i]) {
					sb.append(i + "\n");
					break;
				}
			}
		}
		System.out.println(sb.toString());
	}
}