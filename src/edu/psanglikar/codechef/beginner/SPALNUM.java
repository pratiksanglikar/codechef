/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * The solution to the problem - 
 * <a href="https://www.codechef.com/problems/SPALNUM">
 * Sum of pallindrome numbers </a>
 * 
 * @author Pratik Sanglikar
 */
public class SPALNUM {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfTestCases = Integer.parseInt(br.readLine().trim()), min, max;
		long sum;
		StringBuilder sb = new StringBuilder();
		String line = null;
		StringTokenizer st = null;
		while (numberOfTestCases-- > 0) {
			sum = 0;
			line = br.readLine();
			st = new StringTokenizer(line, " ");
			min = Integer.parseInt(st.nextToken().trim());
			max = Integer.parseInt(st.nextToken().trim());
			for (int i = min; i <= max; i++) {
				if (isPallindrome(i)) {
					sum += i;
				}
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param i
	 * @return
	 */
	private static boolean isPallindrome(int num) {
		char[] charRep = Integer.toString(num).toCharArray();
		for (int i = 0; i < charRep.length / 2; i++) {
			if (charRep[i] != charRep[charRep.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}
