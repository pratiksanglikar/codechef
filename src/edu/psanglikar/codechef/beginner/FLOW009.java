/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

/**
 * The solution to the problem -
 * <a href="https://www.codechef.com/problems/FLOW009">
 * Total Expenses </a>
 * 
 * @author Pratik Sanglikar
 *
 */
public class FLOW009 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfItems = Integer.parseInt(br.readLine().trim()), quantity, price;
		double sum = 0;
		StringTokenizer st;
		String line;
		DecimalFormat df = new DecimalFormat("##.000000");
		StringBuilder sb = new StringBuilder();
		while(numberOfItems-- > 0) {
			line = br.readLine();
			st = new StringTokenizer(line, " ");
			quantity = Integer.parseInt(st.nextToken());
			price = Integer.parseInt(st.nextToken());
			sum = price * quantity;
			if(quantity > 1000) {
				sum *= 0.9;
			}
			sb.append(df.format(sum) + "\n");
		}
		System.out.println(sb.toString());
	}
}
