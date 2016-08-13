/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * The solution to the problem - 
 * <a hreaf="https://www.codechef.com/problems/FLOW010"> The BattleShip </a>
 * 
 * @author Pratik Sanglikar
 */
public class FLOW010 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfTestCases = Integer.parseInt(br.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(numberOfTestCases-- > 0) {
			char ch = (char) br.read();
			while(Character.isWhitespace(ch)) {
				ch = (char) br.read();
			}
			switch (ch) {
				case 'b':
				case 'B':
					sb.append("BattleShip\n");
					break;
				case 'c':
				case 'C':
					sb.append("Cruiser\n");
					break;
				case 'd':
				case 'D':
					sb.append("Destroyer\n");
					break;
				case 'f':
				case 'F':
					sb.append("Frigate\n");
					break;
				default:
					break;
			}
		}
		System.out.println(sb.toString());
	}
}