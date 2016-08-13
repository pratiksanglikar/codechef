/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * @author Pratik Sanglikar
 *
 */
public class FLOW011 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfTestCases = Integer.parseInt(br.readLine().trim()), basicSalary;
		StringBuilder sb = new StringBuilder();
		DecimalFormat df = new DecimalFormat("##.#");
		while (numberOfTestCases-- > 0) {
			basicSalary = Integer.parseInt(br.readLine().trim());
			if (basicSalary < 1500) {
				sb.append(basicSalary * 2 + "\n");
			} else {
				sb.append(df.format(basicSalary * 1.98 + 500) + "\n");
			}
		}
		System.out.println(sb.toString());
	}
}
