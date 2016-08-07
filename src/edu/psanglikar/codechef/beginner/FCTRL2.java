/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <pre>
 * You are asked to calculate factorials of some small positive integers.
 * Input
 * An integer t, 1 ≤ t ≤ 100, denoting the number of testcases, 
 * followed by t lines, each containing a single integer n,1 ≤ n ≤ 100.
 * 
 * Output
 * For each integer n given at input, display a line with the value of n!
 * Example
 * Sample input
 * 4
 * 1
 * 2
 * 5
 * 3
 * 
 * Sample output:
 * 1
 * 2
 * 120
 * 6
 * </pre>
 * @author Pratik Sanglikar
 */
public class FCTRL2 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int numberOfInput = 0;
		int nextInput = 0;
		Scanner scanner = new Scanner(System.in);
		numberOfInput = scanner.nextInt();
		while(numberOfInput-- > 0) {
			nextInput = scanner.nextInt();
			System.out.println(factorial(nextInput));
		}
	}
	
	private static BigInteger factorial(int number) {
		if(number < 2) {
			return BigInteger.valueOf(1);
		}
		return factorial(number - 1).multiply(BigInteger.valueOf(number));
	}
}
