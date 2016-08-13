/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * The solution to the problem -
 * <a href="https://www.codechef.com/problems/FLOW016">
 * GCD & LCM </a>
 * 
 * @author Pratik Sanglikar
 */
public class FLOW016 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfTestCases = Integer.parseInt(br.readLine().trim());
		String line;
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int number1, number2, gcd;
		while (numberOfTestCases-- > 0) {
			line = br.readLine();
			st = new StringTokenizer(line, " ");
			number1 = Integer.parseInt(st.nextToken());
			number2 = Integer.parseInt(st.nextToken());
			gcd = gcd(number1, number2);
			sb.append(gcd + " " + lcm(number1, number2, gcd) + "\n");
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	private static long lcm(int number1, int number2, int gcd) {
		return number1 * number2 / gcd;
	}

	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	private static int gcd(int number1, int number2) {
		if (number2 == 0) {
			return number1;
		}
		return gcd(number2, number1 % number2);
	}
}
