/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * <pre>
 * Shivam is the youngest programmer 
 * in the world, he is just 12 years old. 
 * Shivam is learning programming and 
 * today he is writing his first program.
 * 
 * Program is very simple, Given two integers 
 * A and B, write a program to add these 
 * two numbers. 
 * 
 * <b>Input </b>
 * The first line contains an integer T, 
 * total number of test cases. Then 
 * follow T lines, each line contains 
 * two Integers A and B.
 * 
 * <b>Output</b>
 * Add A and B and display it.
 * 
 * <b>Constraints</b>
 * 1 ≤ T ≤ 1000
 * 1 ≤ A,B ≤ 10000
 * 
 * <b>Example</b>
 * Input
 * 3 
 * 1 2
 * 100 200
 * 10 40
 * 
 * Output
 * 3
 * 300
 * 50
 * </pre>
 * @author Pratik Sanglikar
 */
public class FLOW001 {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		while(numberOfTestCases-- > 0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			sb.append((a + b) + "\n");
		}
		System.out.println(sb.toString());
	}
}
