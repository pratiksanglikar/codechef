/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.util.Scanner;

/**
 * <pre>
 * The purpose of this problem is to verify whether 
 * the method you are using to read input data is 
 * sufficiently fast to handle problems branded with 
 * the enormous Input/Output warning. 
 * You are expected to be able to process at least 
 * 2.5MB of input data per second at runtime.
 * 
 * Input
 * The input begins with two positive integers n k (n, k<=10^7). 
 * The next n lines of input contain one positive integer ti, 
 * not greater than 10^9, each.
 * 
 * Output
 * Write a single integer to output, 
 * denoting how many integers ti are divisible by k.
 * 
 * Example
 * 
 * Input:
 * 7 3
 * 1
 * 51
 * 966369
 * 7
 * 9
 * 999996
 * 11
 * 
 * Output:
 * 4
 * </pre>
 * @author Pratik Sanglikar
 */
public class INTEST {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int inputLength = 0, divider = 0, divisibleItems = 0;
		Scanner scanner = new Scanner(System.in);
		inputLength = scanner.nextInt();
		divider = scanner.nextInt();
		while(inputLength-- > 0) {
			int number = scanner.nextInt();
			if(number % divider == 0) {
				divisibleItems++;
			}
		}
		System.out.println(divisibleItems);
	}
}
