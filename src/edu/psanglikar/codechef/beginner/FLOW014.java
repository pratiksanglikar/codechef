/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * The solution to the problem
 * <a href="https://www.codechef.com/problems/FLOW014">
 * Grade the Steel </a>
 * 
 * @author Pratik Sanglikar
 */
public class FLOW014 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfTestCases = Integer.parseInt(br.readLine().trim());
		double hardness, carbonContent, tensileStregth;
		boolean condition1, condition2, condition3;
		StringBuilder sb = new StringBuilder();
		String line = null;
		StringTokenizer st;
		while (numberOfTestCases-- > 0) {
			condition1 = condition2 = condition3 = false;
			line = br.readLine();
			st = new StringTokenizer(line, " ");
			hardness = Double.parseDouble(st.nextToken().trim());
			carbonContent = Double.parseDouble(st.nextToken().trim());
			tensileStregth = Double.parseDouble(st.nextToken().trim());
			if (hardness > 50)
				condition1 = true;
			if (carbonContent < 0.7)
				condition2 = true;
			if (tensileStregth > 5600)
				condition3 = true;
			if (condition1 && condition2 && condition3)
				sb.append("10\n");
			else if (condition1 && condition2 && !condition3)
				sb.append("9\n");
			else if (!condition1 && condition2 && condition3)
				sb.append("8\n");
			else if (condition1 && !condition2 && condition3)
				sb.append("7\n");
			else if (condition1 || condition2 || condition3)
				sb.append("6\n");
			else if (!condition1 && !condition2 && !condition3)
				sb.append("5\n");
		}
		System.out.println(sb.toString());
	}
}
