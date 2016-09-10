/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * The solution to the problem 
 * <b>https://www.hackerrank.com/challenges/kitty-and-katty</b>
 * 
 * @author Pratik Sanglikar
 */
public class KittyAndKatty {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			if (n == 1 || n % 2 == 0) {
				sb.append("Kitty\n");
			} else {
				sb.append("Katty\n");
			}
		}
		System.out.println(sb.toString());
	}
}
