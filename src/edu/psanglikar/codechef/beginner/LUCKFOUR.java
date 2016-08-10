/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * solution for <a href=https://www.codechef.com/problems/LUCKFOUR> 
 * https://www.codechef.com/problems/LUCKFOUR</a>
 * @author Pratik Sanglikar
 */
public class LUCKFOUR {

	private static Scanner scanner = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), number, fourCount = 0;
		StringBuilder sb = new StringBuilder();
		while(numberOfTestCases-- > 0){
			fourCount = 0;
			number = scanner.nextInt();
			while(number > 0) {
				if(number % 10 == 4) {
					fourCount++;
				}
				number /= 10;
			}
			sb.append(fourCount + "\n");
		}
		System.out.println(sb.toString());
	}
}
