/**
 * 
 */
package edu.psanglikar.codechef.beginner;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * The solution to the problem - 
 * <a href="https://www.codechef.com/problems/FLOW018">
 * Small Factorial </a>
 * 
 * @author Pratik Sanglikar
 */
public class FLOW018 {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfTestCases = scanner.nextInt(), number;
		StringBuilder sb = new StringBuilder();
		BigInteger factorial;
		while(numberOfTestCases-- > 0) {
			number = scanner.nextInt();
			factorial = calculateFactorial(BigInteger.valueOf(number));
			sb.append(factorial+ "\n");
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param number
	 * @return
	 */
	private static BigInteger calculateFactorial(BigInteger number) {
		if(number.intValue() < 2) {
			return BigInteger.valueOf(1);
		}
		return number.multiply(calculateFactorial(BigInteger.valueOf(number.intValue() - 1)));
	}
}
